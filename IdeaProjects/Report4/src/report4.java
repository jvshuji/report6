public class report4 {
    public static void main(String[] args) {
        try {
            String str;
            str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerExceptionが発生しました");
            System.out.println(e.getMessage()) ;
        }
    }
}
