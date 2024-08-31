import java.util.LinkedList;

import java.util.Queue;

import java.util.Stack;

public class PalindromeCheck {

 public static void main(String[] args) {

 String str = “racecar”;

 Stack<Character> stack = new Stack<>();

 Queue<Character> queue = new LinkedList<>();

 for (char ch : str.toCharArray()) {

 stack.push(ch);

 queue.add(ch);

 }

 boolean isPalindrome = true;

 while (!stack.isEmpty() && !queue.isEmpty()) {

 if (!stack.pop().equals(queue.remove())) {

 isPalindrome = false;

 break;

 }

 }

 if (isPalindrome) {

 System.out.println(str + ” is a palindrome.”);

 } else {

 System.out.println(str + ” is not a palindrome.”);

 }

 }

}
