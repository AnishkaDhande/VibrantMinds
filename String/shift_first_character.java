public class shift_first_character {
    public static void main(String[] args) {
        String s1="India";
        StringBuilder s2=new StringBuilder(s1);
        s2.append(s1.charAt(0));
        s2.deleteCharAt(0);
        System.out.println(s2);

    }
}
