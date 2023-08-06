package PERMUTATION;
import java.util.*;
public class StrPERMUTATION {
    public static void main(String[]a) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        Set<String> uniquePermutations = new HashSet<>();
        permutation(s.toCharArray(), 0, uniquePermutations);
        System.out.println("Unique Permutations:");
        for (String permutation : uniquePermutations)
            System.out.println(permutation);
    }
    static void permutation(char[] ar, int fi, Set<String> uniquePermutations){
        if(fi ==ar.length-1){
            // Convert the char array to a string and add it to the HashSet
            uniquePermutations.add(new String(ar));
            return;
        }
        for(int i =fi;i<ar.length;i++){
            swap(ar,i,fi);
            permutation(ar,fi+1, uniquePermutations);
            swap(ar,i,fi);
        }
    }
    static void swap(char[] ar, int i , int fi){
        char temp= ar[i];
        ar[i] = ar[fi];
        ar[fi] = temp;
    }
}