import java.util.ArrayList;

// -----------------Base/abstract user class---------------//

abstract class User {
    String userId;
    String username;
    String password;

    User(String userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
    }

    void login() {
        System.out.printf("%s logged in\n", username);
    }

    void logout() {
        System.out.printf("%s logged out\n", username);
    }
}

class QuizTaker extends User {
    QuizTaker(String id, String name, String pass) {
        super(id, name, pass);
    }
}

class Admin extends User {
    Admin(String id, String name, String pass) {
        super(id, name, pass);
    }
}

// -----------------Question class---------------//

class Question {
    String questionId;
    String text;
    String correctAnswer;
    int points;
    String questionType;
    ArrayList<String> options;

    Question(String questionId, String text, String correctAnswer, int points, String questionType) {
        this.questionId = questionId;
        this.text = text;
        this.correctAnswer = correctAnswer;
        this.points = points;
        this.questionType = questionType;
        this.options = new ArrayList<>();
    }

    void addOption(String option) {
        options.add(option);
    }

    boolean validateAnswer(String userAnswer) {
        return userAnswer.equalsIgnoreCase(correctAnswer);
    }
}

// -----------------Quiz class---------------//

class Quiz {
    String quizId;
    String title;
    String description;
    boolean isActive;
    ArrayList<Question> questions;

    Quiz(String quizId, String title, String description) {
        this.quizId = quizId;
        this.title = title;
        this.description = description;
        this.isActive = false;
        this.questions = new ArrayList<>();
    }
    void startQuiz() 
    { 
        isActive = true; 
    }
    void endQuiz() 
    { 
        isActive = false; 
    }
}
public class QuizTrackerManagement {
    public static void main(String[] args) {

        // -----------------Polymorphism demo---------------//

        User u;
        u = new QuizTaker("288", "Shibloo", "S12S");
        u.login();
        u.logout();

        u = new Admin("442", "Mahmuda", "Masu");
        u.login();
        u.logout();
    }
}