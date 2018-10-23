/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author Graham
 */
public class Main {
    
    public static void main(String[] args) {
        
        Game g = new Game();
        
        // Initialise Game Objects
        
        Pipes p = new Pipes();
        Bird b = new Bird(p);
        
        // Add Updatables And Renderables
        
        g.addRenderable(p);
        g.addUpdatable(p);
        
        g.addRenderable(b);
        g.addUpdatable(b);
        
        // Start!
        
        g.start();
        
    }
    
}
