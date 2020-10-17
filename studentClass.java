import java.util.Scanner;

class Student
{
    private String name,sex;
    private int age;
    public Student(String n,String s,int a)
    {
        this.name = n;
        this.sex = s;
        this.age = a;
    }
    public String toString()
    {
        System.out.println("Student [name='" + name + "', sex='" + sex + "', age=" + age + "]");
        return name;
    }
    public void setName(String n)
    {
        this.name = n;
    }
    public String getName()
    {
        return this.name;
    }
    public void setSex(String s)
    {
        this.sex = s;
    }
    public String getSex()
    {
        return this.sex;
    }
    public void setAge(int a)
    {
        this.age = a;
    }
    public int getAge()
    {
        return this.age;
    }
}

public class studentClass
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        int age=Integer.valueOf(in.next());
        String sex = in.next();
        Student s = new Student(name,sex,age);
        s.toString();
    }
}
