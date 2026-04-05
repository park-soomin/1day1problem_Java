import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int test = Integer.parseInt(bufferedReader.readLine());
        for (int i=0; i<test; i++) {
            int floor = Integer.parseInt(bufferedReader.readLine());
            int room = Integer.parseInt(bufferedReader.readLine());
            stringBuilder.append(countPeople(floor, room)).append("\n");
        }
        System.out.print(stringBuilder);
    }

    public static int countPeople(int k, int n) {
        if (k == 0) return n;
        if (n == 1) return 1;
        return countPeople(k, n-1) + countPeople(k-1, n);
    }
}