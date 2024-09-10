class PattenDiamond
{
    public static void main()
    {
        int h = 0;
        for(int i=1,l=1;i<=5;i++,l+=2)
        {
            int t =l;
            for(int k =5;k>i;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(t+" ");
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print(t+" ");
            }
            for(int k =5;k>i;k--)
            {
                System.out.print(" ");
            }
            System.out.println();t+=2;
        }
        for(int i=4,l=7;i>=1;i--,l-=2)
        {
            int t =l;
            for(int k =4;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(t+" ");
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print(t+" ");
            }
            System.out.println();t+=2;
        }
    }
}