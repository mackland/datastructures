public class Hashmap{
    private int[] buckets;
    
    public Hashmap(){
        buckets = new int[16];   
    }

    private int hashFunction(String key){
        int hashCode = 0;
        for(int i = 0; i < key.length(); i++){
            char c = key.charAt(i);
            hashCode += 31*(key.length() - i)*c;
        }

        return hashCode % buckets.length;
    }

    public void add(String s){
        int index = hashFunction(s);

        buckets[index] = 1;
    }

    public void remove(String s){
        int index = hashFunction(s);

        buckets[index] = 0;
    }

    public boolean has(String s){
        int index = hashFunction(s);

        if(buckets[index] != 0){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isEmpty(){
        for(int i = 0; i < buckets.length; i++){
            if(buckets[i] != 0) return false;
        }

        return true;
    }
    
    public static void main(String[] args){
        Hashmap map = new Hashmap();
        map.add("Hej");
        map.add("Napoleon");
        System.out.println(map.has("Napoleon"));
        map.remove("Napoleon");
        System.out.println(map.has("Napoleon"));
    }
}
