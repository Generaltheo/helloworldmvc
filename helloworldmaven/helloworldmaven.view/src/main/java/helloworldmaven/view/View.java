package helloworldmaven.view;

import helloworldmaven.Contract.IView;

public class View implements IView{
	public void displayMessage(String message)
	{
		System.out.println(message);
	}
}
