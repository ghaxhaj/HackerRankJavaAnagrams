import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        
        String[] aArray = new String[a.length()];
        String[] bArray = new String[b.length()];
        boolean anagram = true;
        
        for(int i = 0; i < aArray.length; i++){
            aArray[i] = Character.toString(a.charAt(i)).toLowerCase();
        }
        
        for(int j = 0; j < bArray.length; j++){
            bArray[j] = Character.toString(b.charAt(j)).toLowerCase();
        }
        
        String[] sortedAArray = sort(aArray);
        String[] sortedBArray = sort(bArray);
        
        if(aArray.length == bArray.length){
            for(int k = 0; k < aArray.length; k++){
                if(!sortedAArray[k].equals(sortedBArray[k])){
                    anagram = false;
                }
            }
        }else{
            anagram = false;
        }
        
     return anagram;
    }
    
    
    public static String[] sort(String[] arr){
        
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i].compareTo(arr[j]) > 0){
                    String jar = arr[i];
                    arr[i] = arr[j];
                    arr[j] = jar;
                }
            }
        }
        
        return arr;
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



