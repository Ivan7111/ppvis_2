package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.List;

public class Enter_impl implements Enter {
    Scene scene;
    Stage stage;
    VBox vbox;
    User user;

    @Override
    public boolean checkUser(String userName, String password) {
        return false;
    }

    @Override
    public User addUser(String userName, String password, int level, int pointsToNextLevel, int tasksDone,
                        boolean status, String country) {
        return new User(userName, password, 1, 0, 0, true, country);
    }

    @Override
    public User signIn() {
        return null;
    }

    @Override
    public void signUp() {

    }
}
