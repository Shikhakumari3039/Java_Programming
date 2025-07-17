public class simple_interest {
        public static void main(String[] args) {
            double principal = 1000; // Principal amount
            double rate = 5;         // Rate of interest
            double time = 2;         // Time in years
    
            double simpleInterest = (principal * rate * time) / 100;
    
            System.out.println("The simple interest is: " + simpleInterest);
        }
}
