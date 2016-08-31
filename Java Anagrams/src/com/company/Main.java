package com.company;

import java.util.*;

public class Main {
    static boolean isAnagram(String a, String b) {

        // Complete the function by writing your code here.
        a=a.toLowerCase();
        b=b.toLowerCase();

        if(a.length() != b.length()){
            return false;
        }

        List<Character> countLetters = new ArrayList<>();
        int countALetter, countBLetter;
        Character toVerify;
        for(int i=0; i<a.length(); i++){
            toVerify = a.charAt(i);
            if(countLetters.contains(toVerify)){
                continue;
            }

            countALetter=0;
            for(int j=0; j<a.length(); j++){
                if(a.charAt(j) == toVerify){
                    countALetter++;
                }
            }

            countBLetter=0;
            for(int k=0; k<a.length(); k++){
                if(b.charAt(k) == toVerify){
                    countBLetter++;
                }
            }

            if(countALetter != countBLetter){
                return false;
            } else{
                countLetters.add(toVerify);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
