import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(bufferedReader.readLine());
        int zeroCount = 0;

        for (int i=1; i<=n; i++) {
            if (i % 5 == 0) {
                zeroCount++;
                if (i % 25 == 0) {
                    zeroCount++;
                    if (i % 125 == 0) {
                        zeroCount++;
                    }
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(zeroCount);
        System.out.print(stringBuilder);
    }
}