// package jb02.part02;
class  WhileTest
{
	public static void main(String[] args) 
	{
		int i = 0;
		while(i<10){
			System.out.println("여기는 와일문 내부입니다. i = " + i );
			i++;
		}

		int j=0;
		do{
			System.out.println("\n\t여기는 Do문 내부 입니다 j = " + j);
			j++;
		} while(j<1);

		int k=1;
		while(k<10){
			System.out.println("5 * "+k+" = " + (5*k));
			k++;
		}
		int a=1;
		while(true){
			System.out.println("여기는 반복문 내부의 무한루프");
			a++;
			if (a>10)
			{
				break;
			}
		}
	}
}
