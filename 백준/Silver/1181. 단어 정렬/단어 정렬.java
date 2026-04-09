import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // 단어의 개수
        int N = Integer.parseInt(bufferedReader.readLine()); 

        // Hashset으로 중복 제거
        HashSet<String> set = new HashSet<>(); 
        for (int i=0; i<N; i++) {
            set.add(bufferedReader.readLine());
        }

        // 정렬 위해 list 변환
        List<String> list = new ArrayList<>(set);

        // list 정렬
        Collections.sort(list, (s1, s2) -> {
            // 음수라면 s1이 앞으로, 0이라면 그대로, 양수라면 s2가 앞으로
            if (s1.length() != s2.length()) {
                return s1.length() - s2.length(); 
            }
            // 길이가 같으면 사전 순으로
            return s1.compareTo(s2); 
        });

        // 출력
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : list) {
            stringBuilder.append(word).append("\n");
        }
        System.out.print(stringBuilder);
    }
}