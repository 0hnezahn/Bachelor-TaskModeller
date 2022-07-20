package de.legoshi.taskmodeller.gui.model.symbols.ctt;

import de.legoshi.taskmodeller.gui.model.symbols.Drawable;
import de.legoshi.taskmodeller.util.PolygonHelper;
import javafx.geometry.Point2D;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class AbstractTask extends Drawable {

    public AbstractTask(Rectangle shape) {
        super(shape);
    }

    public static Rectangle generateAbstractTask() {
        return new Rectangle(50, 50);
    }
}
