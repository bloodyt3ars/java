package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[][] resultArray = new int[rows][columns];
        int currentRows = 0;
        int currentColumns = 0;
        int counter = 1;
        for (int number = 1; number <=rows*columns; counter++) {
            for (; currentColumns < columns-counter;currentColumns++, number++) {
                if ((number-1)==(rows*columns)) break;
                resultArray[currentRows][currentColumns] = number;
            }
            for (; currentRows <= rows-counter; number++,currentRows++) {
                if ((number-1)==(rows*columns)) break;
                resultArray[currentRows][currentColumns] = number;
            }
            currentRows--;
            currentColumns--;
            for (; currentColumns >= counter; number++,currentColumns--) {
                if ((number-1)==(rows*columns)) break;
                resultArray[currentRows][currentColumns] = number;
            }
            for (; currentRows > counter; number++, currentRows--) {
                if ((number-1)==(rows*columns)) break;
                resultArray[currentRows][currentColumns]=number;
            }
        }
        return resultArray;
    }
}
