public class Shift_Last_char_to_first {
    public static void main(String[] args) {
        String s1="India";
        //         aIndi
        StringBuilder s2= new StringBuilder(s1);
        s2.insert(0,s1.charAt(s1.length()-1));
        //System.out.println(s2);
        s2.deleteCharAt(s2.length()-1);
        System.out.println(s2);
    }
}
