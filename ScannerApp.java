import java.io.*;


public class ScannerApp {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner();
        scanner.connectPowerCordConnector();
        scanner.connectUSB();
        scanner.turnOnColoredScan();
        scanner.turnOnStartButton();
        scanner.putSmthOnTable();
        scanner.scanning();
        scanner.disconnectPowerCordConnector();
        scanner.dispose();
    }
}
