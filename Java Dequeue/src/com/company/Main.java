package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine();
        HashMap<Integer, Integer> counter;
        Iterator<Integer> it;
        int next, maxOcur = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if(i>=m-1){
                counter = new HashMap<>();

                it = deque.iterator();
                while(it.hasNext()){
                    next = it.next();
                    if(counter.get(next) == null){
                        counter.put(next, 1);
                    } else{
                        counter.put(next, counter.get(next) + 1);
                    }

                    if(counter.get(next) > maxOcur){
                        maxOcur = counter.get(next);
                    }
                }

                deque.removeLast();
                deque.addFirst(num);
            } else{
                deque.add(num);
            }
        }

        System.out.println(maxOcur);
    }
}
