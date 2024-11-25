public class SubjectArray {
    public static void main (String[] args) {
        // Create an array to store 3 Subject objects
        
        Subject[] subs = new Subject[3];
        subs[0] = new Subject("CCP4134", 'A');
        subs[1] = new Subject("CCP4114", 'B');
        subs[2] = new Subject("CCP6124", 'C');
        
        // Print each Subject object using a loop
        for (int i=0; i < subs.length; i++) {
            System.out.println(subs[i]);
        }
    }
}