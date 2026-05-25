class DynamicArray {

    ArrayList<Integer> dynamicArray;
    int currentSize;
    int currentCapacity;

    public DynamicArray(int capacity) {
            dynamicArray = new ArrayList<Integer>();
            for(int i = 0 ; i < capacity; i++) {
                dynamicArray.add(-1);
            }
            currentSize = 0;
            currentCapacity = capacity;
    }

    public int get(int i) {
        return dynamicArray.get(i);
    }

    public void set(int i, int n) {
        dynamicArray.set(i, n);
    }

    public void pushback(int n) {
        //System.out.println("curr size before"+ currentSize);
        if(currentSize == currentCapacity) {
            resize();
        }
        //System.out.println("curr size "+ currentSize);
        dynamicArray.set(currentSize, n);
        currentSize++;
    }

    public int popback() {
        int poppedElement = dynamicArray.get(currentSize-1);
        dynamicArray.set(currentSize-1, -1);
        currentSize--;

        return poppedElement;
    }

    private void resize() {
        for(int i = currentCapacity; i < (2*currentCapacity); i++ ) {
            dynamicArray.add(-1);
        }
        currentCapacity = (2*currentCapacity);

    }

    public int getSize() {
        return currentSize;

    }

    public int getCapacity() {
        return currentCapacity;

    }
}
