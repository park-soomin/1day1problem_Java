import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int U_R = Integer.parseInt(stringTokenizer.nextToken());
        int T_R = Integer.parseInt(stringTokenizer.nextToken());
        int U_O = Integer.parseInt(stringTokenizer.nextToken());
        int T_O = Integer.parseInt(stringTokenizer.nextToken());

        System.out.println(U_R*56 + T_R*24 + U_O*14 + T_O*6);
    }
}