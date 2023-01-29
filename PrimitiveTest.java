//package jb01.part04;

/* 
	1. Java에서 제공되는 8EA의 Primitive Data Type의 이해
	2. Variable declaration(변수선언)과 Variable Assignment(값의 대입)
*/
public class PrimitiveTest{
	public static void main(String[] args){
		boolean boo=true;
		
		char c = '홍';
		
		byte b = 127;
		// 범위를 넘어가는 수를 입력시 오류 발행 아래 코멘트 문 참조
		// byte b1 = 128;
		
		// 정수형
		short s = 1000;
		int i = 1000;
		long l = 1000L; // <- Long의 경우 L로 int와 구별
		
		// 실수형
		float f= 1000.5F; // <- float의 경우 f로 double과 구별
		double d = 100.5;
		
		//print()와 println()의 차이점
		System.out.print("자바의 Primitive Data Type을 ++");
		System.out.println("::사용하여 표준출력장치로 ,,," + ":: 출력");
		
		//+연산자의 의미 (문자와 + 연산자가 사용되면 append)		
		System.out.println("논리형 : " + boo);
		System.out.println("문자형 : " + c);
		System.out.println("정수형 byte : " + b);
		System.out.println("정수형 short : " + s);
		System.out.println("정수형 int : " + i);
		System.out.println("정수형 long : " + l);
		System.out.println("실수형 float : " + f);
		System.out.println("논리형 double : " + d);
		
		
		
	}
	
}
