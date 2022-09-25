package mypack;

public class Nod {
    long gcd(long a,long b){
        return b == 0 ? a : gcd(b,a % b);
    }
}
