package net.ikmac.blog.loadimplementors.animals;

public class PolarBear extends Bear{
	private final int polarBear_speed=20;

	public PolarBear() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "(polar)";
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return polarBear_speed;
	}


	
	

}
