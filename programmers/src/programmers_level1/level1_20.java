package programmers_level1;

import java.util.Arrays;

public class level1_20 {
	/*문자열 내림차순으로 배치하기

	문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
	s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.*/
	
	public static String solution(String s) {
        String answer = "";
        char ch = ' ';
        int ch_num = 0;
        
        // ASCII 코드 변환
        int[] list = new int[s.length()];
        for(int i=0; i<s.length(); i++){
            ch_num = s.charAt(i);
            list[i] = ch_num;
        }
        //정렬
        Arrays.sort(list);
        // ASCII 코드값이 큰순서대로 answer 
        for(int i=0; i<list.length; i++){
            ch = (char) list[list.length-i-1];
            answer += ch;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		String str = "Zbcdefg";
		System.out.println(solution(str));
	}
}
