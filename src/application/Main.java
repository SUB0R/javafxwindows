package application;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));//�޸���
            //BorderPane root = new BorderPane();
            //����Scene�Ĵ�С(SceneBuilder�е��AnchorPane�ұ�Layout�л���ʾ��С,��һ���Ŀ���)
            Scene scene = new Scene(root,500,522);//�޸���
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            common.stage = primaryStage;
            common.stage.setScene(scene);
            common.stage.setResizable(false);//���ò��ܴ��ڸı��С
            common.stage.setTitle("һ���򵥵�JavaFX");//���ñ���
            common.stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void hui() {
		start(common.stage);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
