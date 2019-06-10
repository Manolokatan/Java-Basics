import java.util.Scanner;

public class Main {


    static void myIfElse()// we will put some code here then call it in the main(were code is executed)
    {
        Scanner in = new Scanner(System.in);// open a scanner in order to get input from the user

        System.out.println("please enter you're name: "); // print to screen
        String name = in.nextLine(); // declare and get input

        System.out.println("please enter the password: ");
        int password = in.nextInt(); // get integer input

        if(name.equals("james") && password == 123)// if name equals james and password is equal to 123
        {
            System.out.println("Correct, welcome back");
        }
        else
        {
            System.out.println("Incorrect, please try again later");
        }

        in.close(); // close scanner
    }

    static void myForLoop()
    {
        Scanner in = new Scanner(System.in);// open a scanner in order to get input from the user

        System.out.print("please enter the number of loops: "); // print this to the user
        int numberOfLoops = in.nextInt(); // declare and get integer input from the user

        //create a variable called i,while i is smaller then numberOfLoops do what is in the brackets
        for(int i = 0; i < numberOfLoops; i++) // i++ means that at the end of the loop add 1 to i
        {
            System.out.println("i is currently equal to: " + i); // while in the loop print this to the user
        }
        in.close();// close the scanner
    }

    static void myAdvancedLoop()
    {
        int[] myNumbers = {1,2,3};
        for(int i : myNumbers) // go over the array and print out each index
        {
            System.out.println("the current i is: " + i); // print to screen
        }
    }

    static void myArray()
    {
        int limit = 5; // this will be the number of variables we will have in our array
        double[] mydoubleArray = new double[limit]; // this will be our array, it will have limit variables in it

        for(int i = 0; i < limit; i++) // for loop while i is smaller then limit
        {
            mydoubleArray[i] = i + .5; // mydoubleArray in index 0(which starts at 0) equals to i + .5
        }

        // now that we have the values lets print the array

        for(double a : mydoubleArray) // use a short for loop
        {
            System.out.print(a + ", "); // print each index one by one
        }
    }





    public static void main(String[] args)
    {
        //call the functions into the main


        //unquote to these to run:

        //myIfElse();

        //myForLoop();

        //myAdvancedLoop();

        //myArray();
    }
}
