import java.util.*;
class CircularPime
{
    boolean isPrime(int n)
    {
        int c =0;boolean isPrime=false;
        for(int i =1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            isPrime=true;
        }
        return isPrime;
    }
    public static void main()
    {
        CircularPime ob = new CircularPime();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number ");
        String n=sc.next();
        int count = n.length();boolean circular=true;
        for(int i = 0;i<count;i++)
        {
            if(!(ob.isPrime(Integer.valueOf(n))))
            {
                circular=false;
                break;
            }
            char ch = n.charAt(0);System.out.println(n);
            n = n.substring(1)+ch;
        }
        if(circular)
        {
            System.out.println("The Number is a Circular Pime");
        }
        else
        {
            System.out.println("The Number is NOT a Circular Pime");
        }
    }
}