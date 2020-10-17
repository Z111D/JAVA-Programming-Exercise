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
/*运行程序后可以输入4个选项，分别为：fib,sort,search,getBirthDate

fib:根据输入n，打印斐波那契数列。比如输入：3，输出：1 1 2

sort:输入一串数字，然后进行排序并输出，注意数组元素输出的格式为使用[ ]包括。提示：可直接使用函数Arrays相关方法处理输出。

search:如果找到返回所找到的位置，如果没找到，返回-1。提示：可以先对数组排序，然后使用Arrays相关函数进行查找。

getBirthDate:输入n个身份证，然后把输入的n个身份号的年月日抽取出来，按年-月-日格式输出。

当输入不是这几个字符串(fib,sort,search,getBirthDate)的时候，显示exit并退出程序。

注意：在处理输入的时候，尽量全部使用Scanner的nextLine()方法接收输入，不要将nextLine()与其它next方法混用，否则可能会出现行尾回车换行未处理影响下次输入的情况。

参考：jdk文档的Arrays，String

输入格式:
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
输出格式:
1 1 2
[-1, 2, 3, 5, 10]
0
-1
1966-05-05
exit
*/