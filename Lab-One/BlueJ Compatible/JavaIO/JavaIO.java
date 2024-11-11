public class JavaIO{
	public static void main(String[] args){
	  int x=10,y=30;
	  System.out.println("This displays a line of text");
	  System.out.print("This line appears underneath the first,");
	  System.out.print(" and this appears next to that\n");

	  System.out.printf("This line uses printf with %d specifier\n", 1);
	  System.out.format("This line uses format with %d specifier%n", 1);

	  System.out.println("x * y = " + x * y);
	  System.out.println("x + y = " + x + y);
	}
}
