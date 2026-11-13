package id.ac.polinema.quiz2;

public class ExpressLaundry extends LaundryOrder implements Deliverable {
    public ExpressLaundry (String orderId, Customer customer, double weightKg){
        super(orderId, customer, weightKg);
    }

    public double calculatePrice(){
        return getWeightKg() * 9000;
    }

    public double deliveryFee(){
        return 5000;
    }
}
