package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine();

        int maxCounter = Integer.MIN_VALUE;
        int i;
        for(i=0; i<m; i++){
            deque.addFirst(in.nextInt());
        }

        HashSet<Integer> set;

        set = new HashSet<>();
        set.addAll(deque);

        if(set.size() > maxCounter){
            maxCounter = set.size();
        }

        int removed;
        int inserted;
        for (i = m; i < n; i++) {
            inserted = in.nextInt();
            deque.addFirst(inserted);
            set.add(inserted);

            removed = deque.removeLast();

            if(!deque.contains(removed)){
                set.remove(removed);
            }

            if(set.size() > maxCounter){
                maxCounter = set.size();
            }
        }

        System.out.println(maxCounter);
    }
}
