import java.util.*;

public class Test
{
    public static int fib(int n)
    {
        if(n == 1 || n == 2)return 1;
        else return (fib(n -1)+ fib(n - 2));
    }
    public static void main(String args[])
    {
         int a[]=new int[1];
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {   
            String opt = in.nextLine();
            if(opt.equals("fib"))
            {
                int num = Integer.valueOf(in.nextLine());
                for(int i = 1;i <= num;i++)
                {
                    if(i == 1)
                        System.out.print("1");
                    else
                        System.out.print(" " + fib(i));
                    System.out.println();
                }
            }
            else if(opt.equals("sort"))
            {
                String s[] = in.nextLine().split(" ");
                a = new int [s.length];
                for(int i = 0;i <s.length;i++)
                {
                    a[i] = Integer.valueOf(s[i]);
                }
                Arrays.sort(a);
                System.out.println(Arrays.toString(a));
            }       
            else if(opt.equals("search"))
            {
                int  b=Integer.valueOf(in.nextLine());
                int flag=0;
                for (int i =0;i<a.length;i++)
                {
                    if (a[i]==b)
                    {
                        flag=1;
                        System.out.println(i);
                        break;
                    }
                }   
                if(flag == 0)System.out.println("-1");
             }
            else if(opt.equals("getBirthDate"))
            {
                int ci = Integer.valueOf(in.nextLine());
                for(int i = 0;i < ci;i++)
                {
                    String birthdate = in.nextLine();
                    System.out.println(birthdate.substring(6,10) + "-" + birthdate.substring(10,12) + "-" + birthdate.substring(12,14));
                }
            }
            else
            {
                System.out.println("exit");
                break;
            }
        }
    }
}
