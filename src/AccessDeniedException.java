public class AccessDeniedException extends Exception {
    public AccessDeniedException() {

        super("Отказано в доступе. Возраст менее 18 лет!");
    }
}