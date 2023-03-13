import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

public class Question {

    public static int similarPairs(String[] W) {
        Set<Set<Character>> S = new HashSet<>();
        int C = 0;
        for(String w : W){
            Set<Character> s = new HashSet<>();
            for(char c : w.toCharArray()){
                s.add(c);
            }
            if(S.contains(s)){
                C++;
            }else{
                S.add(s);
            }
        }
        return C;
    }

    public static String removeDuplicateLetters(String s) {
        int [] li = new int[26];
        boolean [] V = new boolean[26];
        for (int i=0;i<s.length();i++) {
            li[s.charAt(i)-'a'] = i;
        }
        Stack<Character> S = new Stack<>();
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            if(V[curr-'a'])continue;
            while(!S.empty() && curr<S.peek() && li[S.peek()-'a']>i){
                V[S.peek()-'a'] = false;
                S.pop();
            }
            S.push(curr);
            V[curr-'a'] = true;
        }
        Iterator value = S.iterator();
        StringBuilder res = new StringBuilder("");
        while (value.hasNext()) {
            res.append(value.next());
        }
        return res.toString();
    }

    public static void main(String[] args){
        System.out.println(emailRegex("@email.com"));
        System.out.println(emailRegex("rahul.yadav@email.com"));
        System.out.println(emailRegex("rahu@rahhu@email.com"));
        System.out.println(emailRegex("rahurahhu@email.c@om"));
    }

    //john.smith@email.com

    //partA@partB.partC
    public static Boolean emailRegex(String E){
        int L = E.length();
        boolean foundAt=false,foundDot=false;
        String partA = "";
        String partB = "";
        String partC = "";
        int i=0;
        while(i<L){
            if(foundAt && (E.charAt(i)=='@'))return false;
            else if(!foundAt){
                if(E.charAt(i)=='@'){
                    foundAt = true;
                }
                else partA = partA + E.charAt(i);
            }else if(!foundDot){
                if(E.charAt(i)=='.'){
                    foundDot = true;
                }
                else partB = partB + E.charAt(i);
            }else {
                partC = partC + E.charAt(i);
            }
            i++;
        }
        if(partA.length()==0 || partB.length()==0 || partC.length()==0)return false;
        int a = 0;
        while(a<partB.length()){
            if(partB.charAt(a)=='@')return false;
            a++;
        }
        int c = 0;
        while(c<partC.length()){
            if(partC.charAt(c)=='@' || partC.charAt(c)=='.')return false;
            c++;
        }
        return true;
    }



}
