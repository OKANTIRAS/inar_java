package week_12;

public class Question_12_10 {
    public static void main(String[] args) {
        int arraySize = Integer.MAX_VALUE;
        try{
            int [] array = new int[arraySize];
            for (int i = 0; i < arraySize; i++) {
                System.out.println("Inar Academy");
            }
        }catch (OutOfMemoryError ex){
            System.out.println("OutOfMemoryException occurs ! :" +
                    "Java heap space");
        }
    }
}
