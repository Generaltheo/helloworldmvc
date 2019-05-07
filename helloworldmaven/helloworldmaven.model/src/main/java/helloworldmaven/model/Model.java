package helloworldmaven.model;

import helloworldmaven.Contract.IModel;

public class Model implements IModel{
	public String getHelloWorld()
	{
		DAOHelloWorld daohelloWorld = new DAOHelloWorld();
        return daohelloWorld.getHelloWorldMessage();
	}
}
