import java.util.*;
class PronicNumber
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int n = sc.nextInt();boolean sw = false;
        for(int i=1;i<n;i++)
        {
            if(i*(i+1)==n)
            {
                sw=true;break;
            }
        }
        System.out.print(n);
        System.out.println((sw)?" Is A Pronic Number":" Not A Pronic Number");
    }//Main Method
}//class