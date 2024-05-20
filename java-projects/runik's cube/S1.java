public class S1 extends Process
{
    public int[][] whiteSide(int[][] Cube_colors) {
        Cube_colors = this.whiteCross(Cube_colors);
        Cube_colors = this.whiteCorner(Cube_colors);
        return Cube_colors;
    }
    
    public int[][] whiteCorner(int[][] Cube_colors) {
        Cube_colors = this.whiteFirstCorner(Cube_colors);
        System.out.println("FIRST DONE");
        Cube_colors = this.whiteSecondCorner(Cube_colors);
        System.out.println("SECOND DONE");
        Cube_colors = this.whiteThirdCorner(Cube_colors);
        System.out.println("THIRD DONE");
        Cube_colors = this.whiteFourthCorner(Cube_colors);
        System.out.println("FOURTH DONE");
        return Cube_colors;
    }
}