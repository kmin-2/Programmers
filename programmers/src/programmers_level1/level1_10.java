package programmers_level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class level1_10 {
	/*두 개 뽑아서 더하기
	
	정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.

	제한사항
	numbers의 길이는 2 이상 100 이하입니다.
	numbers의 모든 수는 0 이상 100 이하입니다.*/
	
	public static int[] solution(int[] numbers) {
	        ArrayList<Integer> sum = new ArrayList<Integer>();
	      
	        for(int i=0; i<numbers.length-1;i++){   
	            for(int j=i+1; j<numbers.length; j++){
	                if(! sum.contains(numbers[i]+numbers[j])){
	                    sum.add(numbers[i]+numbers[j]);
	                }
	            }
	        }
	        Collections.sort(sum);
	        
	        int[] answer = new int[sum.size()];
	        for(int i=0; i< sum.size(); i++){
	            answer[i] = sum.get(i);
	        }
	            
	        return answer;
	}
	
	public static void main(String[] args) {
		int[] numbers = {5, 0, 2, 7};
		
		System.out.println(Arrays.toString(solution(numbers)));
	}
}
