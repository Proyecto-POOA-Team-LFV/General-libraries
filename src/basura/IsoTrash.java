package basura;

import entidades.IsometricEntity;

public class IsoTrash extends IsometricEntity {


    public IsoTrash(double x, double y, double width, double height) {
        super(x, y, width, height);
    }

    public IsoTrash(double x, double y, double width, double height, double hitboxSize) {
        super(x, y, width, height, hitboxSize);
    }

    public IsoTrash(double x, double y, double width, double height, double hitboxX, double hitboxY, double hitboxWidth, double hitboxHeight) {
        super(x, y, width, height, hitboxX, hitboxY, hitboxWidth, hitboxHeight);
    }
}
