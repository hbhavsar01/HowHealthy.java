import java.util.Scanner;

public class HowHealthy {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("What is your name?");
        String userName = myObj.nextLine();  // Read user input
        System.out.println("Enter gender (M/m or F/f): ");
        char gender = Character.toUpperCase(myObj.nextLine().charAt(0));

        switch (gender) {
            case 'M':
                System.out.println(userName + "'s " + "Male.");
                break;
            case 'F':
                System.out.println(userName + "'s " + "Female.");
                break;
            default:
                System.out.println("Invalid Gender");
        }
        System.out.println("what is your weight: ");
        double weight = myObj.nextDouble();

        System.out.println("what is your height inches: ");
        double height = myObj.nextDouble();

        System.out.println("what is your age: ");
        int age = myObj.nextInt();

        System.out.println("Using these categories:");
        System.out.println("1 - Sedentary(little or no exercise , desk job)");
        System.out.println("2 - light exercise/sports 1-3 days/wk");
        System.out.println("3 - Moderately active(moderate exercise/sports 3-5 days/wk)");
        System.out.println("4 - Very active(hard exercise/sport 6-7 days/wk)");
        System.out.println("5 - Extra active(hard daily exercise/sports & physical job)");

        System.out.println("how active are you?: ");
        int activityLevel = myObj.nextInt();

        System.out.println("Person name is: " + userName);
        System.out.println(userName + "'s " + "Male.");
        System.out.println(userName + "'s  weight (pounds) :" + weight);
        System.out.println(userName + "'s  height (cm) : " + height);
        System.out.println(userName + "'s age (years) :" + age);

        double BMR = 0.0;
        if (gender == 'F') {
            BMR = 655 + (9.6 * (weight / 2.2)) + (1.8 * height * 2.54) - (4.7 * age);
            System.out.printf("Your Female BMR is: %.2f ", BMR);
        } else {
            BMR = 66 + (13.7 * (weight / 2.2)) + (5 * height * 2.54) - (6.8 * age);
            System.out.printf("Your Male BMR is: %.2f ", BMR);
        }

        getActivityMultiplier(activityLevel, BMR);
        double BMI = (weight) / ((height* 2.54)*( height * 2.54) * 703);
        System.out.println("Your BMI is: " + BMI);
    }

    private static void getActivityMultiplier(int activityLevel, double BMR) {
        switch (activityLevel) {
            case 1:
                System.out.printf("Your TDEE is: %.2f", (BMR * 1.2));
                System.out.println("your activity lever is Sedentary");
                break;
            case 2:
                System.out.printf("Your TDEE is: %.2f" , (BMR * 1.375));
                System.out.println("your activity lever is Lightly active");
                break;
            case 3:
                System.out.printf("Your TDEE is: %.2f",( BMR * 1.55));
                System.out.println("your activity lever is Moderately active");
                break;
            case 4:
                System.out.printf("Your TDEE is: %.2f",(BMR * 1.725));
                System.out.println("your activity lever is Very active");
                break;
            case 5:
                System.out.printf("Your TDEE is:%.2f",(BMR * 1.9));
                System.out.println("your activity lever is extra active");
                break;
            default:
                System.out.println("please choose correct activity level");
        }
    }
}






