package week1lesson3q4;

public final class Triangle {
	private double height;
	private double base;
	private double area;
	Triangle(double height,double base){
		this.height=height;
		this.base=base;
	}
	public double getHeight() {
		return height;
	}
	public double getBase() {
		return base;
	}
public double computeArea(){
	
	this.area=0.5*this.getHeight()*this.getBase();
	return this.area;
	
}

}
