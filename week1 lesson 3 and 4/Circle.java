package week1lesson3q4;

public final class Circle {
	private double radius;
	private double area;
	Circle(double radius){
		this.radius=radius;
		
	}
	public double getRadius() {
		return radius;
	}
	public double computeArea(){
		this.area=Math.PI*Math.pow(this.getRadius(), 2);
		return area;
	}

}
