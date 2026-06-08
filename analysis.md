# Behind-the-Scenes Analysis

## 1. Problem Analysis & Modeling
- **Mô hình hóa:** Chúng ta có thể coi ma trận nhà máy là một đồ thị vô hướng, không trọng số. Trong đó, mỗi ô $(r, c)$ là một đỉnh, và các ô trống kề nhau là các cạnh nối giữa các đỉnh.
- **Yêu cầu:** Tìm đường đi ngắn nhất giữa hai đỉnh `S` và `E`.

## 2. Algorithm Selection
- **Thuật toán sử dụng:** Breadth-First Search (BFS - Tìm kiếm theo chiều rộng).
- **Lý do chọn:** 
    - Đối với đồ thị không có trọng số (khoảng cách giữa các ô luôn là 1), BFS luôn đảm bảo tìm thấy đường đi ngắn nhất ngay khi chạm tới đích.
    - So với DFS (Tìm kiếm theo chiều sâu), BFS hiệu quả hơn cho bài toán tìm đường ngắn nhất và không bị lỗi tràn ngăn xếp (Stack Overflow) với ma trận lớn $1000 \times 1000$.

## 3. Implementation Details
- **Data Structure:** 
    - `Queue` (sử dụng `ArrayDeque` trong Java) để lưu trữ các ô cần duyệt theo thứ tự lớp.
    - Mảng `dist[N][M]` để lưu khoảng cách từ `S` đến mỗi ô và đánh dấu các ô đã thăm (`visited`).
- **Complexity:**
    - **Time Complexity:** $O(N \times M)$. Mỗi ô được đưa vào Queue và xử lý đúng một lần. Với $10^6$ ô, thuật toán chạy mất khoảng ~0.1-0.2s, dưới ngưỡng 1s quy định.
    - **Space Complexity:** $O(N \times M)$ để lưu trữ ma trận và mảng đánh dấu.

## 4. Edge Cases & Test Design
- **Edge Case 1:** Điểm `S` và `E` nằm cạnh nhau (Kết quả = 1).
- **Edge Case 2:** Không có đường đi từ `S` tới `E` (Kết quả = -1).
- **Edge Case 3:** Mê cung cực lớn ($1000 \times 1000$) với đường đi ngoằn ngoèo để kiểm tra hiệu năng.
- **Edge Case 4:** Ma trận chỉ có 1 hàng hoặc 1 cột.