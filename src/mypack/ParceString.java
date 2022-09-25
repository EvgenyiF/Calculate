package mypack;

public class ParceString {

    public int[] res(String scanner) {

        String[] scanParce = scanner.replaceAll("\\s+", " ").split(" ");
//        String[] numberParce = scanner.split("[\\d\t\n]");

        int[] res = new int[2];

        res[0] = Integer.parseInt(scanParce[0]);
        res[1] = Integer.parseInt(scanParce[1]);
        // пробовал распарсить строку при вводе типа (-5+10j) не получилось распарсить знаки почему-то при split([0-9])
        // первым записывается пустой элемент.
//        if(scanParce[0].equals("-") ) {
//            res[0] = -Integer.parseInt(scanParce[1]);
//            if (scanParce[2].equals("-")){
//                res[1] = -Integer.parseInt(scanParce[2]);
//            }else if(numberParce[2].equals("+")) {
//                res[1] = Integer.parseInt(scanParce[2]);
//            }
//        }else {
//            res[0] = Integer.parseInt(scanParce[1]);
//            if (numberParce[2].equals("-")) {
//                res[1] = -Integer.parseInt(scanParce[2]);
//            } else{
//                res[1] = Integer.parseInt(scanParce[2]);
//            }
//        }
        return res;
    }


}
