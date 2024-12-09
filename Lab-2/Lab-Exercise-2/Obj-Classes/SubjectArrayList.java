import java.util.ArrayList;

public class SubjectArrayList {
    public static void main (String[] args) {
        // Create an ArrayList to store Subject objects
        
        ArrayList<Subject> subs = new ArrayList<>();
        
        // Add subject objects to the ArrayList
        subs.add(new Subject("CCP4134", 'A'));
        subs.add(new Subject("CCP4114", 'B'));
        subs.add(new Subject("CCP6124", 'C'));
        
        for (Subject sub : subs) {
            System.out.println(sub);
        }
        
        // Remove a specific Subject by Code
        for (int i = 0; i < subs.size(); i++) {
            if (subs.get(i).getCode().equals("CCP6124")) {
                subs.remove(i);
                break;
            }
        }
        
        System.out.println("\nAfter removing CCP6124");
        for (Subject sub : subs) {
            System.out.println(sub);
        }
    }
}