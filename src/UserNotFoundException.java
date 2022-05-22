public class UserNotFoundException extends Exception {
    public UserNotFoundException() {
        super("Пользователь не найден. Bye-Bye! =)");
    }
}