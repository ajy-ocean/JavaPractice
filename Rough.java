import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Rough {

    public static void main(String[] args) {

        // Reverse operation using StringBuilder class
        /*
         * String name = "Ajay";
         * System.out.println("Before reverse operation:-" + name);
         * StringBuilder value = new StringBuilder();
         * value.append(name);
         * value.reverse();
         * System.out.println("After reverse operation:-" + value);
         */

        // Reverse Operation using by using toCharArray
        /*
         * String name = "Ajay Rawat";
         * char[] value = name.toCharArray();
         * int length = value.length;
         * for (int i = length - 1; i >= 0; i--) {
         * System.out.print(value[i]);
         * 
         * }
         */

        // Reverse Operation using charAt()
        /*
         * Scanner scanner = new Scanner(System.in);
         * System.out.println("Enter name to reverse it");
         * String name = scanner.nextLine();
         * int stringLength = name.length();
         * String value = "";
         * 
         * for(int i = stringLength-1; i>=0; i--){
         * value = value + name.charAt(i);
         * }
         * System.out.println(value);
         */

        // Reverse operation for a number
        /*
         * Scanner scanner = new Scanner(System.in);
         * System.out.println("Enter a number");
         * int number = scanner.nextInt();
         * System.out.println("Before Reverse operation = " + number);
         * int mod = 0;
         * int reverse = 0;
         * 
         * while(number != 0){
         * mod = number % 10;
         * reverse = (reverse * 10) + mod;
         * number = number/10;
         * }
         * System.out.println("After Reverse operation = " + reverse);
         * 
         * for(; number != 0; number = number/10){
         * mod = number % 10;
         * reverse = (reverse * 10) + mod;
         * }
         * System.out.println("After Reverse operation = " + reverse);
         */
        /* ========================================================= */
        /* ========================================================= */

        // Swapping numbers
        /*
         * Scanner scanner = new Scanner(System.in);
         * System.out.println("Enter two numbers");
         * 
         * int firstNum = scanner.nextInt();
         * int secondNum = scanner.nextInt();
         * System.out.println("Numbers before swapping = " + firstNum + " " +
         * secondNum);
         * 
         * int temp;
         * temp = firstNum;
         * firstNum = secondNum;
         * secondNum = temp;
         * 
         * System.out.println("Numbers after swapping = " + firstNum + " " + secondNum);
         */

        // Swapping numbers without using third variable
        /*
         * Scanner scanner = new Scanner(System.in);
         * System.out.println("Enter two numbers");
         * int firstNum = scanner.nextInt();
         * int secondNum = scanner.nextInt();
         * System.out.println("Numbers before swapping = " + firstNum + " " +
         * secondNum);
         * 
         * firstNum = firstNum + secondNum;
         * secondNum = firstNum - secondNum;
         * firstNum = firstNum - secondNum;
         * 
         * System.out.println("Numbers after swapping = " + firstNum + " " + secondNum);
         */

        /* ========================================================= */
        /* ========================================================= */

        // Counting number of characters in a String
        /*
         * Scanner scanner = new Scanner(System.in);
         * System.out.println("Enter a name");
         * String name = scanner.nextLine();
         * int count = 0;
         * for(int i = 0; i < name.length(); i++){
         * if(name.charAt(i) != ' '){
         * count++;
         * }
         * }
         * System.out.println(count);
         */

        /* ========================================================= */
        /* ========================================================= */

        // Write a Java Program to iterate HashMap using While and advance for loop.
        /*
         * HashMap<Integer, String> hash = new HashMap<>();
         * hash.put(1, "Mary");
         * hash.put(2, "Tiffany");
         * hash.put(3, "Becky");
         * 
         * Iterator itr = hash.entrySet().iterator();
         * 
         * while (itr.hasNext()) {
         * Map.Entry me = (Map.Entry) itr.next();
         * System.out.println("Key is " + me.getKey() + " Value is " + me.getValue());
         * }
         * System.out.println("For Loop:");
         * for (Map.Entry me2 : hash.entrySet()) {
         * System.out.println("Key is: " + me2.getKey() + " Value is: " +
         * me2.getValue());
         * }
         */

        /* ========================================================= */
        /* ========================================================= */

        // Prime Number
        /*
         * Scanner scanner = new Scanner(System.in);
         * System.out.println("Enter a number");
         * int number = scanner.nextInt();
         * int count = 0;
         * 
         * for (int i = 1; i <= number; i++) {
         * if (number % i == 0) {
         * count++;
         * }
         * }
         * if (count == 2) {
         * System.out.println("The given number is a prime number");
         * } else {
         * System.out.println("The given number is not a prime number");
         * }
         * System.out.println("-------------------------------");
         * System.out.println("Alternate way");
         * System.out.println("-------------------------------");
         * int temp, num;
         * boolean isPrime = true;
         * Scanner in = new Scanner(System.in);
         * System.out.println("Enter a number");
         * num = in.nextInt();
         * in.close();
         * for (int i = 2; i<= num/2; i++) {
         * temp = num%i;
         * if (temp == 0) {
         * isPrime = false;
         * break;
         * }
         * }
         * if(isPrime)
         * System.out.println(num + " number is prime");
         * else{
         * System.out.println(num + " number is not a prime");
         * }
         */

        /* ========================================================= */
        /* ========================================================= */

        // Palindrome Program
        /*
         * Scanner scanner = new Scanner(System.in);
         * System.out.println("Enter a string");
         * String name = scanner.nextLine();
         * 
         * // string reverse logic
         * String stringPalindrome = "";
         * int stringLength = name.length();
         * for (int i = stringLength - 1; i >= 0; i--) {
         * stringPalindrome = stringPalindrome + name.charAt(i);
         * }
         * 
         * System.out.println("Reverse:-" + stringPalindrome);
         * if (name.equals(stringPalindrome)) {
         * System.out.println("The given string is palindrome");
         * } else {
         * System.out.println("The given string is not palindrome");
         * }
         * 
         * System.out.println("-----------------------------------");
         * 
         * System.out.println("Enter a number");
         * int number = scanner.nextInt();
         * int temp = number;
         * int mod = 0;
         * int reverse = 0;
         * 
         * //number reverse logic
         * while(number !=0){
         * mod = number % 10;
         * reverse = (reverse * 10) + mod;
         * number = number / 10;
         * }
         * System.out.println("Reverse:-" + reverse);
         * if(reverse == temp){
         * System.out.println("The given number is palindrome");
         * }else{
         * System.out.println("The given number is not palindrome");
         * }
         */

        /* ========================================================= */
        /* ========================================================= */

        // Fibonacci
        /*
         * Scanner scanner = new Scanner(System.in);
         * System.out.println("Enter the range for fibonacci series");
         * int range = scanner.nextInt();
         * int firstNum = 0;
         * int secondNum = 1;
         * 
         * for(int i = 0; i<=range; i++){
         * System.out.print(firstNum + ",");
         * int nextTerm = firstNum + secondNum;
         * firstNum = secondNum;
         * secondNum = nextTerm;
         * }
         */
        /* ========================================================= */
        /* ========================================================= */

        // Iterator over arraylist
        /*
         * ArrayList<String> list = new ArrayList<>();
         * list.add("Summertime Saga");
         * list.add("What A Legend");
         * list.add("Confined With Goddess");
         * list.add("City Of Broken Dreamers");
         * 
         * System.out.println("------------------------");
         * System.out.println("for-each loop");
         * for(String traverse : list){
         * System.out.println(traverse);
         * }
         * 
         * System.out.println("------------------------");
         * Iterator<String> itrList = list.iterator();
         * System.out.println("while loop");
         * while(itrList.hasNext()){
         * System.out.println(itrList.next());
         * }
         * 
         * System.out.println("------------------------");
         * System.out.println("for loop");
         * for(int i = 0; i< list.size(); i++){
         * System.out.println(list.get(i));
         * }
         */

        /* ========================================================= */
        /* ========================================================= */

        // Java Program to find the duplicate characters in a string
        /*
         * Scanner scanner = new Scanner(System.in);
         * System.out.println("Enter a name");
         * String string1 = scanner.nextLine();
         * int count;
         * 
         * //Converts given string into character array
         * char string[] = string1.toCharArray();
         * 
         * 
         * //Counts each character present in the string
         * for (int i = 0; i < string.length; i++) {
         * count = 1;
         * for (int j = i + 1; j < string.length; j++) {
         * if (string[i] == string[j] && string[i] != ' ') {
         * count++;
         * //Set string[j] to 0 to avoid printing visited character
         * string[j] = '0';
         * }
         * }
         * //A character is considered as duplicate if count is greater than 1
         * if (count > 1 && string[i] != '0'){
         * System.out.println("Duplicate characters in a given string: ");
         * System.out.println(string[i]);
         * }else{
         * System.out.println("No Duplicate characters in a given string");
         * break;
         * }
         * 
         * System.out.println("-------------------------------");
         * System.out.println("Alternate way");
         * 
         * String str =
         * "This is a sample string with duplicate words. This is a sample string.";
         * 
         * String[] words = str.split("\\s+");
         * int counts = 0;
         * System.out.println("Duplicate words in the string:");
         * for (int i = 0; i < words.length; i++) {
         * if (words[i] != null) {
         * counts = 1;
         * for (int j = i + 1; j < words.length; j++) {
         * if (words[i].equals(words[j])) {
         * counts++;
         * words[j] = null;
         * }
         * }
         * if (counts > 1) {
         * System.out.println(words[i]);
         * }
         * }
         * }
         */

        /* ========================================================= */
        /* ========================================================= */

        // Java Program to find the second-highest number in an array.
        /*
         * Scanner scanner = new Scanner(System.in);
         * System.out.println("Enter numbers");
         * int[] numbers = new int[5];
         * 
         * for (int i = 0; i < numbers.length; i++) {
         * numbers[i] = scanner.nextInt();
         * }
         * 
         * System.out.println("Array values");
         * for (int j = 0; j < numbers.length; j++) {
         * System.out.println(numbers[j]);
         * }
         * 
         * int largest = 0;
         * int secondLargest = 0;
         * for (int i = 0; i < numbers.length; i++) {
         * if (numbers[i] > largest) {
         * secondLargest = largest;
         * largest = numbers[i];
         * } else if (numbers[i] > secondLargest) {
         * secondLargest = numbers[i];
         * }
         * }
         * System.out.println("\nSecond largest number is:" + secondLargest);
         * System.out.println("Largest Number is: " + largest);
         */

        /* ========================================================= */
        /* ========================================================= */

        // Java Program to remove all white spaces from a string with using replace().
        /*
         * Scanner scanner = new Scanner(System.in);
         * System.out.println("Enter string");
         * String name = scanner.nextLine();
         * System.out.println("Before:-" + name);
         * 
         * String value = name.replaceAll("\\s", "");
         * System.out.println("After:-" + value);
         * 
         * System.out.println("---------------------------------");
         * 
         * // Java Program to remove all white spaces from a string without using
         * replace().
         * System.out.println("Alternate way");
         * 
         * String tempName = scanner.nextLine();
         * System.out.println("Before:-" + tempName);
         * char[] charValues = tempName.toCharArray();
         * StringBuffer sbf = new StringBuffer();
         * 
         * if((charValues[i] !=' ') && (charValues[i] != '\t')){
         * sbf.append(charValues[i]);
         * }
         * for(int i =0; i<charValues.length; i++){
         * }
         * System.out.println("Before:-" +sbf);
         */

        /* ========================================================= */
        /* ========================================================= */

        // Armstrong program
        /*
         * Scanner scanner = new Scanner(System.in);
         * System.out.println("Enter a number");
         * int number = scanner.nextInt();
         * int temp = number;
         * 
         * int mod = 0;
         * int arm = 0;
         * for (; number != 0; number = number / 10) {
         * mod = number % 10;
         * arm = (mod * mod * mod) + arm;
         * }
         * 
         * if(temp == arm){
         * System.out.println("The given number is armstrong");
         * }else{
         * System.out.println("The given number is not armstrong");
         * }
         */

        /* ========================================================= */
        /* ========================================================= */

        // In a given array add 5 to even number and after that add the sum of these
        // updated values
        /*
         * int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
         * int temp = 0;
         * 
         * for (int i = 0; i < numbers.length; i++) {
         * 
         * if (numbers[i] % 2 == 0) {
         * numbers[i] += 5;
         * temp = temp + numbers[i];
         * 
         * }
         * 
         * }
         * //o/p: 40
         * System.out.println("Output:-"+temp);
         */

        /* ========================================================= */
        /* ========================================================= */

        // Remove duplicate numbers from an array
        /*
         * This is the easy way to remove duplicate values instead of using -1 you can use null for that use Integer and assign null to original
         */
        // int[] original = new int[5];
        Integer[] original = new Integer[5];
        System.out.println("Enter 5 numbers");
        for (int i = 0; i < original.length; i++) {
            original[i] = new Scanner(System.in).nextInt();
        }

        for (int i = 0; i < original.length; i++) {
            for (int j = i + 1; j < original.length; j++) {
                if (original[i] == original[j]) {
                    // original[i] = -1;
                    original[i] = null;
                }
            }
        }
        System.out.println("After removal operation");
        for (int i = 0; i < original.length; i++) {
            // if (original[i] != -1) {
            //     System.out.println(original[i]);
            // }
            if (original[i] != null) {
                System.out.println(original[i]);
            }
        }

        

        // System.out.println("-------------------------------------");

        // int index = 0;
        // int[] arr = new int[5];
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("-------------------------------------");
        // System.out.println("Enter 5 numbers");
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = scanner.nextInt();
        // }

        // int size = arr.length;
        // int count;
        // int[] anti_dup = new int[size];
        // int i, j;
        // System.out.println("-------------------------------------");
        // System.out.println("Before removing duplicate from the array:");
        // for (i = 0; i < size; i++) {
        // System.out.println(arr[i]);
        // }

        // for (i = 0; i < size; i++) {
        // count = 0;
        // for (j = i + 1; j < size; j++) {
        // if (arr[i] == arr[j]) {
        // count = count + 1;
        // break;
        // }

        // }
        // if (count == 0) {
        // anti_dup[index] = arr[i];
        // index++;
        // }
        // }

        // for (i = 0; i < index; i++) {
        // arr[i] = anti_dup[i];
        // }
        // System.out.println("-------------------------------------");
        // System.out.println("After removing duplicate from the array");

        // for (i = 0; i < index; i++) {
        // System.out.println(arr[i]);
        // }

        // System.out.println("-------------------------------------");
        // System.out.println("Alternate way");
        // Integer[] numbers = new Integer[] { 10, 20, 30, 30, 60 };
        // Set<Integer> unique = new LinkedHashSet<>(Arrays.asList(numbers));
        // System.out.println("After:-" + unique);

        /* ========================================================= */
        /* ========================================================= */
    }

}
