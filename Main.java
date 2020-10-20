import java.util.Scanner;

abstract class Shape
{
    final double PI = 3.14;
    public abstract double getPerimeter();
    public abstract double getArea();
}

class Rectangle extends Shape
{
    private int width,length;
    Rectangle(int width,int length)
    {
        this.width = width;
        this.length = length;
    }
    public double getPerimeter()
    {
        return (width + length)*2;
    }
    public double getArea()
    {
        return width * length; 
    }
    public String toString()
    {
        return "Rectangle [width=" + width + ", length=" + length + "]";
    }
}

class Circle extends Shape
{
    private int radius;
    Circle(int radius)
    {
        this.radius = radius;
    }
    
    public double getPerimeter()
    {
        return 2 * PI * radius;
    }
    
    public double getArea()
    {
        return PI * radius * radius;
    }
    public String toString()    //Override
    {
		return "Circle [radius=" + radius + "]";
	}
}    



public class Main
{
    public static double sumAllArea(Shape s[])
    {
        double sum = 0;
        for(int i = 0;i < s.length;i++)
        {
            sum += s[i].getArea();
        }
        return sum;
    }

    public static double sumAllPerimeter(Shape s[])
    {
        double sum = 0;
        for(int i = 0;i < s.length;i++)
        {
            sum += s[i].getPerimeter();
        }
        return sum;
    }
    
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();           //输入n
        in.nextLine(); //换行
        Shape s[] = new Shape[n];       //创建n个Shape
        for(int i = 0;i < n;i++)        //依次输入
        {
            String str = in.nextLine();
            if(str.equals("rect"))
            {
                int w = in.nextInt();
                int l = in.nextInt();
                in.nextLine(); 			//换行
                s[i] = new Rectangle(w,l);
            }
            else if(str.equals("cir"))
            {
                int r = in.nextInt();
                in.nextLine();			//换行
                s[i]= new Circle(r);
            }
        }
        System.out.println(sumAllPerimeter(s));
        System.out.println(sumAllArea(s));
        System.out.print("[");
        for(int i = 0;i < n;i++)
        {   
            if(i != 0)
				System.out.print(", ");
            System.out.print(s[i].toString());
        }
        System.out.println("]");
        for(int i = 0;i < n;i++)
        {
            System.out.println(s[i].getClass() + "," + s[i].getClass().getSuperclass());
        }
    }
}

/*定义抽象类Shape
属性：不可变静态常量double PI，值为3.14，
抽象方法:public double getPerimeter(),public double getArea()
Rectangle与Circle类均继承自Shape类。
Rectangle类(属性：int width,length)、Circle类(属性：int radius)。
带参构造函数为Rectangle(int width,int length),Circle(int radius)。
toString方法(Eclipse自动生成)
编写double sumAllArea方法计算并返回传入的形状数组中所有对象的面积和与
double sumAllPerimeter方法计算并返回传入的形状数组中所有对象的周长和。
main方法
4.1 输入整型值n，然后建立n个不同的形状。如果输入rect，则依次输入宽、长。如果输入cir，则输入半径。
4.2 然后输出所有的形状的周长之和，面积之和。并将所有的形状信息以样例的格式输出。 提示：使用Arrays.toString。
4.3 最后输出每个形状的类型与父类型.使用类似shape.getClass() //获得类型, shape.getClass().getSuperclass() //获得父类型;
注意：处理输入的时候使用混合使用nextInt与nextLine需注意行尾回车换行问题。

思考
你觉得sumAllArea和sumAllPerimeter方法放在哪个类中更合适？
是否应该声明为static?
输入样例:
4
rect
3 1
rect
1 5
cir
1
cir
2
输出样例:
38.84
23.700000000000003
[Rectangle [width=3, length=1], Rectangle [width=1, length=5], Circle [radius=1], Circle [radius=2]]
class Rectangle,class Shape
class Rectangle,class Shape
class Circle,class Shape
class Circle,class Shape */