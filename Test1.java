public class Test1 {
	public static void main(String[] args){

		if (args.length == 2)
		{
			System.out.println("���� �̸��� \"" + args[0] + "\"�Դϴ�.");
			System.out.println("\""+args[0] + "\"���� [����Ʈ�� ��ȣ]�� \"" + args[1] + "\" �Դϴ�.\n\n");
			
			String name = args[0];
			String pNum = args[1];
			System.out.println("���� �̸��� \"" + name + "\"�Դϴ�.");
			System.out.println("\""+ name + "\"���� [����Ʈ�� ��ȣ]�� \"" + pNum + "\" �Դϴ�.");

		} else {
			System.out.println("���ڴ� \"�̸�\", \"����Ʈ�� ��ȣ\" �� ������ �Է��� �ּ���.");
		}
	}//end of main
}//end of class