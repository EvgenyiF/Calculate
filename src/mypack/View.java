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
            case 1 -> {
                System.out.print("Введите комплексное выражение вида (a+b)-(c+d): ");
                complex.complex1(scanner);
            }
            case 2 -> {
                System.out.print("Введите рациональное выражение вида (a/b)+(c/d): ");
                rational.rational1(scanner);
            }
        }


    }

}
