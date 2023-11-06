//import java.io.UnsupportedEncodingException;
//import java.security.InvalidKeyException;
//import java.security.NoSuchAlgorithmException;
//import java.security.spec.KeySpec;
//import java.util.Base64;
//import javax.crypto.*;
//import javax.crypto.spec.SecretKeySpec;
//import javax.crypto.Cipher;
//import javax.crypto.KeyGenerator;
//import javax.crypto.SecretKey;
//import javax.crypto.NoSuchPaddingException;
//import java.security.NoSuchAlgorithmException;
//import java.security.InvalidKeyException;
//import java.io.UnsupportedEncodingException;
//import javax.crypto.IllegalBlockSizeException;
//import javax.crypto.BadPaddingException;
//import java.util.Base64;
//import java.util.Scanner;
//
//public class AES {
//    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
//        // Khởi tạo khóa AES
//        //KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
//        //SecretKey secretKey = keyGenerator.generateKey();
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập key: ");
//        String keyInput = scanner.nextLine();
//        scanner.close();
//
//        // Chuyển keyInput thành một mảng byte và tạo một SecretKey
//        byte[] keyBytes = keyInput.getBytes();
//        SecretKey secretKey = new SecretKeySpec(keyBytes, "AES");
//        // Dữ liệu đầu vào
//        String text = "HelloAES12345678";
//        Cipher cipher = Cipher.getInstance("AES");
//
//        // Mã hóa dữ liệu
//        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
//        byte[] encrypted = cipher.doFinal(text.getBytes());
//
//        // Giải mã dữ liệu
//        cipher.init(Cipher.DECRYPT_MODE, secretKey);
//        byte[] decrypted = cipher.doFinal(encrypted);
//
//        // Chuyển đổi kết quả giải mã thành chuỗi và in ra
//        String decryptedText = new String(decrypted);
//
//        System.out.println("text: " + text);
//        System.out.println("encrypted text: " + Base64.getEncoder().encodeToString(encrypted));
//        System.out.println("decrypted text: " + decryptedText);
//    }
//}

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Scanner;

public class AES {

    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập key: ");
        String keyInput = scanner.nextLine();
        System.out.print("Nhập văn bản cần mã hóa: ");
        String text = scanner.nextLine();
        scanner.close();

        String encryptedText = encryptAES(text, keyInput);
        System.out.println("Encrypted Text: " + encryptedText);

        String decryptedText = decryptAES(encryptedText, keyInput);
        System.out.println("Decrypted Text: " + decryptedText);
    }

    public static String encryptAES(String plainText, String key) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        try {
            byte[] keyBytes = key.getBytes();
            SecretKey secretKey = new SecretKeySpec(keyBytes, "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
            return Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String decryptAES(String encryptedText, String key) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        try {
            byte[] keyBytes = key.getBytes();
            SecretKey secretKey = new SecretKeySpec(keyBytes, "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] encryptedBytes = Base64.getDecoder().decode(encryptedText);
            byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
            return new String(decryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

