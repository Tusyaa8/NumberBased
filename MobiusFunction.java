import java.util.*;
class MobiusFunction
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int n = sc.nextInt();
        int k =2;String s="";String s2="";
        while(n!=1)
        {
            if(n%k==0)
            {
                s+=""+k;
                n/=k;
            }
            else
            {
                k++;
            }
        }
        for(int i=0;i<s.length();i++)
        {
            if(s2.indexOf(s.charAt(i))==-1)
            {
                s2+=""+s.charAt(i);
            }
        }
        System.out.print("Mobius Function ");
        if(s.equals(s2))
        {
            System.out.println((int)Math.pow(-1,s.length()));
        }
        else
        {
            System.out.println(0);
        }
    }//Main Function
}//class