import java.util.*;
class Permulation
{
    public static void main()
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter A Number");
        String s = sc.next();
        if(s.length()==3)
        {
            System.out.println("Permulation Of Three Digit Numbers Are ");
            for(int i=0;i<s.length();i++)
            {
                for(int j=0;j<s.length();j++)
                {
                    for(int k=0;k<s.length();k++)
                    {
                        if(i!=j&&i!=k&&j!=k)
                        {
                            System.out.println(""+s.charAt(i)+s.charAt(j)+s.charAt(k));
                        }
                    }
                }
            }
        }
        else
        {
            System.out.println("Enter A Three Digit Number");
        }
    }
}