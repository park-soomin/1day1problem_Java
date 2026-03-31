import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bufferedReader.readLine());

        for (int i=1; i<num; i++) {
            int temp = i;
            int sum = temp;

            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if (num == sum) {
                System.out.println(i);
                return;
            }
        }

        System.out.println("0");
    }
}