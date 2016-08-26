import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class index extends Application{

    @FXML
    void click(ActionEvent event) {

    }
    public static void main(String [] args){
    	Application.launch(args);
    }
    
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		Parent root = FXMLLoader.load(getClass().getResource("index.fxml"));
		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.show();
	}

}
