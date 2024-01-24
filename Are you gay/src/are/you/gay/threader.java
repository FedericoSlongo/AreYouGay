/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package are.you.gay;

import java.util.Timer;

/**
 *
 * @author federico
 */
public class threader extends Thread{
    String toWrite;
    public threader(String toWrite) {
        this.toWrite = toWrite; 
   }
    
    @Override
    public void run(){
        gui.textBox.setText(toWrite);
        timer.timer();
    }
}
