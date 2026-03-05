package com.gmail.inbox;

public class NestedIf1 {
	public static void main(String[] args) {
		
		String signal="Green";
		String PedestrianSignal="WALK";
		
		if(signal.equals("Green")) {
			if(PedestrianSignal.equals("WALK")){
				System.out.println("You can cross the road ");
				
			}
			else {
				System.out.println("Wait untill some time ");
			}
					
		}
		else {
			System.out.println("Wait for red signal");
		}
	}

}
