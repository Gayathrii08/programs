import java.util.Scanner;
class Pattern {
    
static int pyramid(int n){
    for(int i=0;i<=n;i++)
    {
        for(int j=1;j<=2*n-1;j++)
        {
            if(j>=n-(i-1)&&j<=n+(i-1))
                System.out.print("*");
        
            else 
            System.out.print(" ");
        }
        System.out.println();
    }
    return n;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int n = sc.nextInt();
        pyramid(n);
        
    }
}