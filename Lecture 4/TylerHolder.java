public class TylerHolder
{
    // Global Variables:
    // (Field, instance, many other words for the same thing)
    private String bucket[];
    private int size;
    public TylerHolder() {
        bucket = new String[10]; // I forgot to add this at first, do not forget again
        size = 0;
    }
    
    public void addToBucket_I_Added_This_Wrong(String userInput) {
        if(size+1 > bucket.length) {
            String bucketNew[];
            int newSize = size*2;
            bucketNew = new String[newSize];
            for(int i=0; i<size; i++) {
                bucketNew[i] = bucket[i];
            }
            bucket = new String[newSize];
            for(int i=0; i<size; i++) {
                bucket[i] = bucketNew[i];
            }
        }
        bucket[size] = userInput;
        size++;
    }    
    
    public int size() {
        return size;
    }
    
    public String getPos(int userInput) {
        int selection = userInput - 1;
        return bucket[selection];
    }
    
    public void clear() {
        bucket = new String[10];
        size = 0;
    }
    
    public void printer() {
        for(int i=0; i<(size); i++) {
            System.out.println(bucket[i]);
        }
    }
    
}