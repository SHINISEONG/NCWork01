//package jb01.part04;

/* 
	1. Java���� �����Ǵ� 8EA�� Primitive Data Type�� ����
	2. Variable declaration(��������)�� Variable Assignment(���� ����)
*/
public class PrimitiveTest{
	public static void main(String[] args){
		boolean boo=true;
		
		char c = 'ȫ';
		
		byte b = 127;
		// ������ �Ѿ�� ���� �Է½� ���� ���� �Ʒ� �ڸ�Ʈ �� ����
		// byte b1 = 128;
		
		// ������
		short s = 1000;
		int i = 1000;
		long l = 1000L; // <- Long�� ��� L�� int�� ����
		
		// �Ǽ���
		float f= 1000.5F; // <- float�� ��� f�� double�� ����
		double d = 100.5;
		
		//print()�� println()�� ������
		System.out.print("�ڹ��� Primitive Data Type�� ++");
		System.out.println("::����Ͽ� ǥ�������ġ�� ,,," + ":: ���");
		
		//+�������� �ǹ� (���ڿ� + �����ڰ� ���Ǹ� append)		
		System.out.println("���� : " + boo);
		System.out.println("������ : " + c);
		System.out.println("������ byte : " + b);
		System.out.println("������ short : " + s);
		System.out.println("������ int : " + i);
		System.out.println("������ long : " + l);
		System.out.println("�Ǽ��� float : " + f);
		System.out.println("���� double : " + d);
		
		
		
	}
	
}
