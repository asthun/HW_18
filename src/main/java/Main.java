public class Main {


    public static void main(String[] args) {
        System.out.println(checkIfTicketLucky(1, 2, 4, 4, 1, 1));
    }

    public static String checkIfTicketLucky(int a, int b, int c, int d, int e, int f) {
        return a + b + c == d + e + f ? ("lucky") : ("unlucky");
    }

    public static int countTicketNumbers (int a, int b, int c, int d, int e, int f) {
        return a + b + c + d + e + f ;
    }

    public static int countTicketLength (int a, int b, int c, int d, int e, int f) {
        String str = ""+ a + b + c + d + e + f ;
        return str.length();
    }
}