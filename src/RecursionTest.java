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

    public static int addAllNumbersInArray(int[] arr,int arrLength) {

        int lastIndex = arrLength-1;
        if(lastIndex==-1){
            return 0;
        }

        return arr[lastIndex] + addAllNumbersInArray(arr, arrLength-1);

    }

    public static int[] reverseArray(int[] arr,int firstIndex,int lastIndex) {

        /*
         *          0   1   2   3   4   5   6   7   8   9
         *          5   7   8   1   2   6   8   4   2   3
         *
         *          3                                   5
         *              2                           7
         *                            .
         *                            .
         *                            .
         *                          6  2
         *
         *      if(first>=last)
         *              return arr
         *      else
         *          do the changes
         *          return reverse(arr,first+1,last-1)
         *
         */


        if(firstIndex>=lastIndex){
            return arr;
        }else{
            int temp = arr[firstIndex];
            arr[firstIndex] = arr[lastIndex] ;
            arr[lastIndex] = temp;

            return reverseArray(arr, firstIndex+1, lastIndex-1);
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


        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(addAllNumbersInArray(arr2, arr2.length));










        int[] arr3 = {1,2,3,4,5,6,7,8,9};

        System.out.print("before sort : ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+",");
        }

        int[] arr4 = reverseArray(arr3, 0, arr3.length-1);

        System.out.println();
        System.out.print("after  sort : ");
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i]+",");
        }
        System.out.println();








        System.out.println("****************************************************************************************************************************");
    }
}
