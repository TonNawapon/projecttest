package ku.cs;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.github.saacsos.FXRouter;


import java.io.IOException;

public class ProjectApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        com.github.saacsos.FXRouter.bind(this, stage, "Login", 800, 600);
        configRoute();
        FXRouter.goTo("login");
    }

    private static void configRoute() {
        String packageStr = "ku/cs/";
        FXRouter.when("login", packageStr + "login.fxml");
        FXRouter.when("register",packageStr + "register.fxml");
        FXRouter.when("change_password", packageStr + "change_password.fxml");
        FXRouter.when("home",packageStr + "home.fxml");
    }

    public static void main(String[] args) {
        launch();
    }
}
