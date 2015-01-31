/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forloopassignment;

/**
 *
 * @author sofyashipova
 */
public class ForLoopAssignment {

    public static void main(String[] args) {
        printStar();
        printAlphaNumNine("B");
        printRepeatAlphaNum("T", 6);
        printStarGrid(3, 9);
        printDescending(6);
        countDown(15);
        printSum(1, 4);
        zigZagZug();
        printTimesTable(4, 5);
        printTimesTableFormatted(10, 9);
    }

    public static void Space() {
        System.out.println("");
    }

    public static void printStar() {
        System.out.println("Print Star\n---------");
        for (int i = 0; i < 7; i++) {
            System.out.print("*");
        }
        Space();
    }

    public static void printAlphaNumNine(String alphanum) {
        System.out.println("\nAlphaNum\n---------");
        for (int i = 0; i < 9; i++) {
            System.out.print(alphanum);
        }
        Space();
    }

    public static void printRepeatAlphaNum(String alphanum, int repeat) {
        System.out.printf("\nRepeat AlphaNum (%s,%2d) \n", alphanum, repeat); //s - string, d - number, f - float
        System.out.println("---------");
        for (int i = 0; i < repeat; i++) {
            System.out.print(alphanum);
        }
        Space();
    }

    public static void printStarGrid(int rows, int columns) {
        System.out.printf("\nRepeat AlphaNum (%s,%2d) \n", rows, columns);
        System.out.println("---------");
        for (int i1 = 0; i1 < rows; i1++) {
            for (int i2 = 0; i2 < columns; i2++) {
                System.out.print("*");
            }
            Space();
        }
    }

    public static void printDescending(int rows) {
        System.out.println("\n5 + 6 Tasks Frankenstein: Descending Value (<startValue>)\n---------\n******* <repeated “startValue” times, decreasing by 1 each line>\n...");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < rows - row; col++) {
                System.out.print("*");
            }
            Space();
        }
    }

    public static void countDown(int startValue) {
        Space();
        for (; startValue >= 0; startValue--) {
            if (startValue == 0) {
                System.out.println("Lift off!\n");
            } else {
                System.out.println(startValue);
            }
        }
    }

    public static void printSum(int startValue, int endValue) {
        System.out.printf("Print Sum (%d,%2d)\n", startValue, endValue);
        System.out.println("---------");
        int addition = 0;
        for (int i1 = startValue; i1 <= endValue; i1++) {
            addition += i1;
        }
        System.out.printf("Adding the numbers from %d to %d gives %d\n", startValue, endValue, addition);
    }

    public static void zigZagZug() {
        for (int i1 = 1; i1 <= 100; i1++) {
            System.out.print("\n" + i1 + ") ");

            if (i1 % 2 == 0) {
                System.out.print("Zig ");
            }

            if (i1 % 3 == 0) {
                System.out.print("Zag ");
            }

            if (i1 % 5 == 0) {
                System.out.print("Zug");
            }
        }
    }

    public static void printTimesTable(int rows, int columns) {
        Space();
        System.out.println("Times Table\n---------");
        for (int i1 = 0; i1 < rows; i1++) {
            for (int i2 = 0; i2 <= columns; i2++) {
                System.out.printf(" %d ", i1 * i2);
            }
            Space();
        }
    }
    /*
     Bonus: Write a java method called “printTimesTableFormatted(int rows, int columns)”
     that uses two (nested) for loops to produce a properly formatted grid of (row * column)
     products with the correct number of rows and columns, as defined by the input parameters;
     e.g. printTimesTableFormatted(9, 9) will result in:

     Formatted Times Table
     ---------------------

     * |  1  2  3  4  5  6  7  8  9
     -------------------------------
     1 |  1  2  3  4  5  6  7  8  9
     2 |  2  4  6  8 10 12 14 16 18
     3 |  3  6  9 12 15 18 21 24 27
     4 |  4  8 12 16 20 24 28 32 36
     5 |  5 10 15 20 25 30 35 40 45
     6 |  6 12 18 24 30 36 42 48 54
     7 |  7 14 21 28 35 42 49 56 63
     8 |  8 16 24 32 40 48 56 64 72
     9 |  9 18 27 36 45 54 63 72 81
     */

    public static void printTimesTableFormatted(int rows, int columns) {
        Space();
        System.out.println("Formatted Times Table\n---------------------");
        Space();

        for (int i1 = 1; i1 <= rows; i1++) {
            if (i1 > 9) {
                System.out.print(i1 + "|  ");
            } else {
                System.out.print(i1 + " |  ");
            }
            
            for (int i2 = 1; i2 <= columns; i2++) {

                System.out.printf(" %d ", i1 * i2);

                if (i1 * i2 < 10) {
                    System.out.print(" ");
                }

            }
            Space();
        }
    }
}
