# Problem: Rescue Operation - The Last Exit

## Problem Statement
Sau một trận động đất dữ dội, nhà máy công nghệ cao X bị sụp đổ một phần, biến cấu trúc bên trong thành một mê cung phức tạp. Một Robot cứu hộ được cử vào để xác định lộ trình ngắn nhất từ vị trí hiện tại đến lối thoát hiểm an toàn nhằm truyền tín hiệu cứu hộ cho các nạn nhân còn kẹt lại.

Nhà máy được mô phỏng dưới dạng một lưới ma trận kích thước $N \times M$. Robot có thể di chuyển sang 4 ô kề cạnh (Lên, Xuống, Trái, Phải) nếu ô đó không có vật cản. Hãy giúp Robot tìm số bước di chuyển ít nhất để đến được lối thoát.

## Input Format
- Dòng đầu tiên chứa hai số nguyên $N$ và $M$ ($1 \le N, M \le 1000$) - kích thước của nhà máy.
- $N$ dòng tiếp theo, mỗi dòng chứa $M$ ký tự đại diện cho sơ đồ nhà máy:
    - `S`: Vị trí xuất phát của Robot (Start).
    - `E`: Vị trí lối thoát hiểm (Exit).
    - `#`: Vật cản (tường đổ nát, lửa, không thể đi qua).
    - `.`: Đường trống (có thể di chuyển).

## Output Format
- Một số nguyên duy nhất đại diện cho số bước di chuyển ít nhất từ `S` đến `E`.
- Nếu không có bất kỳ đường đi nào khả thi, in ra `-1`.

## Constraints
- $1 \le N, M \le 1000$
- Tổng số ô trong ma trận tối đa là $10^6$.
- Thời gian giới hạn: 1.0 giây.
- Bộ nhớ giới hạn: 256 MB.

## Sample Test Cases

### Sample 1
**Input:**
5 5
S . . # .
# # . # .
. . . . .
. # # # .
. . . . E

**Output:**
8

### Sample 2
**Input:**
3 3
S # .
# # .
. . E

**Output:**
-1