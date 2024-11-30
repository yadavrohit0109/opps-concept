
class cylinder {
    public double radius;
    public double height;

    public double area() {

        return Math.PI * radius * radius;
    }

    public double surfacearea() {
        return 2 * area()+ circumfrence() * height;
    }

    public double circumfrence() {

        return 2 * Math.PI * radius;
    }

    public double volume() {
        return area() * height;
    }
}

class test {
    public static void main(String args[]) {
        cylinder in = new cylinder();
        in.height = 10;
        in.radius = 5;

        System.out.println("area :" + in.area());
        System.out.println("surfacearea :" + in.surfacearea());
        System.out.println("circumfrence :" + in.circumfrence());
        System.out.println("volume :" + in.volume());
    }
}