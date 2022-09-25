package mypack;

import java.util.Scanner;

public class Complex implements Operation {
    private int real1;
    private int real2;
    private int image1;

    private int image2;


    public Complex() {

    }


    public void complex1(Scanner scanner) {
        ParceString parceString = new ParceString();
        int[] num = parceString.res(scanner.nextLine());
        real1 = num[0];
        image1 = num[1];
        if (image1 < 0) {
            System.out.println("Вы ввели " + real1 + "" + image1 + "j");
        } else {
            System.out.println("Вы ввели " + real1 + "+" + image1 + "j");
        }
    }

    public void complex2(Scanner scanner) {
        ParceString parceString = new ParceString();
        int[] num1 = parceString.res(scanner.nextLine());
        real2 = num1[0];
        image2 = num1[1];
        if (image2 < 0) {
            System.out.println("Вы ввели " + real2 + "" + image2 + "j");
        } else {
            System.out.println("Вы ввели " + real2 + "+" + image2 + "j");
        }
    }

    public void dest(Scanner scanner) {
        switch (scanner.nextLine()) {
            case "+" -> add();
            case "-" -> sub();
            case "*" -> mul();
            case "/" -> div();
        }
    }

    @Override
    public void add() {
        if ((image1 + image2) < 0) {
            System.out.println("Сумма равна " + (real1 + real2) + "" + (image1 + image2) + "j");
        } else {
            System.out.println("Сумма равна " + (real1 + real2) + "+" + (image1 + image2) + "j");
        }
    }

    @Override
    public void sub() {
        if ((image1 - image2) < 0) {
            System.out.println("Разность равна " + (real1 - real2) + "" + (image1 - image2) + "j");
        } else {
            System.out.println("Разность равна " + (real1 - real2) + "+" + (image1 - image2) + "j");
        }
    }

    @Override
    public void mul() {
        if ((real1 * image2 + real2 * image1) < 0) {
            System.out.println("Произведение равно " + (real1 * real2 - image1 * image2) + "" + (real1 * image2 + real2 * image1) + "j");
        } else {
            System.out.println("Произведение равно " + (real1 * real2 - image1 * image2) + "+" + (real1 * image2 + real2 * image1) + "j");
        }
    }

    @Override
    public void div() {
        if ((real2 * real2 + image2 * image2) == 0) {
            System.out.println("Неизвестный результат. Деление на 0");
        } else if ((real2 * image1 - real1 * image2) < 0 || (real2 * real2 + image2 * image2) < 0) {
            System.out.println("Результат деления равен " + ((real1 * real2 + image1 * image2) + "/" + (real2 * real2 + image2 * image2)) +
                    "" + ((real2 * image1 - real1 * image2) + "/" + (real2 * real2 + image2 * image2)) + "j");
        } else {
            System.out.println("Результат деления равен " + ((real1 * real2 + image1 * image2) + "/" + (real2 * real2 + image2 * image2)) +
                    "+" + ((real2 * image1 - real1 * image2) + "/" + (real2 * real2 + image2 * image2)) + "j");
        }
    }

}
