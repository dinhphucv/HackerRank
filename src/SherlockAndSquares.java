public class SherlockAndSquares {
    public static void main(String[] args) {
        System.out.println(squares(3, 9));
    }

    public static int squares(int a, int b) {
        return ((int) Math.sqrt(b) - (int) Math.ceil(Math.sqrt(a))) + 1;
    }
}
