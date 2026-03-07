import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        //Temp Converter
        // declare variables
        Scanner scanner = new Scanner(System.in);

        double temperature;
        double convertedTemperature;
        String unit;

        // register a temp
        System.out.print("Please enter the temperature: ");
        temperature = scanner.nextDouble();

        // ask to convert to F or C

        System.out.print("Convert to Celsius or Fahrenheit? (C/F): ");
        unit = scanner.next().toUpperCase();

        // print temp

        convertedTemperature = (unit.equals("C")) ? (temperature - 32) * 5 / 9 : (temperature * 9 / 5) + 32 ;

        System.out.printf("The converted temperature is: %.1f°%s", convertedTemperature, unit);

        scanner.close();
    }
}
