package net.ikmac.blog.loadimplementors.animals;

public class Grizzly extends Bear{
    private final int grizzly_speed=25;

	public Grizzly() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "(grizzly)";
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return grizzly_speed;
	}


	
	
    
}
