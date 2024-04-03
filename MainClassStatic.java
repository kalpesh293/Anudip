package ClassDemo;


		

		class StaticBlock {

			static int staticVariable;
			
			static
			{
				System.out.println("Static initilization block(SIB) Ststic Component");
				staticVariable=10;
			}
			static void staticMethod()
			{
				System.out.println("from a static method ");
				System.out.println(staticVariable);
			}

		}

		public class MainClassStatic {
		static
		{
			System.out.println("main class SIB");
		}
			public static void main(String[] args) {
				
				StaticBlock.staticVariable=20;
				StaticBlock.staticMethod();
			}

		

	}


