import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(System.in)));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int srcToHan = Integer.parseInt(stringTokenizer.nextToken());
        int srcToYong= Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int hanToItbt = Integer.parseInt(stringTokenizer.nextToken());
        int yongToItbt = Integer.parseInt(stringTokenizer.nextToken());

        if (srcToHan+hanToItbt > srcToYong+yongToItbt) {
            System.out.println("Yongdap");
        } else if (srcToHan+hanToItbt < srcToYong+yongToItbt) {
            System.out.println("Hanyang Univ.");
        } else {
            System.out.println("Either");
        }
    }
}