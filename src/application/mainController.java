package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;

public class mainController {
	@FXML
	private Button btn_1;
	@FXML
	private Button btn_2;
	
	// Event Listener on Button[#btn_1].onAction
	@FXML
	public void first(ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("first.fxml"));//�޸���
		Scene scene = new Scene(root,500,760);//�޸���
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        common.stage.setScene(scene);
        common.stage.setResizable(true);//���ò��ܴ��ڸı��С
        common.stage.setTitle("ѧ���ɼ��鿴");//���ñ���
        common.stage.show();
	}
	// Event Listener on Button[#btn_2].onAction
	@FXML
	public void second(ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("second.fxml"));//�޸���
		Scene scene = new Scene(root,500,760);//�޸���
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        common.stage.setScene(scene);
        common.stage.setResizable(true);//���ò��ܴ��ڸı��С
        common.stage.setTitle("ѧ���ɼ��鿴");//���ñ���
        common.stage.show();
	}
}
