import java.util.*;
class BouncyNumber
{
    String n;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        n = sc.next();
    }//input
    boolean isBouncy()
    {
        int flag=0;
        for(int i=0;i<n.length()-1;i++)
        {
            char ch = n.charAt(i);
            char ch2 = n.charAt(i+1);
            if((ch-48)<(ch2-48))
            {
                flag =1;
            }
            else
            {
                flag =0;break;
            }
        }
        int flag2=0;
        for(int i=0;i<n.length()-1;i++)
        {
            char ch = n.charAt(i);
            char ch2 = n.charAt(i+1);
            if((ch-48)>(ch2-48))
            {
                flag2 =1;
            }
            else
            {
                flag2 =0;break;
            }
        }
        return (flag==0&&flag2==0);
    }//isBouncy
    public static void main()
    {
        BouncyNumber ob = new BouncyNumber();
        ob.input();
        if(ob.isBouncy())
        {
            System.out.println(ob.n+" Is A Bouncy Number");
        }
        else
        {
            System.out.println(ob.n+" Is NOT A Bouncy Number");
        }
    }//Main Fucntion
}//class