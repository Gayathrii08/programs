import java.util.Scanner;  
public class Multiples 
{
    public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the limit");
      int n = sc.nextInt();
       System.out.println("Divisible by 3 ");
       for (int i = 1; i < n; i++)
        {
           if (i % 3 == 0)
          System.out.print(i + " ");
        }
   }
}