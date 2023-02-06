import java.util.Scanner;/**
 * metricConverter
 */
public class metricConverter {
public static void main(String[] args) {
    System.out.println("Welcome to Metric Converter!" + "\nPlease input your query. \nFor example: km to m or in to cm" + "\nNote: use mi for miles and ft for feet!");
    
    Scanner scan = new Scanner(System.in);

    String userInput = scan.nextLine();
    // Create a loop that allows you to convert units multiple times
    for(int i = 0; i < 100; i++){
        //convert km to m
        if(userInput.equalsIgnoreCase("km to m")){
            System.out.println("Please enter a measurement in kilometers");
            double number = scan.nextDouble();
            double convert = number * 1000;
            System.out.printf("%.2fkm is %.2fm\n", number, convert);  
                       
            }
        //Convert m to km  
        else if (userInput.equalsIgnoreCase("m to km")) {
            System.out.println("Please enter a measurement in meters");
            double number = scan.nextDouble();
            double convert = number / 1000;
            System.out.printf("%.2fm is %.2fkm\n", number, convert);  
        }
        //Convert in to cm  
        else if(userInput.equalsIgnoreCase("in to cm")){
            System.out.println("Please enter a measurement in inches");
            double number = scan.nextDouble();
            double convert = number  * 2.54;
            System.out.printf("%.2fin is %.2fcm\n", number, convert);  
         }
        //Convert cm to in  
        else if(userInput.equalsIgnoreCase("cm to in")){
            System.out.println("Please enter a measurement in centimeters");
            double number = scan.nextDouble();
            double convert = number / 2.54;
            System.out.printf("%.2fcm is %.2fin\n", number, convert);  
        }   
        //Convert mi to ft   
        else if(userInput.equalsIgnoreCase("mi to ft")){
            System.out.println("Please enter a measurement in miles");
            double number = scan.nextDouble();
            double convert = number * 5280;
            System.out.printf("%.2fmi is %.2fft\n", number, convert);  
        }   
        //Convert ft to mi  
        else if(userInput.equalsIgnoreCase("ft to mi")){
            System.out.println("Please enter a measurement in feet");
            double number = scan.nextDouble();
            double convert = number / 5280;
            System.out.printf("%.2fft is %.2fmi\n", number, convert);  
        }   
        //Convert g to kg  
        else if(userInput.equalsIgnoreCase("g to kg")){
            System.out.println("Please enter a measurement in grams");
            double number = scan.nextDouble();
            double convert = number * .001;
            System.out.printf("%.2fg is %.2fkg\n", number, convert);  
        }
        //Convert kg to g        
        else if(userInput.equalsIgnoreCase("kg to g")){
            System.out.println("Please enter a measurement in kilograms");
            double number = scan.nextDouble();
            double convert = number / .001;
            System.out.printf("%.2fkg is %.2fg\n", number, convert);  
        }
        //Convert oz to lbs
        else if(userInput.equalsIgnoreCase("oz to lbs")){
            System.out.println("Please enter a measurement in ounces");
            double number = scan.nextDouble();
            double convert = number * .0625;
            System.out.printf("%.2foz is %.2flbs\n", number, convert);  
        }
        //Convert lbs to oz
        else if(userInput.equalsIgnoreCase("lbs to oz")){
            System.out.println("Please enter a measurement in pounds");
            double number = scan.nextDouble();
            double convert = number / .0625;
            System.out.printf("%.2flbs is %.2foz\n", number, convert);  
        }
        //Convert USD to Euros
        else if(userInput.equalsIgnoreCase("USD to EUR")){
                System.out.println("Please enter a measurement in US Dollars");
                double number = scan.nextDouble();
                double convert = number * .93;
                System.out.printf("%.2f USD is %.2f Euro\n", number, convert);  
            }
        // Convert Euros to USD
        else if(userInput.equalsIgnoreCase("EUR to USD")){
                System.out.println("Please enter a measurement in Euros");
                double number = scan.nextDouble();
                double convert = number / .93;
                System.out.printf("%.2f Euro is %.2f USD\n", number, convert);  
            }
        //Run the program again
        Scanner again = new Scanner(System.in);
            
        System.out.println("Input another query?(Y/N)");
            userInput = again.nextLine();
            if(userInput.equalsIgnoreCase("Y")){
            System.out.println("What would you like to convert?");
            userInput = again.nextLine();
            }
            else if(userInput.equalsIgnoreCase("N")){
                System.out.println("Goodbye!");
                break;
            }
        }
    }
}
