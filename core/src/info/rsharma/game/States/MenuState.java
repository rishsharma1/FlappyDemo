package info.rsharma.game.States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import info.rsharma.game.FlappyDemo;

/**
 * Created by rishsharma on 7/02/17.
 */
public class MenuState extends State {

    private Texture background;
    private Texture playButton;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("bg.png");
        playButton = new Texture("playbtn.png");

    }

    @Override
    public void handleInput() {

        if(Gdx.input.justTouched()) {

            gsm.set(new PlayState(gsm));
            dispose();
        }
    }

    @Override
    public void update(float dt) {

        handleInput();


    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background,0,0, FlappyDemo.WIDTH,FlappyDemo.HEIGHT);
        sb.draw(playButton,(FlappyDemo.WIDTH/2)-(playButton.getWidth()/2),FlappyDemo.HEIGHT/2);
        sb.end();
    }

    @Override
    public void dispose() {
        background.dispose();
        playButton.dispose();
    }
}
