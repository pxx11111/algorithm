package test;

	public class TestB extends Test//����TestA
	{
	public TestB()
	{
	System.out.println("û�в����Ĺ��캯��");
	}
	public TestB(String msg)
	{
	super(msg);
	}


	public static void main(String[] args)
	{
	// TODO �Զ����ɵķ������


	TestB test3 = new TestB();
	TestB test2 = new TestB("hello");
	}


	}

