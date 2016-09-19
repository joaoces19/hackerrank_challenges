package com.company;

import java.util.*;

public class Main {

    private static final String AND = "AND";
    private static final String OR = "OR";
    private static final String XOR = "XOR";
    private static final String FLIP = "FLIP";
    private static final String SET = "SET";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int bSize = scan.nextInt();
        int mSize = scan.nextInt();
        scan.nextLine();

        BitSet b1 = new BitSet(bSize);
        BitSet b2 = new BitSet(bSize);

        BitSet[] bArray = new BitSet[2];
        bArray[0] = b1;
        bArray[1] = b2;

        String op;
        int oper1, oper2;
        for(int i=0; i<mSize; i++){
            op = scan.next();
            oper1 = scan.nextInt();
            oper2 = scan.nextInt();
            switch (op){
                case AND: bArray[oper1-1].and(bArray[oper2-1]); break;
                case OR: bArray[oper1-1].or(bArray[oper2-1]); break;
                case XOR: bArray[oper1-1].xor(bArray[oper2-1]); break;
                case FLIP: bArray[oper1-1].flip(oper2); break;
                case SET: bArray[oper1-1].set(oper2); break;
            }

            System.out.println(bArray[0].cardinality() + " " + bArray[1].cardinality());
        }
    }
}
