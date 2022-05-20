package day06;

public class Ex01 {
public static void main(String[] args) {
//	int su1, su2;
//	for (su1=1; su1<=5;su1++) {
//		System.out.println("=====for시작");
//		for(su2=1;su2<=5;su2++) {
//			System.out.println(su1+":"+su2);
//		}
//		System.out.println("for끝====");
//	}
//	int sum=0;
//	for(int i=1; i<10000; i++) {
//		if(i%2==0)
//			sum+=i;
//	}
//	System.out.println("1~10000 짝 합: "+sum);
	//문제1
	/*
	 * int su1,su2;
	 * 
	 * for(su1=2; su1<10;su1++) { for(su2=1; su2<10;su2++) {
	 * System.out.println(su1+"x"+su2+"="+(su1*su2)); }
	 * System.out.println("=====구구단"+su1+"단 끝"); }
	 */	
	//문제2
//	int su1, su2;
//	
//	for (su1=1;su1<6;su1++) {
//		for(su2=1;su2<6;su2++) {
//			System.out.print(su1*su2+"\t");
//		}
//		System.out.println("\n");
//	}
	
	// 문제3
	int su1, su2;
	for(su1=1;su1<26;su1++) {
		
		for(su2=0;su2<5;su2++ ) {
			System.out.print(su1+su2+"\t");
		}System.out.println("\n");
		su1+=4;
	}
	
	
	/*
	   int su=1,num=1;
   for(int i=1;i<=5;i++){
      num = i*5;
      for(int j=su;j<=num;j++){
         System.out.print(j+"\t"); 
      }
      System.out.println();
      su=num+1;
   }
   System.out.println("2번째");
   for(int i=0;i<5;i++) {
      for(int j=1;j<6;j++) {
         System.out.print(j+(5*i)+"\t");
      }
      System.out.println();
   }
   System.out.println("3번째");
   for(int i=1;i<22;i+=5) {
      System.out.print(i+" ");
      for(int j=1;j<5;j++) {
         System.out.print(j+i+" ");
      }
      System.out.println();
   }
}

	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
