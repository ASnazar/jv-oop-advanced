package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstParallel;
    private double secondParallel;
    private double height;

    public IsoscelesTrapezoid(double firstParallel, double secondParallel,
                              double height, Color color) {
        this.firstParallel = firstParallel;
        this.secondParallel = secondParallel;
        this.height = height;
        setColor(color);
    }

    @Override
    public double getArea() {
        return ((firstParallel + secondParallel) / 2) * height;
    }

    @Override
    public void drow() {
        System.out.println("Figure: isosceles trapezoid"
                + ", area: "
                + getArea()
                + " sq.units"
                + ", firstParallel: "
                + firstParallel
                + " units, secondParallel: "
                + secondParallel
                + " units, height: "
                + height
                + " units, color: "
                + getColor().name().toLowerCase());
    }
}