package soal1;

public abstract class Shape {
    protected String shapeName;
    
    protected Shape(String name) {
        this.shapeName = name;
    }

    protected abstract double area();

    @Override
	public String toString() {
        return "Shape: " + shapeName;
    }
}