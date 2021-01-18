package sample;

public class Controller {
    void createOnlinePlatform(){
        MainMenu_impl mainMenu = new MainMenu_impl();
        Enter_impl enter = new Enter_impl();
        MainWindow mainWindow = new MainWindow(mainMenu, enter);
        OnlinePlatform_impl onlinePlatform = new OnlinePlatform_impl(mainWindow);
        onlinePlatform.startWork();
    }
}
