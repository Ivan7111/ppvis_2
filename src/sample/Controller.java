package sample;
import java.util.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;

public class Controller {
    void createOnlinePlatform(){
        MainMenu_impl mainMenu = new MainMenu_impl();
        Enter_impl enter = new Enter_impl();
        MainWindow mainWindow = new MainWindow(mainMenu, enter);
        OnlinePlatform_impl onlinePlatform = new OnlinePlatform_impl(mainWindow, enter, mainMenu);
        onlinePlatform.startWork();
    }
}
