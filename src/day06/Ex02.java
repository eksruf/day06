package day06;

import java.util.Scanner;

public class Ex02 {
public static void main(String[] args) {
	/*
	 �迭
	 -���� �ڷ������� ���ӵ� ������ ����� ��.
	 -�迭�� ���ٽ� index�� ����Ͽ� �����Ѵ�.
	 -index(÷��)�� 0���� �����Ѵ�.
	 -�ڷ���[] �迭�� �Ǵ� �ڷ��� �迭��[] �����Ѵ�.
	 
	 */
	
//	int[] arr= new int [5];
//	int num=1;
//	/*
//	arr[num]=500;
//	arr[0]=100;
//	arr[2]=200;
//	*/
//	System.out.println("arr[0]: "+arr[0]);
//	System.out.println("arr[1]: "+arr[1]);
//	System.out.println("arr[2]: "+arr[2]);
//	System.out.println("arr[3]: "+arr[3]);
//	System.out.println("arr[4]: "+arr[4]);
//	
//
	int [] arr = new int [5];
	System.out.println(arr.length);
	for(int i=0;i<5;i++) {
		arr[i]= 100*(i+1);
		System.out.println(arr[i]);
	//	System.out.println("arr["+i+"]: "+ (i+1)*100);
	}
//	int[] arr = new int[15];		
//	System.out.println(arr.lenght);
	
	//int[] str = new int [] {10,20,30,40}; 
	int[] str = {10,20,30,40}; //new int [] ��������
	for(int s :str) {
		System.out.println(s);
	}
	
	
	
	String[]names = new String[3];
	Scanner input = new Scanner(System.in);
	for (int i=0; i<names.length;i++) {
		System.out.println(i+"�̸� �Է�");
		names[i]= input.next();
	}
	for (int i=0; i<names.length; i++) {
		System.out.println(names[i]);
	}
	
	for (String n : names) {
		System.out.println("�̸�: "+n);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
