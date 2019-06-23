
public class knightstour {

	public static long[] calc(long[] list) {
		long[] newlist = new long[list.length];
		long acc = 1;
		for (int x=0; x<list.length; x++) {
			newlist[x] = (acc *= list[x]);
			System.out.print(newlist[x] + ", ");
		}
		System.out.println();
		return newlist;
	}
	
	public static void average(long[] l1, long[] l2, long[] l3, long[] l4, long[] l5, long[] l6) {
		for (int x=0; x<l1.length; x++) {
			long avg = (l1[x] + l2[x] + l3[x] + l4[x] + l5[x] + l6[x])/6;
			System.out.print(avg + ", ");
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] list1 = {1, 64, 8, 7, 2, 2, 6, 3, 6, 5, 2, 1, 1, 0, 0, 0, 0, 0, 0};
		
		long[] list2 = {1, 64, 8, 3, 6, 3, 6, 3, 7, 3, 3, 3, 5, 3, 2, 0, 0, 0, 0};
		
		long[] list3 = {1, 64, 6, 1, 4, 6, 7, 3, 4, 5, 3, 3, 1, 1, 1, 0, 0, 0, 0};
		
		long[] list4 = {1, 64, 3, 5, 7, 7, 5, 2, 3, 5, 1, 3, 3, 1, 2, 0, 0, 0, 0};
		
		long[] list5 = {1, 64, 6, 2, 3, 6, 7, 2, 2, 4, 4, 3, 2, 3, 5, 4, 2, 4, 3};
		
		long[] list6 = {1, 64, 6, 1, 4, 6, 7, 5, 3, 5, 3, 2, 4, 3, 4, 0, 0, 0, 0};

		long[] l1 = calc(list1);
		long[] l2 = calc(list2);
		long[] l3 = calc(list3);
		long[] l4 = calc(list4);
		long[] l5 = calc(list5);
		long[] l6 = calc(list6);
		System.out.println();
		average(l1,l2,l3,l4,l5,l6);
	}

}
