package java_Exceptions_hw_03;

public class SexException extends Exception {
    public SexException() {
    }

    public void sexException(String i) {
        System.out.println("Exception: SexNotCorrectData");
        System.out.printf("Ошибка ввода данных: %s", i);
        System.out.println();
    }
}
