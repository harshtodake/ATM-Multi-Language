/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_system;

/**
 *
 * @author jude
 */
public class ATM_SYSTEM_marathi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        splash_marathi Keypad=new splash_marathi();
        Keypad.setVisible(true);
        Keypad.setLocationRelativeTo(null);
        verify_marathi very=new verify_marathi();
        try{
         for(int i = 0; i<=100; i++){
         Thread.sleep(50);
         Keypad.progressno.setText(Integer.toString(i)+"%");
         Keypad.progressbar.setValue(i);
         if(i==100){
         Keypad.setVisible(false);
         very.setVisible(true);
         very.setLocationRelativeTo(null);
         }
         
         }
        
        }
        catch(Exception e){
        
        }
        //Keypad.
        
    }
    
}
