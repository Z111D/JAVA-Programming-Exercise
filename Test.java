import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static int count=0;
    public static void fib(int n){
        int a=1;
        int b=1;
        if (n==1){
            System.out.println("1");
            return;
        }else if (n==2){
            System.out.println("1 1");
            return;
        }else if (n==0){
            return;
        } else {
            System.out.print("1 1 ");
        }
        int tem;
        for (int i=2;i<n-1;i++){
            tem=a+b;
            System.out.print(tem+" ");
            a=b;
            b=tem;
        }
        System.out.println(a+b);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[1];
        while (true){
            String str=sc.nextLine();
            if (str.equals("fib")){
                count=0;
                int b=Integer.valueOf(sc.nextLine());
                fib(b);
            }else if (str.equals("sort")){
                String s[]=sc.nextLine().split(" ");
                a=new int[s.length];
                for (int i=0;i<s.length;i++){
                    a[i]=Integer.valueOf(s[i]);
                }
                Arrays.sort(a);
                System.out.println(Arrays.toString(a));
            }else if (str.equals("search")){
                int  b=Integer.valueOf(sc.nextLine());
                int flag=0;
                for (int i =0;i<a.length;i++){
                    if (a[i]==b){
                        flag=1;
                        System.out.println(i);
                        break;
                    }
                }
                if (flag==0){
                    System.out.println(-1);
                }
            }else if (str.equals("getBirthDate")){
                int time=Integer.valueOf(sc.nextLine());
                for (int i=0;i<time;i++){
                    String bir=sc.nextLine();
                    String bem=bir.substring(6,14);
                    System.out.println(bir.substring(6,10)+"-"+bir.substring(10,12)+"-"+bir.substring(12,14));
                }
            }else {
                System.out.println("exit");
            }
        }
    }
}
/*���г�����������4��ѡ��ֱ�Ϊ��fib,sort,search,getBirthDate

fib:��������n����ӡ쳲��������С��������룺3�������1 1 2

sort:����һ�����֣�Ȼ��������������ע������Ԫ������ĸ�ʽΪʹ��[ ]��������ʾ����ֱ��ʹ�ú���Arrays��ط������������

search:����ҵ��������ҵ���λ�ã����û�ҵ�������-1����ʾ�������ȶ���������Ȼ��ʹ��Arrays��غ������в��ҡ�

getBirthDate:����n�����֤��Ȼ��������n����ݺŵ������ճ�ȡ����������-��-�ո�ʽ�����

�����벻���⼸���ַ���(fib,sort,search,getBirthDate)��ʱ����ʾexit���˳�����

ע�⣺�ڴ��������ʱ�򣬾���ȫ��ʹ��Scanner��nextLine()�����������룬��Ҫ��nextLine()������next�������ã�������ܻ������β�س�����δ����Ӱ���´�����������

�ο���jdk�ĵ���Arrays��String

�����ʽ:
fib
3
sort
-1 10 3 2 5
search
-1
search
0
getBirthDate
1
330226196605054190
e
�����ʽ:
1 1 2
[-1, 2, 3, 5, 10]
0
-1
1966-05-05
exit
*/