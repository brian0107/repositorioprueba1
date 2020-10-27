
import java.text.DecimalFormat;
import java.util.*;

public class main {
    Scanner sc = new Scanner(System.in);
DecimalFormat dc = new DecimalFormat("0.00");
    public main() {
        double n1, n2;
        int pre,selection;
        do{
        System.out.println("Dame un numero cabron");
        n1 = sc.nextDouble();
        System.out.println("Dame un segundo numero cabron");
        n2 = sc.nextDouble();



            System.out.println("Selecciona una opcion a realizar: \n 1=(+) \n 2=(-) \n 3(*) \n 4=(/)");
        selection = sc.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("La suma es: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("La resta es: " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("La multiplication es: " + (n1 * n2));
                    break;
                case 4:
                    if (n2 == 0) {
                        System.out.println("No se puede dividir entre 0");
                    } else {
                        System.out.print("La divison es: " + (n1 / n2));

                    }
                    break;
                default:
                    System.out.println("A muchacho pendejo esa opcion no esta wey");
                    break;
            }
            System.out.println("\nDesea seguir haciendo operaciones? 1/si 2/No");
            pre = sc.nextInt();

        }while(pre==1);


}
    public static void main(String[] args) {
        new main();
    }
}