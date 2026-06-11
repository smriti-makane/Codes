import java.util.Arrays; 
class Anagram{
    public boolean IsAnagarm(String s , String t){

        if(s.length() != t.length()){
            return false; 
        }
        char [] arr1 = s.toCharArray(); 
        char[] arr2 = t.toCharArray(); 
        Arrays.sort(arr1); 
        Arrays.sort(arr2); 
        return Arrays.equals(arr1, arr2);
    }
    public static void main (String[]args){
        String s= "anagram"; 
        String t = "nagara,"; 
        boolean result= new Anagram().IsAnagarm(s, t); 
        System.out.println(result);
    }

}