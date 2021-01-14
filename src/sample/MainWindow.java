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

import java.util.ArrayList;
import java.util.List;

public class MainWindow {
    public OnlinePlatform_impl onlinePlatform;
    public MainMenu_impl mainMenu;
    public Enter_impl enter;
    Stage stage;
    User user = new User("example", "111", 0, 0 ,
            0, true, "Беларусь");

    public MainWindow(MainMenu_impl mainMenu, Enter_impl enter){
        this.mainMenu = mainMenu;
        this.enter = enter;
    }

    public void showSignInWindow(){
        this.enter = enter;
        VBox vbox = new VBox();
        TextField userName = new TextField("Имя пользователя");
        TextField password = new TextField("Пароль");
        Button submit = new Button("Войти");
        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(userName.getText().equals("") || userName.getText().equals("Имя пользователя") &&
                        password.getText().equals("") || password.getText().equals("Пароль")) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Alert");
                    alert.setHeaderText(null);
                    alert.setContentText("Все поля должны быть заполнены!");

                    alert.showAndWait();
                }
                else {
                    enter.signIn();
                    stage.close();
                    showMainMenu();
                    //enter.signIn();
                }

            }
        });
        vbox.getChildren().addAll(userName, password, submit);

        vbox.setPadding(new Insets(15, 20, 20, 12));
        vbox.setSpacing(10);

        Scene scene = new Scene(vbox, 700, 500);
        stage = new Stage();
        stage.setTitle("Вход");
        stage.setScene(scene);
        stage.show();
    }
    public void showSignUpWindow(){
        this.enter = enter;
        Scene scene;
        VBox vbox = new VBox();
        TextField userName = new TextField("Имя пользователя");
        TextField password = new TextField("Пароль");
        ComboBox<String> country = new ComboBox<>();
        country.getItems().addAll("Беларусь","Россия","Польша","Литва","Латвия","Украина","Германия");
        country.setValue("Беларусь");
        Button submit = new Button("Зарегистрироваться");
        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                if(userName.getText().equals("") || userName.getText().equals("Имя пользователя") &&
                        password.getText().equals("") || password.getText().equals("Пароль")) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Alert");
                    alert.setHeaderText(null);
                    alert.setContentText("Все поля должны быть заполнены!");

                    alert.showAndWait();
                }
                else{
                    enter.signUp();
                    stage.close();
                    showMainMenu();
                    //User newUser = addUser(userName.getText(), password.getText(), 0, 0, 0,
                    //        true, country.getValue());
                    //checkUser()
                }

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
    public void showMainMenu(){
        VBox vbox = new VBox();
        List<Button> buttonList = new ArrayList<>();
        buttonList.add(new Button("Список заданий")); //0
        buttonList.get(0).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                //stage.close();
                mainMenu.showTasksList();
            }
        });
        buttonList.add(new Button("Список отчетов")); //1
        buttonList.get(1).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                //stage.close();
                mainMenu.viewReportsList();
            }
        });
        //Button tasksList = new Button("Список заданий");
        buttonList.add(new Button("Посмотреть профиль"));//2
        buttonList.get(2).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.close();
                mainMenu.viewProfile(user);
            }
        });
//        //Button reportList = new Button("Список отчетов");
//        buttonList.add(new Button("Посмотреть профиль"));//3
//        buttonList.get(3).setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                stage.close();
//            }
//        });
        //Button userStat = new Button("Посмотреть профиль");

        vbox.getChildren().addAll(buttonList);
        Scene scene = new Scene(vbox, 700, 500);
        stage = new Stage();
        stage.setTitle("Регистрация");
        stage.setScene(scene);
        stage.show();
    }
}
