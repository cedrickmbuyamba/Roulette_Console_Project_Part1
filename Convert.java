import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Convert {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader rd;
		System.out.println("Put your temperature in kelvin:");		
		rd = new BufferedReader(new InputStreamReader(System.in));
		float kelvin = Float.parseFloat(rd.readLine());
		float celsius = kelvin - 273.15F;
		System.out.println("Your Temperature in Celsius is: "+ celsius);

	}

}
