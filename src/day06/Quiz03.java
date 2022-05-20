package day06;

import java.util.Scanner;

public class Quiz03 {
public static void main(String[] args) {

//	Scanner input = new Scanner(System.in);
//
//	int su1=0;
//	while(true){
//	System.out.println("수 입력: ");
//	su1= input.nextInt();
//	
//	for(int i=su1;i<10;i++) {
//		for(int j=1; j<10; j++) {
//			System.out.print(i+"x"+j+"="+i*j+"\t");
//		}System.out.println();
//	}
//	}
	
	
//	for(int i=1; i<6;i++) {
//		for(int j=1; j<i; j++) {
//			System.out.print("*");	
//		}System.out.println();
//	}
//	for(int i=1;i<10;i++) {
//		for(int j=2; j<10;j++) {
//			System.out.print(j+"x"+i+"="+i*j +"\t");
//			
//		}System.out.println();
//	}
	
	
	
//	Scanner input = new Scanner(System.in);
//
//	int su1;
//	System.out.println("수 입력: ");
//	su1= input.nextInt();
//	
//	for(int i=su1;i<10;i++) {
//		for(int j=1; j<10; j++) {
//			System.out.print(i+"x"+j+"="+i*j+"\t");
//		}System.out.println();
//	}

	
//	Scanner input = new Scanner(System.in);
//
//	int su1,su2;
//	System.out.println("수 입력: ");
//	su1= input.nextInt();
//	
//	for(int i=su1;i<10;i++) {
//		for(int j=1; j<10; j++) {
//			System.out.print(i+"x"+j+"="+i*j+"\t");
//		}System.out.println();
//	}

	
	
//	Scanner input = new Scanner(System.in);
//	System.out.println("수 입력: ");
//	int n= input.nextInt();
//	
//	for (int i=1;i<=n;i++) {
//		System.out.println(i);
//	}
	
//	Scanner input = new Scanner(System.in);
//	int []score = new int[4];
//	String[] sub = {"국어","영어","수학","과학"};
//	int index=0, total=0;
//	
//	for(String s: sub) {
//		System.out.println(s+"점수입력");
//		score[index] = input.nextInt();
//		total+=score[index];
//		index++;
//	}
//	System.out.println("4과목 평균점수: "+total/4);
//	for(int i=0; i<score.length;i++) {
//		if(total/4>score[i]) {
//			System.out.println(sub[i]+"과목을 점수:"+score[i]+",평균이하");
//		}
//	}
	


//	String s = "*";
//	int count = 0;
//	
//	for(int i = 0; i < 9; i++) {
//				
//		System.out.println();
//		if(i < 5 ) {
//			count++;
//		} else {
//			count--;
//		}
//		
//		
//		for (int j = 0; j < count; j++) {
//			
//			System.out.print(s);
//		}
//	}
	
	int[] arr = new int [900] ;
	int count=0;
	for(int i=1;i<=30;i++) {
		for(int j=1;j<=i;j++) {
			arr[count]=j;
			count++;
		}for(int k =i-1;k>=1;k--) {
			arr[count]=k;
			count++;
		}
	}
	
	
}
}
