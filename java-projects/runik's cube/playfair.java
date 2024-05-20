class playfair
{
    Basic b;
    char[][] keyMatrix;
    
    playfair() {
        this.b = new Basic();
        this.keyMatrix = new char[5][5];
    }
    
    boolean repeat(final char c) {
        if (!this.b.indexOfChar(c)) {
            return true;
        }
        for (int i = 0; i < this.keyMatrix.length; ++i) {
            for (int j = 0; j < this.keyMatrix[i].length; ++j) {
                if (this.keyMatrix[i][j] == c || c == 'J') {
                    return true;
                }
            }
        }
        return false;
    }
    
    void insertKey(String key) {
        key = key.toUpperCase();
        key = key.replaceAll("J", "I");
        key = key.replaceAll(" ", "");
        int a = 0;
        int b = 0;
        for (int k = 0; k < key.length(); ++k) {
            if (!this.repeat(key.charAt(k))) {
                this.keyMatrix[a][b++] = key.charAt(k);
                if (b > 4) {
                    b = 0;
                    ++a;
                }
            }
        }
        char p = 'A';
        while (a < 5) {
            while (b < 5) {
                if (!this.repeat(p)) {
                    this.keyMatrix[a][b++] = p;
                }
                ++p;
            }
            b = 0;
            ++a;
        }
        System.out.print("-------------------------Key Matrix-------------------");
        for (int i = 0; i < 5; ++i) {
            System.out.println();
            for (int j = 0; j < 5; ++j) {
                System.out.print("\t" + this.keyMatrix[i][j]);
            }
        }
        System.out.println("\n---------------------------------------------------------");
    }
    
    int rowPos(final char c) {
        for (int i = 0; i < this.keyMatrix.length; ++i) {
            for (int j = 0; j < this.keyMatrix[i].length; ++j) {
                if (this.keyMatrix[i][j] == c) {
                    return i;
                }
            }
        }
        return -1;
    }
    
    int columnPos(final char c) {
        for (int i = 0; i < this.keyMatrix.length; ++i) {
            for (int j = 0; j < this.keyMatrix[i].length; ++j) {
                if (this.keyMatrix[i][j] == c) {
                    return j;
                }
            }
        }
        return -1;
    }
    
    String encryptChar(String plain) {
        plain = plain.toUpperCase();
        final char a = plain.charAt(0);
        final char b = plain.charAt(1);
        String cipherChar = "";
        int r1 = this.rowPos(a);
        int c1 = this.columnPos(a);
        int r2 = this.rowPos(b);
        int c2 = this.columnPos(b);
        if (c1 == c2) {
            ++r1;
            ++r2;
            if (r1 > 4) {
                r1 = 0;
            }
            if (r2 > 4) {
                r2 = 0;
            }
            cipherChar = String.valueOf(cipherChar) + this.keyMatrix[r1][c2];
            cipherChar = String.valueOf(cipherChar) + this.keyMatrix[r2][c1];
        }
        else if (r1 == r2) {
            ++c1;
            ++c2;
            if (c1 > 4) {
                c1 = 0;
            }
            if (c2 > 4) {
                c2 = 0;
            }
            cipherChar = String.valueOf(cipherChar) + this.keyMatrix[r1][c1];
            cipherChar = String.valueOf(cipherChar) + this.keyMatrix[r2][c2];
        }
        else {
            cipherChar = String.valueOf(cipherChar) + this.keyMatrix[r1][c2];
            cipherChar = String.valueOf(cipherChar) + this.keyMatrix[r2][c1];
        }
        return cipherChar;
    }
    
    String Encrypt(String plainText, final String key) {
        this.insertKey(key);
        String cipherText = "";
        plainText = plainText.replaceAll("j", "i");
        plainText = plainText.replaceAll(" ", "");
        plainText = plainText.toUpperCase();
        int len = plainText.length();
        if (len / 2 != 0) {
            plainText = String.valueOf(plainText) + "X";
            ++len;
        }
        for (int i = 0; i < len - 1; i += 2) {
            cipherText = String.valueOf(cipherText) + this.encryptChar(plainText.substring(i, i + 2));
            cipherText = String.valueOf(cipherText) + " ";
        }
        return cipherText;
    }
    
    String decryptChar(String cipher) {
        cipher = cipher.toUpperCase();
        final char a = cipher.charAt(0);
        final char b = cipher.charAt(1);
        String plainChar = "";
        int r1 = this.rowPos(a);
        int c1 = this.columnPos(a);
        int r2 = this.rowPos(b);
        int c2 = this.columnPos(b);
        if (c1 == c2) {
            --r1;
            --r2;
            if (r1 < 0) {
                r1 = 4;
            }
            if (r2 < 0) {
                r2 = 4;
            }
            plainChar = String.valueOf(plainChar) + this.keyMatrix[r1][c2];
            plainChar = String.valueOf(plainChar) + this.keyMatrix[r2][c1];
        }
        else if (r1 == r2) {
            --c1;
            --c2;
            if (c1 < 0) {
                c1 = 4;
            }
            if (c2 < 0) {
                c2 = 4;
            }
            plainChar = String.valueOf(plainChar) + this.keyMatrix[r1][c1];
            plainChar = String.valueOf(plainChar) + this.keyMatrix[r2][c2];
        }
        else {
            plainChar = String.valueOf(plainChar) + this.keyMatrix[r1][c2];
            plainChar = String.valueOf(plainChar) + this.keyMatrix[r2][c1];
        }
        return plainChar;
    }
    
    String Decrypt(String cipherText, final String key) {
        String plainText = "";
        cipherText = cipherText.replaceAll("j", "i");
        cipherText = cipherText.replaceAll(" ", "");
        cipherText = cipherText.toUpperCase();
        for (int len = cipherText.length(), i = 0; i < len - 1; i += 2) {
            plainText = String.valueOf(plainText) + this.decryptChar(cipherText.substring(i, i + 2));
            plainText = String.valueOf(plainText) + " ";
        }
        return plainText;
    }
}