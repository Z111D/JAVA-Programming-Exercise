import java.util.*;
 
public class Score {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//通过new Scanner(System.in)创建一个新的Scanner命名为in，控制台会一直等待输入，直到敲回车键结束，
                                            //把所输入的内容传给Scanner，作为扫描对象。
        int n = in.nextInt();//只能输入int类型的字符串
        in.nextLine();//返回Enter键之前的所有字符，所以可以得到带空格的字符串
        float sum = 0;
        List<Float> nums = new ArrayList<Float>();//是泛型，表示该List中只能放Float对象
        String[] line = in.nextLine().split(" ");//根据空格，将字符串拆分为字符串数组。
        for (String str : line) {
            nums.add(Float.valueOf(str));//Float.valueOf(String)是把String字符串转换成float的封装类Float
        }
        Collections.sort(nums);//由小到大对List集合中的元素进行排序
        nums.remove(0);//去掉最小值
        nums.remove(nums.size() - 1);//去掉最大值
        for (double num : nums) {
            sum += num;
        }//求去掉最小数和最大数后的和
        System.out.println(String.format("%.2f", sum / (n - 2)));//.format将平均分转换为两位小数的浮点数
    }
}