class ScannerPort{
    private boolean USB;
    private boolean IEEE1394;
    private boolean connectorForAdditionalBoards;
    private boolean powerCordConnector;


    /**
     * Constructor default
     */
    public ScannerPort(){
        USB = false;
        IEEE1394 = false;
        connectorForAdditionalBoards = false;
        powerCordConnector = false;
    }

    /**
     * Method sets USB connection
     */
    public void set_USB(boolean sUSB){
        USB = sUSB;
    }

    /**
     * Method sets IEEE 1394 connection
     */
    public void set_IEEE1394(boolean sIEEE1394){
        IEEE1394 = sIEEE1394;
    }

    /**
     * Method sets Additional Boards connection
     */
    public void set_connectorForAdditionalBoards(boolean sConnectorForAdditionalBoards){
        connectorForAdditionalBoards = sConnectorForAdditionalBoards;
    }

    /**
     * Method sets Cord Connector connection
     */
    public void set_powerCordConnector(boolean sPowerCordConnector){
        powerCordConnector = sPowerCordConnector;
    }

    /**
     * Method get USB connection
     */
    public boolean get_USB(){
        return USB;
    }

    /**
     * Method get IEEE 1394 connection
     */
    public boolean get_IEEE1394(){
        return IEEE1394;
    }

    /**
     * Method get Additional Boards connection
     */
    public boolean get_connectorForAdditionalBoards(){
        return connectorForAdditionalBoards;
    }

    /**
     * Method get Cord connection
     */
    public boolean get_powerCordConnector(){
        return powerCordConnector;
    }
}

class ScannerMatrix{
    AnalogDigitalDevice ADD;
    private boolean isTransformed;

    /**
     * Constructor default
     */
    public ScannerMatrix(){
        isTransformed = false;
        ADD = new AnalogDigitalDevice();
    }

    /**
     * Method sets transformation
     */
    public void set_transform(boolean sTransform){
        isTransformed = sTransform;
    }

    /**
     * Method get transformation
     */
    public boolean get_transform(){
        return isTransformed;
    }

    /**
     * Method implement scanning
     */
    public boolean Scanned(boolean run){
        if(run == true){
            ADD.set_convert(true);
            return true;
        }
        return false;
    }

}

class AnalogDigitalDevice{
    private boolean isConverted;

    /**
     * Constructor default
     */
    public AnalogDigitalDevice() {
        isConverted = false;
    }

    /**
     * Method sets convert
     */
    public void set_convert(boolean sConvert){
        isConverted = sConvert;
    }

    /**
     * Method get convert
     */
    public boolean get_convert(){
        return isConverted;
    }

}
