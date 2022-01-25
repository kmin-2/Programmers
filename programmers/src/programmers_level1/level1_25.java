package programmers_level1;

public class level1_25 {
	/*시저 암호

	어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
	
	제한 조건
	공백은 아무리 밀어도 공백입니다.
	s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
	s의 길이는 8000이하입니다.
	n은 1 이상, 25이하인 자연수입니다.*/
	
	public static String solution(String s, int n) {
        String answer = "";
        char str = ' ';
        int ch_num = 0;
        
        for(int i=0; i<s.length();i++){
            str = s.charAt(i); 
            ch_num = (int) str;
            
            if(ch_num == 32){
                answer += " ";
            }else{
                if(ch_num>=97 && ch_num<=122){
                    ch_num += n;
                    ch_num = (ch_num>=123) ? ch_num-26 : ch_num; 
                }else{
                    ch_num += n;
                    ch_num = (ch_num>=91) ? ch_num-26 : ch_num; 
                }
                str = (char) ch_num;           
                answer += str;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		String s ="a B z"; 
		int n = 4;
		System.out.println(solution(s,n));
	}
	
}
