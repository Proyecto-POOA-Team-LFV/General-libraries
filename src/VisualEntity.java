import javafx.scene.image.Image;

public abstract class VisualEntity extends Entity {

    private Image sprite;

    public VisualEntity(double x, double y, double width, double height) {
        super(x, y, width, height);

        this.sprite = null;
    }

    public VisualEntity(double x, double y, double width, double height, String url) {
        super(x, y, width, height);

        this.sprite = new Image(url);
    }

    public Image getSprite() {
        return sprite;
    }

    public void setSprite(Image sprite) {
        this.sprite = sprite;
    }

    public void setSprite(String url) {
        this.sprite = new Image(url);
    }
}
