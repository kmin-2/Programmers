package programmers_level1;

public class level1_35 {
	/*핸드폰 번호 가리기

	프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
	전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
	
	제한 조건
	s는 길이 4 이상, 20이하인 문자열입니다.*/
	
    public static String solution(String phone_number) {
        String answer = "";
        int first_num =  phone_number.substring(0,phone_number.length()-4).length();
        String last_str = phone_number.substring(phone_number.length()-4,phone_number.length());
       
        for(int i=0; i<first_num; i++){
            answer += "*";
        }
        answer += last_str;
        
        return answer;
    }

    public static void main(String[] args) {
    	String phone_number = "027778888";
    	System.out.println(solution(phone_number));
	}
}

