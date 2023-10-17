import java.util.*;
class DiffLandS
{
public static void main(String args[]){
int large,small,i;
Scanner scanner = new Scanner(System.in);

 System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
 int[] array = new int[size];
 System.out.println("Enter " + size + " elements:");
        for (i = 0; i < size; i++) {
            array[i] = scanner.nextInt();}
 
int n = array.length;
int difference =0;
large=small=array[0];
for(i=1;i<n;++i)
{
if(array[i]>large)
large=array[i];

if(array[i]<small)
small=array[i];
difference = large-small;
}
System.out.print("The smallest element is " + small );
System.out.print("\nThe largest element is " + large );
System.out.print("\nThe difference of largest  and smallest elements is " + difference );
}
}