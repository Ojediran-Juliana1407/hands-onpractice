package polymorphism;

public class Drawing {
    public static void drawAll(Drawable[] drawables) {
        for (Drawable drawable : drawables) {
            drawable.draw();
        }
    }
}
