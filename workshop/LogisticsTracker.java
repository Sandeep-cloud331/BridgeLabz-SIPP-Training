abstract class CheckPoint{
	String checkpointId;
	String locationName;
	double distanceFromLast;
	double expectedDuration;
	double actualDuration;
	
	abstract boolean isCritical();
	abstract String getType();
	abstract double calculatePenalty();
	
	boolean isDelayed(){
		return expectedDuration < actualDuration;
	}
	
}

class DeliveryCheckpoint extends CheckPoint{
	
	@Override
	boolean isCritical(){
		return true;
	}
	
	@Override
    String getType() {
        return "Delivery";
    }
	
	@Override
	double calculatePenalty(){
		if(isDelayed()){
			return (actualDuration - expectedDuration) * 2;
		}
		return 0;
		
	}
	
	
}
class FuelCheckpoint extends CheckPoint{
	@Override
	boolean isCritical(){
		return true;
	}
	
	@Override
    String getType() {
        return "Fuel";
    }
	
	@Override
	double calculatePenalty(){
		if(isDelayed()){
			return 10;
		}
		return 0;
		
	}
}

class RestCheckpoint extends CheckPoint{
	@Override
	boolean isCritical(){
		return false;
	}
	
	@Override
    String getType() {
        return "Rest";
    }
	
	@Override
	double calculatePenalty(){
		if(isDelayed()){
			return (actualDuration - expectedDuration) * 0.5;
		}
		return 0;
		
	}
}

class Node<T extends CheckPoint>{
	T data;
	Node<T> next;
	
	Node(T checkpoint){
		data = checkpoint;
	}
	
}

class RouteLinkedList<T extends CheckPoint>{
	Node<T> head = null;
	Node<T> tail = null;
	double totalDistance;
	double totalPenalty;
	void addCheckpoint(T checkpoint){
		Node n = new Node(checkpoint);
		totalDistance += checkpoint.distanceFromLast;
		totalPenalty += checkpoint.calculatePenalty();
		if(head == null){
			head =tail = n;
		}
		else{
			tail.next = n;
			tail=tail.next;
		}
	}
	
	boolean removeCheckpoint(String checkpointId){
		Node temp = head;
		if(temp.data.checkpointId.equals(checkpointId) ){
			head = head.next;
		}
		while(temp.next !=null){
			if(temp.next.data.checkpointId.equals(checkpointId)){
				temp.next = temp.next.next;
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	T findCheckpoint(String checkpointId){
		Node<T> temp = head;
		while(temp != null){
			if(temp.data.checkpointId.equals(checkpointId)){
				return temp.data;
			}
			temp = temp.next;
		}
		return null;
	}
	double computeTotalDistance(){
		return totalDistance;
	}
	double computeTotalPenalty(){
		return totalPenalty;
	}
	void printRoute(){
		Node temp = head;
		while(temp !=null){
			System.out.print(temp.data.locationName +"->");
			temp=temp.next;
		}
		System.out.println("");
		
	}
}

class Driver {
    String driverId;
    String name;
    RouteLinkedList<CheckPoint> routeHistory;

    Driver(String driverId, String name) {
        this.driverId = driverId;
        this.name = name;
        this.routeHistory = new RouteLinkedList<>();
    }

    double getRouteScore() {
        return routeHistory.computeTotalDistance() - routeHistory.computeTotalPenalty();
    }

    
    boolean checkCriticalRoute() {
        boolean hasDelivery = false;
        boolean hasFuel = false;

        Node<CheckPoint> temp = routeHistory.head;
        while (temp != null) {
            if (temp.data.getType().equals("Delivery")) {
                hasDelivery = true;
            }
            if (temp.data.getType().equals("Fuel")) {
                hasFuel = true;
            }
            temp = temp.next;
        }
        return hasDelivery && hasFuel;
    }

    void printSummary() {
        System.out.println("Driver: " + driverId + " – " + name);
        System.out.println("Route Summary:");
        routeHistory.printRoute();

        double totalDistance = routeHistory.computeTotalDistance();
        double totalPenalty = routeHistory.computeTotalPenalty();
        double routeScore = getRouteScore();

        System.out.println("Total Distance: " + totalDistance + " km");
        System.out.println("Total Penalty: " + totalPenalty);
        System.out.println("Route Score: " + routeScore);

        System.out.println("Critical Route Check: " +
            (checkCriticalRoute() ? "All required checkpoints present" : "Missing critical checkpoints"));
    }
}

class LogisticsTracker {
    public static void main(String[] args) {
        Driver driver = new Driver("D1204", "Kavita Nair");

       
        DeliveryCheckpoint c1 = new DeliveryCheckpoint();
        c1.checkpointId = "C001";
        c1.locationName = "Warehouse A";
        c1.distanceFromLast = 50.0;
        c1.expectedDuration = 30.0;
        c1.actualDuration = 40.0;

        FuelCheckpoint c2 = new FuelCheckpoint();
        c2.checkpointId = "C002";
        c2.locationName = "Pump 12";
        c2.distanceFromLast = 30.0;
        c2.expectedDuration = 10.0;
        c2.actualDuration = 10.0;

        RestCheckpoint c3 = new RestCheckpoint();
        c3.checkpointId = "C003";
        c3.locationName = "Motel X";
        c3.distanceFromLast = 20.0;
        c3.expectedDuration = 30.0;
        c3.actualDuration = 35.0;

        DeliveryCheckpoint c4 = new DeliveryCheckpoint();
        c4.checkpointId = "C004";
        c4.locationName = "Client Hub";
        c4.distanceFromLast = 20.0;
        c4.expectedDuration = 45.0;
        c4.actualDuration = 60.0;

        driver.routeHistory.addCheckpoint(c1);
        driver.routeHistory.addCheckpoint(c2);
        driver.routeHistory.addCheckpoint(c3);
        driver.routeHistory.addCheckpoint(c4);

        driver.printSummary();
    }
}


