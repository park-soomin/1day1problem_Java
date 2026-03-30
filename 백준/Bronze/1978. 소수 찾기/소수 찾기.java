import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int numberOfNumbers = Integer.parseInt(bufferedReader.readLine()); // 판별할 숫자의 개수
        int primeCount = 0; // 소수의 개수

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i=0; i<numberOfNumbers; i++) {
            int a = Integer.parseInt(stringTokenizer.nextToken()); // 판별할 숫자

            if (a == 1) continue; // 1은 소수가 아님

            boolean isPrime = true; // 소수 판별자 true로 기본 설정

            for (int j=2; j*j<=a; j++) { // 모든 수로 나눠보는 것이 아닌 제곱근까지만 나눠봐도 됨
                if (a % j == 0) {
                    isPrime = false; // 나누어 떨어지면 primeCount 올리지 못하도록
                    break; // 나누어 떨어지면 더 이상 소수가 아님
                }
            }

            if (isPrime) { // 나누어 떨어지지 않는다면 isPrime은 true 유지
                primeCount++; // 소수 개수 1 증가
            }
        }

        System.out.println(primeCount);
    }
}