
import java.io.*;
import java.util.*;

class StackDemo{

	public static void main(String[] args)
	{

		Stack<String> stack1 = new Stack<String>();
		stack1.push("hello");
		stack1.push("bye");
		stack1.push("hi");


		System.out.println("Initially the stack was : " + stack1);

	
stack1.pop(); 
		System.out.println("After poping the stack :"+ stack1);

System.out.println("Is the file empty "+ stack1.empty());

System.out.println("What is the size of stack ? :  "+ stack1.size());

System.out.println("What is the top element : "+stack1.peek());

System.out.println("What is the position of hello "+ stack1.search("hello"));

	}

}
