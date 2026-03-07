import java.sql.SQLOutput;
import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        // circumference = 2 * PI * r
        // area = PI * r²
        // volume = 3/4 * pi * r³

        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;


        System.out.println("Digite o valor do raio: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        //double circumferenceRounded =  Math.round(circumference*100.0)/100.0 ; arredondando para 2 casas decimais
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("O valor da circunferência é: %.1fcm\n", circumference);
        System.out.printf("O valor da área é : %.1fcm²\n", area);
        System.out.printf("Caso o objeto seja uma esfera, o volume é : %.1fcm³\n", volume);



        scanner.close();

    }

}
