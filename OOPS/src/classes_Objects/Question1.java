package classes_Objects;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Box obj=new Box(10,15,6);
        int volume=obj.getVolume();
        System.out.println("The volume of the box is "+volume+"cubic units");
;	}

}
class Box{
	int height;
	int width;
	int depth;
	public Box(int height,int width,int depth) {
		this.height=height;
		this.width=width;
		this.depth=depth;
	}
	public int getVolume() {
		return height*width*depth;
	}
}
