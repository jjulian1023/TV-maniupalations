/*
    Julian Arcila
    This program calls methods that will be called while askign for specfic things from the drop down menu
 */
//applying scanner
import java.util.Scanner;
public class TvAppObjects {
        /*
        This class contains ] mutiple methods that are being called to be able to move a channel up or down
        as well as move volume or down.
        It could set a specific number or volume a user wants to put 
        and prints the status of what channel or volume you are at.  
    
        This class is calling the methods from TvClassObjects and allowing the user to input data when asked from the option they       
        choose from the menu
        */
        public static void main(String[] args) {
        //implementing scanner
        Scanner input = new Scanner(System.in);
        int nOption = 0;//variable to hold the users input
        final int SENTINEL = 15;//final variale to stop the while loop 
        int nChannels = 0;//variable holding channel input
        int nVolume = 0;//variable holding the volume input
        boolean bTorF = false;//variable holding the boolean input
        TvClassObjects Tv1 =  null;//setting the obstructor null here to be able to call methods down below without implementing "new" 
            
            //printing out menu shown in the sample
            System.out.println("TV PROCESSING MENU");
            //printing out menu shown in the sample
            System.out.println("1. Create new TV – default TV object");
            System.out.println("2. Create new TV – information available");
            System.out.println("3. Turn on TV");
            System.out.println("4. Turn off TV");
            System.out.println("5. Set channel");
            System.out.println("6. Set Volume level");
            System.out.println("7. Increase the channel");
            System.out.println("8. Decrease the channel");
            System.out.println("9. Increase the volume");
            System.out.println("10. Decrease the volume");
            System.out.println("11. Show volume level");
            System.out.println("12. Show current channel");
            System.out.println("13. Print TV status");
            System.out.println("14. Print TV detail");
            System.out.println("15. Exit");
            System.out.println("");
            //printing out enter an option for the user to repsond to
            System.out.print("Enter an option: ");
            //storing users option in nOption
            nOption = input.nextInt();
            
            //while loop to gather all options from 1 -14 until 15 which is the sentinel value to stop while loop
            while (nOption != SENTINEL){
                //option #1 Create new TV – default TV object
                if(nOption == 1){
                    //declaring method 
                    Tv1 = new TvClassObjects();
             }//end of if statement for option #2 Create new TV – information available
                
                
                else if(nOption == 2){
                    //printing out the sentence for the user to respond to as to channel
                    System.out.print("Enter a channel: ");
                    nChannels = input.nextInt();
                    //printing out the sentence for the user to respond to as to the volume
                    System.out.print("Enter volume level: ");
                    nVolume = input.nextInt();
                    //printing out the sentence for the user to respond to as to see if the tv is on or off
                    System.out.print("Enter true to On or false to Off: ");
                    bTorF = input.nextBoolean();//storing boolean depending on what the user inputs
                    Tv1 = new TvClassObjects(nChannels,nVolume,bTorF);//declaring method following class objects with its parameters.
                    //need to enter TvClassObjects to implement here
             }//end of if statement for option # 3 Turn on TV
                
                else if(nOption == 3){
                    //calling method to turn on the tv
                    Tv1.turnOn();
                    System.out.println("");
             }//end of if statement for option #3
                // else if option #4 Turn off TV 
                else if(nOption == 4){
                    //calling method to turn off tv
                    Tv1.turnOff();
                    System.out.println("");
             }//end of if statement for option #4
                
                //else if statement of option #5 Set channel
               else if(nOption == 5){
                   //printing out enter channel for user to implement
                    System.out.print("Enter the channel: ");
                    //storing input in nChannels
                    nChannels = input.nextInt();
                    //calling method with variable inside the parameter as the method calls
                    Tv1.setChannel(nChannels);
             }//end of if statement for option #5
               
               //else if option #6 Set Volume level
               else if(nOption == 6){
                   //printing out enter the volume for the user to respond
                    System.out.print("Enter the Volume: ");
                    //storing nvolume with the users input
                    nVolume = input.nextInt();
                    //calling method to set the volume with nvolume in its parameter as it calls.
                    Tv1.setVolume(nVolume);
                    System.out.println("");
             }//end of if statement for option #6
               
               //else if option #7 Increase the channel
               else if(nOption == 7){
                    //calling method with apporiate way to increase the channel
                    Tv1.channelUp();
             }//end of if statement for option #7
               
               //else if option #8 Decrease the channel
               else if(nOption == 8){
                    //calling method to decrease the channel the apporopaite way
                    Tv1.channelDown();
             }//end of if statement for option #8
               
               //else if option#9 to Increase the volume
               else if(nOption == 9){
                    //calling method to raise the volume
                    Tv1.volumeUp();
             }//end of if statement for option #9
               
               //else if option #10 to Decrease the volume
               else if(nOption == 10){
                    //calling method to put the volume down
                    Tv1.volumeDown();
             }//end of if statement for option #10
               
               //else if option #11 to Show volume level
               else if(nOption == 11){
                    //printing out sentence to show current volume level while calling the method 
                    System.out.println("THe current volume level is "+ Tv1.getVolume());
                    System.out.println("");
             }//end of if statement for option #11
               
               //else if option #12 Show current channel
               else if(nOption == 12){
                    //printing out sentence to show current channel level while calling the method 
                    System.out.println("The current channel is "+ Tv1.getChannel() );
                    System.out.println("");
             }//end of if statement for option #12
               
              //else if statement option# 13 Print TV status 
              else  if(nOption == 13){
                   //calling method to print out method stored in printTVstatus
                    Tv1.printTVstatus();
             }//end of if statement for option #13
              
               //else if statement option #14 Print TV detail
               else if(nOption == 14){
                    //calling method to display tv details
                    Tv1.printTVDetail();
             }//end of if statement for option #14
                
         
                //sentence to repeat enter an option until they press 15 which is the sentinel to breakout of the while loop
                System.out.print("Please enter an option: ");
                //storing users input in noption
                nOption = input.nextInt();
                
                
        }//end of while loop once they press 15 or sentinel
        
        //end of while loop once they press 15 and will print out exiting program
        System.out.println("Exiting Program.");
        }//end main method of calling methods
   
}// end of class 

