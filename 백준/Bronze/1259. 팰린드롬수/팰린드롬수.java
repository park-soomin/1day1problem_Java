import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String num = bufferedReader.readLine();

            if (num.equals("0")) break; // 0 입력 시 프로그램 종료

            boolean isPalindrome = true; // 숫자 검사마다 true로 초기화

            for (int i=0; i<num.length()/2; i++) {
                if (num.charAt(i) != num.charAt(num.length() - 1 - i)) { // 맨 앞과 맨 뒤 비교
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}