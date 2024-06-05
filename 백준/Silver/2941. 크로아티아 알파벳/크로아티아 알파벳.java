import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 정규표현식
        String[] cro_arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String str = sc.next();
        // cro_arr의 요소가 있으면 특정 문자 a로 변경
        for (String cro : cro_arr) {
            str = str.replaceAll(cro, "a");
        }
        // 어차피 cro_arr에 속하지 않는 문자는 1개로 치므로
        // 총 문자의 개수가 정답
        System.out.println(str.length());
    }
}