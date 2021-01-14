package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class OnlinePlatform_impl implements OnlinePlatform{
    Scene scene;
    Stage stage;
    private VBox vbox;

    public User currentUser;
    public List<Task> tasksAvailable = new ArrayList<Task>();
    public List<Task> tasksTaken = new ArrayList<Task>();
    public List<Task> tasksDone = new ArrayList<Task>();
    public List<User> users = new ArrayList<User>();

    private MainWindow mainWindow;
    //private MainMenu_impl mainMenu;
    //private Enter_impl enter = new Enter_impl();

    public OnlinePlatform_impl(MainWindow mainWindow, Enter_impl enter, MainMenu_impl mainMenu){
        this.mainWindow = mainWindow;
        //this.mainMenu = mainMenu;
        //this.enter = enter;
    }

    @Override
    public void signIn() {
        //User user;
        vbox = new VBox();
        TextField userName = new TextField("Имя пользователя");
        TextField password = new TextField("Пароль");
        Button submit = new Button("Войти");
        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
//                if(userName.getText().equals("") || userName.getText().equals("Имя пользователя") &&
//                        password.getText().equals("") || password.getText().equals("Пароль")) {
//                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
//                    alert.setTitle("Alert");
//                    alert.setHeaderText(null);
//                    alert.setContentText("Все поля должны быть заполнены!");
//
//                    alert.showAndWait();
//                }
//                else {
//                    enter.signIn();
//                }

            }
        });
        vbox.getChildren().addAll(userName, password, submit);

        vbox.setPadding(new Insets(15, 20, 20, 12));
        vbox.setSpacing(10);

        scene = new Scene(vbox, 700, 500);
        stage = new Stage();
        stage.setTitle("Вход");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void signUp() {
        //User user;
        vbox = new VBox();
        TextField userName = new TextField("Имя пользователя");
        TextField password = new TextField("Пароль");
        ComboBox<String> country = new ComboBox<>();
        country.getItems().addAll("Беларусь","Россия","Польша","Литва","Латвия","Украина","Германия");
        country.setValue("Беларусь");
        Button submit = new Button("Зарегистрироваться");
        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

//                if(userName.getText().equals("") || userName.getText().equals("Имя пользователя") &&
//                        password.getText().equals("") || password.getText().equals("Пароль")) {
//                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
//                    alert.setTitle("Alert");
//                    alert.setHeaderText(null);
//                    alert.setContentText("Все поля должны быть заполнены!");
//
//                    alert.showAndWait();
//                }
//                else{
//                    String userNameV = userName.getText();
//                    String passwordV = password.getText();
//                    String countryV = country.getValue();
//                    //user = enter.addUser(userNameV, passwordV)
//                    enter.signUp();
//                }

            }
        });
        vbox.getChildren().addAll(userName, password, submit);

        vbox.setPadding(new Insets(15, 20, 20, 12));
        vbox.setSpacing(10);

        scene = new Scene(vbox, 700, 500);
        stage = new Stage();
        stage.setTitle("Регистрация");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void startWork() {
        //mainWindow = new MainWindow();
        //mainMenu = new MainMenu_impl();
        vbox = new VBox();

        Button enterButton = new Button("Войти");
        enterButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.close();
                //enter.signIn();
                mainWindow.showSignInWindow();
                //enter.signIn(users, currentUser);
            }
        });
        Button registerButton = new Button("Зарегистрироваться");
        registerButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.close();
                //enter.signUp();
                mainWindow.showSignUpWindow();
                //enter.signUp(users, currentUser);
            }
        });
        vbox.getChildren().addAll(enterButton, registerButton);
        vbox.setPadding(new Insets(15, 20, 20, 12));
        vbox.setSpacing(10);
        BorderPane root = new BorderPane(vbox);
        //root.setCenter(vbox);
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
