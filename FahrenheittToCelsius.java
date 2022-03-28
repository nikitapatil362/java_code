import java.util.Scanner;


public class FahrenheittToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter temperature in Fahrenhiet");
		Scanner sc = new Scanner(System.in);
		float Fahrenheit = sc.nextInt();
		float Celsius =((Fahrenheit-32)*5)/9;
		System.out.println("Temperature in celsius is: "+ Celsius);
			}

		}
