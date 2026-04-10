import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        int sum = 0;

        for (int i=1; i<=N; i++) {
            sum += i;
        }

        int sumSquare = sum * sum;

        int sumCubes = 0;
        for (int i=1; i<=N; i++) {
            sumCubes += i*i*i;
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(sum).append("\n").append(sumSquare).append("\n")
                .append(sumCubes);
        System.out.print(stringBuilder);
    }
}