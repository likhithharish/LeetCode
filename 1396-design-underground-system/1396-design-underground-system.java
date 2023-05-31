class UndergroundSystem {
    public HashMap<Integer, Pair<String, Integer>> travelData = new HashMap<>();
    public HashMap<String, Pair<Double, Double>> routeData = new HashMap<>();

    public UndergroundSystem() {
        
    }
    
    public void checkIn(int id, String stationName, int t) {
        travelData.put(id, new Pair<>(stationName, t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        Pair<String, Integer> checkIn = travelData.get(id);
        String route = checkIn.getKey() +"->" + stationName;
        
        if( routeData.containsKey(route) ){
            double tripTime = (double) t-checkIn.getValue();
            Pair<Double, Double> prevTrips = routeData.get(route);
            tripTime += prevTrips.getKey();
            double trips = prevTrips.getValue() + 1.0;
            routeData.put(route, new Pair<>(tripTime,trips));
        }else{
            routeData.put(route, new Pair<>((double) (t-checkIn.getValue()), 1.0));
        }
        
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String key = startStation +"->" + endStation;
        Pair<Double, Double> result = routeData.get(key);
        
        return result.getKey() / result.getValue();
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */