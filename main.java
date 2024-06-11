import java.util.Scanner;

class BookMyshow {

    private String move_name;
    private String theatre_name;
 
    private int cost;

    void movies() {
     
        System.out.println("the movies available are");
        System.out.println(" 1.Spider man (No way home) -------- Rs.400 \n 2.kimi no na wa -- Rs.500 \n 3.Ron gone wrong ---- Rs.300 \n 4.conjuring 2 ----- Rs.400 ");
     
     
    }

}

class thea extends BookMyshow {
private int no_f_tickets;
    void th() {
        System.out.println("*******the theaters available are******* \n 1.cinepolis theater \n 2.inox theater");
        int k;
        int an;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("*******cinepolis theater*******");
            System.out.println("*******select a movie*******");
            System.out.println("movie available are \n 1.Spiderman no way home \n 2.Kimi no na wa ");
            Scanner a = new Scanner(System.in);
            int o = a.nextInt();
            if (o == 1) {
                System.out.println("Spider man no way home movie @ cinepolis theater");
                System.out.println("enter the number of tickets to be booked");
                Scanner j = new Scanner(System.in);
                int r = j.nextInt();
                int left= no_f_tickets-r;
                int amount=400*r;
                System.out.println("to continue to book for this movie press 1");
                Scanner d = new Scanner(System.in);
                int h = d.nextInt();
                System.out.println("\n\n\n");
                if (h == 1) {
                    System.out.println("******************************************************");
                    System.out.println("theater ------------------- cinepolis theater");
                    System.out.println("movie --------------------- Spiderman no way home");
                    System.out.println("cost ---------------------- Rs."+amount);
                    System.out.println("******************************************************");
                }

            }
            if (o == 2) {
                System.out.println("kimi no na wa @cinepolis theater");
                 System.out.println("enter the number of tickets to be booked");
                Scanner j = new Scanner(System.in);
                int r = j.nextInt();
                int left= no_f_tickets-r;
                int amount=500*r;
                System.out.println("to continue to book for this movie press 1");
                Scanner d = new Scanner(System.in);
                int h = d.nextInt();
                System.out.println("\n\n\n");
                if (h == 1) {
                    System.out.println("******************************************************");
                    System.out.println("theater ------------------- cinepolis theater");
                    System.out.println("movie --------------------- kimi no na wa");
                    System.out.println("cost ---------------------- Rs"+amount);
                    System.out.println("******************************************************");
                }

            }

        }
        if (n == 2) {
            System.out.println("*******inox theater*******");
            System.out.println("*******select a movie*******");
            System.out.println("movie available are \n 1.ron gone wrong \n 2.conjuring 2");
            Scanner b = new Scanner(System.in);
            int p = b.nextInt();
            Scanner a = new Scanner(System.in);
            int o = a.nextInt();
            if (o == 1) {
                System.out.println("ron gone wrong @inox theater");
                 System.out.println("enter the number of tickets to be booked");
                Scanner j = new Scanner(System.in);
                int r = j.nextInt();
                int left= no_f_tickets-r;
                int amount=600*r;
                System.out.println("to continue to book for this movie prees 1");
                Scanner d = new Scanner(System.in);
                int h = d.nextInt();
                System.out.println("\n\n\n");
                if (h == 1) {
                    System.out.println("******************************************************");
                    System.out.println("theater ------------------- inox theater");
                    System.out.println("movie --------------------- ron gone wrong");
                    System.out.println("cost ---------------------- Rs."+amount);
                    System.out.println("******************************************************");
                }

            }
            if (o == 2) {
                System.out.println("conjuring 2 @inox theater");
                 System.out.println("enter the number of tickets to be booked");
                Scanner j = new Scanner(System.in);
                int r = j.nextInt();
                int left= no_f_tickets-r;
                int amount=400*r;
                System.out.println("to continue to book for this movie press 1");
                Scanner d = new Scanner(System.in);
                int h = d.nextInt();
                System.out.println("\n\n\n");
                if (h == 1) {
                    System.out.println("******************************************************");
                    System.out.println("theater ------------------- inox theater");
                    System.out.println("movie --------------------- conjuring 2");
                    System.out.println("cost ---------------------- Rs."+amount);
                    System.out.println("******************************************************");
                }

            }
        }

    }
}

public class labfr {

    public static void main(String[] args) {
        BookMyshow ob = new BookMyshow();

        BookMyshow[] moviename = new BookMyshow[2];
        moviename[0] = ob;
        thea a = new thea();
        moviename[1] = a;

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        System.out.println("---------1.list of movies and their prices--------- \n-------2.acces and book tickets through theaters---");

        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        Scanner d = new Scanner(System.in);
        int h = d.nextInt();
        switch (h) {
            case 1: {
                ob.movies();
                break;
            }
            case 2: {
             
                a.th();
            }
        }
  }
}
