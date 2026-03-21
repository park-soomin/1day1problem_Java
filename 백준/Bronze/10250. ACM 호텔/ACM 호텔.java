import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int test = Integer.parseInt(br.readLine());

        for (int i = 0; i < test; i++) {
            st = new StringTokenizer(br.readLine());
            int height = Integer.parseInt(st.nextToken());
            int width = Integer.parseInt(st.nextToken()); // width는 사실 이 문제에서 안 써도 무방합니다.
            int n = Integer.parseInt(st.nextToken());

            int floor; // 층수 (Y)
            int room;  // 호수 (X)

            // 꼭대기 층일 경우 (나머지가 0)
            if (n % height == 0) {
                floor = height;      // 층수는 꼭대기 층
                room = n / height;   // 호수는 몫과 같음
            } 
            // 그 외의 경우
            else {
                floor = n % height;      // 층수는 나머지
                room = (n / height) + 1; // 호수는 몫 + 1
            }

            // 출력부 (호수가 10보다 작으면 중간에 0을 끼워넣음)
            if (room < 10) {
                System.out.println(floor + "0" + room);
            } else {
                System.out.println(floor + "" + room); 
                // 빈 문자열("")을 더해 숫자끼리 연산(+)되지 않고 문자로 이어붙게 만듦
            }
        }
    }
}