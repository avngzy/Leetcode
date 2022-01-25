class MovingAverage {
    ArrayList<Integer> window;
    int size;
    int windowSize = 0;

    public MovingAverage(int size) {
        window = new ArrayList<Integer>();;
        this.size = size;
    }
    
    public double next(int val) {
        if(size == 1){
            return val;
        }
        
        else if(windowSize < size){
            window.add(val);
            windowSize++;
            return average(window);
        } else if(windowSize == size){
            int i = 0;
            for(i = 0; i < windowSize - 1; i++){
                if(i == windowSize - 2){
                    break;
                }
                window.set(i, window.get(i+1));
                
            }
            window.set(i, window.get(i+1));
            window.set(windowSize-1, val);
            return average(window);
        }
        return -1.0;
    }
    
    public double average(ArrayList<Integer> arr){
        double sum = 0;
        for(int i = 0; i < windowSize; i++){
            sum += arr.get(i);
        }
        return sum / windowSize;
    }
}