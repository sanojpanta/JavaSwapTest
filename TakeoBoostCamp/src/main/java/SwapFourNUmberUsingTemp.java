
public class SwapFourNUmberUsingTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int fnum, snum, tnum, fonum;
 fnum = 1;
 snum =2;
 tnum = 3;
 fonum = 4;
System.out.println("before swaping number \t"+fnum+"\t"+snum+"\t"+tnum+"\t"+fonum); 
	int temp =0;
	temp = fnum;
	fnum =snum;
	snum = tnum;
	tnum = fonum;
	fonum = temp;
	
	System.out.println("after swaping number \t"+fnum+"\t"+snum+"\t"+tnum+"\t"+fonum);	
	}

}
