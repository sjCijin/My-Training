package newproject;

public class AllPublic {
	public void method1()
	{
		int a=35;
	  float b=45;
		float sum=a+b;
		System.out.println(sum);
	}
		@SuppressWarnings("unused")
		private void method2()
		{
			int c=56;
			int d=45;
			float mean=c+d/2;
			System.out.println(mean);
		}
		protected void method3()
		{
			System.out.println("Protected");
		}
		void method4()
		{
			System.out.println("Default value");
		}
}
//Same class lu main method koduthal ellam call cheyan pattum

