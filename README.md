# Chương trình cộng 2 số lớn (được biểu diễn dưới dạng chuỗi).

## Yêu cầu môi trường : Đã cài đặt JDK và IDE cần thiết để chạy chương trình Java.

## Hướng dẫn sử dụng :

Chương trình được viết trong Class MyBigNumber với phương thức : String sum(String stn1, String stn2).

### Gọi phương thức ::

MyBigNumber myBigNumber = new MyBigNumber();
myBigNumber.sum(<chuỗi số 1>, <chuỗi số 2>);

Với <chuỗi số 1> và <chuỗi số 2> là 2 chuỗi số nguyên (Giả định giá trị tham số truyền vào hàm là đúng, chỉ chứa các kí số hợp lệ, không có kí tự nào khác).

### Test Case :
Chương trình có tích hợp TestCase trong Class MyBigNumberTest, chạy class này để kiểm tra các testcase.

## Mô tả thuật toán :

1. Xác định độ dài của các chuỗi số đầu vào và tìm độ dài lớn nhất.

2. Khởi tạo một LinkedList trống để lưu trữ kết quả và một biến temp để lưu trữ biến nhớ trong quá trình cộng. (VD : 7 +6 = 13 ::> temp = 1)

3. Lặp qua các kí tự trong chuỗi từ phải sang trái, lưu kết quả và LinkedList sau mỗi lần lặp.

4. Sau khi xử lý tất cả các chữ số, nếu còn lại bất kỳ biến nhớ nào (temp > 0), nó sẽ được thêm vào vị trí đầu của kết quả.

5. Chuyển đổi thành dạng chuỗi và return.