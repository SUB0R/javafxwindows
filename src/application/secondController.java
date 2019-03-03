package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;

public class secondController {
	@FXML
	private Button btn;

	// Event Listener on Button[#btn].onAction
	@FXML
	public void back(ActionEvent event) throws IOException {
		common.back();
	}
}
