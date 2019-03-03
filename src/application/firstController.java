package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.event.ActionEvent;

public class firstController {
	@FXML
	private Button btn1;

	// Event Listener on Button[#btn1].onAction
	@FXML
	public void back1(ActionEvent event) {
		common.back();
	}
}
