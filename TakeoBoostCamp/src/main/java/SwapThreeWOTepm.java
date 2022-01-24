
public class SwapThreeWOTepm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fnum, snum, tnum;
		fnum = 1;
		snum = 2;
		tnum = 3;
	System.out.println("before swap\t"+fnum +"\t"+snum+"\t"+tnum);	
		
		fnum = snum;
		snum = tnum;
		tnum = snum - fnum;
		System.out.println("after swap\t"+fnum +"\t"+snum+"\t"+tnum);

	}

}
