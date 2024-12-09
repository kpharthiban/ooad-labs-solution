public class JavaIO{
	public static void main(String[] args){
	  int x=10,y=30;
	  System.out.println("This displays a line of text");
	  System.out.print("This line appears underneath the first,");
	  System.out.print(" and this appears next to that\n");

	  System.out.printf("This line uses printf with %d specifier\n", 1);
	  System.out.format("This line uses format with %d specifier%n", 1);

	  System.out.println("x * y = " + x * y);
	  System.out.println("x + y = " + (x + y));
	}
}

/*
 * 1.	What is the name of the class in this Java program? (JavaIO)
 * 2.	What should the filename of the program be saved as? (JavaIO.java)
 * 3.	What specifier replaces ‘%d’ if you wanted to print the string "one" instead of a digit? (%s)
 * 4.	What is wrong with output in the last println statement? (The output is supposed to be "x + y = 40" and NOT "x + y = 1030")
 * 5.	How do you fix the last println statement? (--> System.out.println("x + y = " + (x + y)))
 */