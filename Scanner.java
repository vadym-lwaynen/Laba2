import java.io.*;



public class Scanner{
    private ScannerButton scannerButton;
    private ScannerTablet scannerTablet;
    private ScannerPort scannerPort;
    private ScannerMatrix scannerMatrix;
    private PrintWriter fout;

    /**
     * Constructor
     * @throws FileNotFoundException
     */
    public Scanner() throws FileNotFoundException
    {
        scannerButton = new ScannerButton();
        scannerTablet = new ScannerTablet();
        scannerPort = new ScannerPort();
        scannerMatrix = new ScannerMatrix();
        fout = new PrintWriter(new File("Log.txt"));
    }

    /**
     * Constructor
     * @throws FileNotFoundException
     */

    public Scanner(boolean colored) throws FileNotFoundException
    {
        scannerButton = new ScannerButton(colored);
        scannerTablet = new ScannerTablet();
        scannerPort = new ScannerPort();
        scannerMatrix = new ScannerMatrix();
        fout = new PrintWriter(new File("Log.txt"));
    }

    /**
     * Method releases used recourses
     */
    public void dispose()
    {
        fout.close();
    }

    /**
     * Method implements turning on Scanner
     */
    public void turnOnScanner(){
        if(scannerPort.get_powerCordConnector()) {
            scannerButton.set_Power(true);
            if (scannerButton.get_Power()) {
                System.out.print("The scanner is on\n");
                fout.print("The scanner is on\n");
                fout.flush();
            } else {
                System.out.print("The scanner isn't on\n");
                fout.print("The scanner isn't on\n");
                fout.flush();
            }
        }
    }

    /**
     * Method implements turning off Scanner
     */
    public void turnOffScanner(){
        if(!scannerPort.get_powerCordConnector()) {
            scannerButton.set_Power(false);
            if (!scannerButton.get_Power()) {
                System.out.print("The scanner isn't on\n");
                fout.print("The scanner isn't on\n");
                fout.flush();
            } else {
                System.out.print("The scanner is on\n");
                fout.print("The scanner is on\n");
                fout.flush();
            }
        }
    }

    /**
     * Method implements turn on colored scanning
     */
    public void turnOnColoredScan(){
        scannerButton.set_Colored(true);
        if(scannerButton.get_Colored()) {
            System.out.print("The colored scan is on\n");
            fout.print("The colored scan is on\n");
            fout.flush();
        }else{
            System.out.print("The colored scan isn't on\n");
            fout.print("The colored scan isn't on\n");
            fout.flush();
        }
    }

    /**
     * Method implements turn off colored scanning
     */
    public void turnOffColoredScan(){
        scannerButton.set_Colored(false);
        if(scannerButton.get_Colored()) {
            System.out.print("The colored scan is on\n");
            fout.print("The colored scan is on\n");
            fout.flush();
        }else{
            System.out.print("The colored scan isn't on\n");
            fout.print("The colored scan isn't on\n");
            fout.flush();
        }
    }

    /**
     * Method implements turn on Start button
     */
    public void turnOnStartButton() {
        scannerButton.set_Start(true);
        if(scannerButton.get_Start()) {
            System.out.print("The start button is pressed\n");
            fout.print("The start button is pressed\n");
            fout.flush();
        }else{
            System.out.print("The start button isn't pressed\n");
            fout.print("The start button isn't pressed\n");
            fout.flush();
        }
    }

    /**
     * Method implements turn off Start button
     */
    public void turnOffStartButton(){
        scannerButton.set_Start(false);
        if(scannerButton.get_Start()) {
            System.out.print("The start button is pressed\n");
            fout.print("The start button is pressed\n");
            fout.flush();
        }else{
            System.out.print("The start button isn't pressed\n");
            fout.print("The start button isn't pressed\n");
            fout.flush();
        }
    }

    /**
     * Method implements putting something on scanner table
     * to scan it
     */
    public void putSmthOnTable(){
        scannerTablet.set_Tablet(true);
        System.out.print("Something put on table\n");
        fout.print("Something put on table\n");
        fout.flush();
    }

    /**
     * Method implements check if something is on the table
     */
    public boolean canWeScan(){
        return scannerTablet.get_Tablet();
    }


    /**
     * Method implements connecting USB
     */
    public void connectUSB(){
        scannerPort.set_USB(true);
        if(scannerPort.get_USB()){
            System.out.print("The USB is connected\n");
            fout.print("The USB is connected\n");
            fout.flush();
        }else{
            System.out.print("The USB isn't connected\n");
            fout.print("The USB isn't connected\n");
            fout.flush();
        }
    }

