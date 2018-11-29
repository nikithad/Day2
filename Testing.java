import java.util.ArrayList;

public class Testing {

	public static void main(String [] args) {

	}

	public static int convertToInteger (ArrayList<Integer> list) {
		String term = "";

		for (int i = 0; i < list.size(); i++) {
			term += list.get(i);
		}

		return Integer.parseInt(term);
	}

}