public class frist {
    public static int waterM, ElectM;
    public static int resultBill; 

    public static int currentWaterMeter, lastWaterMeter;
    public static int CurrentElectMeter, lastElectMeter;

    public static int calculateWaterBill() { //1
        if (currentWaterMeter >= lastWaterMeter) {
            waterM = (currentWaterMeter - lastWaterMeter) * 5;
        }
        return waterM;
    }

    public static int calculateElectBill(){ //2
        if (CurrentElectMeter >= lastElectMeter) {
            ElectM = (CurrentElectMeter - lastElectMeter) * 6;
        }
        return ElectM;
    }

    public static int calculateResultBill(String roomType){ //3
        if (roomType.equals("Sigle Room")) {
            resultBill = 1500 + calculateWaterBill() + calculateElectBill();
        } else if (roomType.equals("Double Room")){ //4
            resultBill = 2000 + calculateWaterBill() + calculateElectBill();
        }
        return resultBill;
    }

    public static void main(String[] args) {
        CurrentElectMeter = 30;
        lastElectMeter = 20;

        currentWaterMeter = 100;
        lastWaterMeter = 50;

        System.out.println("Your bill is: " + calculateResultBill("Sigle Room")); //6
    }
    
}