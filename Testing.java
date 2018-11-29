import java.util.ArrayList;

public class Testing {

	public static void main(String [] args) {
	ArrayList<Integer> lis = new ArrayList<>();
	lis.add(1);
	lis.add(2);
	lis.add(3);

	int z = 123;
	System.out.println(convertToArrayList(z));

	System.out.println(convertToInteger(lis));
	}

	public static ArrayList<Integer> convertToArrayList (int n) {
		ArrayList<Integer> list = new ArrayList<>();
		while (n!=0){
			int x = n%10;
			list.add(0, x);
			 n = n/10;
		}
		return list;
	}

	public static int convertToInteger (ArrayList<Integer> list) {
		String term = "";

		for (int i = 0; i < list.size(); i++) {
			term += list.get(i);
		}

		return Integer.parseInt(term);
	}

}