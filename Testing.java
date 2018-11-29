import java.util.ArrayList;
public class Testing{
	public static void main(String [] args){

	}
	public static ArrayList<Integer> convertToArrayList(int n){
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n.length; i ++){
			list.add(i);
		}
		return n;
	}
}