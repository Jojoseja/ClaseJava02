package formulasCoche;

public class Formulas {
    static final double horsepowerConstant = 9550;

    static double torque(double force, double distance){
        return force*distance;
    }

    static double horsepower(double rpm, double torque){
        return (rpm*torque)/horsepowerConstant;
    }

    public static void main(String[] args) {
        System.out.println(horsepower(6000,600));
        System.out.println(torque(9000,0.1));
    }
}
