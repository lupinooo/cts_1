package net.ikmac.blog.loadimplementors.animals;

public class Human implements Runner {
   private int age;
   
   public Human() {
	   
   }

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "I am human";
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

@Override
public int getSpeed() {
	// TODO Auto-generated method stub
	if(this.age < 50) {
		return 10;
	}
	else {
		return 7;
	}
}


   
   
}
