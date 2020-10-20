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
        int n = in.nextInt();           //����n
        in.nextLine(); //����
        Shape s[] = new Shape[n];       //����n��Shape
        for(int i = 0;i < n;i++)        //��������
        {
            String str = in.nextLine();
            if(str.equals("rect"))
            {
                int w = in.nextInt();
                int l = in.nextInt();
                in.nextLine(); 			//����
                s[i] = new Rectangle(w,l);
            }
            else if(str.equals("cir"))
            {
                int r = in.nextInt();
                in.nextLine();			//����
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

/*���������Shape
���ԣ����ɱ侲̬����double PI��ֵΪ3.14��
���󷽷�:public double getPerimeter(),public double getArea()
Rectangle��Circle����̳���Shape�ࡣ
Rectangle��(���ԣ�int width,length)��Circle��(���ԣ�int radius)��
���ι��캯��ΪRectangle(int width,int length),Circle(int radius)��
toString����(Eclipse�Զ�����)
��дdouble sumAllArea�������㲢���ش������״���������ж�����������
double sumAllPerimeter�������㲢���ش������״���������ж�����ܳ��͡�
main����
4.1 ��������ֵn��Ȼ����n����ͬ����״���������rect������������������������cir��������뾶��
4.2 Ȼ��������е���״���ܳ�֮�ͣ����֮�͡��������е���״��Ϣ�������ĸ�ʽ����� ��ʾ��ʹ��Arrays.toString��
4.3 ������ÿ����״�������븸����.ʹ������shape.getClass() //�������, shape.getClass().getSuperclass() //��ø�����;
ע�⣺���������ʱ��ʹ�û��ʹ��nextInt��nextLine��ע����β�س��������⡣

˼��
�����sumAllArea��sumAllPerimeter���������ĸ����и����ʣ�
�Ƿ�Ӧ������Ϊstatic?
��������:
4
rect
3 1
rect
1 5
cir
1
cir
2
�������:
38.84
23.700000000000003
[Rectangle [width=3, length=1], Rectangle [width=1, length=5], Circle [radius=1], Circle [radius=2]]
class Rectangle,class Shape
class Rectangle,class Shape
class Circle,class Shape
class Circle,class Shape */