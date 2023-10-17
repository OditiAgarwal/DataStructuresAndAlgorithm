import java.util.Scanner; 

public class JaggedArray2 {
  public static void main(String args[])
  {

      int JaggedArray[][] = new int[4][];
    
      JaggedArray[0] = new int[3];   
      JaggedArray[1] = new int[2];   
      JaggedArray[2] = new int[4];
      JaggedArray[3] = new int[1];     
      
    Input(JaggedArray);
    Output(JaggedArray);


}

static void Input(int JaggedArray[][]){

      Scanner sc = new Scanner(System.in); 

      for(int i=0;i<JaggedArray.length;i++)
      {
         for(int j=0;j<JaggedArray[i].length;j++)
         {
            System.out.print("Enter element in array at position["+i+"]["+j+"]::");
            JaggedArray[i][j]=sc.nextInt();
         }
      }
    }

    static void Output(int JaggedArray[][]){

      for(int i=0;i<JaggedArray.length;i++)
      {
         for(int j=0;j<JaggedArray[i].length;j++)
         {
            System.out.print(JaggedArray[i][j] +",");
         }
         System.out.println();
    }
}
}