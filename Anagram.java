import java.util.Arrays;

class Angram {
    
    //static method created to return the anagram function
    static boolean anagramClass(String s1, String s2){
        //converted the string to char[] Array
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        //Sorting char array in to char array order
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        //return the equals method to confess anagram b/t 2 strings
        return Arrays.equals(s1Array, s2Array);
    } 
    
    //main class with string arguments
    public static void main(String[] args) {
        //declaration the strings
        String s1 = "Eliyaz";
        String s2 = "Afreen";
        //print the return method from static method
        System.out.println(anagramClass(s1, s2));
    }
}
