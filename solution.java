import java.io.*;
import java.util.*;

public class solution {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    static class Node {
        int r, c, dist;

        Node(int r, int c, int dist) {
            this.r = r;
            this.c = c;
            this.dist = dist;
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int N = sc.nextInt();
        int M = sc.nextInt();

        char[][] maze = new char[N][M];
        int startR = -1, startC = -1;
        int endR = -1, endC = -1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                // Đọc từng ký tự (bỏ qua mọi khoảng trắng và dấu xuống dòng)
                String token = sc.next();
                maze[i][j] = token.charAt(0);

                if (maze[i][j] == 'S') {
                    startR = i;
                    startC = j;
                } else if (maze[i][j] == 'E') {
                    endR = i;
                    endC = j;
                }
            }
        }

        System.out.println(bfs(maze, N, M, startR, startC, endR, endC));
    }

    static int bfs(char[][] maze, int N, int M, int sR, int sC, int eR, int eC) {
        boolean[][] visited = new boolean[N][M];
        Queue<Node> q = new ArrayDeque<>();

        q.add(new Node(sR, sC, 0));
        visited[sR][sC] = true;

        int[] dr = { -1, 1, 0, 0 };
        int[] dc = { 0, 0, -1, 1 };

        while (!q.isEmpty()) {
            Node curr = q.poll();

            if (curr.r == eR && curr.c == eC)
                return curr.dist;

            for (int i = 0; i < 4; i++) {
                int nr = curr.r + dr[i];
                int nc = curr.c + dc[i];

                if (nr >= 0 && nr < N && nc >= 0 && nc < M &&
                        maze[nr][nc] != '#' && !visited[nr][nc]) {
                    visited[nr][nc] = true;
                    q.add(new Node(nr, nc, curr.dist + 1));
                }
            }
        }

        return -1; // Không tìm thấy đường
    }
}