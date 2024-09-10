import java.util.*;
class HammingNumber
{
    public static void main()
    {
        HammingNumber ob = new HammingNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int n = sc.nextInt();
        String s = ob.ugly(n);
        System.out.println(s);
    }//main Method
    static String ugly(int n)
    {
        int a[] = {2,3,5};int i=0;String s="";
        while(n>1&&i<a.length)
        {
            if(n%a[i]==0)
            {
                n/=a[i];s+=""+a[i]+"*";
            }
            else
            {
                i++;
            }
        }
        if(n==1)
        {
            System.out.println("The Number is A Hamming Number");
            s=s.substring(0,s.length()-1);
        }
        else
        {
            s="The Number is Not a Hamming Number";
        }
        return s;
    }//ugly
}//class