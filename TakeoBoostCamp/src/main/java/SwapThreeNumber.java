
public class SwapThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fnum , snum , tnum ;
		fnum = 1;
		snum = 2;
		tnum = 3;
		System.out.println("before swap\t"+fnum +"\t" +snum +"\t" +tnum);
		int temp =0;
		temp = fnum;
		fnum = snum;
		snum = tnum;
		tnum = temp;
		
		System.out.println("after swap\t"+fnum +"\t" +snum +"\t" +tnum);
	}

}
