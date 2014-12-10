public class Tester{
    public static void main(String[] args){
        Hash<Integer, Integer> hashTable = new Hash<Integer, Integer>();
        hashTable.put(10, 100);
        hashTable.put(9, 81);
        System.out.println(hashTable.get(9));
    }
}