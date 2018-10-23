/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

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
        
        try {
            
            flapUp = Sprite.getSprite("bird_up.png");
            flapDown = Sprite.getSprite("bird_down.png");
            
        } catch (IOException ex) {
            
            System.err.println(ex.getMessage());
            System.exit(1);
            
        }
        
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
    
        y = y + yVel;
        yVel = yVel + gravity;
        
        if(y < 0) {
            
            y = 0;
            yVel = 0;
            
        }
        
        if(input.isSpacePressed()) {
            
            flap();
            
        }
        
        float[] pipeCoords = pipes.getCurrentPipe();
        float pipeX = pipeCoords[0];
        float pipeY = pipeCoords[1];
        
        if((x >= pipeX && x <= pipeX + pipes.getPipeWidth() 
                && (y <= pipeY || y >= pipeY + pipes.getPipeVerticalSpacing()))
                || y >= Game.HEIGHT) {
            
            pipes.resetPipes();
            resetBird();
            score = 0;
            
        }
        
        else {
            
            int currentPipeId = pipes.getCurrentPipeId();
            score = (scoredPipe != currentPipeId) ? score + 1 : score;
            scoredPipe = currentPipeId;
            
        }
    
    }

    @Override
    public void render(Graphics2D g, float interpolation) {
    
        
    
    }
    
    
    
}
