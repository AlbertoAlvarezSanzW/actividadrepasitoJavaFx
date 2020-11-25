package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {


    @FXML
    PasswordField TEOSTIOPW ;

    @FXML
    Button boton;



    @FXML
    public void botonClick(){
        String pw = TEOSTIOPW.getText();
        boton.setText(pw);
    }



}
