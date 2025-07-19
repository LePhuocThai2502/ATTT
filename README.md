# 🔐 ATTT – Mã hóa thủ công bằng AES & RSA trong Java

Đây là đồ án môn học **An toàn Thông Tin**, hiện thực thủ công hai thuật toán mã hóa quan trọng: **AES (Advanced Encryption Standard)** và **RSA (Rivest–Shamir–Adleman)** bằng ngôn ngữ **Java**, **không sử dụng bất kỳ thư viện mã hóa có sẵn nào**.

Mục tiêu là hiểu rõ cơ chế hoạt động của các thuật toán mã hóa hiện đại, từ đó có khả năng xây dựng và áp dụng vào thực tiễn hoặc mô phỏng.

---

## 🎯 Mục tiêu dự án

- Xây dựng **giải thuật AES và RSA từ đầu** bằng Java.
- Mã hóa và giải mã **văn bản** và **chuỗi dữ liệu**.
- Không dùng `javax.crypto` hay các thư viện mã hóa hỗ trợ khác.
- Hiển thị kết quả đầu ra và kiểm chứng tính đúng đắn.

---

## 📁 Cấu trúc thư mục

```bash 
ATTT-master/
├── AES/
│   └── AES/src/AES.java             # Mã nguồn AES thủ công
│
├── AES2/
│   └── src/FinishAES/
│       ├── AES.java                 # Mã AES cải tiến
│       ├── AlgorithmRSA.java       # Mã RSA đầy đủ
│       └── FormDSRSA.java          # Giao diện demo RSA (Java Swing)

```
---

## 💻 Công nghệ sử dụng

| Thành phần | Mô tả |
|-----------|-------|
| Ngôn ngữ  | Java 8+ |
| IDE đề xuất | Eclipse hoặc IntelliJ |
| Môi trường | Chạy Java console hoặc Java Swing (demo RSA) |
| Giao diện | Java Swing (cho RSA) |

---

## 🚀 Hướng dẫn chạy chương trình

### 1. Clone repo và mở bằng IDE (Eclipse/IntelliJ)

```bash
git clone https://github.com/LePhuocThai2502/ATTT.git

```
### 2. Biên dịch và chạy mã AES
```bash
// File: AES/AES/src/AES.java
public static void main(String[] args) {
    // Nhập vào chuỗi và key
    // Chạy mã hóa và giải mã AES
}
```
### 3. Biên dịch và chạy mã RSA
```bash
// File: AES2/src/FinishAES/FormDSRSA.java
// Chạy giao diện demo mã hóa/giải mã bằng RSA
```

🔐 Tính năng
-  Mã hóa/giải mã chuỗi bằng AES (thủ công từng bước)
 
-  Mã hóa/giải mã số nguyên lớn bằng RSA
 
-  Giao diện Java Swing đơn giản cho RSA
 
-  Hỗ trợ nhập file văn bản (có thể mở rộng)
 

 📸 Giao diện (RSA)
-  Giao diện được xây dựng bằng Java Swing, hỗ trợ nhập plaintext, sinh khóa, mã hóa và giải mã:


📌 Ghi chú
-  Mã hóa RSA sử dụng số nguyên lớn tự sinh và tính nghịch đảo modulo thủ công.
-  Dự án chỉ mang mục đích học tập – không khuyến nghị sử dụng trong môi trường yêu cầu bảo mật cao thực tế.
-  Có thể cải tiến thêm bằng cách thêm mã hóa file hoặc cải thiện UI/UX.

👨‍💻 Tác giả

-  Tên: Lê Phước Thái
-  Môn học: An toàn thông tin
-  🔗 GitHub: github.com/LePhuocThai2502

📜 License

Dự án dùng cho mục đích học thuật và chia sẻ mã nguồn mở. Không chịu trách nhiệm nếu mã bị sử dụng sai mục đích.

---


## ✅ Việc bạn nên làm tiếp:
1. **Tạo file `README.md` trong thư mục chính** và copy toàn bộ nội dung trên.
2. **Thêm ảnh minh họa giao diện (nếu có)** vào thư mục và cập nhật link `![Demo RSA UI](...)`.
3. Commit file mới lên GitHub.
Nếu bạn muốn mình **viết README tiếng Anh**, **thêm hình ảnh minh họa**, hoặc **tối ưu mã Java AES/RSA**, mình có thể hỗ trợ tiếp. Bạn cần thêm gì nữa không? ​:contentReference[oaicite:0]{index=0}​

