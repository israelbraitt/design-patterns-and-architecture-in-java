package application.controller;

import application.view.View;
import application.model.Model;

public class Controller {
	
	public View view;
	public Model model;
	
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
	}

}
