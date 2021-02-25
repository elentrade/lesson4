package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;


public class Controller {
    @FXML
    public TextArea TxtArea;
    @FXML
    public TextField TxtField;
    @FXML
    public Label TxtLog;


    public void btnSendOnClick(ActionEvent actionEvent) {
        TxtArea.appendText(TxtLog.getText()+"\n");
        TxtArea.appendText(TxtField.getText()+"\n");
        TxtField.clear();
        TxtField.requestFocus();
    }



    public void btnExitOnClick(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void txtEnter(KeyEvent keyEvent) {
        if(keyEvent.getCode()== KeyCode.ENTER){
            TxtArea.appendText(TxtLog.getText()+"\n");
            TxtArea.appendText(TxtField.getText()+"\n");
            TxtField.clear();
            TxtField.requestFocus();
        }
    }
}


