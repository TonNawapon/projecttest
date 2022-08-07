package ku.cs.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import com.github.saacsos.FXRouter;

import java.io.IOException;

public class LoginController {
    @FXML
    public void changePassWordButton(ActionEvent actionEvent){
        try {
            FXRouter.goTo("change_password");
        } catch (IOException e) {
            System.err.println("ไปที่หน้าChangePassword ไม่ได้");
        }
    }

    @FXML
    public void registerButton(ActionEvent actionEvent){
        try {
            FXRouter.goTo("register");
        } catch (IOException e) {
            System.err.println("ไปที่หน้าRegister ไม่ได้");
        }
    }

    @FXML
    public void homeButton(ActionEvent actionEvent){
        try {
            FXRouter.goTo("home");
        } catch (IOException e) {
            System.err.println("ไปที่หน้าHome ไม่ได้");
        }
    }

}
