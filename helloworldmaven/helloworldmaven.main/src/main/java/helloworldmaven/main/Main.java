package helloworldmaven.main;

import helloworldmaven.controller.Controller;
import helloworldmaven.model.Model;
import helloworldmaven.view.View;

public class Main {

	public static void main(String[] args) 		
	{
    	View vue = new View();
		
		Model modele = new Model();
		
		Controller controleur = new Controller(vue , modele);
		controleur.run();
    }
}
