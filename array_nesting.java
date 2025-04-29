package Java;
import java.util.Scanner;

public class array_nesting {
    public static int arrayNesting(int[] nums) {
        int n = nums.length;
        boolean[] visited = new boolean[n];
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) { 
                int count = 0;
                int current = i;
                
                while (!visited[current]) {
                    visited[current] = true;
                    current = nums[current];
                    count++;
                }

                maxLength = Math.max(maxLength, count);
            }
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        sc.close();
        int[] nums = new int[n];
        System.out.println("Enter array elements (space separated):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        int result = arrayNesting(nums);
        System.out.println("Longest set length: " + result);
    }
}
