package programmers_level1;

import java.util.Arrays;

public class level1_29 {
	/*정수 내림차순으로 배치하기

	함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
	
	제한 조건
	n은 1이상 8000000000 이하인 자연수입니다.*/
	
    public static long solution(long n) {
        String str = n + "";
        String num = "";
        long[] number = new long[str.length()];
        for(int i = 0 ; i < str.length(); i++){
            number[i] = n % 10;
            n = n/10;
        }
        Arrays.sort(number);
        
        for(int i = 0 ; i < str.length(); i++){
            num += number[str.length() - i -1];
        }
        long answer = Long.parseLong(num);
        return answer;
    }
    
	public static void main(String[] args) {
		long n = 118372;
		System.out.println(solution(n));
	}
}
