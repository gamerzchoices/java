class Medical extends Thread {
    public void run() {
        try {
            System.out.println("Medical started");
            Thread.sleep(3000);
            System.out.println("Medical completed");

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}

class DriveTest extends Thread {
    public void run() {
        try {
            System.out.println("Drive test started");
            Thread.sleep(5000);
            System.out.println("Drive test completed");

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}

class OfficerSign extends Thread {
    public void run() {
        try {
            System.out.println("Officer reviewed document");
            Thread.sleep(2000);
            System.out.println("Office signed the license");

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}

public class LicenseDemo {

    public static void main(String[] args) throws InterruptedException {

        Medical medical = new Medical();
        medical.start();
        medical.join(); // Main method waits for medical to complete task

        DriveTest driveTest = new DriveTest();
        driveTest.start();

        driveTest.join(4000); // If waiting time exceed than that of mentioned that it is excuted
                              // automatically

        OfficerSign officerSign = new OfficerSign();
        officerSign.start();
    }

}
