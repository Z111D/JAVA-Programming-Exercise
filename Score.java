import java.util.*;
 
public class Score {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//ͨ��new Scanner(System.in)����һ���µ�Scanner����Ϊin������̨��һֱ�ȴ����룬ֱ���ûس���������
                                            //������������ݴ���Scanner����Ϊɨ�����
        int n = in.nextInt();//ֻ������int���͵��ַ���
        in.nextLine();//����Enter��֮ǰ�������ַ������Կ��Եõ����ո���ַ���
        float sum = 0;
        List<Float> nums = new ArrayList<Float>();//�Ƿ��ͣ���ʾ��List��ֻ�ܷ�Float����
        String[] line = in.nextLine().split(" ");//���ݿո񣬽��ַ������Ϊ�ַ������顣
        for (String str : line) {
            nums.add(Float.valueOf(str));//Float.valueOf(String)�ǰ�String�ַ���ת����float�ķ�װ��Float
        }
        Collections.sort(nums);//��С�����List�����е�Ԫ�ؽ�������
        nums.remove(0);//ȥ����Сֵ
        nums.remove(nums.size() - 1);//ȥ�����ֵ
        for (double num : nums) {
            sum += num;
        }//��ȥ����С�����������ĺ�
        System.out.println(String.format("%.2f", sum / (n - 2)));//.format��ƽ����ת��Ϊ��λС���ĸ�����
    }
}