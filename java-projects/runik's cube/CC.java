public class CC extends input
{
    public static int[][] GreenCW(final int[][] colors) {
        final int[] pf = new int[62];
        pf[0] = colors[0][0];
        pf[1] = colors[0][1];
        pf[2] = colors[0][2];
        pf[3] = colors[0][3];
        pf[4] = colors[0][4];
        pf[5] = colors[0][5];
        pf[6] = colors[0][6];
        pf[7] = colors[0][7];
        pf[8] = colors[0][8];
        colors[0][2] = pf[0];
        colors[0][5] = pf[1];
        colors[0][8] = pf[2];
        colors[0][1] = pf[3];
        colors[0][4] = pf[4];
        colors[0][7] = pf[5];
        colors[0][0] = pf[6];
        colors[0][3] = pf[7];
        colors[0][6] = pf[8];
        final int[] po = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, colors[1][0], 0, 0, colors[1][3], 0, 0, colors[1][6], 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, colors[3][2], 0, 0, colors[3][5], 0, 0, colors[3][8], 0, colors[4][0], 0, 0, colors[4][3], 0, 0, colors[4][6], 0, 0, 0, colors[5][0], 0, 0, colors[5][3], 0, 0, colors[5][6], 0, 0, 0, 0, 0 };
        colors[1][0] = po[40];
        colors[1][3] = po[43];
        colors[1][6] = po[46];
        colors[5][0] = po[10];
        colors[5][3] = po[13];
        colors[5][6] = po[16];
        colors[3][8] = po[50];
        colors[3][5] = po[53];
        colors[3][2] = po[56];
        colors[4][0] = po[38];
        colors[4][3] = po[35];
        colors[4][5] = po[32];
        System.out.println("GreenClockWise");
        return colors;
    }
    
    public static int[][] GreenCCW(final int[][] colors) {
        final int[] pf = new int[62];
        pf[0] = colors[0][0];
        pf[1] = colors[0][1];
        pf[2] = colors[0][2];
        pf[3] = colors[0][3];
        pf[4] = colors[0][4];
        pf[5] = colors[0][5];
        pf[6] = colors[0][6];
        pf[7] = colors[0][7];
        pf[8] = colors[0][8];
        colors[0][6] = pf[0];
        colors[0][3] = pf[1];
        colors[0][0] = pf[2];
        colors[0][7] = pf[3];
        colors[0][4] = pf[4];
        colors[0][1] = pf[5];
        colors[0][8] = pf[6];
        colors[0][5] = pf[7];
        colors[0][2] = pf[8];
        final int[] po = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, colors[1][0], 0, 0, colors[1][3], 0, 0, colors[1][6], 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, colors[3][2], 0, 0, colors[3][5], 0, 0, colors[3][8], 0, colors[4][0], 0, 0, colors[4][3], 0, 0, colors[4][6], 0, 0, 0, colors[5][0], 0, 0, colors[5][3], 0, 0, colors[5][6], 0, 0, 0, 0, 0 };
        colors[3][8] = po[40];
        colors[3][5] = po[43];
        colors[3][2] = po[46];
        colors[4][0] = po[10];
        colors[4][3] = po[13];
        colors[4][6] = po[16];
        colors[1][0] = po[50];
        colors[1][3] = po[53];
        colors[1][6] = po[56];
        colors[5][0] = po[38];
        colors[5][3] = po[35];
        colors[5][6] = po[32];
        System.out.println("GreenCounterClockWise");
        return colors;
    }
    
    public static int[][] WhiteCW(final int[][] colors) {
        final int[] pf = new int[62];
        pf[0] = colors[1][0];
        pf[1] = colors[1][1];
        pf[2] = colors[1][2];
        pf[3] = colors[1][3];
        pf[4] = colors[1][4];
        pf[5] = colors[1][5];
        pf[6] = colors[1][6];
        pf[7] = colors[1][7];
        pf[8] = colors[1][8];
        colors[1][2] = pf[0];
        colors[1][5] = pf[1];
        colors[1][8] = pf[2];
        colors[1][1] = pf[3];
        colors[1][4] = pf[4];
        colors[1][7] = pf[5];
        colors[1][0] = pf[6];
        colors[1][3] = pf[7];
        colors[1][6] = pf[8];
        final int[] po = { 0, 0, colors[0][2], 0, 0, colors[0][5], 0, 0, colors[0][8], 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, colors[2][0], 0, 0, colors[2][3], 0, 0, colors[2][6], 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, colors[4][6], colors[4][7], colors[4][8], 0, colors[0][2], colors[0][5], colors[0][8], 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        colors[2][0] = po[46];
        colors[2][3] = po[47];
        colors[2][6] = po[48];
        colors[5][2] = po[20];
        colors[5][1] = po[23];
        colors[5][0] = po[26];
        colors[0][8] = po[52];
        colors[0][5] = po[51];
        colors[0][2] = po[50];
        colors[4][6] = po[8];
        colors[4][7] = po[5];
        colors[4][8] = po[2];
        System.out.println("WhiteClockWise");
        return colors;
    }
    
    public static int[][] WhiteCCW(final int[][] colors) {
        final int[] pf = new int[62];
        pf[0] = colors[1][0];
        pf[1] = colors[1][1];
        pf[2] = colors[1][2];
        pf[3] = colors[1][3];
        pf[4] = colors[1][4];
        pf[5] = colors[1][5];
        pf[6] = colors[1][6];
        pf[7] = colors[1][7];
        pf[8] = colors[1][8];
        colors[1][6] = pf[0];
        colors[1][3] = pf[1];
        colors[1][0] = pf[2];
        colors[1][7] = pf[3];
        colors[1][4] = pf[4];
        colors[1][1] = pf[5];
        colors[1][8] = pf[6];
        colors[1][5] = pf[7];
        colors[1][2] = pf[8];
        final int[] po = { 0, 0, colors[0][2], 0, 0, colors[0][5], 0, 0, colors[0][8], 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, colors[2][0], 0, 0, colors[2][3], 0, 0, colors[2][6], 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, colors[4][6], colors[4][7], colors[4][8], 0, colors[0][2], colors[0][5], colors[0][8], 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        colors[0][8] = po[46];
        colors[0][5] = po[47];
        colors[0][2] = po[48];
        colors[4][6] = po[20];
        colors[4][7] = po[23];
        colors[4][8] = po[26];
        colors[2][0] = po[52];
        colors[2][3] = po[51];
        colors[2][6] = po[50];
        colors[5][2] = po[8];
        colors[5][1] = po[5];
        colors[5][0] = po[2];
        System.out.println("WhiteCounterClockWise");
        return colors;
    }
    
    public static int[][] BlueCW(final int[][] colors) {
        final int[] pf = new int[62];
        pf[0] = colors[2][0];
        pf[1] = colors[2][1];
        pf[2] = colors[2][2];
        pf[3] = colors[2][3];
        pf[4] = colors[2][4];
        pf[5] = colors[2][5];
        pf[6] = colors[2][6];
        pf[7] = colors[2][7];
        pf[8] = colors[2][8];
        colors[2][2] = pf[0];
        colors[2][5] = pf[1];
        colors[2][8] = pf[2];
        colors[2][1] = pf[3];
        colors[2][4] = pf[4];
        colors[2][7] = pf[5];
        colors[2][0] = pf[6];
        colors[2][3] = pf[7];
        colors[2][6] = pf[8];
        final int[] po = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, colors[1][2], 0, 0, colors[1][5], 0, 0, colors[1][8], 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, colors[3][0], 0, 0, colors[3][3], 0, 0, colors[3][6], 0, 0, 0, 0, 0, colors[4][2], 0, 0, colors[4][5], 0, 0, colors[4][8], 0, 0, 0, colors[5][2], 0, 0, colors[5][5], 0, 0, colors[5][8], 0, 0, 0 };
        colors[3][0] = po[48];
        colors[3][3] = po[45];
        colors[3][6] = po[42];
        colors[5][8] = po[30];
        colors[5][5] = po[33];
        colors[5][2] = po[36];
        colors[1][8] = po[58];
        colors[1][5] = po[55];
        colors[1][2] = po[52];
        colors[4][8] = po[18];
        colors[4][5] = po[15];
        colors[4][2] = po[12];
        System.out.println("BlueClockWise");
        return colors;
    }
    
    public static int[][] BlueCCW(final int[][] colors) {
        final int[] pf = new int[62];
        pf[0] = colors[2][0];
        pf[1] = colors[2][1];
        pf[2] = colors[2][2];
        pf[3] = colors[2][3];
        pf[4] = colors[2][4];
        pf[5] = colors[2][5];
        pf[6] = colors[2][6];
        pf[7] = colors[2][7];
        pf[8] = colors[2][8];
        colors[2][6] = pf[0];
        colors[2][3] = pf[1];
        colors[2][0] = pf[2];
        colors[2][7] = pf[3];
        colors[2][4] = pf[4];
        colors[2][1] = pf[5];
        colors[2][8] = pf[6];
        colors[2][5] = pf[7];
        colors[2][2] = pf[8];
        final int[] po = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, colors[1][2], 0, 0, colors[1][5], 0, 0, colors[1][8], 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, colors[3][0], 0, 0, colors[3][3], 0, 0, colors[3][6], 0, 0, 0, 0, 0, colors[4][2], 0, 0, colors[4][5], 0, 0, colors[4][8], 0, 0, 0, colors[5][2], 0, 0, colors[5][5], 0, 0, colors[5][8], 0, 0, 0 };
        colors[1][8] = po[48];
        colors[1][5] = po[45];
        colors[1][2] = po[42];
        colors[4][8] = po[30];
        colors[4][5] = po[33];
        colors[4][2] = po[36];
        colors[3][0] = po[58];
        colors[3][3] = po[55];
        colors[3][6] = po[52];
        colors[5][8] = po[18];
        colors[5][5] = po[15];
        colors[5][2] = po[12];
        System.out.println("BlueCounterClockWise");
        return colors;
    }
    
    public static int[][] YellowCW(final int[][] colors) {
        final int[] pf = new int[62];
        pf[0] = colors[3][0];
        pf[1] = colors[3][1];
        pf[2] = colors[3][2];
        pf[3] = colors[3][3];
        pf[4] = colors[3][4];
        pf[5] = colors[3][5];
        pf[6] = colors[3][6];
        pf[7] = colors[3][7];
        pf[8] = colors[3][8];
        colors[3][2] = pf[0];
        colors[3][5] = pf[1];
        colors[3][8] = pf[2];
        colors[3][1] = pf[3];
        colors[3][4] = pf[4];
        colors[3][7] = pf[5];
        colors[3][0] = pf[6];
        colors[3][3] = pf[7];
        colors[3][6] = pf[8];
        final int[] po = { colors[0][0], 0, 0, colors[0][3], 0, 0, colors[0][6], 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, colors[2][2], 0, 0, colors[2][5], 0, 0, colors[2][8], 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, colors[4][0], colors[4][1], colors[4][2], 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, colors[5][6], colors[5][7], colors[5][8], 0, 0, 0 };
        colors[0][0] = po[42];
        colors[0][3] = po[41];
        colors[0][6] = po[40];
        colors[5][6] = po[0];
        colors[5][7] = po[3];
        colors[5][8] = po[6];
        colors[2][8] = po[56];
        colors[2][5] = po[57];
        colors[2][2] = po[58];
        colors[4][2] = po[28];
        colors[4][1] = po[25];
        colors[4][0] = po[22];
        System.out.println("YellowClockWise");
        return colors;
    }
    
    public static int[][] YellowCCW(final int[][] colors) {
        final int[] pf = new int[62];
        pf[0] = colors[3][0];
        pf[1] = colors[3][1];
        pf[2] = colors[3][2];
        pf[3] = colors[3][3];
        pf[4] = colors[3][4];
        pf[5] = colors[3][5];
        pf[6] = colors[3][6];
        pf[7] = colors[3][7];
        pf[8] = colors[3][8];
        colors[3][6] = pf[0];
        colors[3][3] = pf[1];
        colors[3][0] = pf[2];
        colors[3][7] = pf[3];
        colors[3][4] = pf[4];
        colors[3][1] = pf[5];
        colors[3][8] = pf[6];
        colors[3][5] = pf[7];
        colors[3][2] = pf[8];
        final int[] po = { colors[0][0], 0, 0, colors[0][3], 0, 0, colors[0][6], 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, colors[2][2], 0, 0, colors[2][5], 0, 0, colors[2][8], 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, colors[4][0], colors[4][1], colors[4][2], 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, colors[5][6], colors[5][7], colors[5][8], 0, 0, 0 };
        colors[2][8] = po[42];
        colors[2][5] = po[41];
        colors[2][2] = po[40];
        colors[4][2] = po[0];
        colors[4][1] = po[3];
        colors[4][0] = po[6];
        colors[0][0] = po[56];
        colors[0][3] = po[57];
        colors[0][6] = po[58];
        colors[5][6] = po[28];
        colors[5][7] = po[25];
        colors[5][8] = po[22];
        System.out.println("YellowCounterClockWise");
        return colors;
    }
    
    public static int[][] OrangeCW(final int[][] colors) {
        final int[] pf = new int[62];
        pf[0] = colors[4][0];
        pf[1] = colors[4][1];
        pf[2] = colors[4][2];
        pf[3] = colors[4][3];
        pf[4] = colors[4][4];
        pf[5] = colors[4][5];
        pf[6] = colors[4][6];
        pf[7] = colors[4][7];
        pf[8] = colors[4][8];
        colors[4][2] = pf[0];
        colors[4][5] = pf[1];
        colors[4][8] = pf[2];
        colors[4][1] = pf[3];
        colors[4][4] = pf[4];
        colors[4][7] = pf[5];
        colors[4][0] = pf[6];
        colors[4][3] = pf[7];
        colors[4][6] = pf[8];
        final int[] po = { colors[0][0], colors[0][1], colors[0][2], 0, 0, 0, 0, 0, 0, 0, colors[1][0], colors[1][1], colors[1][2], 0, 0, 0, 0, 0, 0, 0, colors[2][0], colors[2][1], colors[2][2], 0, 0, 0, 0, 0, 0, 0, colors[3][0], colors[3][1], colors[3][2], 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        colors[2][2] = po[32];
        colors[2][1] = po[31];
        colors[2][0] = po[30];
        colors[1][2] = po[22];
        colors[1][1] = po[21];
        colors[1][0] = po[20];
        colors[0][2] = po[12];
        colors[0][1] = po[11];
        colors[0][0] = po[10];
        colors[3][2] = po[2];
        colors[3][1] = po[1];
        colors[3][0] = po[0];
        System.out.println("OrangeClockWise");
        return colors;
    }
    
    public static int[][] OrangeCCW(final int[][] colors) {
        final int[] pf = new int[62];
        pf[0] = colors[4][0];
        pf[1] = colors[4][1];
        pf[2] = colors[4][2];
        pf[3] = colors[4][3];
        pf[4] = colors[4][4];
        pf[5] = colors[4][5];
        pf[6] = colors[4][6];
        pf[7] = colors[4][7];
        pf[8] = colors[4][8];
        colors[4][6] = pf[0];
        colors[4][3] = pf[1];
        colors[4][0] = pf[2];
        colors[4][7] = pf[3];
        colors[4][4] = pf[4];
        colors[4][1] = pf[5];
        colors[4][8] = pf[6];
        colors[4][5] = pf[7];
        colors[4][2] = pf[8];
        final int[] po = { colors[0][0], colors[0][1], colors[0][2], 0, 0, 0, 0, 0, 0, 0, colors[1][0], colors[1][1], colors[1][2], 0, 0, 0, 0, 0, 0, 0, colors[2][0], colors[2][1], colors[2][2], 0, 0, 0, 0, 0, 0, 0, colors[3][0], colors[3][1], colors[3][2], 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        colors[0][2] = po[32];
        colors[0][1] = po[31];
        colors[0][0] = po[30];
        colors[3][2] = po[22];
        colors[3][1] = po[21];
        colors[3][0] = po[20];
        colors[2][2] = po[12];
        colors[2][1] = po[11];
        colors[2][0] = po[10];
        colors[1][2] = po[2];
        colors[1][1] = po[1];
        colors[1][0] = po[0];
        System.out.println("OrangeCounerClockWise");
        return colors;
    }
    
    public static int[][] RedCW(final int[][] colors) {
        final int[] pf = new int[62];
        pf[0] = colors[5][0];
        pf[1] = colors[5][1];
        pf[2] = colors[5][2];
        pf[3] = colors[5][3];
        pf[4] = colors[5][4];
        pf[5] = colors[5][5];
        pf[6] = colors[5][6];
        pf[7] = colors[5][7];
        pf[8] = colors[5][8];
        colors[5][2] = pf[0];
        colors[5][5] = pf[1];
        colors[5][8] = pf[2];
        colors[5][1] = pf[3];
        colors[5][4] = pf[4];
        colors[5][7] = pf[5];
        colors[5][0] = pf[6];
        colors[5][3] = pf[7];
        colors[5][6] = pf[8];
        final int[] po = { 0, 0, 0, 0, 0, 0, colors[0][6], colors[0][7], colors[0][8], 0, 0, 0, 0, 0, 0, 0, colors[1][6], colors[1][7], colors[1][8], 0, 0, 0, 0, 0, 0, 0, colors[2][6], colors[2][7], colors[2][8], 0, 0, 0, 0, 0, 0, 0, colors[3][6], colors[3][7], colors[3][8], 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        colors[2][6] = po[16];
        colors[2][7] = po[17];
        colors[2][8] = po[18];
        colors[3][6] = po[26];
        colors[3][7] = po[27];
        colors[3][8] = po[28];
        colors[0][6] = po[36];
        colors[0][7] = po[37];
        colors[0][8] = po[38];
        colors[1][6] = po[6];
        colors[1][7] = po[7];
        colors[1][8] = po[8];
        System.out.println("RedClockWise");
        return colors;
    }
    
    public static int[][] RedCCW(final int[][] colors) {
        final int[] pf = new int[62];
        pf[0] = colors[5][0];
        pf[1] = colors[5][1];
        pf[2] = colors[5][2];
        pf[3] = colors[5][3];
        pf[4] = colors[5][4];
        pf[5] = colors[5][5];
        pf[6] = colors[5][6];
        pf[7] = colors[5][7];
        pf[8] = colors[5][8];
        colors[5][6] = pf[0];
        colors[5][3] = pf[1];
        colors[5][0] = pf[2];
        colors[5][7] = pf[3];
        colors[5][4] = pf[4];
        colors[5][1] = pf[5];
        colors[5][8] = pf[6];
        colors[5][5] = pf[7];
        colors[5][2] = pf[8];
        final int[] po = { 0, 0, 0, 0, 0, 0, colors[0][6], colors[0][7], colors[0][8], 0, 0, 0, 0, 0, 0, 0, colors[1][6], colors[1][7], colors[1][8], 0, 0, 0, 0, 0, 0, 0, colors[2][6], colors[2][7], colors[2][8], 0, 0, 0, 0, 0, 0, 0, colors[3][6], colors[3][7], colors[3][8], 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        colors[0][6] = po[16];
        colors[0][7] = po[17];
        colors[0][8] = po[18];
        colors[1][6] = po[26];
        colors[1][7] = po[27];
        colors[1][8] = po[28];
        colors[2][6] = po[36];
        colors[2][7] = po[37];
        colors[2][8] = po[38];
        colors[3][6] = po[6];
        colors[3][7] = po[7];
        colors[3][8] = po[8];
        System.out.println("RedCounterClockWise");
        return colors;
    }
}