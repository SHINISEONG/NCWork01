//package jb01.part02;

public class Hello
{
    public static void main(String[] args){
        System.out.println("Hello Java :: �ȳ� �ڹ�");
    }
}

/*
	<<���ǻ��� �� ��ӻ���>>
	1. class name �� file name�� �����ؾ� �Ѵ�.(��ҹ��� ����)
		ex) public class Hello�� --> Hello.java (File name)
	2. ��ҹ��ڸ� ����
	3. ����� public static void main(String[] args)�ʿ�
	4. System.out.println(~~~); --> ~~~ ���
	5. Hello.java ������ �� Hello.class(ByteCode) ���� Ȯ��

	<<Consonle���� compile & run>>
	2. compile
		1) file ���� ���丮 �̵� �� javac [Ȯ���� ���� file name]
			c:\work>javac Hello.java
		2) classfile ����Ȯ�� (Hello.class)
			c:\work>dir

	3. run
		3) classȮ���ڸ� ������ FileName
			c:\work>java Hello(.class<-����)

			<<EditPlus ȯ�漳�� : ������, �������ϱ�>>
			-->����/������ �������� ����� �� ����.
 */