package com.comptech.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.comptech.game.Game;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.title = "Hotline Bling";
		config.width = 1920;
		config.height = 1080;
		config.resizable = false;
		config.fullscreen = true;
		new LwjglApplication(new Game(), config);

	}
}
