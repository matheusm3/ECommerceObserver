package ECommerce;

public class Cliente implements Observer{
	
	private int number;
	private String name;
	
	public Cliente(String name) {
		this.name = name;
	}
	
	@Override
	public void update(Subject s, Object o) {
		number = (Integer) o;
		System.out.println(name+" atualizado: Valor = "+number);
	}

}