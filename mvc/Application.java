package application;

import application.view.View;
import application.model.Model;
import application.controller.Controller;

public class Application {

	public static void main(String[] args) {
		
		View view = new View();
		Model model = new Model();
		Controller controller = new Controller(view, model);
		
		runApp(view);

	}
	
	public static void runApp(View view) {
		view.setVisible(true);
	}

}
