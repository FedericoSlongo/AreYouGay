/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package are.you.gay;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author federico
 */
public class timer {
    public static void timer() {
        Timer timer = new Timer();
        timer.schedule(new MyTask(), 4000);  // run the task in 5 seconds
    }

    static class MyTask extends TimerTask {
        @Override
        public void run() {
            gui.textBox.setText("Are you gay?");
        }
    }
}
