package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class OnlinePlatform_impl implements OnlinePlatform{
    Scene scene;
    Stage stage;

    public User currentUser;
    public List<Task> tasksAvailable = new ArrayList<>();
    public List<Task> tasksTaken = new ArrayList<>();
    public List<Task> tasksDone = new ArrayList<>();
    public List<User> users = new ArrayList<>();

    private MainWindow mainWindow;

    public OnlinePlatform_impl(MainWindow mainWindow, Enter_impl enter, MainMenu_impl mainMenu){
        this.mainWindow = mainWindow;
    }

    @Override
    public void signIn() {
        mainWindow.showSignInWindow();
    }

    @Override
    public void signUp() {
        mainWindow.showSignUpWindow();
    }

    @Override
    public void startWork() {
        VBox vbox = new VBox();

        Button enterButton = new Button("Войти");
        enterButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.close();
                mainWindow.showSignInWindow();
            }
        });
        Button registerButton = new Button("Зарегистрироваться");
        registerButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.close();
                mainWindow.showSignUpWindow();
            }
        });
        vbox.getChildren().addAll(enterButton, registerButton);
        vbox.setPadding(new Insets(15, 20, 20, 12));
        vbox.setSpacing(10);
        BorderPane root = new BorderPane(vbox);
        scene = new Scene(root, 700, 500);
        stage = new Stage();
        stage.setTitle("PPvIS-2");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void exit() {

    }
}
