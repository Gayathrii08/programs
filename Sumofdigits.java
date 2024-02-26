import java.util.scanner
public class Sumofdigits 
{
   public static void main(String args [])
 {
   int number,digit,sum=0;
   Scanner sc = new Scanner(System.in);
   System.out.println("enter number");
   number = sc.next.Int();
   while (number>0)
  { 
    digit = number%10;
    sum = sum + digit;
    number = number/10;
  }
System.out.println("sum of digit is" + sum);
 }
}
