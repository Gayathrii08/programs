public class NegativeElementSum {
                  public static void main(String args[])
                        {
                          int a[] = {1,-2,3,-4};
                          int sum = 0;
                         for (int i = 0;i<a.length;i++)
                        {
                          if(a[i] < 0)
                          sum += a[i];
                         }
                  System.out.println(sum);
                       }
                     }