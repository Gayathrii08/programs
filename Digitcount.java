import java.util.scanner
public class Digitcount 
{
   public static void main(String args [])
 {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int count = 0 ;
   while (n>0)
  { 
    n = n/10;
    count++;
  }
System.out.println("Digit count of n is" + count");
 }
}
