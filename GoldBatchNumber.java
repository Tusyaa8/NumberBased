import java.util.*;
class GoldBatchNumber
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int n = sc.nextInt();System.out.println("Gold Bach Numbers");
        for(int i=n/2;i<=n;i++)
        {
            if(isPrime(i)&&isPrime(n-i))
            {
                System.out.println(i+" + "+(n-i)+" = "+n);
            }
        }
    }//Main Function
    static boolean isPrime(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        return (count==2);
    }//isPrime
}//class