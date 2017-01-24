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
	//	img = new Texture("badlogic.jpg");
		//New way
		res.loadTexture("badlogic.jpg", "testImg");
		img = res.getTexture("testImg");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();
		batch.draw(img, 0, 0,1920,1080);
		batch.end();
	}
	
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}

	
	//Never really used these
	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}

}
