//package jb03.part04;
public class  MethodSyntax
{
	String name = "ȫ�浿";
	String addr = "�Ѿ�";

	public void browerOn(){
		System.out.println("brower�� �׽��ϴ�.");
	}

	public boolean documentWork(){
		System.out.println("document�۾��� �ϰ� �۾��ϼ� ������ boolean return");
		return true;
	}
	
	public int sum(int i, int j){
		System.out.println("<<"+i+">> �� <<"+j+">> ���� �޾� �� retrun");
		return (i+j);
	}

	public String getName(){
		System.out.println("�̸��� �����մϴ�.");
		return name;
	}

	public String getAddr(){
		System.out.println("�ּҸ� �����մϴ�.");
		return addr;
	}

	public String[] getAllInformation(){
		String[] str = { name, addr };
//		String[] str = { "ȫ�浿", "�Ѿ�" };
		return str;
	}
}// end of class