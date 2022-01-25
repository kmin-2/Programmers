package programmers_level1;

public class level1_21 {
	/*문자열 다루기 기본

	문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.*/
	
	public static boolean solution(String s) {
        int ch_num = 0;
        boolean answer = true;
        if(s.length() == 4 || s.length() == 6){
            for(int i=0; i<s.length();i++){
                ch_num = s.charAt(i);
                if(ch_num < 48 || ch_num > 57){
                    answer = false;
                    break;
                }
            }
        }else{
            answer = false;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		String str = "a234";
		System.out.println(solution(str));
	}
}
