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

    public static void main(String[] args) {

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

        for (String word : stack) {
            System.out.print(word + " ");
        }







    }

}

