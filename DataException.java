package java_Exceptions_hw_03;

public class DataException extends Exception{
    public DataException() {
    }

    public void dataException(String i) {
        System.out.println("Exception: DataNotCorrectFormat");
        System.out.printf("Неправильный ввод данных: %s", i);
        System.out.println();
    }
}
