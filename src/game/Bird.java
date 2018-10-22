/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author Graham
 */
public class Bird implements Updatable, Renderable {
    
    private float x, y;
    private float yVel;
    private float baseYVel = -6.0f;
    private float gravity = 0.25f;
    
    private Pipes pipes;
    private int scoredPipe = 0;
    
    private int score = 0;
    
    private Font gameFont = new Font("Arial", Font.BOLD, 30);
    
    private BufferedImage flapUp;
    private BufferedImage flapDown;
    
    public Bird(Pipes pipes) {
        
        resetBird();
        
        this.pipes = pipes;
        
        
        
    }
    
    public void resetBird() {
        
        x = 100;
        y = 100;
        yVel = baseYVel;
        
    }
    
    private void flap() {
        
        yVel = baseYVel;
        
    }

    @Override
    public void update(Input input) {
    
        
    
    }

    @Override
    public void render(Graphics2D g, float interpolation) {
    
        
    
    }
    
    
    
}
