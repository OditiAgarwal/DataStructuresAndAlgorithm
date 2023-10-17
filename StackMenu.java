import java.util.*;
//ClassWork In DS 

public class StackMenu{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
 System.out.println("Enter Size of Integer Stack ");
        int n = sc.nextInt();
	arrayStack stk=new arrayStack(n);
	while (true){
		System.out.println("Options");
		System.out.println("1.Push");
		System.out.println("2.Pop");
		System.out.println("3.Peek");
		System.out.println("4.Exit");

		int choice= sc.nextInt();

switch(choice){ 

	case 1: 
	System.out.println("Enter element you want to push : ");
	stk.push(sc.nextInt());
	stk.display();

	break;

case 2:
System.out.println("Element popped="+ stk.pop());
stk.display();
break;

case 3: 
System.out.println("Element at the top :" + stk.peek());
stk.display();
break;

case 4: 
System.out.println("Program Exited ");
stk.display();
System.exit(0);

break;

default: 
System.out.println("Wrong entry");
break; 
}


	}
	}
}

class arrayStack{
protected int arr[];
    protected int top, size, len;
   
    public arrayStack(int n)
    {
        size = n;
        len = 0;
        arr = new int[size];
        top = -1;
    }

public boolean isEmpty()
{
	return top==-1;

}
public boolean isFull(){
	return top== size-1;

}
public int peek()
{
	if(isEmpty())
		System.out.println("Underflow");
		return arr[top];

}
public void push(int i)
{
	if(top+1>=size)
		System.out.println("Stack overflow ");
	if(top+1<size)
		arr[++top]=i;
	len++;

}
public int pop()
{
	if(isEmpty())
		System.out.println("Underflow stack ");
	len--;
	return arr[top--];
}
public void display()
{
	System.out.println("\nStack: ");
	if(len==0){
		System.out.print("Empty\n");
		return;

	}
	 for (int i = top; i >= 0; i--)
            System.out.print(arr[i]+" ");
        System.out.println();
}
}