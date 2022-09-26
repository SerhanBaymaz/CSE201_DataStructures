import java.util.HashSet;
import java.util.Set;

public class Homework1 {
    /*
    1)Write a short method in any language that counts the number of a,e,i,u characters in a given character string.
     */
    public static int vowelCounter(String s){
        int count = 0;

        for(int i=0;i<s.length();i++){
            if (s.charAt(i)=='a'){
                count++;
            }else if(s.charAt(i)=='e'){
                count++;
            }else if(s.charAt(i)=='i'){
                count++;
            }else if(s.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }


    /*
    2)Write a method that takes an array of float values and determines
     if all the numbers are different from each other (that is, they are distinct) up to 4 digits after point.
     */
    public static boolean areAllDifferent(float[] arr){
        /*
        1)Firstly I round all numbers to #.#### format.
        2)then i created a SET, because;
         If some numbers are same , array's size won't be equal to set's size.
        3)So if all numbers are different it will return true.
         */
        Set<String> set1 = new HashSet<String>();
        for (int i = 0; i <arr.length ; i++) {
            String cuttedNumberToFourDecimal = String.format("%.4f", arr[i]); //converting .4 decimal
            set1.add(cuttedNumberToFourDecimal);
        }

        return set1.size()== arr.length;

    }



    /*
    3)Write a method that takes an array containing the set of all integers in the range 1 to 52
    and shuffles it into random order. Your method should output each possible order with equal probability.
     */
    public static int[] shuffleTheCards(int[] arr){
        int[] shuffledCards = new int[52];
        int lastIndex = arr.length-1;

        for (int i = 0; i <arr.length ; i++) {
            int randomIndex = (int) (Math.random()*lastIndex);
            shuffledCards[i] = arr[randomIndex];
            arr[randomIndex] = arr[lastIndex];
            lastIndex--;
        }
        return shuffledCards;
    }




    public static void main(String[] args) {
        /*
        first questions' test
         */
        String s1 = "1 a, 2 ee, 3 iii, 4 uuuu,sdfghjk";
        System.out.println(vowelCounter("Number of  a,e,i,u in sentence is :  "+s1));



        /*
        second questions' test
         */
        float[] arr1 = {5.66545615f,5.66546464f,5.6684543f};
        System.out.println(areAllDifferent(arr1));



         /*
        third questions' test
         */
        //1)creating array [1,2,3,4 ... 51,52]
        int[] cardNums = new int[52];
        for (int i = 0; i < 52; i++) {
            cardNums[i]=i+1;
        }

        //2)call the method
        int[] outputArr = shuffleTheCards(cardNums);
        System.out.print("Shuffled cards are : ");
        for (int i = 0; i < cardNums.length; i++) {
            System.out.print(outputArr[i]+" ");
        }

    }
}
