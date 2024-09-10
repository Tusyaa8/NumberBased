import java.util.*;
class Prime_Factoriasion
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int n = sc.nextInt();int i =2;String ans="";
        while(n>1)
        {
            if(n%i==0)
            {
                ans += i +"*";
                n=n/i;
            }
            else
            {
                i++;
            }
        }//loop
        System.out.println("Prime Factors "+ans.substring(0,ans.length()-1));
    }//Main Fucntion
}//class