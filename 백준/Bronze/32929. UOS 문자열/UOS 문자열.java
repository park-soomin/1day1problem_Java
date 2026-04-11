import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bufferedReader.readLine());

        if (x % 3 == 0) {
            System.out.println("S");
        } else if (x % 3 == 1) {
            System.out.println("U");
        } else {
            System.out.println("O");
        }
    }
}