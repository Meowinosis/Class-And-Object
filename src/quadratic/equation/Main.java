package quadratic.equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        String nums = input.nextLine();
        String[] arr = nums.split(" ");
        QuadraticEquation equation = new QuadraticEquation();
        try{
            equation.setA(Double.parseDouble(arr[0]));
            equation.setB(Double.parseDouble(arr[1]));
            equation.setC(Double.parseDouble(arr[2]));
        if (equation.getDiscriminant() > 0) {
            System.out.printf("The equation has two roots %f and %f",equation.getRoot1(),equation.getRoot2());
        } else if (equation.getDiscriminant() ==0) {
            System.out.printf("The equation has one roots %f", -equation.getB()/(2*equation.getA()));
        }else {
            System.out.println("The equation has no real roots");
        }
        }catch (Exception e){
            System.out.println("Invalid input");
        }
    }
}
