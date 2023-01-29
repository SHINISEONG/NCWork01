public class  Prob06
{
	public static void main(String[] args) 
	{
		int year = 2400;
		int month = 2;
		int maxDay = 0;

		switch (month)
		{
		case 2 : 
			if(year % 4 == 0){
				if(year % 100 == 0){
					if(year % 400 ==0){
						maxDay = 29;
						break;
					}
					maxDay = 28;
					break;
				}
				maxDay = 29;
				break;
			}
			maxDay=28;
			break;
		case 4: 
		case 6: 
		case 9: 
		case 11: 
			maxDay = 30;
			break;
		default :
			maxDay = 31;
			break;
		
		}
		System.out.println(year + "년 " + month + "월의 말일은 "+maxDay+"일 입니다");
	} // end of main
} // end of class
