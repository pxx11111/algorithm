package test;

	public class TestB extends Test//集成TestA
	{
	public TestB()
	{
	System.out.println("没有参数的构造函数");
	}
	public TestB(String msg)
	{
	super(msg);
	}


	public static void main(String[] args)
	{
	// TODO 自动生成的方法存根


	TestB test3 = new TestB();
	TestB test2 = new TestB("hello");
	}


	}

