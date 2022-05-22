import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин:");
        String login = scanner.nextLine();
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();
        getUserByLoginAndPassword(login, password);
        validateUser(getUserByLoginAndPassword(login, password));
    }

    public static User[] getUsers() {
        User user1 = new User("John", "superjohn", "qwerty", "john@mail.com", 23);
        User user2 = new User("Mary", "lalala", "123456", "mary@mail.com", 8);
        User user3 = new User("Tom", "yourdaddy", "qazwsx", "tom@mail.com", 40);
        return new User[]{user1, user2, user3};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
            return user;
            }
        }
        throw new UserNotFoundException("Пользователь не найден");
    }
    public static void validateUser(User user) throws AccessDeniedException {
        if (user.getAge() < 18) {
            throw new AccessDeniedException("Отказано в доступе. Возраст менее 18 лет!");
        } else {
            System.out.println("\nДоступ предоставлен!");
        }
    }
}