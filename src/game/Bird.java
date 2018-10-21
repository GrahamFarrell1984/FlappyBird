/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Graphics2D;

/**
 *
 * @author Graham
 */
public class Bird implements Updatable, Renderable {
    
    private float x, y;
    private float yVel;
    private float baseYVel = -6.0f;
    private float gravity = 0.25f;
    
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
