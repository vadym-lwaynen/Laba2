class ScannerButton{
    private boolean isStart;
    private boolean isColored;
    private boolean isPower;


    /**
     * Constructor default
     */
    public ScannerButton(){
        isStart = false;
        isColored = false;
        isPower = true;
    }

    /**
     * Constructor with three parameters
     */
    public ScannerButton(boolean setStart, boolean setColored, boolean setPower){
        isStart = setStart;
        isColored = setColored;
        isPower = setPower;
    }

    /**
     * Constructor with one parameter
     */
    public ScannerButton(boolean setColored){
        isColored = setColored;
    }

    /**
     * Method sets start button
     */
    public void set_Start(boolean setStart){
        isStart = setStart;
    }

    /**
     * Method sets colored button
     */
    public void set_Colored(boolean setColored){
        isColored = setColored;
    }

    /**
     * Method sets power button
     */
    public void set_Power(boolean setPower){
        isPower = setPower;
    }

    /**
     * Method sets start button
     */
    public boolean get_Start(){
        return isStart;
    }

    /**
     * Method get colored button
     */
    public boolean get_Colored(){
        return isColored;
    }

    /**
     * Method get power button
     */
    public boolean get_Power(){
        return isPower;
    }
}

class ScannerTablet{
    private boolean isOnTablet;

    /**
     * Constructor default
     */
    public ScannerTablet(){
        isOnTablet = false;
    }

    /**
     * Method sets tablet
     */
    public void set_Tablet(boolean sOnTablet){
        isOnTablet = sOnTablet;
    }

    /**
     * Method get tablet
     */
    public boolean get_Tablet(){
        return isOnTablet;
    }
}
