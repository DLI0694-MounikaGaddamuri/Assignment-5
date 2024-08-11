package Stack;

import java.util.*;
public class BalancedParentheses {

     int maxSize;
     int[] stackArray;
     int top;

     BalancedParentheses(int size){
         maxSize=size;
         stackArray=new int[maxSize];
         top=-1;
     }

     public void push(char value){
         if(top==maxSize-1) {
             System.out.println("Stack overflow.");
             return;
         }
         stackArray[++top]=value;
     }

     public char pop(){
         if(top==-1){
             System.out.println("Stack underflow.");
             return '0';
         }
         char poppedElement= (char)stackArray[top--];
         return poppedElement;
     }

     public char top(){
         if(top==-1){
             System.out.println("Stack is empty");
             return '0';
         }
         return (char)stackArray[top];
     }

    public boolean isEmpty() {
        return (top == -1);
    }

    public static boolean balancedParentheses(String brackets, BalancedParentheses stack){

         for(int i=0;i<brackets.length();i++){
             if((brackets.charAt(i)=='(') || (brackets.charAt(i)=='[')|| (brackets.charAt(i)=='{'))
                 stack.push(brackets.charAt(i));
             else{
                 if(stack.isEmpty())
                     return false;
                 char c = stack.top();
                 stack.pop();

                 if((brackets.charAt(i)==')' && c=='(') || brackets.charAt(i)==']' && c=='['  || brackets.charAt(i)=='}' && c=='{')
                 {

                 }
                 else
                     return false;

             }
         }
         if(stack.isEmpty())
             return true;
         return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String brackets = input.next();

        BalancedParentheses stack = new BalancedParentheses(brackets.length());
        System.out.println(balancedParentheses(brackets,stack));

    }
}
