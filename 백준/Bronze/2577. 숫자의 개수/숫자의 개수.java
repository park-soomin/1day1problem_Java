import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        int[] array = new int[10];
        String mul = String.valueOf(a * b * c);

        for (int i = 0; i < mul.length(); i++) {
            int digit = mul.charAt(i) - '0';
            array[digit]++;
        }

        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
    }
}