import java.util.Scanner;
public class Time{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int h1,h2,m1,m2;
        h1 = sc.nextInt();
        m1 = sc.nextInt();
        h2 = sc.nextInt();
        m2 = sc.nextInt();
        System.out.println(+(((h2*60+m2)-(h1*60+m1))/60)+" "+(((h2*60+m2)-(h1*60+m1))%60));
	}
}