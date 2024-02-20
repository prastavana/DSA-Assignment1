import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SecretSharingProcess {

    public static List<Integer> secretPossessors(int n, int[][] intervals, int initialPerson) {
        Set<Integer> knownIndividuals = new HashSet<>();
        knownIndividuals.add(initialPerson);

        // Iterate through each interval
        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            // Sharingsecret with individuals within the current interval
            for (int i = start; i <= end; i++) {
                if (i < n) { // Check if ID is withinvalid range
                    knownIndividuals.add(i);
                }
                
            }
        }

        // Convert set to list and sort it
        List<Integer> result = new ArrayList<>(knownIndividuals);
        result.sort(null);
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] intervals = {{0, 2}, {1, 3}, {2, 4}};
        int initialPerson = 0;

        List<Integer> result = secretPossessors(n, intervals, initialPerson);
        System.out.println("Set of individuals who know secret is "+result);  
    }
}
