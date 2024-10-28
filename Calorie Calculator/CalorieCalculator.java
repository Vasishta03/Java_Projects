import java.util.Scanner;

public class CalorieCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User Info
        System.out.println("Calorie Calculator");
        System.out.print("Gender(M/F): ");
        String gender = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.print("Weight(kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Height(cm): ");
        double height = scanner.nextDouble();
        System.out.print("Enter your activity level (sedentary/moderate/active): ");
        String activityLevel = scanner.next();

        // BMR
        double bmr;
        if (gender.equalsIgnoreCase("M")) {
            bmr = Math.round(88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age));
        } else if (gender.equalsIgnoreCase("F")) {
            bmr = Math.round(447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age));
        } else {
            System.out.println("Invalid gender input.");
            return;
        }

        // Daily Calorie Needs
        double calorieNeeds;
        switch (activityLevel.toLowerCase()) {
            case "sedentary" -> calorieNeeds = Math.round(bmr * 1.2);
            case "moderate" -> calorieNeeds = Math.round(bmr * 1.55);
            case "active" -> calorieNeeds = Math.round(bmr * 1.725);
            default -> {
                System.out.println("Invalid activity level input.");
                return;
            }
        }

        // Results
        System.out.println("BMR: " + (int) bmr + " calories per day.");
        System.out.println("Your estimated daily calorie needs are: " + (int) calorieNeeds + " calories per day.");
        System.out.println("BMR is the minimum number of calories your body needs to perform essential functions like breathing and digestion while at rest. It's a measure of the energy your body expends per unit of time.");
      

        scanner.close();
    }
}
