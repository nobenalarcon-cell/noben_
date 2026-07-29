abstract class Smartdevice {

    int value;

    Smartdevice(int value) {
        this.value = value;
    }

    abstract void operate();
}

class Smartfan extends Smartdevice {
    Smartfan(int temp) {
        super(temp);
    }

    void operate() {
        System.out.println("Temprature: " + value + "c");
        if (value >= 10) {
            System.out.println("HIGH");
        } else if (value >= 5) {
            System.out.println("MED");
        } else {
            System.out.println("LOW");
        }
    }
}

class Smartlight extends Smartdevice {
    Smartlight(int hour) {
        super(hour);
    }

    void operate() {
        System.out.println("HOUR: " + value + "HOURS");
        if (value >= 6 && value <= 17) {
            System.out.println("HIGH BRIGHTNESS");
        } else {
            System.out.println("LOW BRIGHTNESS");
        }
    }

    public class last {
        public static void main(String[] args) {
            System.out.println("=====SMARTFAN TEST===");
            for (int temp = 15; temp <= 35; temp += 10) {
                Smartdevice sw1 = new Smartfan(temp);
                sw1.operate();
                System.out.println("");

            }
            System.out.println("SMART LIGHT TESTER");
            int[] hours = { 5, 9, 18, 22 };
            for (int hour : hours) {
                Smartdevice f1 = new Smartlight(hour);
                f1.operate();
                System.out.println("");

            }
        }
    }
}
