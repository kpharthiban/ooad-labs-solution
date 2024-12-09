import java.util.*;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int square_side = 1;

        do {
            System.out.print("\nEnter an integer between 1 and 20: ");
            square_side = input.nextInt();

            if (square_side <= 0 || square_side >= 21){
                System.out.println("Number not between 1 and 20. Exiting.");
                break;
            }

            else {
                // For calculating side units at the left of the square
                for (int i = 1; i <= square_side; i++) {
                    int y = 1;
                    // For the top side of the square
                    if (i == 1){
                        do {
                            System.out.print("* ");
                            y++;
                        } while (y <= square_side);
                        continue;
                    }
                    // For the bottom side of the square
                    else if (i == square_side){
                        System.out.println();
                        do {
                            System.out.print("* ");
                            y++;
                        } while (y <= square_side);
                        continue;
                    }
                    // For the left and right sides of the sqaure
                    else{
                        for (int j = 1; j <= square_side; j++){
                            // Left side
                            if (j == 1){
                                System.out.print("\n* ");
                            }
                            // Right side
                            else if (j == square_side) {
                                System.out.print("* ");
                            }
                            // Gap between left and right sides
                            else {
                                System.out.print("  ");
                            }
                        }
                    }
                }
            }
            
        } while (square_side > 0 && square_side < 21);
    }
}
