package week1lesson3q4;

public final class Rectangle {
	private double height;
	private double weidth;
	private  double area;
	Rectangle(double height,double weidth){
		this.height=height;
		this.weidth=weidth;
	}
	public double getHeight() {
		return height;
	}
	public double getWeidth() {
		return weidth;
	}
	public double computeArea(){
		this.area=this.getHeight()*this.getWeidth();
		return area;
	}

}
