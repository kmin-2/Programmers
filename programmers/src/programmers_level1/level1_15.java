package programmers_level1;

public class level1_15 {
	/*가운데 글자 가져오기

	단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.*/
	
    public static String solution(String s) {
        String answer = "";
        if(s.length() % 2 == 0 ){
            answer = s.substring(s.length()/2 - 1, s.length()/2 + 1);
        } else {
            answer += s.charAt(s.length()/2);
        }   
        return answer;
    }
    
    public static void main(String[] args) {
		String str = "qwer";
		System.out.println(solution(str));
	}
}
