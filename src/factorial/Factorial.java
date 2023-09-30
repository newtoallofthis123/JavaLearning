package factorial;

public class Factorial{

    double num;

    public Factorial(double num) {
        this.num = num;
    }

    private double calculateFactorial(double num){
        if(num ==0 || num == 1){
            return num;
        }
        return num * calculateFactorial(num-1);
    }

    public double getFactorial(){
        return calculateFactorial(this.num);
    }
}