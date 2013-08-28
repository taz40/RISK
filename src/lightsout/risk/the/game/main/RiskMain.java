/*
 * Copyright (c) 2004-2010, P. Simon Tuffs (simon@simontuffs.com)
 * All rights reserved.
 *
 * See the full license at http://one-jar.sourceforge.net/one-jar-license.html
 * This license is also included in the distributions of this software
 * under doc/one-jar-license.txt
 */
package lightsout.risk.the.game.main;

import java.util.Arrays;

import taz40.lightsoutgamingengine.V1.Game;

public class RiskMain {
    
    public static void main(String args[]) {
        if (args == null)
            args = new String[0];
        System.out.println("risk main entry point, args=" + Arrays.asList(args));
        new RiskMain().run();
    }
    
    // Bring up the application: only expected to exit when user interaction
    // indicates so.
    public void run() {
        System.out.println("risk main is running");
        // Implement the functionality of the application. 
        System.out.println("risk OK.");
        Game game = new Game(800, 600, "Polygon Detection", 100);
        game.getScreenFactory().showScreen(new TestScreen(game.getScreenFactory()));
        
    }
    

}
