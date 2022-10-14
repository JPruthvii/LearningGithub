package JAVA_EMPIRE;

public class Patterns {
	public static void main(String[] args) {
		int no = 4;
		for (int i = 0; i < no; i++) {
			for (int j = 0; j < no; j++)
			{
				if(i==0&&j==0||i==4&&j==4)
				{
	                System.out.print("*");
				}
			}
			
			System.out.println();
		}
	}
}
