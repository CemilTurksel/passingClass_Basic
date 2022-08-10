import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int mat, fizik, turkce, kimya, muzik, total = 5;
        int max= 100, min = 0;
        int cmat, cfizik, cturkce, ckimya, cmuzik;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your mat grade: ");
        mat = scanner.nextInt();
        cmat = (mat <= 100 && mat >= 0) ? mat : 0;
        if (cmat == 0){
            --total;
        }

        System.out.println("Enter your fizik grade: ");
        fizik = scanner.nextInt();
        cfizik = (fizik <= 100 && fizik >= 0) ? fizik : 0;
        if (cfizik == 0){
            --total;
        }

        System.out.println("Enter your turkce grade: ");
        turkce = scanner.nextInt();
        cturkce = (turkce <= 100 && turkce >= 0) ? turkce : 0;
        if (cturkce == 0){
            --total;
        }

        System.out.println("Enter your kimya grade: ");
        kimya = scanner.nextInt();
        ckimya = (kimya <= 100 && kimya >= 0) ? kimya : 0;
        if (ckimya == 0){
            --total;
        }

        System.out.println("Enter your muzik grade: ");
        muzik = scanner.nextInt();
        cmuzik = (muzik <= 100 && muzik >= 0) ? muzik : 0;
        if (cmuzik == 0){
            --total;
        }

        double average = (cmat + cfizik + cturkce + ckimya +cmuzik) / total;
        if (average <=55){
            System.out.println("You could not pass the class.");
            System.out.println("Your average is: " + average);
        }
        else {
            System.out.println("You passed the class.");
            System.out.println("Your average is: " + average);
        }

    }

}
