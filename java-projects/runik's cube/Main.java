import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    int[] lm;
    int[][] km;
    int[] rm;
    static int choice;
    int[][] invK;

    public static void main(final String[] args) throws IOException {
        final Scanner in = new Scanner(System.in);
        final input obj = new input();
        final S1 obj2 = new S1();
        int[][] Cube_colors = new int[6][9];
        Cube_colors = obj.getColors();
        System.out.println("Checkpoint");
        Cube_colors = obj2.whiteSide(Cube_colors);
        for (int i = 0; i < 6; ++i) {
            for (int j = 0; j < 9; ++j) {
                System.out.println(String.valueOf(Cube_colors[i][j]) + " ");
            }
            System.out.println();
        }
        final int minimum = 1;
        final int maximum1 = 6;
        final int maximum2 = 8;
        final int k = 0;
        final Random rd = new Random();
        final int[][] temp = new int[3][3];
        final Main rg = new Main();
        final Main obj3 = new Main();
        final BufferedReader in2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Menu:\n1: Encryption\n2: Decryption");
        Main.choice = Integer.parseInt(in2.readLine());
        if (Main.choice == 1) {
            int k2 = 0;
            System.out.println("Enter the side required for encryptiion ");
            final int s1 = in.nextInt();
            switch (s1) {
                case 1: {
                        for (int l = 0; l < 3; ++l) {
                            for (int m = 0; m < 3; ++m) {
                                temp[l][m] = Cube_colors[s1 - 1][k];
                                ++k2;
                                System.out.println(temp[l][m]);
                            }
                        }
                        break;
                    }
                case 2: {
                        for (int l = 0; l < 3; ++l) {
                            for (int m = 0; m < 3; ++m) {
                                temp[l][m] = Cube_colors[s1 - 1][k2];
                                ++k2;
                                System.out.println(temp[l][m]);
                            }
                        }
                        break;
                    }
                case 3: {
                        for (int l = 0; l < 3; ++l) {
                            for (int m = 0; m < 3; ++m) {
                                temp[l][m] = Cube_colors[s1 - 1][k2];
                                ++k2;
                                System.out.println(temp[l][m]);
                            }
                        }
                        break;
                    }
                case 4: {
                        for (int l = 0; l < 3; ++l) {
                            for (int m = 0; m < 3; ++m) {
                                temp[l][m] = Cube_colors[s1 - 1][k2];
                                ++k2;
                                System.out.println(temp[l][m]);
                            }
                        }
                        break;
                    }
                case 5: {
                        for (int l = 0; l < 3; ++l) {
                            for (int m = 0; m < 3; ++m) {
                                temp[l][m] = Cube_colors[s1 - 1][k2];
                                ++k2;
                                System.out.println(temp[l][m]);
                            }
                        }
                        break;
                    }
                case 6: {
                        for (int l = 0; l < 3; ++l) {
                            for (int m = 0; m < 3; ++m) {
                                temp[l][m] = Cube_colors[s1 - 1][k2];
                                ++k2;
                                System.out.println(temp[l][m]);
                            }
                        }
                        break;
                    }
            }
            if (Main.choice == 0) {
                System.out.println("Enter the side required for decryption ");
                final int s2 = in.nextInt();
                for (int i2 = 0; i2 < 3; ++i2) {
                    for (int j2 = 0; j2 < 3; ++j2) {
                        temp[i2][j2] = Cube_colors[s2 - 1][k2];
                        ++k2;
                        System.out.println(temp[i2][j2]);
                    }
                }
            }
        }
        String res = "";
        for (int c = 0; c < temp[0].length; ++c) {
            for (int r = 0; r < temp.length; ++r) {
                res = String.valueOf(res) + temp[r][c];
            }
        }
        System.out.println(res);
        System.out.println("String: " + res);
        final char[] ch1 = res.toCharArray();
        final int[] temp2 = new int[res.length()];
        System.out.println("Character Array...");
        for (int i2 = 0; i2 < ch1.length; ++i2) {
            temp2[i2] = ch1[i2] - '0';
            temp2[i2] += 97;
            ch1[i2] = (char)temp2[i2];
            System.out.print(String.valueOf(ch1[i2]) + " ");
        }
        final String string = new String(ch1);
        System.out.println("The string is" + string);
        System.out.println();
        System.out.println("Enter the plaintext/ciphertext: ");
        final String line = in2.readLine();
        System.out.println("Enter the key: ");
        final String key = string;
        final double sq = Math.sqrt(key.length());
        if (sq != (long)sq) {
            System.out.println("Cannot Form a square matrix");
        }
        else {
            final int size = (int)sq;
            if (obj3.check(key, size)) {
                System.out.println("Result:");
                obj3.cofact(obj3.km, size);
                obj3.performDivision(line, size);
            }
            else {
                System.out.println("Encryption of hill cipher is not possible");
                System.out.println("Would ypu like to continue Encryption");
                System.out.println("Enter your choice");
                System.out.println("1. Encryption of playfair");
                System.out.println("2. Decryption of playfair");
                final int u = in.nextInt();
                final playfair p = new playfair();
                final Scanner scn = new Scanner(System.in);
                switch (u) {
                    case 1: {
                            System.out.println("Enter plaintext:");
                            final String plainText = scn.nextLine();
                            System.out.println("Enter Key:");
                            final String key2 = string;
                            final String cipherText = p.Encrypt(plainText, key2);
                            System.out.println("Encrypted text:");
                            System.out.println(cipherText);
                            break;
                        }
                    case 2: {
                            System.out.println("Enter ciphertext");
                            final String cipherText = scn.nextLine();
                            System.out.println("Enter Key:");
                            final String key2 = string;
                            final String encryptedText = p.Decrypt(cipherText, key2);
                            System.out.println("Decrypted text:");
                            System.out.println(encryptedText);
                            break;
                        }
                }
            }
        }
    }

    static int randomNumberGenerator(final int min, final int max) {
        final double r = Math.random();
        final int randomNum = (int)(r * (max - min)) + min;
        return randomNum;
    }

    public void performDivision(String temp, final int s) {
        while (temp.length() > s) {
            final String line = temp.substring(0, s);
            temp = temp.substring(s, temp.length());
            this.calLineMatrix(line);
            if (Main.choice == 1) {
                this.multiplyLineByKey(line.length());
            }
            else {
                this.multiplyLineByInvKey(line.length());
            }
            this.showResult(line.length());
        }
        if (temp.length() == s) {
            if (Main.choice == 1) {
                this.calLineMatrix(temp);
                this.multiplyLineByKey(temp.length());
                this.showResult(temp.length());
            }
            else {
                this.calLineMatrix(temp);
                this.multiplyLineByInvKey(temp.length());
                this.showResult(temp.length());
            }
        }
        else if (temp.length() < s) {
            for (int i = temp.length(); i < s; ++i) {
                temp = String.valueOf(temp) + 'x';
            }
            if (Main.choice == 1) {
                this.calLineMatrix(temp);
                this.multiplyLineByKey(temp.length());
                this.showResult(temp.length());
            }
            else {
                this.calLineMatrix(temp);
                this.multiplyLineByInvKey(temp.length());
                this.showResult(temp.length());
            }
        }
    }

    public void calKeyMatrix(final String key, final int len) {
        this.km = new int[len][len];
        int k = 0;
        for (int i = 0; i < len; ++i) {
            for (int j = 0; j < len; ++j) {
                this.km[i][j] = key.charAt(k) - 'a';
                ++k;
            }
        }
    }

    public void calLineMatrix(final String line) {
        this.lm = new int[line.length()];
        for (int i = 0; i < line.length(); ++i) {
            this.lm[i] = line.charAt(i) - 'a';
        }
    }

    public void multiplyLineByKey(final int len) {
        this.rm = new int[len];
        for (int i = 0; i < len; ++i) {
            for (int j = 0; j < len; ++j) {
                final int[] rm = this.rm;
                final int n = i;
                rm[n] += this.km[i][j] * this.lm[j];
            }
            final int[] rm2 = this.rm;
            final int n2 = i;
            rm2[n2] %= 26;
        }
    }

    public void multiplyLineByInvKey(final int len) {
        this.rm = new int[len];
        for (int i = 0; i < len; ++i) {
            for (int j = 0; j < len; ++j) {
                final int[] rm = this.rm;
                final int n = i;
                rm[n] += this.invK[i][j] * this.lm[j];
            }
            final int[] rm2 = this.rm;
            final int n2 = i;
            rm2[n2] %= 26;
        }
    }

    public void showResult(final int len) {
        String result = "";
        for (int i = 0; i < len; ++i) {
            result = String.valueOf(result) + (char)(this.rm[i] + 97);
        }
        System.out.print(result);
    }

    public int calDeterminant(final int[][] A, final int N) {
        int resultOfDet = 0;
        switch (N) {
            case 1: {
                    resultOfDet = A[0][0];
                    break;
                }
            case 2: {
                    resultOfDet = A[0][0] * A[1][1] - A[1][0] * A[0][1];
                    break;
                }
            default: {
                    resultOfDet = 0;
                    for (int j1 = 0; j1 < N; ++j1) {
                        final int[][] m = new int[N - 1][N - 1];
                        for (int i = 1; i < N; ++i) {
                            int j2 = 0;
                            for (int k = 0; k < N; ++k) {
                                if (k != j1) {
                                    m[i - 1][j2] = A[i][k];
                                    ++j2;
                                }
                            }
                        }
                        resultOfDet += (int)(Math.pow(-1.0, 1.0 + j1 + 1.0) * A[0][j1] * this.calDeterminant(m, N - 1));
                    }
                    break;
                }
        }
        return resultOfDet;
    }

    public void cofact(final int[][] num, final int f) {
        final int[][] b = new int[f][f];
        final int[][] fac = new int[f][f];
        for (int q = 0; q < f; ++q) {
            for (int p = 0; p < f; ++p) {
                int m = 0;
                int n = 0;
                for (int i = 0; i < f; ++i) {
                    for (int j = 0; j < f; ++j) {
                        b[i][j] = 0;
                        if (i != q && j != p) {
                            b[m][n] = num[i][j];
                            if (n < f - 2) {
                                ++n;
                            }
                            else {
                                n = 0;
                                ++m;
                            }
                        }
                    }
                }
                fac[q][p] = (int)Math.pow(-1.0, q + p) * this.calDeterminant(b, f - 1);
            }
        }
        this.trans(fac, f);
    }

    void trans(final int[][] fac, final int r) {
        final int[][] b = new int[r][r];
        final int[][] inv = new int[r][r];
        final int d = this.calDeterminant(this.km, r);
        int mi = this.mi(d % 26);
        mi %= 26;
        if (mi < 0) {
            mi += 26;
        }
        for (int i = 0; i < r; ++i) {
            for (int j = 0; j < r; ++j) {
                b[i][j] = fac[j][i];
            }
        }
        for (int i = 0; i < r; ++i) {
            for (int j = 0; j < r; ++j) {
                inv[i][j] = b[i][j] % 26;
                if (inv[i][j] < 0) {
                    final int[] array = inv[i];
                    final int n = j;
                    array[n] += 26;
                }
                final int[] array2 = inv[i];
                final int n2 = j;
                array2[n2] *= mi;
                final int[] array3 = inv[i];
                final int n3 = j;
                array3[n3] %= 26;
            }
        }
        this.invK = inv;
    }

    public int mi(final int d) {
        int r1 = 26;
        int r2 = d;
        int t1 = 0;
        int t2;
        int r3;
        int t3;
        for (t2 = 1; r1 != 1 && r2 != 0; r1 = r2, r2 = r3, t1 = t2, t2 = t3) {
            final int q = r1 / r2;
            r3 = r1 % r2;
            t3 = t1 - t2 * q;
        }
        return t1 + t2;
    }

    public void matrixtoinvkey(final int[][] inv, final int n) {
        String invkey = "";
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                invkey = String.valueOf(invkey) + (char)(inv[i][j] + 97);
            }
        }
        System.out.print(invkey);
    }

    public boolean check(final String key, final int len) {
        this.calKeyMatrix(key, len);
        int d = this.calDeterminant(this.km, len);
        d %= 26;
        if (d == 0) {
            System.out.println("Key is not invertible");
            return false;
        }
        if (d % 2 == 0 || d % 13 == 0) {
            System.out.println("Key is not invertible");
            return false;
        }
        return true;
    }
}