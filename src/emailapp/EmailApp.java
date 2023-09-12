package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email eml = new Email("Sanisha", "Maharjan");
		String info = eml.showInfo();
		System.out.println(info);
	}

}
