package mypack;

import java.io.IOException;
import java.util.Scanner;

public class View {
    Complex complex = new Complex();
    Rational rational = new Rational();
    Scanner scanner = new Scanner(System.in);

    public void view() throws IOException {

        System.out.println("Выберите с какими числами будете работать: ");
        System.out.println("1 - комплексное");
        System.out.println("2 - рациональное");
        int w = scanner.nextInt();
        scanner.nextLine();
        switch (w) {
            case 1:
                System.out.print("Введите комплексное число действительную и мнимую часть через пробел a b: ");
                complex.complex1(scanner);
                System.out.print("Введите второе комплексное число действительную и мнимую часть через пробел a b: ");
                complex.complex2(scanner);
                System.out.print("Выберите действие: ");
                complex.dest(scanner);
                break;
            case 2:
                System.out.print("Введите рациональное число числитель и знаменатель через пробел a b: ");
                rational.rational1(scanner);
                System.out.print("Введите второе рациональное числитель и знаменатель через пробел a b: ");
                rational.rational2(scanner);
                System.out.print("Выберите действие: ");
                rational.operation(scanner);
                break;
        }


    }

}
