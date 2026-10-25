class Box {
    double width, height, depth;

    Box() {
        width = 1.0; height = 1.0; depth = 1.0;
    }

    Box(double len) {
        width = height = depth = len;
    }

    Box(double w, double h, double d) {
        width = w; height = h; depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

public class TestBox {
    public static void main(String args[]) {
        Box b1 = new Box();
        Box b2 = new Box(5.0);
        Box b3 = new Box(2.0, 3.0, 4.0);

        System.err.println("b1.volume" + b1.volume());
        System.err.println("b2.volume" + b2.volume());
        System.err.println("b3.volume" + b3.volume());

    }
}