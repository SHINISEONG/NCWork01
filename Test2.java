public class Test2{
	public static void main(String[] args){
		
		if (args.length==2)
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			String msg = "";
			if (a!=b)
			{
				msg = (a>b)? ("ù ��° �μ� : " + a + ", �� ��° �μ� : " + b +", "+ a + "-" + b + "=" + (a-b)+"�Դϴ�.") : ("ù ��° �μ� : " + a + ", �� ��° �μ� : " + b +", "+ b + "+" + a + "=" + (a+b)+"�Դϴ�.");
			}
			else {
				msg = "�� ���� ���׿�";
			}
				System.out.println(msg);

		} else {
			System.out.println("�μ��� 2������ �Է��� �ּ���");
		}
	}//end of main
}//end of class