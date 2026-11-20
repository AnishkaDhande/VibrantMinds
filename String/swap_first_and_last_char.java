public class swap_first_and_last_char {
    public static void main(String[] args) {
        String s1="India";
        StringBuilder sb= new StringBuilder(s1.substring(1,s1.length()-1));
        sb.append(s1.charAt(0));
        sb.insert(0,s1.charAt(s1.length()-1));
        System.out.println(sb);
        
        //s1.substring(1,s1.length()-1);
    }
}
