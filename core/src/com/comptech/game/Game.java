package com.comptech.game;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.comptech.handlers.Content;

public class Game implements ApplicationListener {
	SpriteBatch batch;
	Texture img;
	public static boolean isFullScreen = false;
	public static Content res;
	public static int WIDTH = 1920;
	public static int HEIGHT = 1080;
	//Frames per second I am thinking 60 or 30
	public static final float FPS = 1/60f;
	
	private OrthographicCamera camera;
	private OrthographicCamera hudCam;
	@Override
	public void create () {
		//Use this for multiple resolutions so it will work for Abirs screen and Mine
		WIDTH = Gdx.graphics.getWidth();
		HEIGHT = Gdx.graphics.getHeight();
		res = new Content();

		//Sprite batch is kind of like Graphics g
		batch = new SpriteBatch();
		
		//Old way
		//img = new Texture("badlogic.jpg");
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
		WIDTH = width;
		HEIGHT = height;
	}
	public OrthographicCamera getCamera(){
		return camera;
	}
	public OrthographicCamera getHUDCamera(){
		return hudCam;
	}
	

	public SpriteBatch getSpriteBatch(){
		return batch;
	}

	
	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}

}
