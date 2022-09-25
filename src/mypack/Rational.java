package mypack;

import java.util.Scanner;

public class Rational implements Operation {
    private int real1;
    private int real2;
    private int image1;
    private int image2;

    public Rational() {
    }
    Nod nod = new Nod();
    public void rational1(Scanner scanner) {
        ParceString parceString = new ParceString();
        int[] num = parceString.res(scanner.nextLine());
        real1 = num[0];
        image1 = num[1];
        System.out.println("Вы ввели " + real1 + "/" + image1);
    }

    public void rational2(Scanner scanner) {
        ParceString parceString = new ParceString();
        int[] num1 = parceString.res(scanner.nextLine());
        real2 = num1[0];
        image2 = num1[1];
        System.out.println("Вы ввели " + real2 + "/" + image2);
    }

    public void operation(Scanner scanner) {
        switch (scanner.nextLine()) {
            case "+" -> add();
            case "-" -> sub();
            case "*" -> mul();
            case "/" -> div();
        }
    }

    @Override
    public void add() {
        int resReal = real1 * image2 + real2 * image1;
        int resImage = image1 * image2;
        long f = nod.gcd(resReal,resImage);
        if (resReal > resImage) {
            int x = resReal / resImage;
            System.out.println("Результат сложения равен " + x +" "+ (resReal-resImage*x)/f + "/" + resImage/f);
        } else if (resReal < resImage | resImage % resReal == 0) {
            int x = resImage / resReal;
            System.out.println("Результат сложения равен " + (resReal / f) + "/" + (resImage / f));
        } else {
            System.out.println("Результат сложения равен " + (resReal) + "/" + (resImage));
        }
    }

    @Override
    public void sub() {
        int resReal = real1 * image2 - real2 * image1;
        int resImage = image1 * image2;
        long f = nod.gcd(resReal,resImage);
        if (resReal > resImage) {
            int x = resReal / resImage;
            System.out.println("Результат вычитания равен " + x +" "+ (resReal-resImage*x)/f + "/" + resImage/f);
        } else if (resReal < resImage | resImage % resReal == 0) {
            int x = resImage / resReal;
            System.out.println("Результат вычитания равен " + (resReal / f) + "/" + (resImage / f));
        } else {
            System.out.println("Результат вычитания равен " + (resReal) + "/" + (resImage));
        }
    }

    @Override
    public void mul() {
        int resReal = real1 * real2;
        int resImage = image1 * image2;
        long f = nod.gcd(resReal,resImage);
        if (resReal > resImage) {
            int x = resReal / resImage;
            System.out.println("Результат умножения равен " + x +" "+ (resReal-resImage*x)/f + "/" + resImage/f);
        } else if (resReal < resImage | resImage % resReal == 0) {
            int x = resImage / resReal;
            System.out.println("Результат умножения равен " + (resReal / f) + "/" + (resImage / f));
        } else {
            System.out.println("Результат умножения равен " + (resReal) + "/" + (resImage));
        }
    }

    @Override
    public void div() {
        int resReal = real1 * image2;
        int resImage = image1 * real2;
        long f = nod.gcd(resReal,resImage);
        if (resReal > resImage) {
            int x = resReal / resImage;
            System.out.println("Результат деления равен " + x +" "+ (resReal-resImage*x)/f + "/" + resImage/f);
        } else if (resReal < resImage | resImage % resReal == 0) {
            int x = resImage / resReal;
            System.out.println("Результат деления равен " + (resReal / f) + "/" + (resImage / f));
        } else {
            System.out.println("Результат деления равен " + (resReal) + "/" + (resImage));
        }

    }
}



