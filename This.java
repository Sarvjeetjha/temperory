class Area {
    Area(int a, int b) {
        System.out.println("area of rectangle is " + a * b);
    }

    Area(int a) {
        System.out.println("area of squrae is " + a * a);
    }

    Area(float a) {
        System.out.println("area of circle is " + 3.14 * a * a);
    }

    Area(float a, int b) {
        System.out.println("area of traingle is " + 0.5 * b * a);
    }
};

class Constructer {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        float c = 2.3F;
        Area a1 = new Area(a, b);
        Area a2 = new Area(a);
        Area a3 = new Area(c);
        Area a4 = new Area(c, a);

    }
};