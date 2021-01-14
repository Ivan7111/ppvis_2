package sample;

public class User {
    public String name;
    public int level;
    public int pointsToNextLevel;
    public int tasksDone;
    public String password;
    public boolean status;
    public String country;
    public Task taskTaken;

    public User(String name, String password, int level, int pointsToNextLevel, int tasksDone, boolean status, String country){
        this.name = name;
        this.password = password;
        this.level = level;
        this.pointsToNextLevel = pointsToNextLevel;
        this.tasksDone = tasksDone;
        this.status = status;
        this.country = country;
    }
}
