package jb01.part08;


// 분기문 switch 연습

public class SwitchTest{
	public static void main(String[] args){
		int inputData = Integer.parseInt(args[0]);
		
		switch(inputData){
			case 1:
				System.out.println("입력하신 값은 1입니다.");
				break;
			case 2:
				System.out.println("입력하신 값은 2입니다.");
				break;
			case 3:
				System.out.println("입력하신 값은 3입니다.");
				break;
			case 4:
				System.out.println("입력하신 값은 4입니다.");
				break;
			case 5:
				System.out.println("입력하신 값은 5입니다.");
				break;
			default:
				System.out.println("case문을 다 통과 <- 동일 상수가 없을 경우");
				System.out.println("default가 수행됨.. 입력하신 수는"+inputData+"입니다.");
				break;
		}
		
	}
}

//case1의 break를 코멘트처리하고 실행해보자. --> break; 의 역할 확인
