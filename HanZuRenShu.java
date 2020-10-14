import java.util.Scanner;

public class HanZuRenShu {

	public static void main(String[] args) {
		final int HUMANNUM=10;
		String persons[]=new String[HUMANNUM];
		Scanner in=new Scanner(System.in);
		for(int i=0;i<persons.length;i++)
			persons[i]=in.nextLine();
		int result=numofHan(persons);
		System.out.println(result);
	
	}
	
	public static int numofHan(String data[]){
        String s = "汉族";
        int num = 0;
        for(String string: data)//表示取出数组data[]中的每一个元素，就是循环一次就依次取出一个元素赋值给string，直到取完为止
        {
            if( string.indexOf(s) >= 0 ){
                num ++;
            }
        }
        return num;
    }
}

/*本题运行时要求键盘输入10个人员的信息（每一个人信息包括：姓名，性别，年龄，民族），要求同学实现一个函数，统计民族是“汉族”的人数。

函数接口定义：
public static int numofHan(String data[])
其中 data[] 是传入的参数。 data[]中的每一个元素都是一个完整的人员信息字符串，该字符串由“姓名，性别，年龄，民族”，各项之间用英文半角的逗号分隔。函数须返回 值是汉族的人数。
输入样例：
Tom_1,男,19,汉族
Tom_2,女,18,汉族
Tom_3,男,20,满族
Tom_4,男,18,汉族
Tom_5,男,19,汉族人
Tom_6,女,17,汉族
Tom_7,男,19,蒙古族
汉族朋友_1,男,18,汉族
Tom_8,male,19,老外
Tom_9,female,20,汉族

输出样例：
7*/