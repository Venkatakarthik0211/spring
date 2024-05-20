import java.util.Scanner;
class input extends Main
{
    public int[][] getColors() {
        final int[][] input = new int[6][9];
        int counter_0 = 0;
        int counter_2 = 0;
        final Scanner in = new Scanner(System.in);
        System.out.println("Enter the colors for the green side\n1 = GREEN\n2 = WHITE\n3 = BLUE\n4 = YELLOW\n5 = ORANGE\n6 = RED\nThe orange side should be on top\nThe red side is on the bottom\nThe white side to the right\nAnd the yellow side to the left");
        while (counter_0 <= 8) {
            counter_2 = 0;
            input[0][counter_0] = Integer.parseInt(in.nextLine());
            ++counter_0;
        }
        System.out.println("Enter the colors for the white side\n1 = GREEN\n2 = WHITE\n3 = BLUE\n4 = YELLOW\n5 = ORANGE\n6 = RED\nThe orange side should be on top\nThe red side should be on the bottom\nThe blue side to the right\nAnd the green side to the left");
        for (counter_0 = 0; counter_0 <= 8; ++counter_0) {
            counter_2 = 0;
            input[1][counter_0] = Integer.parseInt(in.nextLine());
        }
        System.out.println("Enter the colors for the blue side\n1 = GREEN\n2 = WHITE\n3 = BLUE\n4 = YELLOW\n5 = ORANGE\n6 = RED\nOrange on top\nred on bottom\nyellow to the right\nAnd Red on bottom");
        for (counter_0 = 0; counter_0 <= 8; ++counter_0) {
            counter_2 = 0;
            input[2][counter_0] = Integer.parseInt(in.nextLine());
        }
        System.out.println("Enter the colors for the yellow side\n1 = GREEN\n2 = WHITE\n3 = BLUE\n4 = YELLOW\n5 = ORANGE\n6 = RED\nOrange on top\nred on bottom\ngreen to right\nblue to left");
        for (counter_0 = 0; counter_0 <= 8; ++counter_0) {
            counter_2 = 0;
            input[3][counter_0] = Integer.parseInt(in.nextLine());
        }
        System.out.println("Enter the colors for the orange side\n1 = GREEN\n2 = WHITE\n3 = BLUE\n4 = YELLOW\n5 = ORANGE\n6 = RED");
        for (counter_0 = 0; counter_0 <= 8; ++counter_0) {
            counter_2 = 0;
            input[4][counter_0] = Integer.parseInt(in.nextLine());
        }
        System.out.println("Enter the colors for the red side\n1 = GREEN\n2 = WHITE\n3 = BLUE\n4 = YELLOW\n5 = ORANGE\n6 = RED");
        for (counter_0 = 0; counter_0 <= 8; ++counter_0) {
            counter_2 = 0;
            input[5][counter_0] = Integer.parseInt(in.nextLine());
        }
        return input;
    }
}