package ECommerce;

public class Main {

	 public static void main(String[] args) {
		Brecho assunto = new Brecho();

		Cliente o1 = new Cliente("Blusas");
		Cliente o2 = new Cliente("Cal�as");

		assunto.attach(o1);
		assunto.attach(o2);
		
		assunto.generateNewNumber();
		System.out.println("------");
		

		assunto.generateNewNumber();
		
	}
	
}