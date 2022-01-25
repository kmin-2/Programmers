package programmers_level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class level1_17 {
	/*나누어 떨어지는 숫자 배열

	array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
	divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
	
	제한사항
	arr은 자연수를 담은 배열입니다.
	정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
	divisor는 자연수입니다.
	array는 길이 1 이상인 배열입니다.*/
	
	 public static int[] solution(int[] arr, int divisor) {
        
        ArrayList<Integer> result = new ArrayList(); 
        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                result.add(arr[i]);
            }
        }
        Collections.sort(result);
        
        int[] answer = {};
         if( result.size()!=0){
             answer = new int[result.size()];
             for(int i =0 ; i<result.size();i++){
                 answer[i] = result.get(i);
             }
         }else{
             answer = new int[1];
             answer[0] = -1;
         }
        
        return answer;
    }
	 
	 public static void main(String[] args) {
		 int[] arr = {3, 2, 6};
		 int divisor = 10;
		 System.out.println(Arrays.toString(solution(arr, divisor)));
	}
}
