package test;

public class Test {
	
	/**
	* �޲����Ĺ��캯��
	*/
	public Test()
	{
	System.out.println("�޲����Ĺ��캯����");
	}
	/**
	* ����String�����Ĺ��캯��
	*/
	public Test(String msg)
	{
	System.out.println("����String�����Ĺ��캯����"+msg);
	}
	public static void main(String[] args)
	{
	// TODO �Զ����ɵķ������
	Test test = new Test();//�½��޲�������
	Test test1 = new Test("hello");//�½�String��������
	}

	}

