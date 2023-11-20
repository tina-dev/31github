package com.java;

    public class SudokuTest {

        public static void main(String [] args) {
            String[][] validBoard = { {"5", "3", ".", ".", "7", ".", ".", ".", "."}, {"6", ".", ".", "1", "9", "5", ".", ".", "."}, {".", "9", "8", ".", ".", ".", ".", "6", "."}, {"8", ".", ".", ".", "6", ".", ".", ".", "3"}, {"4", ".", ".", "8", ".", "3", ".", ".", "1"}, {"7", ".", ".", ".", "2", ".", ".", ".", "6"}, {".", "6", ".", ".", ".", ".", "2", "8", "."}, {".", ".", ".", "4", "1", "9", ".", ".", "5"}, {".", ".", ".", ".", "8", ".", ".", "7", "9"} };


        }
        String[][] validBoard = { {"5", "3", ".", ".", "7", ".", ".", ".", "."}, {"6", ".", ".", "1", "9", "5", ".", ".", "."}, {".", "9", "8", ".", ".", ".", ".", "6", "."}, {"8", ".", ".", ".", "6", ".", ".", ".", "3"}, {"4", ".", ".", "8", ".", "3", ".", ".", "1"}, {"7", ".", ".", ".", "2", ".", ".", ".", "6"}, {".", "6", ".", ".", ".", ".", "2", "8", "."}, {".", ".", ".", "4", "1", "9", ".", ".", "5"}, {".", ".", ".", ".", "8", ".", ".", "7", "9"} };
        String[][] invalidBoard = { {"8", "3", ".", ".", "7", ".", ".", ".", "."}, {"6", ".", ".", "1", "9", "5", ".", ".", "."}, {".", "9", "8", ".", ".", ".", ".", "6", "."}, {"8", ".", ".", ".", "6", ".", ".", ".", "3"}, {"4", ".", ".", "8", ".", "3", ".", ".", "1"}, {"7", ".", ".", ".", "2", ".", ".", ".", "6"}, {".", "6", ".", ".", ".", ".", "2", "8", "."}, {".", ".", ".", "4", "1", "9", ".", ".", "5"}, {".", ".", ".", ".", "8", ".", ".", "7", "9"} };


        private static boolean isValidSet(int [] set) {
            boolean [] seen = new boolean[10];
            for(int num: set) {
                if(num != 0) {
                    if(seen[num]) {
                        return false;
                    }
                    seen[num] = true;
                }
            }
            return true;
        }

        private static boolean isValidRows(int [] [] board) {
            for(int row = 0; row < 9; row ++) {
                if(!isValidSet(board[row])) {
                    return false;
                }
            }
            return true;
        }

        private static boolean isValidColumns(int [] [] board) {
            for(int col = 0; col < 9; col++) {
                int [] column = new int [9];
                for(int row = 0; row < 9; row ++) {
                    column[row] = board[row] [col];
                }
                if(!isValidSet(column)) {
                    return false;
                }
            }
            return true;
        }

        private static boolean isValidSubgrids(int [] [] board){
            for(int startRow = 0; startRow < 9; startRow+=3) {
                for(int startCol = 0; startCol < 9; startCol +=3) {
                    int [] subgrid = new int[9];
                    int index = 0;
                    for(int row = 0; row < 3; row++) {
                        for(int col = 0; col < 3; col++) {
                            subgrid[index++] = board[startRow + row][startCol+col];
                        }
                    }
                    if(!isValidSet(subgrid)) {
                        return false;
                    }
                }

            }
            return true;
        }



    }
