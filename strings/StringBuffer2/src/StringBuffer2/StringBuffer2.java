package StringBuffer2;

public class StringBuffer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer s1 = new StringBuffer("It is used to _ at the specified index position.");
		StringBuffer s2 = new StringBuffer("insert text");
		s1.delete(14,15);
		s1.insert(14,s2);
		System.out.println(s1);
	}
}