public class Lasagna {
        
    public int expectedMinutesInOven() {
        return 40;
    }
    
    public int remainingMinutesInOven(int timeOven) {
        return this.expectedMinutesInOven() - timeOven;
    }
    
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }
    
    public int totalTimeInMinutes(int layers, int timeOven) {
        return this.preparationTimeInMinutes(layers) + timeOven;
    }
}
    
    
