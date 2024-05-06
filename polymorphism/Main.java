package polymorphism;

import static polymorphism.Drawing.drawAll;

public class Main {
    public static void main(String[]args) {
        Drawable[] drawables = {new Circle(),new Rectangle()};
        drawAll(drawables);
    }

}
