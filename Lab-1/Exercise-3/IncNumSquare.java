import java.util.*;

public class IncNumSquare {
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
                    double y = 1;
                    int total_top = 1;
                    int total_bottom = square_side;
                    for (int x = 0; x < square_side; x++){
                        total_top += square_side;
                        total_bottom += square_side;
                    }

                    // For the top side of the square
                    if (i == 1){
                        do {
                            System.out.format("%3.0f", y);
                            y += square_side;
                        } while (y < total_top);
                        continue;
                    }
                    // For the bottom side of the square
                    else if (i == square_side){
                        System.out.println();
                        y = square_side;
                        do {
                            System.out.format("%3.0f", y);
                            y += square_side;
                        } while (y < total_bottom);
                        continue;
                    }
                    // For each rows of the square (except beginning and ending)
                    else{
                        System.out.println();
                        int total_row = i;
                        for (int x = 0; x < square_side; x++){
                            total_row += square_side;
                        }
                        y = i;
                        do {
                            System.out.format("%3.0f", y);
                            y += square_side;
                        } while (y < total_row);
                        continue;
                    }
                }
            }
            
        } while (square_side > 0 && square_side < 21);
    }
}
