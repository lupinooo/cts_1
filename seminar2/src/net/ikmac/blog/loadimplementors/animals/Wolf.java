package net.ikmac.blog.loadimplementors.animals;

public class Wolf implements Runner {
   private final int wolf_speed=30;
   
   public Wolf() {
   }

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "This is a wolf";
}

@Override
public int getSpeed() {
	// TODO Auto-generated method stub
	return wolf_speed;
}
  
}
