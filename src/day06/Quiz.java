package day06;

public class Quiz {
public static void main(String[] args) {
	int[] arr = new int [900];
	int count = 0;
	
	for(int i = 1; i <= 30; i++) {
		
		for(int j = 1; j <= i; j++) {
			
			arr[count] = j;
			count++;
		}
		
		for(int k = i-1; k >= 1; k--) {
			
			arr[count] = k;
			count++;
			
		}
		
	}
	



}
}
