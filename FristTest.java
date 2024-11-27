
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class FristTest {

    @Before
    public void setUp() {
        // Reset ค่าเริ่มต้นของตัวแปร static ก่อนการทดสอบแต่ละครั้ง
        frist.currentWaterMeter = 0;
        frist.lastWaterMeter = 0;
    }

    
    @Test
    public void testCalculateResultBill() {
        frist.currentWaterMeter = 100;
        frist.lastWaterMeter = 50;
        frist.CurrentElectMeter = 30;
        frist.lastElectMeter = 20;

        int actual = frist.calculateResultBill("Double Room");
        assertEquals(2310, actual); 
    }

    @Test
    public void testCalculateResultBill2() {
        frist.currentWaterMeter = 100;
        frist.lastWaterMeter = 50;
        frist.CurrentElectMeter = 30;
        frist.lastElectMeter = 20;

        int actual = frist.calculateResultBill("Sigle Room");
        assertEquals(1810, actual); 
    }

    @Test
    public void testCalculateWaterBill() {
        // กำหนดค่าเริ่มต้น
        frist.currentWaterMeter = 100;
        frist.lastWaterMeter = 50;

        // คำนวณค่าน้ำและตรวจสอบผลลัพธ์
        int actual = frist.calculateWaterBill();
        assertEquals(250, actual); // (100 - 50) * 5 = 250
    }

    @Test
    public void testCalculateElectBill() {
        frist.CurrentElectMeter = 50;
        frist.lastElectMeter = 20;

        int actual = frist.calculateElectBill();
        assertEquals(100, actual); // (50 - 20) * 10 = 100
    }
}
