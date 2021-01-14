package sample;

public interface MainMenu {
    void showTasksList();
    void viewTask(Task task);
    void viewProfile(User user);
    void addTask(String headline, String photoLink, String description, String country, User user);
    void addReport(Task task, User user, String photoLink, int time, int firstGrade, int SecondGrade, int mediumGrade);
    void takeTask(User user, Task task);
    void deleteTask(Task task);
    void viewReportsList();
    void viewReport(Report report);
    void gradeReport(Report report);
    void viewUserData(User user);
    void changeTask(Task task);
    void giveGrades();
    void refuseTask();
    void redactName();
    void redactCountry();
    void redactPassword();
    void deleteProfile();
    void changeUserStatus(boolean status);
}
