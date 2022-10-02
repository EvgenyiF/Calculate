package mypack;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;


public class Complex implements Operation {
    private int real1;
    private int real2;
    private int image1;
    private int image2;

    public void complex1(Scanner scanner) throws IOException {
        ParceString parceString = new ParceString();
        int[] num = parceString.res(scanner.nextLine());
        real1 = num[0];
        image1 = num[1];
        real2 = num[2];
        image2 = num[3];
        dest(num[4]);
    }

    public void dest(int oper) throws IOException {
        switch (oper) {
            case 1 -> add();
            case 2 -> sub();
            case 3 -> mul();
            case 4 -> div();
        }
    }

    @Override
    public void add() throws IOException {
        Log log = new Log();
        if ((image1 + image2) < 0) {
            System.out.println("Сумма равна " + (real1 + real2) + "" + (image1 + image2) + "j");
            String a = "Сумма равна " + (real1 + real2) + "" + (image1 + image2) + "j" + " " + new Date();
            log.log(a);

        } else {
            System.out.println("Сумма равна " + (real1 + real2) + "+" + (image1 + image2) + "j");
            String a = "Сумма равна " + (real1 + real2) + "+" + (image1 + image2) + "j" + " " + new Date();
            log.log(a);
        }
    }

    @Override
    public void sub() throws IOException {
        Log log = new Log();
        if ((image1 - image2) < 0) {
            System.out.println("Разность равна " + (real1 - real2) + "" + (image1 - image2) + "j");
            String a = "Разность равна " + (real1 - real2) + "" + (image1 - image2) + "j" + " " + new Date();
            log.log(a);
        } else {
            System.out.println("Разность равна " + (real1 - real2) + "+" + (image1 - image2) + "j");
            String a = "Разность равна " + (real1 - real2) + "+" + (image1 - image2) + "j" + " " + new Date();
            log.log(a);
        }
    }

    @Override
    public void mul() throws IOException {
        Log log = new Log();
        if ((real1 * image2 + real2 * image1) < 0) {
            System.out.println("Произведение равно " + (real1 * real2 - image1 * image2) + "" + (real1 * image2 + real2 * image1) + "j");
            String a = "Произведение равно " + (real1 * real2 - image1 * image2) + "" + (real1 * image2 + real2 * image1) + "j" + " " + new Date();
            log.log(a);
        } else {
            System.out.println("Произведение равно " + (real1 * real2 - image1 * image2) + "+" + (real1 * image2 + real2 * image1) + "j");
            String a = "Произведение равно " + (real1 * real2 - image1 * image2) + "+" + (real1 * image2 + real2 * image1) + "j" + " " + new Date();
            log.log(a);
        }
    }

    @Override
    public void div() throws IOException {
        Log log = new Log();
        if ((real2 * real2 + image2 * image2) == 0) {
            System.out.println("Неизвестный результат. Деление на 0");
            String a = "Неизвестный результат. Деление на 0" + " " + new Date();
            log.log(a);
        } else if ((real2 * image1 - real1 * image2) < 0 || (real2 * real2 + image2 * image2) < 0) {
            System.out.println("Результат деления равен " + ((real1 * real2 + image1 * image2) + "/" + (real2 * real2 + image2 * image2)) +
                    "" + ((real2 * image1 - real1 * image2) + "/" + (real2 * real2 + image2 * image2)) + "j");
            String a = "Результат деления равен " + ((real1 * real2 + image1 * image2) + "/" + (real2 * real2 + image2 * image2)) +
                    "" + ((real2 * image1 - real1 * image2) + "/" + (real2 * real2 + image2 * image2)) + "j" + " " + new Date();
            log.log(a);
        } else {
            System.out.println("Результат деления равен " + ((real1 * real2 + image1 * image2) + "/" + (real2 * real2 + image2 * image2)) +
                    "+" + ((real2 * image1 - real1 * image2) + "/" + (real2 * real2 + image2 * image2)) + "j");
            String a = "Результат деления равен " + ((real1 * real2 + image1 * image2) + "/" + (real2 * real2 + image2 * image2)) +
                    "+" + ((real2 * image1 - real1 * image2) + "/" + (real2 * real2 + image2 * image2)) + "j" + " " + new Date();
            log.log(a);
        }
    }

}
