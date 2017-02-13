package info.rsharma.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by rishsharma on 13/02/17.
 */
public class Bird {

    private static final int GRAVITY = -15;
    private Vector3 position;
    private Vector3 velocity;
    private Texture bird;



    public Vector3 getPosition() {
        return position;
    }

    public void setPosition(Vector3 position) {
        this.position = position;
    }

    public Bird(int x, int y) {

        position = new Vector3(x,y,0);
        velocity = new Vector3(0,0,0);
        bird = new Texture("bird.png");

    }

    public void update(float dt) {

        if(position.y > 0) {
            velocity.add(0,GRAVITY,0);
        }
        velocity.scl(dt);
        position.add(0,velocity.y,0);

        if(position.y < 0) {
            position.y = 0;
        }

        velocity.scl(1/dt);
    }

    public Texture getTexture() {
        return bird;
    }

    public void setBird(Texture bird) {
        this.bird = bird;
    }

    public void jump() {

        velocity.y = 250;

    }
}
