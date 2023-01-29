public class Example1 {
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		
		/*
		if (a>=0 && a<=100) {
			
			if (a>=90) {
				System.out.println("입력하신 점수 " + a + "점은 수입니다.");
			} else if (a>=80) {
				System.out.println("입력하신 점수 " + a + "점은 우입니다.");
			} else if (a>=70) {
				System.out.println("입력하신 점수 " + a + "점은 미입니다.");
			} else if (a>=60) {
				System.out.println("입력하신 점수 " + a + "점은 양입니다.");
			} else {
				System.out.println("입력하신 점수 " + a + "점은 가입니다.");
			}
		}
 		else {
			System.out.println("0과 100사이의 수로 입력해야 합니다.");
		}
		*/
		if (args.length != 1)
		{
			System.out.println("점수 인자는 하나만 입력하세요.");
			return;
		}

		if (a<0 || a>100)
		{
			System.out.println("0과 100사이의 수로 입력해야 합니다.");
			return;
		}
		String grade = "수";
		switch (a/10)
		{
			case 10:
			case 9:
				break;
			case 8:
				grade = "우";
				break;
			case 7:
				grade = "미";
				break;
			case 6:
				grade = "양";
				break;
			default :
				grade = "가";
				break;
		}
		System.out.println("입력하신 점수 " + a + "점은 \""+grade+"\"입니다.");
	}//end of main
}//end of class