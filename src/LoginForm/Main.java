package LoginForm;

public class Main {
    public static void main(String[] args) {
        Info students = new Info();
        students.getUsers();
        LoginPage login = new LoginPage(students.getUsers());
    }
}
