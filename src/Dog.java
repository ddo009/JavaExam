public class Dog implements Drawable, Runnable, Moveable {
    private Picture pic;
    private Text name;

    public Dog(int x, int y, String file) {
        pic = new Picture(file);
        pic.translate(x, y);
        name = new Text(x, y + pic.getHeight(),
                file.substring(0, file.indexOf(".")));
    }

    public void draw() {
        pic.draw();
        name.draw();
    }

    @Override
    public void move(int seconds) {
        pic.translate(0, 1);
        name.translate(0, 1);
    }

    @Override
    public void run(double distance) {

    }
}