    /**
     * Method implements disconnecting USB
     */
    public void disconnectUSB(){
        scannerPort.set_USB(false);
        if(scannerPort.get_USB()){
            System.out.print("The USB isn't disconnected\n");
            fout.print("The USB isn't disconnected\n");
            fout.flush();
        }else{
            System.out.print("The USB is disconnected\n");
            fout.print("The USB is disconnected\n");
            fout.flush();
        }
    }

    /**
     * Method implements connecting IEEE 1394
     */
    public void connectIEEE1394(){
        scannerPort.set_IEEE1394(true);
        if(scannerPort.get_IEEE1394()){
            System.out.print("The IEEE1394 PORT is connected\n");
            fout.print("The IEEE1394 PORT is connected\n");
            fout.flush();
        }else{
            System.out.print("The IEEE1394 PORT isn't connected\n");
            fout.print("The IEEE1394 PORT isn't connected\n");
            fout.flush();
        }
    }

    /**
     * Method implements disconnecting IEEE 1394
     */
    public void disconnectIEEE1394(){
        scannerPort.set_IEEE1394(false);
        if(scannerPort.get_IEEE1394()){
            System.out.print("The IEEE1394 PORT isn't disconnected\n");
            fout.print("TThe IEEE1394 PORT isn't disconnected\n");
            fout.flush();
        }else{
            System.out.print("The IEEE1394 PORT is disconnected\n");
            fout.print("The IEEE1394 PORT is disconnected\n");
            fout.flush();
        }
    }

    /**
     * Method implements connecting Additional Boards
     */
    public void connectAdditionalBoards(){
        scannerPort.set_connectorForAdditionalBoards(true);
        if(scannerPort.get_connectorForAdditionalBoards()){
            System.out.print("The AdditionalBoards is connected\n");
            fout.print("The AdditionalBoards is connected\n");
            fout.flush();
        }else{
            System.out.print("The AdditionalBoards isn't connected\n");
            fout.print("The AdditionalBoards isn't connected\n");
            fout.flush();
        }
    }

    /**
     * Method implements disconnecting Additional Boards
     */
    public void disconnectAdditionalBoards(){
        scannerPort.set_connectorForAdditionalBoards(false);
        if(scannerPort.get_connectorForAdditionalBoards()){
            System.out.print("AdditionalBoards isn't disconnected\n");
            fout.print("AdditionalBoards isn't disconnected\n");
            fout.flush();
        }else{
            System.out.print("AdditionalBoards is disconnected\n");
            fout.print("AdditionalBoards is disconnected\n");
            fout.flush();
        }
    }


    /**
     * Method implements connecting Power Cord
     */
    public void connectPowerCordConnector() {
        scannerPort.set_powerCordConnector(true);
        if(scannerPort.get_powerCordConnector()){
            System.out.print("The Power Cord is connected\n");
            fout.print("The Power Cord is connected\n");
            fout.flush();
        }else{
            System.out.print("The Power Cord isn't connected\n");
            fout.print("The Power Cord isn't connected\n");
            fout.flush();
        }
    }

    /**
     * Method implements disconnecting Power Cord
     */
    public void disconnectPowerCordConnector() {
        scannerPort.set_powerCordConnector(false);
        if(scannerPort.get_powerCordConnector()){
            System.out.print("The Power Cord isn't disconnected\n");
            fout.print("The Power Cord isn't disconnected\n");
            fout.flush();
        }else{
            System.out.print("The Power Cord is disconnected\n");
            fout.print("The Power Cord is disconnected\n");
            fout.flush();
        }
    }

    /**
     * Method implements scanning
     */
    public void scanning(){
        if(scannerPort.get_powerCordConnector()){
            if(scannerButton.get_Power()){
                if(scannerButton.get_Start()){
                    if(scannerTablet.get_Tablet()){
                        if(scannerButton.get_Colored()){
                            scannerMatrix.Scanned(true);
                            System.out.print("Colored scanning ...\n");
                            System.out.print("Scanned\n");
                            fout.print("Colored scanning ...\n");
                            fout.print("Scanned\n");
                            fout.flush();
                        }else {
                            scannerMatrix.Scanned(true);
                            System.out.print("White\\Black scanning ...\n");
                            System.out.print("Scanned\n");
                            fout.print("White\\Black scanning ...\n");
                            System.out.print("Scanned\n");
                            fout.flush();
                        }
                    }else{
                        System.out.print("Nothing to scan try again\n");
                        fout.print("Nothing to scan try again\n");
                        fout.flush();
                    }
                }else{
                    System.out.print("Start button isn't pressed\n");
                    fout.print("Start button isn't pressed\n");
                    fout.flush();
                }
            }else{
                System.out.print("Power button isn't plugged in\n");
                fout.print("Power button isn't plugged in\n");
                fout.flush();
            }
        }else{
            System.out.print("Power isn't plugged in\n");
            fout.print("Power isn't plugged in\n");
            fout.flush();
        }
    }
}
