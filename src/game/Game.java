/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Canvas;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Graham
 */
public class Game {
    
    public final static int WIDTH = 800, HEIGHT = 600;
    
    private String gameName = "Flappy Bird";
    
    private Canvas game = new Canvas();
    
    private Input input;
    
    private ArrayList<Updatable> updatables = new ArrayList<>();
    private ArrayList<Renderable> renderables = new ArrayList<>();
    
    public void start() {
        
        // Init Window
        
        Dimension gameSize = new Dimension(Game.WIDTH, Game.HEIGHT);
        JFrame gameWindow = new JFrame(gameName);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.setSize(gameSize);
        gameWindow.setResizable(false);
        gameWindow.setVisible(true);
        game.setSize(gameSize);
        game.setMinimumSize(gameSize);
        game.setMaximumSize(gameSize);
        game.setPreferredSize(gameSize);
        gameWindow.add(game);
        gameWindow.setLocationRelativeTo(null);
        
        // Init Input
        
        input = new Input();
        
        // Game Loop
        
        boolean running = true;
        
        while(running) {
            
            
            
        }
        
        // Game End
        
    }
    
    private void update() {
        
        for(Updatable u : updatables) {
            
            u.update(input);
            
        }
        
    }
    
    private void render(float interpolation) {
        
        for(Renderable r : renderables) {
            
            r.render(g2d, interpolation);
            
        }
        
    }
    
}
