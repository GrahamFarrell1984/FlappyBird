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
        
        
        
    }

    @Override
    public void update(Input input) {
    
        
    
    }

    @Override
    public void render(Graphics2D g, float interpolation) {
    
        
    
    }
    
    
    
}
