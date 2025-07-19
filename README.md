# 🔐 Information Security – Manual AES & RSA Encryption in Java

This is a course project for **Information Security**, implementing two major cryptographic algorithms: **AES (Advanced Encryption Standard)** and **RSA (Rivest–Shamir–Adleman)** manually in **Java**, **without using any built-in cryptography libraries**.

The goal is to deeply understand the internal mechanics of modern encryption algorithms and be able to apply or simulate them effectively.

---

## 🎯 Project Objectives

- Build **AES and RSA algorithms from scratch** using Java.
- Encrypt and decrypt **text strings and data**.
- Do not use `javax.crypto` or any built-in crypto libraries.
- Display output and verify correctness.

---

## 📁 Folder Structure

```bash 
ATTT-master/
├── AES/
│   └── AES/src/AES.java             # Manual AES source code
│
├── AES2/
│   └── src/FinishAES/
│       ├── AES.java                # Improved AES version
│       ├── AlgorithmRSA.java       # Full RSA implementation
│       └── FormDSRSA.java          # Java Swing demo interface for RSA

```
---

## 💻 Technologies Used

| Component | Description |
|-----------|-------|
| Language  | Java 8+ |
| IDE | Eclipse or IntelliJ |
| Environment | Java Console & Java Swing |
| UI | Java Swing (RSA) |

---

## 🚀 How to Run

### 1. Clone the repository and open with your IDE

```bash
git clone https://github.com/LePhuocThai2502/ATTT.git

```
### 2. Compile & run AES
```bash
// File: AES/AES/src/AES.java
public static void main(String[] args) {
    // Nhập vào chuỗi và key
    // Chạy mã hóa và giải mã AES
}
```
### 3. Compile & run RSA (with GUI)
```bash
// File: AES2/src/FinishAES/FormDSRSA.java
// Chạy giao diện demo mã hóa/giải mã bằng RSA
```

🔐 Features
-    Manual step-by-step AES encryption and decryption

-    RSA encryption/decryption using large prime numbers

-    Simple Java Swing GUI for RSA

-    (Optional) Input from text file (can be extended)
 

 📸 Demo UI (RSA)
-  Java Swing interface to enter plaintext, generate keys, encrypt and decrypt.



📌 Notes
-    RSA implementation uses manual big integer generation and modular inverse calculation.

-    This project is for educational purposes and not recommended for production-level secure systems.

-    Can be extended with file encryption, enhanced UI/UX, or added padding techniques.

👨‍💻 Author

-  Name: Lê Phước Thái
-  Course: Information Security
-  🔗 GitHub: github.com/LePhuocThai2502

📜 License

-    This project is open-source and intended for academic learning.

-    The author is not responsible for misuse in real-world secure environments.

---


