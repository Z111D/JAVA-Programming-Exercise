public class Main{
    public Main(){
        System.out.println("���췽��һ��������");
    }
    public Main(int x){
        this();
        System.out.println("���췽������������");
    }
    public Main(boolean b){
        this(1);
        System.out.println("���췽������������");
    }
    public static void main(String[] args) {
        Main a = new Main(true);				
    }
}

//this�ؼ��ֵ������÷�
//���ڷ��������ó�Ա����������������ͬ���ľֲ�������
//���ڹ��췽���е����������췽����һ�������ڵ�һ�䣩


//���췽��һ��������
// ���췽������������
// ���췽������������