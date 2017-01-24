package com.comptech.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.comptech.handlers.Content;

public class Game implements ApplicationListener {
	SpriteBatch batch;
	Texture img;
	public static Content res;
	@Override
	public void create () {
		res = new Content();

		//Sprite batch is kind of like Graphics g
		batch = new SpriteBatch();
		
		//Old way
		img = new Texture("badlogic.jpg");
		//New way
		res.loadTexture("badlogic.jpg", "testImg");
		img = res.getTexture("testIMG");
	}

	@Override
	public void render () {
	}
	
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}
	//Example
	/*	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		//You always have to have batch.begin() and batch.end() ??? you just do
		batch.begin();
		//Draw Image get rid of later but used for reference
		batch.draw(img, 0, 0);
		batch.end();
	}
*/
}
