import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        if (minute >=45) {
            minute -= 45;
            System.out.println(hour + " " + minute);
        } else {
            if (hour == 0) {
                hour = 23;
                minute += 15;
                System.out.println(hour + " " + minute);
            } else {
                hour -= 1;
                minute += 15;
                System.out.println(hour + " " + minute);
            }
        }
    }
}