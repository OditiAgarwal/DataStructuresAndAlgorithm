import java.util.*;
public class Frequency {  
    public static void main(String[] args) {  
         
int[] arr = new int[5];
 Scanner s = new Scanner(System.in);
      
System.out.print("Enter Elements: ");
      for(int i=0; i<5; i++)
 arr[i] = s.nextInt();

 int [] fr = new int [arr.length];  
        int visited = -1;  
        for(int i = 0; i < arr.length; i++){  
       int count = 1;  
   for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
       count++;  
        fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }
        System.out.println(" Element   Frequency");  
          
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  
                System.out.println("    " + arr[i] + "        " + fr[i]);  
        }  
       
    }}  