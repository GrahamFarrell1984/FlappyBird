/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Graphics2D;
import java.util.Random;

/**
 *
 * @author Graham
 */
public class Pipes implements Updatable, Renderable {
    
    private int pipeWidth = 100;
    private int pipeHorizontalSpacing = 210;
    private int pipeVerticalSpacing = 180;
    
    private float xVel = -5.0f;
    private float x1, x2, x3;
    private float y1, y2, y3;
    
    // The Pipe That Is Closest To The Bird
    private int currentPipe;
    
    // An Array To Hold The Pipe's Coordinates
    private float[][] pipeCoords = new float[3][2];
    
    private Random rand;
    
    public Pipes() {
        
        rand = new Random();
        
        resetPipes();
        
    }
    
    public void resetPipes() {
        
        currentPipe = 0;
        
        x1 = Game.WIDTH * 2;
        x2 = x1 + pipeWidth + pipeHorizontalSpacing;
        x3 = x2 + pipeWidth + pipeHorizontalSpacing;
        
        y1 = getRandomY();
        y2 = getRandomY();
        y3 = getRandomY();
    
    }
    
    private int getRandomY() {
        
        return rand.nextInt((int) (Game.HEIGHT * 0.4f)) + (Game.HEIGHT / 10);
        
    }

    @Override
    public void update(Input input) {
    
        x1 = x1 + xVel;
        x2 = x2 + xVel;
        x3 = x3 + xVel;
        
        if(x1 + pipeWidth < 0) {
            
            x1 = Game.WIDTH;
            y1 = getRandomY();
            currentPipe = 1;
            
        }
        
        if(x2 + pipeWidth < 0) {
            
            x2 = Game.WIDTH;
            y2 = getRandomY();
            currentPipe = 2;
            
        }
        
        if(x3 + pipeWidth < 0) {
            
            x3 = Game.WIDTH;
            y3 = getRandomY();
            currentPipe = 0;
            
        }
        
        // Update The Pipe Coordinates
        
        switch(currentPipe) {
            
            case 0:
                pipeCoords[0][0] = x1;
                pipeCoords[0][1] = y1;
                break;
            case 1:
                pipeCoords[1][0] = x2;
                pipeCoords[1][1] = y2;
                break;
            case 2:
                pipeCoords[2][0] = x3;
                pipeCoords[2][1] = y3;
                break;
            
        }
    
    }

    @Override
    public void render(Graphics2D g, float interpolation) {
    
        
    
    }
    
    
    
}
