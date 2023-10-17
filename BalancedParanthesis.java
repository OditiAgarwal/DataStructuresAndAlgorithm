import java.util.*;
//Oditi22CSU125
class BalancedParanthesis
{public static void main(String[] args)
   {
      String expression;
      int i, length;
      char ch;
        Scanner s = new Scanner(System.in);
      
 System.out.print("Enter the Expression: ");
      expression = s.next();
      
Stack<Character> stack = new Stack<Character>();
      length = expression.length();
      for(i=0; i<length; i++){
         ch = expression.charAt(i);
         if(ch=='(' || ch=='{' || ch=='[')
         {
            stack.push(ch); }
         else if(ch==')')
{
  if(stack.isEmpty() || stack.pop() != '(')
  {
System.out.println("\nUnbalanced Parentheses!");
  return;
         }}
         else if(ch=='}')
         {
            if(stack.isEmpty() || stack.pop() != '{')
            {
               System.out.println("\nUnbalanced Parentheses!");
               return;} }
         else if(ch==']')
         {if(stack.isEmpty() || stack.pop() != '[')
            {
               System.out.println("\nUnbalanced Parentheses!");
               return;
            }  } }
      if(stack.isEmpty())
         System.out.println("\nBalanced Parentheses.");
   }
}