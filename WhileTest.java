// package jb02.part02;
class  WhileTest
{
	public static void main(String[] args) 
	{
		int i = 0;
		while(i<10){
			System.out.println("����� ���Ϲ� �����Դϴ�. i = " + i );
			i++;
		}

		int j=0;
		do{
			System.out.println("\n\t����� Do�� ���� �Դϴ� j = " + j);
			j++;
		} while(j<1);

		int k=1;
		while(k<10){
			System.out.println("5 * "+k+" = " + (5*k));
			k++;
		}
		int a=1;
		while(true){
			System.out.println("����� �ݺ��� ������ ���ѷ���");
			a++;
			if (a>10)
			{
				break;
			}
		}
	}
}