package jb01.part07;

/*
	1. 문자를 int DataType으로 변경하는 Integer.parseInt() 사용
	2. 특수문자를 사용하기 (\t, \n, \")
	
	실행 방법 예 >> java IfElseETC 1 2
*/

public class IfElseETC{
	public static void main(String[] args){
		System.out.println("입력하신 \"1번째인수\"는 : " + args[0]);
		System.out.println("입력하신 \"2번째인수\"는 : " + args[1]);
		System.out.println("================================");
		
		//입력한 문자를 int DataType으로 변경하는 Integer.parseInt() 사용
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		
		//i, j변수값 확인
		System.out.println("i="+i+"\t,j="+j);
		System.out.println("한줄처리\n");
		System.out.println("================================");
		
		if(i>j){
			System.out.println("i 가 j 보다 큽니다.");
		} elseif(i==j){
			System.out.println("i 가 j 와 같습니다.");
		} elseif(i<j){
			System.out.println("i 가 j 보다 작습니다.");
		}
		
	}
}