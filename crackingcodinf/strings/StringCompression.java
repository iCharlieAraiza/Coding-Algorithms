import java.util.*;

class Main {
    public static void main(String args[]) {  //static method  
        System.out.println(compress(new char[]{'a','a','a','b','c','b','c'}));
        System.out.println(compress(new char[]{'a','a','a','b','c','b','c','c'}));
        System.out.println(compress(new char[]{'a','b','c','a','c','b','d','c'}));
        System.out.println(compress(new char[]{'a','b','a','a','a','a','a','a'}));
        System.out.println(compress(new char[]{'a','a','b','c','c','c','c','c','a','a','a'}));
    }
    
    public static ArrayList<Character> compress(char[] chars) {
        ArrayList<Character> compressed = new ArrayList<>();
        
        int left = 0;
        int right = 0;
        int count = 0;
        
        while (right < chars.length) {
            if(chars[left] == chars[right]) {
                count++;
                right++;
            } else if (chars[left] != chars[right]) {
                left = right;
                if (count >= 1) {
                    compressed.add((char)(count+'0'));
                }
                compressed.add(chars[left-1]);
                count = 0;
            } 
            if (right >= chars.length) {
                if (count >= 1) {
                    compressed.add((char)(count+'0'));
                }
                compressed.add(chars[left]);
                count = 0;
            }
        }
        return compressed;
    }
}
