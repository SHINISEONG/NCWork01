public class Test3{
	public static void main(String[] args){
		int a=0;
		for (int i=0;i<args.length ; i++)
		{
			a=Integer.parseInt(args[i]);
			if (a % 2 == 0 ) {
				if(a % 3 == 0){
					System.out.println("�Է��Ͻ� "+(i+1)+"��° ���ڰ� \"" + a + "\" ��(��) ¦�� �̸� 3�� ����Դϴ�.");
				} else {
					System.out.println("�Է��Ͻ� "+(i+1)+"��° ���ڰ� \"" + a + "\" ��(��) ¦�� �̸� 3�� ����� �ƴմϴ�.");
				}				
			} else if(a % 3 == 0) {
				System.out.println("�Է��Ͻ� "+(i+1)+"��° ���ڰ� \"" + a + "\" ��(��) Ȧ�� �̸� 3�� ����Դϴ�.");
			} else{
				System.out.println("�Է��Ͻ� "+(i+1)+"��° ���ڰ� \"" + a + "\" ��(��) Ȧ�� �̸� 3�� ����� �ƴմϴ�.");
			}
		}//end of for

	}//end of main
}//end of class