import java.util.*;
public class RandomNumber{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();
		List<Integer>ss = new ArrayList<Integer>();
		Random rand = new Random(k);
		for(int i = 0;i < n;i++)
		{
			ss.add(rand.nextInt(m));
			if(i==n-1)
				System.out.println(ss.get(i));
		}
	}
}