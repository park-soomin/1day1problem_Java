import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int participantNumber = Integer.parseInt(bufferedReader.readLine());

        int[] size = new int[6];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i=0; i<size.length; i++) {
            size[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int bundleOfTShirts = Integer.parseInt(stringTokenizer.nextToken());
        int bundleOfPen = Integer.parseInt(stringTokenizer.nextToken());

        int bundleCount = 0;
        for (int s : size) {
            bundleCount += (s / bundleOfTShirts);
            if (s % bundleOfTShirts != 0) {
                bundleCount++;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bundleCount).append("\n");
        stringBuilder.append(participantNumber/bundleOfPen).append(" ").append(participantNumber%bundleOfPen);
        System.out.println(stringBuilder);
    }
}