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
		
		Parent root = FXMLLoader.load(getClass().getResource("first.fxml"));//修改了
		Scene scene = new Scene(root,500,760);//修改了
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        common.stage.setScene(scene);
        common.stage.setResizable(true);//设置不能窗口改变大小
        common.stage.setTitle("学生成绩查看");//设置标题
        common.stage.show();
	}
	// Event Listener on Button[#btn_2].onAction
	@FXML
	public void second(ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("second.fxml"));//修改了
		Scene scene = new Scene(root,500,760);//修改了
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        common.stage.setScene(scene);
        common.stage.setResizable(true);//设置不能窗口改变大小
        common.stage.setTitle("学生成绩查看");//设置标题
        common.stage.show();
	}
}
