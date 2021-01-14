package sample;

import java.util.*;

public interface Enter {
    boolean checkUser(String userName, String password);
    User addUser(String userName, String password, int level, int pointsToNextLevel, int tasksDone, boolean status, String country);
    User signIn();
    void signUp();
}
