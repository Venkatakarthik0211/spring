class Basic
{
    String allChar;
    
    Basic() {
        this.allChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    }
    
    boolean indexOfChar(final char c) {
        for (int i = 0; i < this.allChar.length(); ++i) {
            if (this.allChar.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }
}