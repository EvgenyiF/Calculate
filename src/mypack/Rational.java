package mypack;

import java.util.Scanner;

public class Rational implements Operation {
    private int real1;
    private int real2;
    private int image1;
    private int image2;
    Nod nod = new Nod();

    public void rational1(Scanner scanner) {
        ParceString parceString = new ParceString();
        int[] num = parceString.res(scanner.nextLine());
        real1 = num[0];
        image1 = num[1];
        real2 = num[2];
        image2 = num[3];
        dest(num[4]);

    }


    public void dest(int oper) {
        switch (oper) {
            case 1 -> add();
            case 2 -> sub();
            case 3 -> mul();
            case 4 -> div();
        }
    }

    @Override
    public void add() {
        int resReal = real1 * image2 + real2 * image1;
        int resImage = image1 * image2;
        long f = nod.gcd(resReal, resImage);
        if (resReal == 0) {
            System.out.println("Результат сложения равен 0");
        } else if (resImage == 0) {
            System.out.println("Деление на ноль!!!!!!!");
        } else if (Math.abs(resReal) == Math.abs(resImage)) {
            System.out.println("Результат сложения равен " + resReal / f);
        } else  if (resReal > resImage) {
                int x = resReal / resImage;
                System.out.println("Результат сложения равен " + x + " " + (resReal - (long) resImage * x) / f + "/" + resImage / f);
            } else if (resReal < resImage | resImage % resReal == 0) {
                System.out.println("Результат сложения равен " + (resReal / f) + "/" + (resImage / f));
            } else {
                System.out.println("Результат сложения равен " + (resReal) + "/" + (resImage));
            }
        }


    @Override
    public void sub() {
        int resReal = real1 * image2 - real2 * image1;
        int resImage = image1 * image2;
        long f = nod.gcd(resReal, resImage);
        if (resReal == 0) {
            System.out.println("Результат вычитания равен 0");
        } else if (resImage == 0) {
            System.out.println("Деление на ноль!!!!!!!");
        } else if (Math.abs(resReal) == Math.abs(resImage)) {
            System.out.println("Результат вычитания равен " + resReal / f);
        } else if (resReal > resImage) {
            int x = resReal / resImage;
            System.out.println("Результат вычитания равен " + x + " " + (resReal - (long) resImage * x) / f + "/" + resImage / f);
        } else if (resReal < resImage | resImage % resReal == 0) {
            System.out.println("Результат вычитания равен " + (resReal / f) + "/" + (resImage / f));
        } else {
            System.out.println("Результат вычитания равен " + (resReal) + "/" + (resImage));
        }

    }


    @Override
    public void mul() {
        int resReal = real1 * real2;
        int resImage = image1 * image2;
        long f = nod.gcd(resReal, resImage);
        if (resReal == 0) {
            System.out.println("Результат умножения равен 0");
        } else if (resImage == 0) {
            System.out.println("Деление на ноль!!!!!!!");
        } else if (Math.abs(resReal) == Math.abs(resImage)) {
            System.out.println("Результат умножения равен " + resReal / f);
        } else if (resReal > resImage) {
            int x = resReal / resImage;
            System.out.println("Результат умножения равен " + x + " " + (resReal - (long) resImage * x) / f + "/" + resImage / f);
        } else if (resReal < resImage | resImage % resReal == 0) {
            System.out.println("Результат умножения равен " + (resReal / f) + "/" + (resImage / f));
        } else {
            System.out.println("Результат умножения равен " + (resReal) + "/" + (resImage));
        }

    }

    @Override
    public void div() {
        int resReal = real1 * image2;
        int resImage = image1 * real2;
        long f = nod.gcd(resReal, resImage);
        if (resReal == 0) {
            System.out.println("Результат деления равен 0");
        } else if (resImage == 0) {
            System.out.println("Деление на ноль!!!!!!!");
        } else if (Math.abs(resReal) == Math.abs(resImage)) {
            System.out.println("Результат деления равен " + resReal / f);
        } else if (resReal > resImage) {
            int x = resReal / resImage;
            System.out.println("Результат деления равен " + x + " " + (resReal - (long) resImage * x) / f + "/" + resImage / f);
        } else if (resReal < resImage | resImage % resReal == 0) {
            System.out.println("Результат деления равен " + (resReal / f) + "/" + (resImage / f));
        } else {
            System.out.println("Результат деления равен " + (resReal) + "/" + (resImage));
        }

    }

}



