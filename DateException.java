package java_Exceptions_hw_03;

public class DateException extends Exception {
    public DateException() {
    }

    public void dataException(String i) {
        System.out.println("Exception: DateNotCorrectFormat");
        System.out.printf("Неправильный ввод даты: %s", i);
        System.out.println();
    }
}
