import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        // name에 각각 yearning이 할당되므로 Map 사용
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        // map에 key가 있으면 value만큼 더해줌
        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                if (map.containsKey(photo[i][j])) {
                    answer[i] += map.get(photo[i][j]);
                }
            }
        }
        
        return answer;
    }
}