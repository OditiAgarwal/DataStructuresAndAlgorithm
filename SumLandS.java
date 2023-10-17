import java.util.*;
class DiffLandS
{
public static void main(String args[]){
int large,small,i;
int a[] = new int[]{1, 2, 3, 4, 5};
int n = a.length;
int sum=0;
large=small=a[0];
for(i=1;i<n;++i)
{
if(a[i]>large)
large=a[i];

if(a[i]<small)
small=a[i];
sum= large-small;
}
System.out.print("The smallest element is " + small );
System.out.print("\nThe largest element is " + large );
System.out.print("\nThe sum of largest  and smallest elements is " + sum );
}
}