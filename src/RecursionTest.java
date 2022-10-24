import java.util.Scanner;

public class RecursionTest {

    public static void helloWorldRecursion(int n){
        //base case:
        if (n>0){
            System.out.println("Hello world "+n);
            n--; //decrement

            helloWorldRecursion(n); //recall the method
        }
    }

    public static void walkingRemainingInMetersRecursion(int startingPoint , int distance){
        if (startingPoint<distance){    //base condition
            startingPoint++;  //increment
            System.out.println("you're now at "+startingPoint+". point.");
            System.out.println("Remaining distance is :"+(distance-startingPoint));
            System.out.println();

            walkingRemainingInMetersRecursion(startingPoint,distance); //recall the method.
        }else {
            System.out.println("You are reach the point.");
        }
    }

    public static double factorialIterative(double number){

        double faktoriyel_1=1;
        for(int i=1;i<=number;i++){

            faktoriyel_1=faktoriyel_1*i;
        }
        return faktoriyel_1;
    }
    public static double factorialWithRecursion(double number){
        if (number > 0){   //BaseCase
            return number*factorialWithRecursion(--number); // recall the method and decrement part.
        }else {
            return 1;
        }

    }

    public static int sumOf1toN(int n){
        if (n>0){   //BaseCase
            return n+sumOf1toN(--n);    // recall the method and decrement part.
        }else{
            return 0;
        }
    }





    public static void main(String[] args)  {
        System.out.println("****************************************************************************************************************************");

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many times do you want to write hello world  --->");
        int n = scanner.nextInt();
        helloWorldRecursion(n);



        System.out.print("Please enter the starting point  --->");
        int startingPoint = scanner.nextInt();
        System.out.print("Please enter the distance  --->");
        int distance = scanner.nextInt();
        walkingRemainingInMetersRecursion(startingPoint,distance);



        System.out.print("Please enter the number to calculate factorial  --->");
        double factorial = scanner.nextInt();
        System.out.println(factorial+"! is --> "+factorialWithRecursion(factorial));



        System.out.print("Plase enter the number for find the sum of 1to your number ---> ");
        int numberForSum = scanner.nextInt();
        System.out.println("1+2+3+ ... +"+numberForSum+" ="+sumOf1toN(numberForSum));



        System.out.println("****************************************************************************************************************************");
    }
}
