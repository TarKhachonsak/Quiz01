import java.util.Scanner;
public class index {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Current Meter: ");
            int currentMeter = scanner.nextInt(); //1

            System.out.print("Enter Last Meter: ");
            int lastMeter = scanner.nextInt(); //2

            if (currentMeter < lastMeter) { //3
                System.out.println("มิเตอร์ปัจจุบันจะต้องมากกว่าหรือเท่ากับมิเตอร์ล่าสุด");
                System.exit(1);
            }

            int units = currentMeter - lastMeter; //4
            int waterBill = units * 5; //5
            int electBill = units * 6; //6

            System.out.println("\nSelect Room Type:");
            System.out.println("1. Single Bed (+1,500)");
            System.out.println("2. Double Bed (+2,000)");
            System.out.print("Enter your choice: "); 
            int roomChoice = scanner.nextInt(); //7

            if (roomChoice < 1 || roomChoice > 3) { //8
                System.out.println("Invalid choice. Please select 1 or 2");
                System.exit(1);
            }

            int totalBill = waterBill + electBill; //9
            if (roomChoice == 1) { //10
                totalBill += 1500;
            } else if (roomChoice == 2) { //11
                totalBill += 2000;
            }

            // แสดงผลใบเรียกเก็บเงิน
            System.out.println("\n----- Bill Summary -----");
            System.out.println("Water Bill: " + waterBill + " บาท");
            System.out.println("Electric Bill: " + electBill + " บาท");
            if (roomChoice == 1) { //12
                System.out.println("Room Type: Single Bed (+1,500 บาท)");
            } else if (roomChoice == 2) { //13
                System.out.println("Room Type: Double Bed (+2,000 บาท)");
            }
            System.out.println("Total Bill: " + totalBill + " บาท"); //14

        } catch (Exception e) {
            System.out.println("Error: กรุณาป้อนตัวเลขที่ถูกต้อง");
        } finally {
            scanner.close();
        }
    }
}
