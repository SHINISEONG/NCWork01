public class  Example2
{
	public static void main(String[] args) 
	{
		if (args.length == 1)
		{
			int gugudan = Integer.parseInt(args[0]);
			if (gugudan >= 1 && gugudan <=9)
			{
				System.out.println(gugudan + "���� ����մϴ�.");
				System.out.println("==================================");
				for (int i=1; i<=9; i++)
				{
					System.out.println(gugudan+" x "+ i + " = " + (gugudan*i));
				}
			} else{
				System.out.println("�������� 1�ܺ��� 9�ܱ����� �����մϴ�.");
			}
		} else {
			System.out.println("�μ��� �ϳ��� �Է��� �ּ���.");
		}
	} //end of main
} // end of class