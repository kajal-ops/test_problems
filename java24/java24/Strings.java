package java24;
public class Strings {

    @Override
    public String toString() {
        return "Strings []";
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0, 'p');
        System.out.println(sb);

    
    }
}