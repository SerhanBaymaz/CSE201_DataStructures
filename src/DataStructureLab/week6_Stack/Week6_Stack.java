package DataStructureLab.week6_Stack;
import java.util.Stack;


public class Week6_Stack {

    public static int elimate(String[] words){
        Stack<String> stack = new Stack<String>();

        for (String word : words) {
            if (stack.isEmpty()) {
                stack.push(word);
            } else {
                if (stack.peek().equals(word)) {
                    stack.pop();
                } else {
                    stack.push(word);
                }
            }
        }



        return stack.size();

    }

    //write a recursive method that sum all the numbers in the ONE-dimensional array.
    public static int sumOneDimension(int[] array1,int min,int max){
        if(min<=max){
            return array1[min]+array1[max]+sumOneDimension(array1,++min,--max);
        }else{
            return 0;
        }
    }

    //write a recursive method that sum all the numbers in the two-dimensional array.
    public static int sumTwoDimension(int[][] array, int row, int col){
        if (row == array.length) {
            return 0;
        } else if (col == array[row].length) {
            return sumTwoDimension(array, row + 1, 0);
        } else {
            return array[row][col] + sumTwoDimension(array, row, col + 1);
        }
    }


    public static void main(String[] args) {
        System.out.println("************************************OUTPUT************************************");
        //write a program to eliminate the duplicate words two times in a sentence.
        String s = "abc def abc ghi jkl mno mno mno stu stu vwx yz";
        String[] words = s.split(" ");

        Stack<String> stack = new Stack<String>();
        for (String word : words) {
            if (stack.isEmpty()) {
                stack.push(word);
            } else {
                if (stack.peek().equals(word)) {
                    stack.pop();
                } else {
                    stack.push(word);
                }
            }
        }

        System.out.print("Remaining elements in stack are : ");
        for (String word : stack) {
            System.out.print(word + " ");
        }
        System.out.println("\nStack has "+stack.size()+" elements");

        System.out.println();




        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Sum of one dimension array : " + sumOneDimension(array1,0,array1.length-1));





        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Sum of one dimension array : "+sumTwoDimension(array, 0, 0));
        //what is running time of the method?
        //O(n^2)
        //what is the space complexity of the method?
        //O(n)




        System.out.println("************************************OUTPUT************************************");
    }

}

