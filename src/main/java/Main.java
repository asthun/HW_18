public class Main {
        public static void main (String[]args){
        checkIfTicketLucky();
    }
        public static void checkIfTicketLucky() {

        int[] ticket = new int[6];
        int upperBound = 9;
        // upperBound 9 will also be included
        int range = upperBound + 1;
        System.out.println("Numbers of the ticket: ");
        //fill array
        for (int i = 0; i < 6; i++) {
            int random = (int) (Math.random() * range);
            ticket[i] = random;
            System.out.print(ticket[i] + " ");
        }
        if ((ticket[0] + ticket[1] + ticket[2]) == (ticket[3] + ticket[4] + ticket[5])) {
            System.out.println("\nLUCKY TICKET!!!");
        } else {
            System.out.println("\nYou shouldn't eat the ticket before inspection.");
        }
    }
}
