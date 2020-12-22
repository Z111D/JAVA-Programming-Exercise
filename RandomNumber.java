import java.util.*;
 
public class RandomNumber{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int k=scan.nextInt();
		scan.close();
		Random s=new Random(k);
		int temp=0;
		for(int i=1;i<=n;i++) {
			temp=s.nextInt(m);
		}
		System.out.println(temp);
	}
}
