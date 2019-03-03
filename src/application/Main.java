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
			Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));//修改了
            //BorderPane root = new BorderPane();
            //设置Scene的大小(SceneBuilder中点击AnchorPane右边Layout中会显示大小,不一样的可以)
            Scene scene = new Scene(root,500,522);//修改了
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            common.stage = primaryStage;
            common.stage.setScene(scene);
            common.stage.setResizable(false);//设置不能窗口改变大小
            common.stage.setTitle("一个简单的JavaFX");//设置标题
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
