package org.campus02.printnumbers;

public class PrintNumbers {

    public static void main(String[] args) {
        fromNToZero(5);
    }

    public static void fromNToZero(int n) {
        if (n < 0 ) {
            return;
        }
        System.out.println("n = " + n);
        fromNToZero(n - 1);
    }
}
