import java.util.Scanner;

class PrintLongValue {
    public static void main(String[] args) {
        // Initialize scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to input temperature
        System.out.println("Enter current temperature (in degrees Celsius):");
        double temperature = scanner.nextDouble();

        // Adjust AC cooling level based on temperature
        if (temperature < 25) {
            System.out.println("Temperature is below optimal range: " + temperature + " degrees Celsius. Increasing cooling level.");
            // Code to increase cooling level
        } else if (temperature >= 25 && temperature <= 28) {
            System.out.println("Temperature is within optimal range: " + temperature + " degrees Celsius. Maintaining current cooling level.");
            // Code to maintain current cooling level
        } else {
            System.out.println("Temperature is above optimal range: " + temperature + " degrees Celsius. Decreasing cooling level.");
            // Code to decrease cooling level
        }
    }
}
/* OUTPUT:
compile time: Success
Run time: Enter current temperature (in degrees Celsius):
44.44
Temperature is above optimal range: 44.44 degrees Celsius. Decreasing cooling level.

*/
