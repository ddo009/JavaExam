// BlueJ project: lesson9/scene1

import java.util.ArrayList;

public class Scene {
    public static void main(String[] args) {

        ArrayList<Drawable> drawables = new ArrayList<>();
        drawables.add(new Car(100, 300));
        drawables.add(new Car(250, 300));
        drawables.add(new Car(250, 350));
        drawables.add(new Dog(200, 100, "Fido.jpg"));
        drawables.add(new Dog(100, 400, "Rex.jpg"));
        drawables.add(new Dog(200, 400, "Lucky.jpg"));
        drawables.add(new House(100, 150, 100, 100));
        drawables.add(new House(250, 100, 150, 150));

        Ball ball = new Ball(400, 400, Color.RED);
        ball.draw();


        for (int i = 0; i < drawables.size(); i++) {
            drawables.get(i).draw();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < drawables.size(); j++) {
                if (drawables.get(j) instanceof Dog) {
                    ((Dog) drawables.get(j)).move(1);
                }
                if (drawables.get(j) instanceof Car) {
                    ((Car) drawables.get(j)).move(1);
                }
            }
            Canvas.snapshot();
        }
    }
}
