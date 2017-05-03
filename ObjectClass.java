
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author mdameron0
 */
public class ObjectClass {
    
    public int locationX, locationY;
    
    private File imagePath;
    public BufferedImage sprite;
    
    private String type;
    
    public ObjectClass (File spritePath, String type){
        this.imagePath = spritePath;
        this.type = type;
        
        try{
            sprite = ImageIO.read(imagePath);
        } catch(Exception e){
            e.printStackTrace();
        }
        
        locationX = 0;
        locationY = 0;
        
    }
    
    public void updateLocation(int x, int y){
    
        this.locationX+= x;
        this.locationY += y;
    }
    
}
