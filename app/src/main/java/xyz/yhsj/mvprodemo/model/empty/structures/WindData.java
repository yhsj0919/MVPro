package xyz.yhsj.mvprodemo.model.empty.structures;

/**
 * Created by LOVE on 2016/1/27.
 */
public class WindData<Direction, Speed> {
    private Direction direction;
    private Speed speed;

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Speed getSpeed() {
        return speed;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }
}
