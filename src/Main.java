
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "árvíztűrő tükörfúrógép";
		String codedText = WeightCode.getCode(text);
		System.out.println(codedText);
		try {
			System.out.println(WeightCode.decode(codedText));
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
