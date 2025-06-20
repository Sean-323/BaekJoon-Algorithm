import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) queue.offer(i);

        while (!queue.isEmpty()) {
            for (int i = 0; i < K - 1; i++) queue.offer(queue.poll());

            sb.append(queue.poll());
            if (!queue.isEmpty()) sb.append(", ");
        }
        sb.append(">");
        System.out.println(sb);
    }
}