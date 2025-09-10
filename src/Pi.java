import java.util.Scanner;
public class Pi {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many darts do you have?");
        int darts = scan.nextInt();
        int areaSq = 1 * 1;
        double areaCrcl = 0.5 * 0.5 * 3.141592353;
        double probablity = areaCrcl/areaSq;
        System.out.println(probablity);
    }

}
