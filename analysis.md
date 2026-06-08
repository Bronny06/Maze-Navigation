# Behind-the-Scenes Analysis

## 1. Problem Analysis & Modeling
- **Modeling:** We can model the factory grid as an unweighted, undirected graph. Each cell $(r, c)$ represents a vertex, and the adjacent empty cells are the edges connecting these vertices.
- **Objective:** Find the shortest path between the two vertices `S` and `E`.

## 2. Algorithm Selection
- **Algorithm Used:** Breadth-First Search (BFS).
- **Reason for Selection:** - For unweighted graphs (where the distance between any two valid adjacent cells is always 1), BFS guarantees finding the shortest path the moment it reaches the destination.
    - Compared to Depth-First Search (DFS), BFS is more efficient for shortest-path problems and avoids Stack Overflow errors when dealing with a large 1000x1000 grid.

## 3. Implementation Details
- **Data Structure:** - `Queue` (using `ArrayDeque` in Java) to store the cells to be visited layer by layer.
    - A `dist[N][M]` array (or a `visited` boolean matrix) to store the distance from `S` to each cell and to mark visited cells.
- **Complexity:**
    - **Time Complexity:** $O(N \times M)$. Each cell is pushed into the Queue and processed exactly once. With 1,000,000 cells, the algorithm takes roughly ~0.1 to 0.2 seconds, well within the 1.0s limit.
    - **Space Complexity:** $O(N \times M)$ to store the 2D grid and the visited tracking array.

## 4. Edge Cases & Test Design
- **Edge Case 1:** `S` and `E` are immediately adjacent to each other (Expected Output = 1).
- **Edge Case 2:** No valid path exists from `S` to `E` (Expected Output = -1).
- **Edge Case 3:** An extremely large maze (1000x1000) with a long, sinuous path to stress-test the time performance.
- **Edge Case 4:** The grid consists of only 1 row or 1 column.
