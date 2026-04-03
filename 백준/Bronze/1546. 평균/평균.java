import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int numberOfCourses = Integer.parseInt(bufferedReader.readLine()); // 과목 수
        int[] scoresAll = new int[numberOfCourses]; // 점수들의 집합
        int highestScore = 0; // 최고점
        float sum = 0; // 전체 점수 합

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i=0; i<numberOfCourses; i++) {
            scoresAll[i] = Integer.parseInt(stringTokenizer.nextToken());
            if (scoresAll[i] > highestScore) {
                highestScore = scoresAll[i];
            }
            sum += scoresAll[i];
        }

        stringBuilder.append((sum/highestScore*100)/numberOfCourses);
        System.out.println(stringBuilder);
    }
}