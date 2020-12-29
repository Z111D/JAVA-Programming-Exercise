import java.util.Scanner;
 
abstract class Shape {
	double PI = 3.14;
 
	public abstract double getPerimeter();
 
	public abstract double getArea();
}
 
class Rectangle extends Shape {
	int wide, len;
 
	Rectangle(int a, int b) {
		wide = a;
		len = b;
	}
 
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * (wide + len);
	}
 
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return wide * len;
	}
	
	public String toString(){
		return "[width=" + wide + ", length=" + len + "]";
	}
}
 
class Circle extends Shape {
	int radius;
 
	Circle(int _radius) {
		radius = _radius;
	}
 
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return radius * 2 * PI;
	}
 
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return radius * radius * PI;
	}
 
	public String toString(){
		return "[radius=" + radius + "]";
	}
 
}
 
public class Shape_{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		Shape A[] = new Shape[n];
		int k = 0, j = 0;
		double sumAllArea = 0, sumAllPerimeter = 0;
		for (int i = 0; i < n; i++) {
			String S = in.next();
			if (S.equals("rect")) {
				int wide = in.nextInt(), len = in.nextInt();
				in.nextLine();
				A[i] = new Rectangle(wide, len);
			} else if (S.equals("cir")) {
				int radius = in.nextInt();
				in.nextLine();
				A[i] = new Circle(radius);
			}
			sumAllArea += A[i].getArea();
			sumAllPerimeter += A[i].getPerimeter();
		}
 
		System.out.println(sumAllPerimeter);
		System.out.println(sumAllArea);
		System.out.print("[");
		for (int i = 0; i < n; i++) {
			if(i != 0)
				System.out.print(", ");
			if (A[i] instanceof Rectangle) {
					System.out.print("Rectangle ");
				System.out.print(A[i].toString());
			}
			else {
					System.out.print("Circle ");
				System.out.print(A[i].toString());	
			}
		}
 
		System.out.println("]");
 
		for(int i = 0;i < n;i++) {
			if(A[i] instanceof Rectangle) {
				System.out.println("class Rectangle,class Shape");
			}else {
				System.out.println("class Circle,class Shape");
 
			}
		}
		in.close();
	}
}