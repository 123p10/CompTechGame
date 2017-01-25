package com.comptech.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.comptech.game.Game;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.title = "Hotline Bling";
		config.width = Game.WIDTH;
		config.height = Game.HEIGHT;
		config.resizable = true;
		if(Game.isFullScreen){
			config.fullscreen = true;
		}
		else{
			config.fullscreen = false;
		}
		
		new LwjglApplication(new Game(), config);

	}
}
