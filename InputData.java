package java_Exceptions_hw_03;

import java.util.Scanner;

public class InputData {
    public String[] enterData() {
        Scanner iScanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите строку данных, разделяя пробелом: фамилия, имя, отчество, дата рождения (dd.mm.yyyy), номер телефона (цифры), пол (f/m) : ");
            String data = iScanner.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6){
                System.out.println("Недостаточно данных, повторите");
            } else System.out.println("Слишком много данных, повторите");
        }

    }
}
