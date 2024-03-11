package gui.util;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class Utils {

	//Para saber que evento o botão recebeu
	public static Stage currentStage(ActionEvent event) {
		
		return (Stage) ((Node) event.getSource()).getScene().getWindow();
	}
	
	//Converter valor da combo para inteiro
	public static Integer tryParseToInt(String str) {
		try {
			return Integer.parseInt(str);
		} catch (NumberFormatException e) {
			return null;
		}
		
	}
}
