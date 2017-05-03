/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Graphics;
import java.util.LinkedList;
import javax.swing.JPanel;

/**
 *
 * @author mdameron0
 */
public class GraphicsClass extends JPanel{
    
    LinkedList<ObjectClass> objects;
    
    //Add the object passing
    public GraphicsClass(LinkedList<ObjectClass> objects){
        this.objects = objects;
    }
    
    @Override
    public void paintComponent(Graphics g){
    
        super.paintComponent(g);
       for(int i = 0; i < objects.size(); i++){
           ObjectClass object = objects.get(i);
           g.drawImage(object.sprite, object.locationX, object.locationY, this);
       }
    }
}
