
import java.util.HashMap;
import java.util.Map;
// key : 이름(String), value : 점수(Integer)
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
      // 이름 배열 name과 점수 배열 yearning의 인덱스를 순회하며 HashMap에 저장
        Map<String, Integer> point = new HashMap<>();

        // 이름과 그리움 점수 매핑
        for (int i = 0; i < name.length; i++) {
            point.put(name[i], yearning[i]);
        }

        // 사진별 점수 계산
        for (int i = 0; i < photo.length; i++) {
            int score = 0; // 점수 초기화  
            for (String person : photo[i]) {
                score += point.getOrDefault(person, 0); // 없는 사람은 기본값 0
            }
            answer[i] = score; // 사진별 점수 저장
        }

        return answer;
    }
}
