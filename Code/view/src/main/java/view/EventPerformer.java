package view;
import controller.IOrderPerformer;
import controller.UserOrder;
import lorann.IEventPerformer;

import java.awt.event.KeyEvent;

public class EventPerformer {
	 private IOrderPerformer orderPerformer;

	    public EventPerformer(IOrderPerformer orderPerformer){
	        this.orderPerformer = orderPerformer;
	    }

	    public void eventPerform(KeyEvent keyCode){}

	    private UserOrder keyCodeToUserOrder(int keyCode){
	        return null;
	    }
}
