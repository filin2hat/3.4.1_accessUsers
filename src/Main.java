import java.util.Scanner;

public class Main {
    public static String login;
    public static String password;

    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите ЛОГИН и ПАРОЛЬ. Для выхода введите 'exit'.");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                System.out.println("Пока!");
                break;
            }
            try {
                String[] parts = input.split(" ");
                login = parts[0];
                password = parts[1];
                getUserByLoginAndPassword(login, password);
                validateUser(getUserByLoginAndPassword(login, password));
                break;
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Не верный ввод пары ЛОГИН  ПАРОЛЬ.\n");
            }
        }
    }

    public static User[] getUsers() {
        User user1 = new User("John", "superjohn", "qwerty", "john@mail.com", 23);
        User user2 = new User("Mery", "lalala", "123456", "mary@mail.com", 8);
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
        throw new UserNotFoundException();
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.getAge() < 18) {
            throw new AccessDeniedException();
        } else {
            System.out.println("\nДоступ предоставлен!");
        }
    }
}