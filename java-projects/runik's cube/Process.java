class Process extends CC
{
    public int[][] whiteFirstCorner(int[][] Cube_colors) {
        if (Cube_colors[0][0] == 2 && Cube_colors[4][0] == 5 && Cube_colors[3][2] == 1) {
            Cube_colors = CC.GreenCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.GreenCW(Cube_colors);
        }
        else if (Cube_colors[0][2] == 2 && Cube_colors[1][0] == 5 && Cube_colors[4][6] == 1) {
            Cube_colors = CC.GreenCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.GreenCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.GreenCCW(Cube_colors);
            Cube_colors = CC.GreenCW(Cube_colors);
        }
        else if (Cube_colors[0][6] == 2 && Cube_colors[3][8] == 5 && Cube_colors[5][6] == 1) {
            Cube_colors = CC.WhiteCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.RedCCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.RedCW(Cube_colors);
            Cube_colors = CC.WhiteCW(Cube_colors);
        }
        else if (Cube_colors[0][8] == 2 && Cube_colors[5][0] == 5 && Cube_colors[1][6] == 1) {
            Cube_colors = CC.RedCCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.RedCW(Cube_colors);
            Cube_colors = CC.WhiteCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.RedCCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.RedCW(Cube_colors);
            Cube_colors = CC.WhiteCW(Cube_colors);
        }
        else if (Cube_colors[1][2] == 2 && Cube_colors[2][0] == 5 && Cube_colors[4][8] == 1) {
            Cube_colors = CC.OrangeCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.OrangeCW(Cube_colors);
            Cube_colors = CC.GreenCCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.GreenCW(Cube_colors);
        }
        else if (Cube_colors[1][6] == 2 && Cube_colors[0][8] == 5 && Cube_colors[5][0] == 1) {
            Cube_colors = CC.RedCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.RedCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.GreenCCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.GreenCW(Cube_colors);
        }
        else if (Cube_colors[1][8] == 2 && Cube_colors[5][2] == 5 && Cube_colors[2][6] == 1) {
            Cube_colors = CC.BlueCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.BlueCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.GreenCCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.GreenCW(Cube_colors);
        }
        else if (Cube_colors[1][8] == 2 && Cube_colors[5][2] == 5 && Cube_colors[2][6] == 1) {
            Cube_colors = CC.OrangeCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.OrangeCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.GreenCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.GreenCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.GreenCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.GreenCW(Cube_colors);
        }
        else if (Cube_colors[2][2] == 2 && Cube_colors[3][0] == 5 && Cube_colors[4][2] == 1) {
            Cube_colors = CC.GreenCCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.GreenCW(Cube_colors);
        }
        else if (Cube_colors[2][6] == 2 && Cube_colors[1][8] == 5 && Cube_colors[5][2] == 1) {
            Cube_colors = CC.BlueCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.BlueCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.GreenCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.GreenCW(Cube_colors);
        }
        else if (Cube_colors[2][8] == 2 && Cube_colors[5][8] == 5 && Cube_colors[3][6] == 1) {
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.GreenCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.GreenCW(Cube_colors);
        }
        else if (Cube_colors[3][0] == 2 && Cube_colors[4][2] == 5 && Cube_colors[2][2] == 1) {
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.GreenCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.GreenCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.GreenCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.GreenCW(Cube_colors);
        }
        else if (Cube_colors[3][2] == 2 && Cube_colors[0][0] == 5 && Cube_colors[4][0] == 1) {
            Cube_colors = CC.GreenCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.GreenCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.GreenCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.GreenCW(Cube_colors);
        }
        else if (Cube_colors[3][6] == 2 && Cube_colors[2][8] == 5 && Cube_colors[5][8] == 1) {
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.GreenCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.GreenCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.GreenCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.GreenCW(Cube_colors);
        }
        else if (Cube_colors[3][8] == 2 && Cube_colors[5][6] == 5 && Cube_colors[0][6] == 1) {
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.GreenCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.GreenCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.GreenCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.GreenCW(Cube_colors);
        }
        else if (Cube_colors[4][0] == 2 && Cube_colors[3][2] == 5 && Cube_colors[0][0] == 1) {
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.GreenCCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.GreenCW(Cube_colors);
        }
        else if (Cube_colors[4][2] == 2 && Cube_colors[2][2] == 5 && Cube_colors[3][0] == 1) {
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.GreenCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.GreenCW(Cube_colors);
        }
        else if (Cube_colors[4][6] == 2 && Cube_colors[0][2] == 5 && Cube_colors[1][0] == 1) {
            Cube_colors = CC.GreenCCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.GreenCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.GreenCCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.GreenCW(Cube_colors);
        }
        else if (Cube_colors[4][8] == 2 && Cube_colors[1][2] == 5 && Cube_colors[2][0] == 1) {
            Cube_colors = CC.OrangeCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.OrangeCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.GreenCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.GreenCW(Cube_colors);
        }
        else if (Cube_colors[5][0] == 2 && Cube_colors[1][6] == 5 && Cube_colors[0][8] == 1) {
            Cube_colors = CC.RedCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.RedCW(Cube_colors);
            Cube_colors = CC.GreenCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.GreenCW(Cube_colors);
        }
        else if (Cube_colors[5][2] == 2 && Cube_colors[2][6] == 5 && Cube_colors[1][8] == 1) {
            Cube_colors = CC.BlueCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.BlueCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.GreenCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.GreenCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.GreenCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.GreenCW(Cube_colors);
        }
        else if (Cube_colors[5][6] == 2 && Cube_colors[0][6] == 5 && Cube_colors[3][8] == 1) {
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.GreenCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.GreenCW(Cube_colors);
        }
        else if (Cube_colors[5][8] == 2 && Cube_colors[3][6] == 5 && Cube_colors[2][8] == 1) {
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.GreenCCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.GreenCW(Cube_colors);
        }
        return Cube_colors;
    }
    
    public int[][] whiteSecondCorner(int[][] Cube_colors) {
        if (Cube_colors[0][0] == 2 && Cube_colors[4][0] == 1 && Cube_colors[3][2] == 6) {
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.RedCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.RedCW(Cube_colors);
        }
        else if (Cube_colors[0][6] == 2 && Cube_colors[3][8] == 1 && Cube_colors[5][6] == 6) {
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.RedCCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.RedCW(Cube_colors);
        }
        else if (Cube_colors[0][8] == 2 && Cube_colors[5][0] == 1 && Cube_colors[1][6] == 6) {
            Cube_colors = CC.RedCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.RedCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.RedCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.RedCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.RedCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.RedCW(Cube_colors);
        }
        else if (Cube_colors[1][2] == 2 && Cube_colors[2][0] == 1 && Cube_colors[4][8] == 6) {
            Cube_colors = CC.OrangeCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.OrangeCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.RedCCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.RedCW(Cube_colors);
        }
        else if (Cube_colors[1][6] != 2 || Cube_colors[0][8] != 1 || Cube_colors[5][0] != 6) {
            if (Cube_colors[1][8] == 2 && Cube_colors[5][2] == 1 && Cube_colors[2][6] == 6) {
                Cube_colors = CC.BlueCCW(Cube_colors);
                Cube_colors = CC.YellowCCW(Cube_colors);
                Cube_colors = CC.YellowCCW(Cube_colors);
                Cube_colors = CC.BlueCW(Cube_colors);
                Cube_colors = CC.RedCCW(Cube_colors);
                Cube_colors = CC.YellowCW(Cube_colors);
                Cube_colors = CC.RedCW(Cube_colors);
            }
            else if (Cube_colors[2][0] == 2 && Cube_colors[4][8] == 1 && Cube_colors[1][2] == 6) {
                Cube_colors = CC.OrangeCCW(Cube_colors);
                Cube_colors = CC.YellowCW(Cube_colors);
                Cube_colors = CC.OrangeCW(Cube_colors);
                Cube_colors = CC.RedCCW(Cube_colors);
                Cube_colors = CC.YellowCW(Cube_colors);
                Cube_colors = CC.YellowCW(Cube_colors);
                Cube_colors = CC.RedCW(Cube_colors);
            }
            else if (Cube_colors[2][2] == 2 && Cube_colors[3][0] == 1 && Cube_colors[4][2] == 6) {
                Cube_colors = CC.RedCCW(Cube_colors);
                Cube_colors = CC.YellowCW(Cube_colors);
                Cube_colors = CC.YellowCW(Cube_colors);
                Cube_colors = CC.RedCW(Cube_colors);
            }
            else if (Cube_colors[2][6] == 2 && Cube_colors[1][8] == 1 && Cube_colors[5][2] == 6) {
                Cube_colors = CC.BlueCCW(Cube_colors);
                Cube_colors = CC.YellowCCW(Cube_colors);
                Cube_colors = CC.BlueCW(Cube_colors);
                Cube_colors = CC.RedCCW(Cube_colors);
                Cube_colors = CC.YellowCCW(Cube_colors);
                Cube_colors = CC.RedCW(Cube_colors);
            }
            else if (Cube_colors[3][0] == 2 && Cube_colors[4][2] == 1 && Cube_colors[2][2] == 6) {
                Cube_colors = CC.YellowCW(Cube_colors);
                Cube_colors = CC.YellowCW(Cube_colors);
                Cube_colors = CC.RedCCW(Cube_colors);
                Cube_colors = CC.YellowCCW(Cube_colors);
                Cube_colors = CC.YellowCCW(Cube_colors);
                Cube_colors = CC.RedCW(Cube_colors);
                Cube_colors = CC.YellowCW(Cube_colors);
                Cube_colors = CC.RedCCW(Cube_colors);
                Cube_colors = CC.YellowCCW(Cube_colors);
                Cube_colors = CC.RedCW(Cube_colors);
            }
            else if (Cube_colors[3][2] == 2 && Cube_colors[0][0] == 1 && Cube_colors[4][0] == 6) {
                Cube_colors = CC.YellowCW(Cube_colors);
                Cube_colors = CC.RedCCW(Cube_colors);
                Cube_colors = CC.YellowCCW(Cube_colors);
                Cube_colors = CC.YellowCCW(Cube_colors);
                Cube_colors = CC.RedCW(Cube_colors);
                Cube_colors = CC.YellowCW(Cube_colors);
                Cube_colors = CC.RedCCW(Cube_colors);
                Cube_colors = CC.YellowCCW(Cube_colors);
                Cube_colors = CC.RedCW(Cube_colors);
            }
            else if (Cube_colors[3][6] == 2 && Cube_colors[2][8] == 1 && Cube_colors[5][8] == 6) {
                Cube_colors = CC.YellowCCW(Cube_colors);
                Cube_colors = CC.RedCCW(Cube_colors);
                Cube_colors = CC.YellowCCW(Cube_colors);
                Cube_colors = CC.YellowCCW(Cube_colors);
                Cube_colors = CC.RedCW(Cube_colors);
                Cube_colors = CC.YellowCW(Cube_colors);
                Cube_colors = CC.RedCCW(Cube_colors);
                Cube_colors = CC.YellowCCW(Cube_colors);
                Cube_colors = CC.RedCW(Cube_colors);
            }
            else if (Cube_colors[3][8] == 2 && Cube_colors[5][6] == 1 && Cube_colors[0][6] == 6) {
                Cube_colors = CC.RedCCW(Cube_colors);
                Cube_colors = CC.YellowCCW(Cube_colors);
                Cube_colors = CC.YellowCCW(Cube_colors);
                Cube_colors = CC.RedCW(Cube_colors);
                Cube_colors = CC.YellowCW(Cube_colors);
                Cube_colors = CC.RedCCW(Cube_colors);
                Cube_colors = CC.YellowCCW(Cube_colors);
                Cube_colors = CC.RedCW(Cube_colors);
            }
            else if (Cube_colors[4][0] == 2 && Cube_colors[3][2] == 1 && Cube_colors[0][0] == 6) {
                Cube_colors = CC.RedCCW(Cube_colors);
                Cube_colors = CC.YellowCW(Cube_colors);
                Cube_colors = CC.RedCW(Cube_colors);
            }
            else if (Cube_colors[4][2] == 2 && Cube_colors[2][2] == 1 && Cube_colors[3][0] == 6) {
                Cube_colors = CC.YellowCW(Cube_colors);
                Cube_colors = CC.YellowCW(Cube_colors);
                Cube_colors = CC.RedCCW(Cube_colors);
                Cube_colors = CC.YellowCCW(Cube_colors);
                Cube_colors = CC.RedCW(Cube_colors);
            }
            else if (Cube_colors[4][8] == 2 && Cube_colors[1][2] == 1 && Cube_colors[2][0] == 6) {
                Cube_colors = CC.OrangeCCW(Cube_colors);
                Cube_colors = CC.YellowCCW(Cube_colors);
                Cube_colors = CC.OrangeCW(Cube_colors);
                Cube_colors = CC.YellowCCW(Cube_colors);
                Cube_colors = CC.RedCCW(Cube_colors);
                Cube_colors = CC.YellowCCW(Cube_colors);
                Cube_colors = CC.RedCW(Cube_colors);
            }
            else if (Cube_colors[5][0] == 2 && Cube_colors[1][6] == 1 && Cube_colors[0][8] == 6) {
                Cube_colors = CC.RedCCW(Cube_colors);
                Cube_colors = CC.YellowCCW(Cube_colors);
                Cube_colors = CC.RedCW(Cube_colors);
                Cube_colors = CC.YellowCW(Cube_colors);
                Cube_colors = CC.RedCCW(Cube_colors);
                Cube_colors = CC.YellowCCW(Cube_colors);
                Cube_colors = CC.RedCW(Cube_colors);
            }
            else if (Cube_colors[5][2] == 2 && Cube_colors[2][6] == 1 && Cube_colors[1][8] == 6) {
                Cube_colors = CC.BlueCCW(Cube_colors);
                Cube_colors = CC.YellowCW(Cube_colors);
                Cube_colors = CC.BlueCW(Cube_colors);
                Cube_colors = CC.YellowCCW(Cube_colors);
                Cube_colors = CC.YellowCCW(Cube_colors);
                Cube_colors = CC.RedCCW(Cube_colors);
                Cube_colors = CC.YellowCW(Cube_colors);
                Cube_colors = CC.RedCW(Cube_colors);
            }
            else if (Cube_colors[5][6] == 2 && Cube_colors[0][6] == 1 && Cube_colors[3][8] == 6) {
                Cube_colors = CC.RedCCW(Cube_colors);
                Cube_colors = CC.YellowCCW(Cube_colors);
                Cube_colors = CC.RedCW(Cube_colors);
            }
            else if (Cube_colors[5][8] == 2 && Cube_colors[3][6] == 1 && Cube_colors[2][8] == 6) {
                Cube_colors = CC.YellowCW(Cube_colors);
                Cube_colors = CC.RedCCW(Cube_colors);
                Cube_colors = CC.YellowCW(Cube_colors);
                Cube_colors = CC.YellowCW(Cube_colors);
                Cube_colors = CC.RedCW(Cube_colors);
            }
        }
        return Cube_colors;
    }
    
    public int[][] whiteThirdCorner(int[][] Cube_colors) {
        if (Cube_colors[0][0] == 2 && Cube_colors[4][0] == 5 && Cube_colors[3][2] == 3) {
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.OrangeCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.OrangeCW(Cube_colors);
        }
        else if (Cube_colors[0][6] == 2 && Cube_colors[5][6] == 5 && Cube_colors[3][8] == 3) {
            Cube_colors = CC.OrangeCCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.OrangeCW(Cube_colors);
        }
        else if (Cube_colors[1][8] == 2 && Cube_colors[2][6] == 5 && Cube_colors[5][2] == 3) {
            Cube_colors = CC.BlueCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.BlueCW(Cube_colors);
            Cube_colors = CC.OrangeCCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.OrangeCW(Cube_colors);
        }
        else if (Cube_colors[2][0] == 2 && Cube_colors[1][2] == 5 && Cube_colors[4][8] == 3) {
            Cube_colors = CC.OrangeCCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.OrangeCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.OrangeCCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.OrangeCW(Cube_colors);
        }
        else if (Cube_colors[2][2] == 2 && Cube_colors[4][2] == 5 && Cube_colors[3][0] == 3) {
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.OrangeCCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.OrangeCW(Cube_colors);
        }
        else if (Cube_colors[2][6] == 2 && Cube_colors[5][2] == 5 && Cube_colors[1][8] == 3) {
            Cube_colors = CC.BlueCCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.OrangeCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.OrangeCW(Cube_colors);
            Cube_colors = CC.OrangeCW(Cube_colors);
            Cube_colors = CC.BlueCW(Cube_colors);
            Cube_colors = CC.OrangeCCW(Cube_colors);
        }
        else if (Cube_colors[2][8] == 2 && Cube_colors[3][6] == 5 && Cube_colors[5][8] == 3) {
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.OrangeCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.OrangeCW(Cube_colors);
        }
        else if (Cube_colors[3][0] == 2 && Cube_colors[2][2] == 5 && Cube_colors[4][2] == 3) {
            Cube_colors = CC.OrangeCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.OrangeCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.OrangeCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.OrangeCW(Cube_colors);
        }
        else if (Cube_colors[3][2] == 2 && Cube_colors[4][0] == 5 && Cube_colors[0][0] == 3) {
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.OrangeCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.OrangeCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.OrangeCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.OrangeCW(Cube_colors);
        }
        else if (Cube_colors[3][6] == 2 && Cube_colors[5][8] == 5 && Cube_colors[2][8] == 3) {
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.OrangeCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.OrangeCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.OrangeCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.OrangeCW(Cube_colors);
        }
        else if (Cube_colors[3][8] == 2 && Cube_colors[0][6] == 5 && Cube_colors[5][6] == 3) {
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.OrangeCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.OrangeCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.OrangeCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.OrangeCW(Cube_colors);
        }
        else if (Cube_colors[4][0] == 2 && Cube_colors[0][0] == 5 && Cube_colors[3][2] == 3) {
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.OrangeCCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.OrangeCW(Cube_colors);
        }
        else if (Cube_colors[4][2] == 2 && Cube_colors[3][0] == 5 && Cube_colors[2][2] == 3) {
            Cube_colors = CC.OrangeCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.OrangeCW(Cube_colors);
        }
        else if (Cube_colors[5][2] == 2 && Cube_colors[1][8] == 5 && Cube_colors[2][6] == 3) {
            Cube_colors = CC.BlueCCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.BlueCW(Cube_colors);
            Cube_colors = CC.OrangeCCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.OrangeCW(Cube_colors);
        }
        else if (Cube_colors[5][6] == 2 && Cube_colors[3][8] == 5 && Cube_colors[0][6] == 3) {
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.OrangeCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.OrangeCW(Cube_colors);
        }
        else if (Cube_colors[5][8] == 2 && Cube_colors[2][8] == 5 && Cube_colors[3][6] == 3) {
            Cube_colors = CC.OrangeCCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.OrangeCW(Cube_colors);
        }
        return Cube_colors;
    }
    
    public int[][] whiteFourthCorner(int[][] Cube_colors) {
        if (Cube_colors[0][0] == 2 && Cube_colors[3][2] == 3 && Cube_colors[4][0] == 6) {
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.BlueCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.BlueCW(Cube_colors);
        }
        else if (Cube_colors[0][6] == 2 && Cube_colors[5][6] == 3 && Cube_colors[3][8] == 6) {
            Cube_colors = CC.BlueCCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.BlueCW(Cube_colors);
        }
        else if (Cube_colors[2][2] == 2 && Cube_colors[4][2] == 3 && Cube_colors[3][0] == 6) {
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.BlueCCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.BlueCW(Cube_colors);
        }
        else if (Cube_colors[2][6] == 2 && Cube_colors[5][2] == 3 && Cube_colors[1][8] == 6) {
            Cube_colors = CC.BlueCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.BlueCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.BlueCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.BlueCW(Cube_colors);
        }
        else if (Cube_colors[2][8] == 2 && Cube_colors[3][6] == 3 && Cube_colors[5][8] == 6) {
            Cube_colors = CC.BlueCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.BlueCW(Cube_colors);
        }
        else if (Cube_colors[3][0] == 2 && Cube_colors[2][2] == 3 && Cube_colors[4][2] == 6) {
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.BlueCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.BlueCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.BlueCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.BlueCW(Cube_colors);
        }
        else if (Cube_colors[3][2] == 2 && Cube_colors[4][0] == 3 && Cube_colors[0][0] == 6) {
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.BlueCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.BlueCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.BlueCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.BlueCW(Cube_colors);
        }
        else if (Cube_colors[3][6] == 2 && Cube_colors[5][8] == 3 && Cube_colors[2][8] == 6) {
            Cube_colors = CC.BlueCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.BlueCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.BlueCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.BlueCW(Cube_colors);
        }
        else if (Cube_colors[3][8] == 2 && Cube_colors[0][6] == 3 && Cube_colors[5][6] == 6) {
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.BlueCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.BlueCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.BlueCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.BlueCW(Cube_colors);
        }
        else if (Cube_colors[3][8] == 2 && Cube_colors[0][6] == 3 && Cube_colors[5][6] == 6) {
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.BlueCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.BlueCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.BlueCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.BlueCW(Cube_colors);
        }
        else if (Cube_colors[4][0] == 2 && Cube_colors[0][0] == 3 && Cube_colors[3][2] == 6) {
            Cube_colors = CC.BlueCCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.BlueCW(Cube_colors);
        }
        else if (Cube_colors[4][2] == 2 && Cube_colors[2][2] == 3 && Cube_colors[3][0] == 6) {
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.BlueCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.BlueCW(Cube_colors);
        }
        else if (Cube_colors[5][2] == 2 && Cube_colors[1][8] == 3 && Cube_colors[2][6] == 6) {
            Cube_colors = CC.BlueCCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.BlueCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.BlueCCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.BlueCW(Cube_colors);
        }
        else if (Cube_colors[5][6] == 2 && Cube_colors[3][8] == 3 && Cube_colors[0][6] == 6) {
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.BlueCCW(Cube_colors);
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.BlueCW(Cube_colors);
        }
        else if (Cube_colors[5][8] == 2 && Cube_colors[2][8] == 3 && Cube_colors[3][6] == 6) {
            Cube_colors = CC.YellowCCW(Cube_colors);
            Cube_colors = CC.BlueCCW(Cube_colors);
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.BlueCW(Cube_colors);
        }
        return Cube_colors;
    }
    
    public int[][] whiteCross(int[][] Cube_colors) {
        Cube_colors = this.whiteFirstEdge(Cube_colors);
        Cube_colors = this.whiteSecondEdge(Cube_colors);
        Cube_colors = this.whiteThirdEdge(Cube_colors);
        Cube_colors = this.whiteFourthEdge(Cube_colors);
        return Cube_colors;
    }
    
    public int[][] whiteFirstEdge(int[][] Cube_colors) {
        if (Cube_colors[0][1] == 2 && Cube_colors[4][3] == 1) {
            Cube_colors = CC.OrangeCCW(Cube_colors);
            Cube_colors = CC.WhiteCCW(Cube_colors);
        }
        else if (Cube_colors[0][3] == 2 && Cube_colors[3][5] == 1) {
            Cube_colors = CC.GreenCW(Cube_colors);
            Cube_colors = CC.OrangeCCW(Cube_colors);
            Cube_colors = CC.WhiteCCW(Cube_colors);
        }
        else if (Cube_colors[0][5] == 2 && Cube_colors[1][3] == 1) {
            Cube_colors = CC.GreenCCW(Cube_colors);
            Cube_colors = CC.OrangeCCW(Cube_colors);
            Cube_colors = CC.WhiteCCW(Cube_colors);
        }
        else if (Cube_colors[0][7] == 2 && Cube_colors[5][3] == 1) {
            Cube_colors = CC.RedCW(Cube_colors);
            Cube_colors = CC.WhiteCW(Cube_colors);
        }
        else if (Cube_colors[1][1] == 2 && Cube_colors[4][7] == 1) {
            Cube_colors = CC.WhiteCCW(Cube_colors);
        }
        else if (Cube_colors[1][3] != 2 || Cube_colors[0][5] != 1) {
            if (Cube_colors[1][5] == 2 && Cube_colors[2][3] == 1) {
                Cube_colors = CC.WhiteCW(Cube_colors);
                Cube_colors = CC.WhiteCW(Cube_colors);
            }
            else if (Cube_colors[1][7] == 2 && Cube_colors[5][1] == 1) {
                Cube_colors = CC.WhiteCW(Cube_colors);
            }
            else if (Cube_colors[2][1] == 2 && Cube_colors[4][5] == 1) {
                Cube_colors = CC.OrangeCW(Cube_colors);
                Cube_colors = CC.WhiteCCW(Cube_colors);
            }
            else if (Cube_colors[2][3] == 2 && Cube_colors[1][5] == 1) {
                Cube_colors = CC.BlueCW(Cube_colors);
                Cube_colors = CC.OrangeCW(Cube_colors);
                Cube_colors = CC.WhiteCCW(Cube_colors);
            }
            else if (Cube_colors[2][5] == 2 && Cube_colors[3][3] == 1) {
                Cube_colors = CC.BlueCCW(Cube_colors);
                Cube_colors = CC.OrangeCW(Cube_colors);
                Cube_colors = CC.WhiteCCW(Cube_colors);
            }
            else if (Cube_colors[2][7] == 2 && Cube_colors[5][5] == 1) {
                Cube_colors = CC.BlueCW(Cube_colors);
                Cube_colors = CC.BlueCW(Cube_colors);
                Cube_colors = CC.OrangeCW(Cube_colors);
                Cube_colors = CC.WhiteCCW(Cube_colors);
            }
            else if (Cube_colors[3][1] == 2 && Cube_colors[4][1] == 1) {
                Cube_colors = CC.OrangeCW(Cube_colors);
                Cube_colors = CC.OrangeCW(Cube_colors);
                Cube_colors = CC.WhiteCCW(Cube_colors);
            }
            else if (Cube_colors[3][3] == 2 && Cube_colors[2][5] == 1) {
                Cube_colors = CC.BlueCW(Cube_colors);
                Cube_colors = CC.BlueCW(Cube_colors);
                Cube_colors = CC.WhiteCW(Cube_colors);
                Cube_colors = CC.WhiteCW(Cube_colors);
            }
            else if (Cube_colors[3][5] == 2 && Cube_colors[0][3] == 1) {
                Cube_colors = CC.GreenCW(Cube_colors);
                Cube_colors = CC.GreenCW(Cube_colors);
            }
            else if (Cube_colors[3][7] == 2 && Cube_colors[5][7] == 1) {
                Cube_colors = CC.YellowCCW(Cube_colors);
                Cube_colors = CC.GreenCW(Cube_colors);
                Cube_colors = CC.GreenCW(Cube_colors);
            }
            else if (Cube_colors[4][1] == 2 && Cube_colors[3][1] == 1) {
                Cube_colors = CC.OrangeCCW(Cube_colors);
                Cube_colors = CC.GreenCW(Cube_colors);
            }
            else if (Cube_colors[4][3] == 2 && Cube_colors[0][1] == 1) {
                Cube_colors = CC.GreenCW(Cube_colors);
            }
            else if (Cube_colors[4][5] == 2 && Cube_colors[2][1] == 1) {
                Cube_colors = CC.OrangeCW(Cube_colors);
                Cube_colors = CC.OrangeCW(Cube_colors);
                Cube_colors = CC.GreenCW(Cube_colors);
            }
            else if (Cube_colors[4][7] == 2 && Cube_colors[1][1] == 1) {
                Cube_colors = CC.OrangeCW(Cube_colors);
                Cube_colors = CC.GreenCW(Cube_colors);
            }
            else if (Cube_colors[5][1] == 2 && Cube_colors[1][7] == 1) {
                Cube_colors = CC.RedCCW(Cube_colors);
                Cube_colors = CC.GreenCCW(Cube_colors);
            }
            else if (Cube_colors[5][3] == 2 && Cube_colors[0][7] == 1) {
                Cube_colors = CC.GreenCCW(Cube_colors);
            }
            else if (Cube_colors[5][5] == 2 && Cube_colors[2][7] == 1) {
                Cube_colors = CC.RedCW(Cube_colors);
                Cube_colors = CC.RedCW(Cube_colors);
                Cube_colors = CC.GreenCCW(Cube_colors);
            }
            else if (Cube_colors[5][7] == 2 && Cube_colors[3][7] == 1) {
                Cube_colors = CC.RedCW(Cube_colors);
                Cube_colors = CC.GreenCCW(Cube_colors);
            }
        }
        return Cube_colors;
    }
    
    public int[][] whiteSecondEdge(int[][] Cube_colors) {
        if (Cube_colors[0][1] == 2 && Cube_colors[4][3] == 5) {
            Cube_colors = CC.OrangeCCW(Cube_colors);
        }
        else if (Cube_colors[0][3] == 2 && Cube_colors[3][5] == 5) {
            Cube_colors = CC.GreenCCW(Cube_colors);
            Cube_colors = CC.RedCW(Cube_colors);
            Cube_colors = CC.WhiteCW(Cube_colors);
            Cube_colors = CC.WhiteCW(Cube_colors);
            Cube_colors = CC.GreenCW(Cube_colors);
        }
        else if (Cube_colors[0][5] != 2 || Cube_colors[1][3] != 5) {
            if (Cube_colors[0][7] == 2 && Cube_colors[5][3] == 5) {
                Cube_colors = CC.RedCW(Cube_colors);
                Cube_colors = CC.GreenCCW(Cube_colors);
                Cube_colors = CC.WhiteCW(Cube_colors);
                Cube_colors = CC.WhiteCW(Cube_colors);
                Cube_colors = CC.GreenCW(Cube_colors);
            }
            else if ((Cube_colors[1][1] != 2 || Cube_colors[4][7] != 5) && (Cube_colors[1][3] != 2 || Cube_colors[0][5] != 5)) {
                if (Cube_colors[1][5] == 2 && Cube_colors[2][3] == 5) {
                    Cube_colors = CC.GreenCW(Cube_colors);
                    Cube_colors = CC.WhiteCCW(Cube_colors);
                    Cube_colors = CC.GreenCCW(Cube_colors);
                }
                else if (Cube_colors[1][7] == 2 && Cube_colors[5][1] == 5) {
                    Cube_colors = CC.GreenCCW(Cube_colors);
                    Cube_colors = CC.WhiteCW(Cube_colors);
                    Cube_colors = CC.WhiteCW(Cube_colors);
                    Cube_colors = CC.GreenCW(Cube_colors);
                }
                else if (Cube_colors[2][1] == 2 && Cube_colors[4][5] == 5) {
                    Cube_colors = CC.OrangeCW(Cube_colors);
                }
                else if (Cube_colors[2][3] == 2 && Cube_colors[1][5] == 5) {
                    Cube_colors = CC.BlueCW(Cube_colors);
                    Cube_colors = CC.OrangeCW(Cube_colors);
                }
                else if (Cube_colors[2][5] == 2 && Cube_colors[3][3] == 5) {
                    Cube_colors = CC.BlueCCW(Cube_colors);
                    Cube_colors = CC.OrangeCW(Cube_colors);
                }
                else if (Cube_colors[2][7] == 2 && Cube_colors[5][5] == 5) {
                    Cube_colors = CC.BlueCW(Cube_colors);
                    Cube_colors = CC.BlueCW(Cube_colors);
                    Cube_colors = CC.OrangeCW(Cube_colors);
                }
                else if (Cube_colors[3][1] == 2 && Cube_colors[4][1] == 5) {
                    Cube_colors = CC.OrangeCW(Cube_colors);
                    Cube_colors = CC.OrangeCW(Cube_colors);
                }
                else if (Cube_colors[3][3] == 2 && Cube_colors[2][5] == 5) {
                    Cube_colors = CC.YellowCW(Cube_colors);
                    Cube_colors = CC.OrangeCW(Cube_colors);
                    Cube_colors = CC.OrangeCW(Cube_colors);
                }
                else if (Cube_colors[3][5] == 2 && Cube_colors[0][3] == 5) {
                    Cube_colors = CC.YellowCCW(Cube_colors);
                    Cube_colors = CC.OrangeCW(Cube_colors);
                    Cube_colors = CC.OrangeCW(Cube_colors);
                }
                else if (Cube_colors[3][7] == 2 && Cube_colors[5][7] == 5) {
                    Cube_colors = CC.YellowCW(Cube_colors);
                    Cube_colors = CC.YellowCW(Cube_colors);
                    Cube_colors = CC.OrangeCW(Cube_colors);
                    Cube_colors = CC.OrangeCW(Cube_colors);
                }
                else if (Cube_colors[4][1] == 2 && Cube_colors[3][1] == 5) {
                    Cube_colors = CC.YellowCCW(Cube_colors);
                    Cube_colors = CC.BlueCCW(Cube_colors);
                    Cube_colors = CC.OrangeCW(Cube_colors);
                }
                else if (Cube_colors[4][3] == 2 && Cube_colors[0][1] == 5) {
                    Cube_colors = CC.OrangeCW(Cube_colors);
                    Cube_colors = CC.YellowCCW(Cube_colors);
                    Cube_colors = CC.BlueCCW(Cube_colors);
                    Cube_colors = CC.OrangeCW(Cube_colors);
                }
                else if (Cube_colors[4][5] == 2 && Cube_colors[2][1] == 5) {
                    Cube_colors = CC.OrangeCCW(Cube_colors);
                    Cube_colors = CC.YellowCCW(Cube_colors);
                    Cube_colors = CC.BlueCCW(Cube_colors);
                    Cube_colors = CC.OrangeCW(Cube_colors);
                }
                else if (Cube_colors[4][7] == 2 && Cube_colors[1][1] == 5) {
                    Cube_colors = CC.OrangeCCW(Cube_colors);
                    Cube_colors = CC.WhiteCW(Cube_colors);
                    Cube_colors = CC.BlueCCW(Cube_colors);
                    Cube_colors = CC.WhiteCCW(Cube_colors);
                }
                else if (Cube_colors[5][1] == 2 && Cube_colors[1][7] == 5) {
                    Cube_colors = CC.RedCW(Cube_colors);
                    Cube_colors = CC.WhiteCW(Cube_colors);
                    Cube_colors = CC.BlueCW(Cube_colors);
                    Cube_colors = CC.WhiteCCW(Cube_colors);
                }
                else if (Cube_colors[5][3] == 2 && Cube_colors[0][7] == 5) {
                    Cube_colors = CC.RedCW(Cube_colors);
                    Cube_colors = CC.RedCW(Cube_colors);
                    Cube_colors = CC.WhiteCW(Cube_colors);
                    Cube_colors = CC.BlueCW(Cube_colors);
                    Cube_colors = CC.WhiteCCW(Cube_colors);
                }
                else if (Cube_colors[5][5] == 2 && Cube_colors[2][7] == 5) {
                    Cube_colors = CC.WhiteCW(Cube_colors);
                    Cube_colors = CC.BlueCW(Cube_colors);
                    Cube_colors = CC.WhiteCCW(Cube_colors);
                }
                else if (Cube_colors[5][7] == 2 && Cube_colors[3][7] == 5) {
                    Cube_colors = CC.RedCCW(Cube_colors);
                    Cube_colors = CC.WhiteCW(Cube_colors);
                    Cube_colors = CC.BlueCW(Cube_colors);
                    Cube_colors = CC.WhiteCCW(Cube_colors);
                }
            }
        }
        return Cube_colors;
    }
    
    public int[][] whiteThirdEdge(int[][] Cube_colors) {
        if (Cube_colors[0][1] == 2 && Cube_colors[4][3] == 3) {
            Cube_colors = CC.WhiteCCW(Cube_colors);
            Cube_colors = CC.OrangeCCW(Cube_colors);
            Cube_colors = CC.WhiteCW(Cube_colors);
        }
        else if (Cube_colors[0][3] == 2 && Cube_colors[3][5] == 3) {
            Cube_colors = CC.YellowCW(Cube_colors);
            Cube_colors = CC.RedCCW(Cube_colors);
            Cube_colors = CC.BlueCW(Cube_colors);
        }
        else if (Cube_colors[0][5] != 2 || Cube_colors[1][3] != 3) {
            if (Cube_colors[0][7] == 2 && Cube_colors[5][3] == 3) {
                Cube_colors = CC.WhiteCW(Cube_colors);
                Cube_colors = CC.RedCW(Cube_colors);
                Cube_colors = CC.WhiteCCW(Cube_colors);
            }
            else if ((Cube_colors[1][1] != 2 || Cube_colors[4][7] != 3) && (Cube_colors[1][3] != 2 || Cube_colors[0][5] != 3) && (Cube_colors[1][5] != 2 || Cube_colors[2][3] != 3)) {
                if (Cube_colors[1][7] == 2 && Cube_colors[5][1] == 3) {
                    Cube_colors = CC.RedCCW(Cube_colors);
                    Cube_colors = CC.WhiteCW(Cube_colors);
                    Cube_colors = CC.RedCW(Cube_colors);
                    Cube_colors = CC.WhiteCCW(Cube_colors);
                }
                else if (Cube_colors[2][1] == 2 && Cube_colors[4][5] == 3) {
                    Cube_colors = CC.WhiteCCW(Cube_colors);
                    Cube_colors = CC.OrangeCW(Cube_colors);
                    Cube_colors = CC.WhiteCW(Cube_colors);
                }
                else if (Cube_colors[2][3] == 2 && Cube_colors[1][5] == 3) {
                    Cube_colors = CC.BlueCW(Cube_colors);
                    Cube_colors = CC.WhiteCCW(Cube_colors);
                    Cube_colors = CC.OrangeCW(Cube_colors);
                    Cube_colors = CC.WhiteCW(Cube_colors);
                }
                else if (Cube_colors[2][5] == 2 && Cube_colors[3][3] == 3) {
                    Cube_colors = CC.BlueCCW(Cube_colors);
                    Cube_colors = CC.WhiteCCW(Cube_colors);
                    Cube_colors = CC.OrangeCW(Cube_colors);
                    Cube_colors = CC.WhiteCW(Cube_colors);
                }
                else if (Cube_colors[2][7] == 2 && Cube_colors[5][5] == 3) {
                    Cube_colors = CC.BlueCW(Cube_colors);
                    Cube_colors = CC.BlueCW(Cube_colors);
                    Cube_colors = CC.WhiteCCW(Cube_colors);
                    Cube_colors = CC.OrangeCW(Cube_colors);
                    Cube_colors = CC.WhiteCW(Cube_colors);
                }
                else if (Cube_colors[3][1] == 2 && Cube_colors[4][1] == 3) {
                    Cube_colors = CC.WhiteCCW(Cube_colors);
                    Cube_colors = CC.OrangeCW(Cube_colors);
                    Cube_colors = CC.OrangeCW(Cube_colors);
                    Cube_colors = CC.WhiteCW(Cube_colors);
                }
                else if (Cube_colors[3][3] == 2 && Cube_colors[2][5] == 3) {
                    Cube_colors = CC.YellowCW(Cube_colors);
                    Cube_colors = CC.WhiteCCW(Cube_colors);
                    Cube_colors = CC.OrangeCW(Cube_colors);
                    Cube_colors = CC.OrangeCW(Cube_colors);
                    Cube_colors = CC.WhiteCW(Cube_colors);
                }
                else if (Cube_colors[3][5] == 2 && Cube_colors[0][3] == 3) {
                    Cube_colors = CC.YellowCCW(Cube_colors);
                    Cube_colors = CC.WhiteCCW(Cube_colors);
                    Cube_colors = CC.OrangeCW(Cube_colors);
                    Cube_colors = CC.OrangeCW(Cube_colors);
                    Cube_colors = CC.WhiteCW(Cube_colors);
                }
                else if (Cube_colors[3][7] == 2 && Cube_colors[5][7] == 3) {
                    Cube_colors = CC.YellowCW(Cube_colors);
                    Cube_colors = CC.YellowCW(Cube_colors);
                    Cube_colors = CC.WhiteCCW(Cube_colors);
                    Cube_colors = CC.OrangeCW(Cube_colors);
                    Cube_colors = CC.OrangeCW(Cube_colors);
                    Cube_colors = CC.WhiteCW(Cube_colors);
                }
                else if (Cube_colors[4][1] == 2 && Cube_colors[3][1] == 3) {
                    Cube_colors = CC.YellowCW(Cube_colors);
                    Cube_colors = CC.YellowCW(Cube_colors);
                    Cube_colors = CC.RedCCW(Cube_colors);
                    Cube_colors = CC.BlueCW(Cube_colors);
                }
                else if (Cube_colors[4][3] == 2 && Cube_colors[0][1] == 3) {
                    Cube_colors = CC.WhiteCW(Cube_colors);
                    Cube_colors = CC.WhiteCW(Cube_colors);
                    Cube_colors = CC.GreenCW(Cube_colors);
                    Cube_colors = CC.WhiteCW(Cube_colors);
                    Cube_colors = CC.WhiteCW(Cube_colors);
                }
                else if (Cube_colors[4][5] == 2 && Cube_colors[2][1] == 3) {
                    Cube_colors = CC.BlueCCW(Cube_colors);
                }
                else if (Cube_colors[4][7] != 2 || Cube_colors[1][1] != 3) {
                    if (Cube_colors[5][1] == 2 && Cube_colors[1][7] == 3) {
                        Cube_colors = CC.RedCW(Cube_colors);
                        Cube_colors = CC.BlueCW(Cube_colors);
                    }
                    else if (Cube_colors[5][3] == 2 && Cube_colors[0][7] == 3) {
                        Cube_colors = CC.RedCW(Cube_colors);
                        Cube_colors = CC.RedCW(Cube_colors);
                        Cube_colors = CC.BlueCW(Cube_colors);
                    }
                    else if (Cube_colors[5][5] == 2 && Cube_colors[2][7] == 3) {
                        Cube_colors = CC.RedCW(Cube_colors);
                    }
                    else if (Cube_colors[5][7] == 2 && Cube_colors[3][7] == 3) {
                        Cube_colors = CC.RedCCW(Cube_colors);
                        Cube_colors = CC.BlueCW(Cube_colors);
                    }
                }
            }
        }
        return Cube_colors;
    }
    
    public int[][] whiteFourthEdge(int[][] Cube_colors) {
        if (Cube_colors[0][1] == 2 && Cube_colors[4][3] == 6) {
            Cube_colors = CC.WhiteCW(Cube_colors);
            Cube_colors = CC.WhiteCW(Cube_colors);
            Cube_colors = CC.OrangeCCW(Cube_colors);
            Cube_colors = CC.WhiteCW(Cube_colors);
            Cube_colors = CC.WhiteCW(Cube_colors);
        }
        else if (Cube_colors[0][3] == 2 && Cube_colors[3][5] == 6) {
            Cube_colors = CC.WhiteCW(Cube_colors);
            Cube_colors = CC.GreenCW(Cube_colors);
            Cube_colors = CC.WhiteCW(Cube_colors);
            Cube_colors = CC.OrangeCCW(Cube_colors);
            Cube_colors = CC.WhiteCW(Cube_colors);
            Cube_colors = CC.WhiteCW(Cube_colors);
        }
        else if (Cube_colors[0][5] != 2 || Cube_colors[1][3] != 6) {
            if (Cube_colors[0][7] == 2 && Cube_colors[5][3] == 6) {
                Cube_colors = CC.RedCW(Cube_colors);
            }
            else if ((Cube_colors[1][1] != 2 || Cube_colors[4][7] != 6) && (Cube_colors[1][3] != 2 || Cube_colors[0][5] != 6) && (Cube_colors[1][5] != 2 || Cube_colors[2][3] != 6) && (Cube_colors[1][7] != 2 || Cube_colors[5][1] != 6)) {
                if (Cube_colors[2][1] == 2 && Cube_colors[4][5] == 6) {
                    Cube_colors = CC.WhiteCW(Cube_colors);
                    Cube_colors = CC.WhiteCW(Cube_colors);
                    Cube_colors = CC.OrangeCW(Cube_colors);
                    Cube_colors = CC.WhiteCW(Cube_colors);
                    Cube_colors = CC.WhiteCW(Cube_colors);
                }
                else if (Cube_colors[2][3] != 2 || Cube_colors[1][5] != 6) {
                    if (Cube_colors[2][5] == 2 && Cube_colors[3][3] == 6) {
                        Cube_colors = CC.WhiteCCW(Cube_colors);
                        Cube_colors = CC.BlueCW(Cube_colors);
                        Cube_colors = CC.WhiteCW(Cube_colors);
                        Cube_colors = CC.RedCCW(Cube_colors);
                    }
                    else if (Cube_colors[2][7] == 2 && Cube_colors[5][5] == 6) {
                        Cube_colors = CC.RedCCW(Cube_colors);
                    }
                    else if (Cube_colors[3][1] == 2 && Cube_colors[4][1] == 6) {
                        Cube_colors = CC.WhiteCW(Cube_colors);
                        Cube_colors = CC.WhiteCW(Cube_colors);
                        Cube_colors = CC.OrangeCW(Cube_colors);
                        Cube_colors = CC.OrangeCW(Cube_colors);
                        Cube_colors = CC.WhiteCW(Cube_colors);
                        Cube_colors = CC.WhiteCW(Cube_colors);
                    }
                    else if (Cube_colors[3][3] == 2 && Cube_colors[2][5] == 6) {
                        Cube_colors = CC.YellowCW(Cube_colors);
                        Cube_colors = CC.WhiteCW(Cube_colors);
                        Cube_colors = CC.WhiteCW(Cube_colors);
                        Cube_colors = CC.OrangeCW(Cube_colors);
                        Cube_colors = CC.OrangeCW(Cube_colors);
                        Cube_colors = CC.WhiteCW(Cube_colors);
                        Cube_colors = CC.WhiteCW(Cube_colors);
                    }
                    else if (Cube_colors[3][5] == 2 && Cube_colors[0][3] == 6) {
                        Cube_colors = CC.YellowCCW(Cube_colors);
                        Cube_colors = CC.WhiteCW(Cube_colors);
                        Cube_colors = CC.WhiteCW(Cube_colors);
                        Cube_colors = CC.OrangeCW(Cube_colors);
                        Cube_colors = CC.OrangeCW(Cube_colors);
                        Cube_colors = CC.WhiteCW(Cube_colors);
                        Cube_colors = CC.WhiteCW(Cube_colors);
                    }
                    else if (Cube_colors[3][7] == 2 && Cube_colors[5][7] == 6) {
                        Cube_colors = CC.YellowCW(Cube_colors);
                        Cube_colors = CC.YellowCW(Cube_colors);
                        Cube_colors = CC.WhiteCW(Cube_colors);
                        Cube_colors = CC.WhiteCW(Cube_colors);
                        Cube_colors = CC.OrangeCW(Cube_colors);
                        Cube_colors = CC.OrangeCW(Cube_colors);
                        Cube_colors = CC.WhiteCW(Cube_colors);
                        Cube_colors = CC.WhiteCW(Cube_colors);
                    }
                    else if (Cube_colors[4][1] == 2 && Cube_colors[3][1] == 6) {
                        Cube_colors = CC.WhiteCW(Cube_colors);
                        Cube_colors = CC.WhiteCW(Cube_colors);
                        Cube_colors = CC.OrangeCW(Cube_colors);
                        Cube_colors = CC.WhiteCW(Cube_colors);
                        Cube_colors = CC.BlueCCW(Cube_colors);
                        Cube_colors = CC.WhiteCW(Cube_colors);
                    }
                    else if (Cube_colors[4][3] == 2 && Cube_colors[0][1] == 6) {
                        Cube_colors = CC.WhiteCW(Cube_colors);
                        Cube_colors = CC.GreenCW(Cube_colors);
                        Cube_colors = CC.WhiteCCW(Cube_colors);
                    }
                    else if (Cube_colors[4][5] == 2 && Cube_colors[2][1] == 6) {
                        Cube_colors = CC.WhiteCCW(Cube_colors);
                        Cube_colors = CC.BlueCCW(Cube_colors);
                        Cube_colors = CC.WhiteCW(Cube_colors);
                    }
                    else if (Cube_colors[4][7] != 2 || Cube_colors[1][1] != 6) {
                        if (Cube_colors[5][1] == 2 && Cube_colors[1][7] == 6) {
                            Cube_colors = CC.RedCW(Cube_colors);
                            Cube_colors = CC.WhiteCCW(Cube_colors);
                            Cube_colors = CC.BlueCW(Cube_colors);
                            Cube_colors = CC.WhiteCW(Cube_colors);
                        }
                        else if (Cube_colors[5][3] == 2 && Cube_colors[0][7] == 6) {
                            Cube_colors = CC.WhiteCW(Cube_colors);
                            Cube_colors = CC.GreenCCW(Cube_colors);
                            Cube_colors = CC.WhiteCCW(Cube_colors);
                        }
                        else if (Cube_colors[5][5] == 2 && Cube_colors[2][7] == 6) {
                            Cube_colors = CC.WhiteCCW(Cube_colors);
                            Cube_colors = CC.BlueCW(Cube_colors);
                            Cube_colors = CC.WhiteCW(Cube_colors);
                        }
                        else if (Cube_colors[5][7] == 2 && Cube_colors[3][7] == 6) {
                            Cube_colors = CC.RedCCW(Cube_colors);
                            Cube_colors = CC.WhiteCCW(Cube_colors);
                            Cube_colors = CC.BlueCW(Cube_colors);
                            Cube_colors = CC.WhiteCW(Cube_colors);
                        }
                    }
                }
            }
        }
        return Cube_colors;
    }
}