public class SmallestNumber {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 2, 7};
        int smallest = numbers[0];
        
        for (int num : numbers) {
            if (num < smallest) {
                smallest = num;
            }
        }
        
        System.out.println("Smallest number: " + smallest);
    }
}
