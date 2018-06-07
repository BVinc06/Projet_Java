package controller;

public class UserOrder implements IUserOrder{
	
	private int player;
	private Order order;
	
	public UserOrder() {
		player = 0;
		order = Order.NOP;
		
	}
	
	public Order getOrder() {
		return null;
	}
	
	public int getPlayer() {
		return 0;
	}

	
}
