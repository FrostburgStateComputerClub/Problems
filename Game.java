/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.LinkedList;
import javax.swing.JFrame;

/**
 *
 * @author mdameron0
 */
public class Game {
    
    static LinkedList<ObjectClass> objects = new LinkedList<ObjectClass>();
    static LinkedList<Character> keyPressed = new LinkedList<Character>();
    static long lastFrame = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player player = new Player();
        
        objects.add(player);
        GraphicsClass graphics = new GraphicsClass(objects);
        
        JFrame frame = new JFrame("GamesAreNeat");
        frame.add(graphics);
        frame.addKeyListener(new EventHandler(keyPressed));
        frame.setSize(800,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        while(true){
            if(System.currentTimeMillis() - lastFrame  > 60){
            
                graphics.validate();
                graphics.repaint();
                
                        
                if(keyPressed.contains('s') || keyPressed.contains('S')){
                    player.updateLocation(0, 10);
                }
                if (keyPressed.contains('d')|| keyPressed.contains('D')){
                    player.updateLocation(10, 0);
                }
                if(keyPressed.contains('w')|| keyPressed.contains('W')){
                    player.updateLocation(0, -10);
                }
                if (keyPressed.contains('a')|| keyPressed.contains('A')){
                    player.updateLocation(-10, 0);
        }
        
                
                
                //player.updateLocation(10,10);
                lastFrame = System.currentTimeMillis();
            }
        }
        
    }
    
}
