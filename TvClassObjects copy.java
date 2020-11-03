/*
    Julian Arcila
    This program display methods that will be used in another java file
 */
public class TvClassObjects {
    /*
        This class contains holds mutiple methods that are being defined to be able to move a channel up or down
        as well as move volume or down.
        It could set a specific number or volume a user wants to put 
        and prints the status of what channel or volume you are at.
    
        This class only defines the methods but nothing is being printed but stored only.
    */
    
   //PRIVATE
    private int nChannel = 1;//setting channel variable to 1
    private int nVolumeLevel = 1; //setting volume variable to 1
    private boolean bOn = false;//setting boolean to false automatically
    
    //default constructor #1
    public TvClassObjects(){
        printTVDetail();//calling method
    }


    //overload contructor #2
    public TvClassObjects(int nStartChannel, int nStartVolumeLevel, boolean bStartOn) {
        //if statement to set the number it cannot pass for volume and channel
        if(nStartChannel >= 1 && nStartChannel <= 120 && nStartVolumeLevel >= 1 && nStartVolumeLevel <= 7){
            nChannel = nStartChannel;
            nVolumeLevel = nStartVolumeLevel;
            bOn = bStartOn;//boolean variable to see if its true or false (on or off)
        }
        else {
            //printing this statement if the parameteres are incorrect
            System.out.println("One of the parameter was incorrect, the TV will be created using the default value.");
            System.out.println("");
        }
        printTVDetail();//calling method
    }// end of TvClassObjects 
    
    //turn on method
    public void turnOn(){
        bOn = true;
    }//end of turnOn method
    
    //turn off mehtod
    public void turnOff(){
       bOn = false; 
    }//end of turn off method
     
    //setting channel method
    public void setChannel(int nNewChannel) {
        if ((bOn == true && nNewChannel >= 1) && (nNewChannel <= 120)){
            nChannel = nNewChannel;//setting nChannel equal to newChannel
        }//end of if statement
        else{
            System.out.println("Make sure the TV is ON or enter a channel between 1 && 120");
            System.out.println("");
        }//end of else statement
    }//end of set a new channel method
    //setting volume method
    public void setVolume(int nNewVolume) {
        if ((bOn && nNewVolume >= 1) && (nNewVolume <= 7)){
            nVolumeLevel = nNewVolume;
        }//end of if statement
        else{
            System.out.println("Make sure the TV is ON or enter a volume level between 1 && 7");
            System.out.println("");
        }//end of else statement 
    }//end of set a volume method
    //putting a channel up method
    public void channelUp(){
        if(bOn == true && nChannel < 120){
            nChannel++;
        }//end of if statement for algorithm to increase the channel
        else {
            System.out.println("TV is off or channel is 120");
            System.out.println("");
        }//end of else statement 
    }//end of increasing channel method
    //putting a channel down method
    public void channelDown(){
        if(bOn == true && nChannel > 1){
            nChannel--;
        }//end of if statement for decreasing channel
        else {
            System.out.println("TV is off or channel is 1");
            System.out.println("");
        }//end of else statement 
    }//end of decreasing channel mehtod
    //putting volume up method
    public void volumeUp(){
        if (bOn == true && nVolumeLevel < 7){
            nVolumeLevel++;
        }//end of statement to increase the volume
        else {
            System.out.println("TV is off or volume is set to 7");
            System.out.println("");
        }//end of else statement
    }//end of increasing volume method
    //putting volume down method
    public void volumeDown(){
        if(bOn == true && nVolumeLevel > 1){
            nVolumeLevel--;
        }//end of if statement to be able to lower the volume
        else {
            System.out.println("TV is off or volume is set to 1");
            System.out.println("");
        }//end of else statement
    }//end of mehtod to put volume down
    //getting the channel method
    public int getChannel(){
        return nChannel;
    }//end of method to return the current channel channel
    //getting the volume method
    public int getVolume(){
        return nVolumeLevel;
    }//end of method to return the current volume channel
    //getting boolean to see if its on or not method
    public boolean getOn(){
            return bOn;
    }//end of method to see if its off or not
    //printing tv status method
    public void printTVstatus() {
        if(bOn == true){
            System.out.println("The TV is ON");
            System.out.println("");
        } //if statement to see if tv is on to show ON
        else if (bOn == false) {
            System.out.println("The TV is OFF");
            System.out.println("");
        }//else if statement to see if tv is off to show OFF
    }//end of method to show if tv is on or off
    //printing tv detail method
    public void printTVDetail(){
        System.out.println("TV detail ");
        System.out.println("-------------");
        //if and else if statement to see if tv is on or off
        if(bOn == true){
            System.out.println("The TV is ON");
        } //if statement to see if tv is on to show ON
        else if (bOn == false) {
            System.out.println("The TV is OFF");
        }//else if end statement to display tv is off
        System.out.println("Current volume level: " +nVolumeLevel);
        System.out.println("Current channel: "+ nChannel);
    }//end of method to displays the status of the attributes
    
}//end of class TvClassObjects
