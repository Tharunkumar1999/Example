package Abstraction;

public interface InterfaceRealWorld {
	
	void gearUp(int a);
	void speedUp(double b);
	void applybreak(double a);
}

class car implements InterfaceRealWorld{
	
	double speed;
	int gear;
	
	@Override
	public void gearUp(int changegear) {
		gear=changegear;
		
	}

	@Override
	public void speedUp(double increasespeed) {
		speed=increasespeed;
		
	}

	@Override
	public void applybreak(double a) {
		speed=a;
		
	}
	public void printStates() {
        System.out.println("speed: " + speed
            + " gear: " + gear);
    }
}

class bike implements InterfaceRealWorld{

	double speed;
	int gear;
	
	@Override
	public void gearUp(int changegear) {
		gear=changegear;
		
	}

	@Override
	public void speedUp(double increasespeed) {
		speed=increasespeed;
		
	}

	@Override
	public void applybreak(double a) {
		speed=a;
		
	}
	
	public void printStates() {
        System.out.println("speed: " + speed
            + " gear: " + gear);
    }
}

class demo{
	public static void main(String[] args) {
		bike b=new bike();
		car c=new car();
	
		b.gearUp(5);
		b.speedUp(498.78);
		b.applybreak(100.9);
		b.printStates();
	}
}
