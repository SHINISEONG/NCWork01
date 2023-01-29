//package jb01.part03;

public class Hi
{
	public static void main(String[] args){
		System.out.println("1번째 정보 : " + args[0]);
		System.out.println("2번째 아구먼트 : " + args[1]);
		System.out.println("3번째 인자 : " + args[2]);
	}
}

/*
	javac Hi.java <- 컴파일
	
	java Hi 홍길동 1234 한양 5678
	Hi.class 실행 시 Java Hi 후단에 추가적 정보를 입력하면
	1번째 주가적 정보는 args[0]
	2번째 주가적 정보는 args[1]
	3번째 주가적 정보는 args[2]
	fh qkedktj cjflgkf tn dlTek.
	
	3. +(연산자) : 연산자 문자에 +를 사용하면 append된다.
	
	4. editplus 에서 인자값 받기 설정
		문서/영구적설정/사용자도구/인수내용 묻기 check
*/