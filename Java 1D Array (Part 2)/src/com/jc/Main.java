
package com.jc;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static int n, m;
    private static String[] gameBoard;

    private static final int GAME_WON = -1;
    private static final int GAME_LOST = -2;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        int i;
        int position;

        for (i = 0; i < t; i++) {
            n = scan.nextInt();
            m = scan.nextInt();
            scan.nextLine();

            position = 0;

            //gameBoard = removeMultipleZeros(scan.nextLine()).split(" ");
            gameBoard = scan.nextLine().split(" ");

            do {
                position = validateNextBoardPosition(position);
            } while(position != GAME_LOST && position != GAME_WON);

            System.out.println(position == GAME_WON ? i + "YES" : i + "NO");

            System.gc();
        }
    }

    private static int validateNextBoardPosition(int curPos) {
        if(curPos + 1 > gameBoard.length || curPos + m > gameBoard.length){
            return GAME_WON;
        }

        if (gameBoard[curPos + 1].equals("0")) {
            return curPos + 1;
        }

        if(gameBoard[curPos+m].equals("0")){
            return curPos+m;
        }

        return GAME_LOST;
    }

    private static String removeMultipleZeros(String gameBoard){
        Pattern p = Pattern.compile("[0 ]+");

        Matcher m = p.matcher(gameBoard);

        while(m.find()){
            gameBoard.replaceAll(m.group(), " 0 ");
        }

        return gameBoard;
    }
}
