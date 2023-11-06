package FinishAES;

import java.math.BigInteger;
import java.security.SecureRandom;

public class AlgorithmRSA {
//d: private key, public key
    private BigInteger n, d, e;
   

    public BigInteger getN() {
        return n;
    }

    public void setN(BigInteger n) {
        this.n = n;
    }

    public BigInteger getD() {
        return d;
    }

    public void setD(BigInteger d) {
        this.d = d;
    }

    public BigInteger getE() {
        return e;
    }

    public void setE(BigInteger e) {
        this.e = e;
    }

    /**
     * Create an instance that can encrypt using someone elses public key.
     */
    public AlgorithmRSA(BigInteger newn, BigInteger newe) {
        n = newn;
        e = newe;
    }

    /**
     * Create an instance that can both encrypt and decrypt.
     */
    public AlgorithmRSA() {
        
       
    }
    
    public void KeyRSA(int bits){
        
        
        SecureRandom r = new SecureRandom();//create BigInteger r random
        BigInteger p = new BigInteger(bits , 100, r);
        BigInteger q = new BigInteger(bits , 100, r);
        n = p.multiply(q);
        BigInteger m = (p.subtract(BigInteger.ONE)).multiply(q
                .subtract(BigInteger.ONE));
        boolean found = false;
        do {
            e = new BigInteger(bits , 50, r);
            if (m.gcd(e).equals(BigInteger.ONE) && e.compareTo(m) < 0) {
                found = true;
            }
        } while (!found);
        d = e.modInverse(m);
        
    }


    // Encrypt the given plaintext message.Use public key decrypt
   
    
    public synchronized String encrypt(String message) {
        return (new BigInteger(message.getBytes())).modPow(e, n).toString();
    }

   
    //Encrypt the given plaintext message.Use public key decrypt
 
    public synchronized BigInteger encrypt(BigInteger message) {
        return message.modPow(e, n);
    }

  
     // Decrypt the given ciphertext message.Use private key decrypt
   
    public synchronized String decrypt(String message) {
        return new String((new BigInteger(message)).modPow(d, n).toByteArray());
    }

  
     // Decrypt the given ciphertext message.Use private key decrypt
 
    public synchronized BigInteger decrypt(BigInteger message) {
        return message.modPow(d, n);
    }

 

     // Trivial test program.
  
    public static void main(String[] args) throws Exception {
        AlgorithmRSA rsa = new AlgorithmRSA();
        rsa.KeyRSA(1024);
        String text ="Hi there";
        String mahoa=rsa.encrypt(text);
        System.out.println("Đây là kết quả đoạn mã hóa:"+mahoa);
        System.out.println("Giải mã được như sau: "+rsa.decrypt(mahoa));

    }

    void setN(int bitleg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
