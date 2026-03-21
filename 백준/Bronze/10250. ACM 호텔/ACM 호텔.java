import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int test = Integer.parseInt(br.readLine());

        for (int i=0; i<test; i++) {
            st = new StringTokenizer(br.readLine());
            int height = Integer.parseInt(st.nextToken());
            int width = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int floor;
            int room;

            if (n % height == 0) {
                floor = height;
                room = (n / height);
            } else {
                floor = n % height;
                room = (n / height) + 1;
            }

            if (room < 10) {
                sb.append(floor).append("0").append(room).append("\n");
            } else {
                sb.append(floor).append(room).append("\n");
            }
        }
        System.out.println(sb);
    }
}