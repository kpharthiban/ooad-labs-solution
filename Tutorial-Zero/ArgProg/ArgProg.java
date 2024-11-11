class ArgProg
{
    public static void main(String[] a){
        if(a.length==0)
            System.out.println("Welcome to Java");
        else
            System.out.println("This is my first Java program of " + a[0]);
    }
}

/*
 * 1. What is the name of the save file for this program? (ArgProg.java)
 * 2. What is the file output of the compilation process? (Welcome to Java)
 * 3. What does the code statement (a.length==0) tell the program? (Check if the length of the list of strings(a) is equals to 0/Checks if there is any arguments passed.)
 * 4. What happens if no arguments are passed? (The program will output -> Welcome to Java)
 * 5. What happens when two or more arguments are passed? (The program will print -> This is my first Java program of <the-first-argument>)
 */