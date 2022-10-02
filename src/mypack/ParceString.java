package mypack;

public class ParceString {

    String oper = "";

    public int[] res(String scanner) {
        String prob = scanner.replaceAll("\\s", "");
        int index = prob.indexOf("-");
        String[] scanParce = scanner.replaceAll("\\)", "").replaceAll("\\(", " ").replaceAll("\\w*", " ").replaceAll("\\s+", " ").replaceAll("^\\s*", "").split(" ");
        String[] numberParce = scanner.replaceAll("\\)", "").replaceAll("\\(", "").replaceAll("\\W*", " ").replaceAll("\\s+", " ").replaceAll("^\\s", "").split(" ");

        int[] res = new int[5];

        switch (scanParce.length) {
            case 3:
                oper = scanParce[1];
                res[0] = Integer.parseInt(numberParce[0]);
                if (scanParce[0].equals("-")) {
                    res[1] = -Integer.parseInt(numberParce[1]);
                } else {
                    res[1] = Integer.parseInt(numberParce[1]);
                }
                res[2] = Integer.parseInt(numberParce[2]);
                if (scanParce[2].equals("-")) {
                    res[3] = -Integer.parseInt(numberParce[3]);
                } else {
                    res[3] = Integer.parseInt(numberParce[3]);
                }
                break;
            case 4:
                if (index == 1) {
                    res[0] = -Integer.parseInt(numberParce[0]);
                    oper = scanParce[2];
                    if (scanParce[1].equals("-")) {
                        res[1] = -Integer.parseInt(numberParce[1]);
                    } else {
                        res[1] = Integer.parseInt(numberParce[1]);
                    }
                    res[2] = Integer.parseInt(numberParce[2]);
                    if (scanParce[3].equals("-")) {
                        res[3] = -Integer.parseInt(numberParce[3]);
                    } else {
                        res[3] = Integer.parseInt(numberParce[3]);
                    }
                } else {
                    res[0] = Integer.parseInt(numberParce[0]);
                    oper = scanParce[1];
                    if (scanParce[0].equals("-")) {
                        res[1] = -Integer.parseInt(numberParce[1]);
                    } else {
                        res[1] = Integer.parseInt(numberParce[1]);
                    }
                    if (scanParce[2].equals("-")) {
                        res[2] = -Integer.parseInt(numberParce[2]);
                    } else {
                        res[2] = Integer.parseInt(numberParce[2]);
                    }
                    if (scanParce[3].equals("-")) {
                        res[3] = -Integer.parseInt(numberParce[3]);
                    } else {
                        res[3] = Integer.parseInt(numberParce[3]);
                    }
                }
                break;
            case 5:
                res[0] = -Integer.parseInt(numberParce[0]);
                oper = scanParce[2];
                if (scanParce[1].equals("-")) {
                    res[1] = -Integer.parseInt(numberParce[1]);
                } else {
                    res[1] = Integer.parseInt(numberParce[1]);
                }
                res[2] = -Integer.parseInt(numberParce[2]);
                if (scanParce[4].equals("-")) {
                    res[3] = -Integer.parseInt(numberParce[3]);
                } else {
                    res[3] = Integer.parseInt(numberParce[3]);
                }
                break;

        }


        switch (oper) {
            case "+" -> res[4] = 1;
            case "-" -> res[4] = 2;
            case "*" -> res[4] = 3;
            case "/" -> res[4] = 4;
        }
        return res;
    }
}
