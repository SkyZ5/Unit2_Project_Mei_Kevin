import java.util.Scanner;

public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //FORMAT
        System.out.println("--------------------------------------");
        System.out.println("       Coordinate format: (x,y) ");
        System.out.println("              NO SPACES");
        System.out.println("--------------------------------------");

        //FIRST COORDINATE INPUT
        System.out.print("Enter your first coordinate: ");
        String coordinate1 = s.nextLine();
        int indexOfOpen = coordinate1.indexOf("(");
        int indexOfComma = coordinate1.indexOf(",");
        int indexOfClose = coordinate1.indexOf(")");
        int x1 = Integer.parseInt(coordinate1.substring(indexOfOpen + 1, indexOfComma));
        int y1 = Integer.parseInt(coordinate1.substring(indexOfComma + 1, indexOfClose));

        //SECOND COORDINATE INPUT
        System.out.print("Enter your second coordinate: ");
        String coordinate2 = s.nextLine();
        int indexOfOpen2 = coordinate2.indexOf("(");
        int indexOfComma2 = coordinate2.indexOf(",");
        int indexOfClose2 = coordinate2.indexOf(")");
        int x2 = Integer.parseInt(coordinate2.substring(indexOfOpen2 + 1, indexOfComma2));
        int y2 = Integer.parseInt(coordinate2.substring(indexOfComma2 + 1, indexOfClose2));

        //CREATES LINEAR EQUATION OBJECT
        LinearEquation linearEquation = new LinearEquation(x1,x2,y1,y2);
        System.out.println(linearEquation);

        //THIRD X VALUE
        System.out.print("Enter a third x-value: ");
        double x = Double.parseDouble(s.nextLine());
        System.out.println(linearEquation.returnCoordinate(x));

    }
}