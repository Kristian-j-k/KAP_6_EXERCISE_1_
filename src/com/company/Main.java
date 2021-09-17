package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        loop(999999999); //EXERCISE 6.1

}
//EXERCISE 6.1

/*  TABLE OF I AND N
i = 10    n = 10    n = 10
i = 5    n = 10    n = 10
i = 6    n = 10    n = 10
i = 3    n = 10    n = 10
i = 4    n = 10    n = 10
i = 2    n = 10    n = 10

OUTPUT:
10
5
6
3
4
2

BECAUSE n IS AN INT, THE PROGRAM CAN'T HAVE DECIMALS.
n CANT 1 OR LESS
n CANT BE MORE THAN 99999999 BECAUSE THE INT DOES NOT ALLOW IT

*/

    public static void loop(int n) {
        int i = n;  //n never change during the loop
        while (i > 1) {
            System.out.println(i);
            if (i % 2 == 0) {
                i = i / 2;
            } else {
                i = i + 1;
            }
        }
    }


}