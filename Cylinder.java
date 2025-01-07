package sunbeam.com;

public class Cylinder {

		private double radius;
		private double height;
		public Cylinder() {
			this.radius=2;
			this.height=5;
		}
		public Cylinder(double radius,double height) {
			radius=this.radius;
			height=this.height;
		}
		
		public double getRadius() {
			return radius;
		}
		public void setRadius(double radius) {
			this.radius = radius;
		}
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		public double getVolume()
		{			
			return 3.14*radius*radius*height;
		}
		public void printVolume() {
			System.out.println("Volume of Cylinder :"+getVolume());
		}
		public static void main(String[] args) {
			Cylinder c=new Cylinder();
			c.printVolume();

		}

	}
