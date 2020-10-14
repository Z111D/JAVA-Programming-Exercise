public class Main{
    public Main(){
        System.out.println("构造方法一被调用了");
    }
    public Main(int x){
        this();
        System.out.println("构造方法二被调用了");
    }
    public Main(boolean b){
        this(1);
        System.out.println("构造方法三被调用了");
    }
    public static void main(String[] args) {
        Main a = new Main(true);				
    }
}

//this关键字的两种用法
//①在方法中引用成员变量（尤其是区分同名的局部变量）
//②在构造方法中调用其他构造方法（一定出现在第一句）


//构造方法一被调用了
// 构造方法二被调用了
// 构造方法三被调用了