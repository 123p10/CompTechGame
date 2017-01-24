package com.comptech.handlers;
import java.util.HashMap;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;

public class Content {
	//Creates essentially a table with a String input and a Texture Input
	private HashMap<String,Texture> textures;

	public Content(){
		textures = new HashMap<String,Texture>();
	}
	
	//You should use this in Game with 
	//Game.res.loadTexture(path to file, the key or name to access for later);
	public void loadTexture(String path, String key){
		Texture tex = new Texture(Gdx.files.internal(path));
		//adds to the table
		textures.put(key, tex);

	}
	//You should use this in Game with 
	//Game.res.getTexture(the key you used earlier);

	public Texture getTexture(String key){
		return textures.get(key);
	}
	public void disposeTexture(String key){
		Texture tex = textures.get(key);
		if(tex != null) tex.dispose();
	}

	
	
}
