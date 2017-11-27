public class report4 {
    public static void main(String[] args) {
        try {
            String str;
            str = "３．１４";
            System.out.println(str.length());
            double value;
            value = Double.parseDouble(str);
        } catch (NullPointerException e) {
            System.out.println("NullPointerExceptionが発生しました");
            System.out.println(e.getMessage()) ;
        }
    }
}
