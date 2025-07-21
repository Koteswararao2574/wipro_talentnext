package collections_project;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class SetOfBoxes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Box> set = new LinkedHashSet<>(); 
		System.out.println("Enter the number of Box: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the details of Box " + (i+1));
			System.out.println("Height: ");
			double height = sc.nextDouble();
			System.out.println("Width: ");
			double width = sc.nextDouble();
			System.out.println("Length: ");
			double length = sc.nextDouble();
			
			Box box = new Box(height,width,length);
				set.add(box);
		}
		System.out.println("Unique Boxes in the set are: ");
		for(Box b:set) {
			b.display();
		}
	}

}


class Box{
	double height;
	double width;
	double length;
	public Box(double height, double width, double length) {
		this.height = height;
		this.width = width;
		this.length = length;
	}
	
	public double getVolume() {
		return width*height*length;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof Box)) return false;
		Box box = (Box) obj;
		return Math.round(this.getVolume()*100)/100 ==  Math.round(box.getVolume()*100)/100;
	}
	// here the volume may be same but the length, width and height are different so it is considered as different obj
	// but here we override the equals method by checking the volume of the boxes so if volumes are equal we are considering
	// them as same obj
	@Override
	public int hashCode() {
		return Double.valueOf(Math.round(this.getVolume() * 100)/100).hashCode();
	}
	
	public void display() {
		System.out.println("Height = " + height + " Width = " + width + " Length = " + length + " Volume = " + getVolume());
	}
}
