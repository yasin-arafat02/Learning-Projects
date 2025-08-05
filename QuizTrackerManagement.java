import java.util.ArrayList;

abstract class user{
    int userID;
    String username;
    String password;

    user(int userID,String username,String password){
        this.userID = userID;
        this.username = username;
        this.password = password;
    }

    void LogIn(){
        System.out.printf("%s is Logged in\n",username);
    }
    void LogOut(){
        System.out.printf("%s is logged Out\n",username);
    }
}

class QuizTaker extends user{
    QuizTaker(int id,String name,String pass){
        super(id,name,pass);
    }
}
class admin extends user{
    admin(int id,String name,String pass){
        super(id,name,pass);
    }
}

class Quiz {
    String quizID;
    String title;
    String description;
    boolean isActive;
    ArrayList<Question> questions;

    Quiz(String quizID,String title,String description){
        this.quizID=quizID;
        this.title=title;
        this.description=description;
        this.isActive = false;
        this.questions = new ArrayList<>();
    }
    void StartQuiz(){
        isActive = true;
    }
    void EndQuiz(){
        isActive = false;
    }


}


public class QuizTrackerManagement {
   public static void main(String[] args) {
    user u;
    u = new QuizTaker(288, "Shibloo", "S12S");
    u.LogIn();
    u.LogOut();
    u = new admin(442, "Mahmuda", "Masu");
    u.LogIn();
    u.LogOut();
   } 
}
