import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("0: Decode");
		System.out.println("1: Code");
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("Response: ");
		String response = in.nextLine();
		while (response.charAt(0) != '0' && response.charAt(0) != '1') {
			System.out.println("Unexpected response!");
			System.out.print("Response: ");
			response = in.nextLine();
		}
		
		System.out.print("The text: ");
		String text = in.nextLine();
		if (response.charAt(0) == '0') {
			try {
				System.out.println(WeightCode.decode(text));
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		} else {
			System.out.println(WeightCode.getCode(text));
		}
	}

}
