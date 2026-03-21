import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int[] a = new int[num];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<num; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int max = a[0];
        int min = a[0];
        for (int i=0; i<num-1; i++) {
            if (a[i+1] > max) {
                max = a[i+1];
            }
            if (a[i+1] < min) {
                min = a[i+1];
            }
        }

        sb.append(min).append(" ").append(max);
        System.out.println(sb);
    }
}