package o;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
/* loaded from: classes5.dex */
public final class bindString {
    private static final int[] ag$a = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};
    private static final bindString[] valueOf = values();
    private final int HaptikSDK$b;
    private final int ah$a;
    private final bindString$ah$a[] toString;
    private final int[] values;

    private bindString(int i, int[] iArr, bindString$ah$a... bindstring_ah_aArr) {
        valueOf[] ag$a2;
        this.HaptikSDK$b = i;
        this.values = iArr;
        this.toString = bindstring_ah_aArr;
        int ah$a = bindstring_ah_aArr[0].ah$a();
        int i2 = 0;
        for (valueOf valueof : bindstring_ah_aArr[0].ag$a()) {
            i2 += valueof.values() * (valueof.ah$a() + ah$a);
        }
        this.ah$a = i2;
    }

    public int valueOf() {
        return this.HaptikSDK$b;
    }

    public int ah$a() {
        return this.ah$a;
    }

    public int ag$a() {
        return (this.HaptikSDK$b * 4) + 17;
    }

    public bindString$ah$a valueOf(ErrorCorrectionLevel errorCorrectionLevel) {
        return this.toString[errorCorrectionLevel.ordinal()];
    }

    public static bindString values(int i) {
        if (i <= 0 || i > 40) {
            throw new IllegalArgumentException();
        }
        return valueOf[i - 1];
    }

    /* loaded from: classes5.dex */
    public static final class valueOf {
        private final int valueOf;
        private final int values;

        valueOf(int i, int i2) {
            this.valueOf = i;
            this.values = i2;
        }

        public int values() {
            return this.valueOf;
        }

        public int ah$a() {
            return this.values;
        }
    }

    public String toString() {
        return String.valueOf(this.HaptikSDK$b);
    }

    private static bindString[] values() {
        return new bindString[]{new bindString(1, new int[0], new bindString$ah$a(7, new valueOf(1, 19)), new bindString$ah$a(10, new valueOf(1, 16)), new bindString$ah$a(13, new valueOf(1, 13)), new bindString$ah$a(17, new valueOf(1, 9))), new bindString(2, new int[]{6, 18}, new bindString$ah$a(10, new valueOf(1, 34)), new bindString$ah$a(16, new valueOf(1, 28)), new bindString$ah$a(22, new valueOf(1, 22)), new bindString$ah$a(28, new valueOf(1, 16))), new bindString(3, new int[]{6, 22}, new bindString$ah$a(15, new valueOf(1, 55)), new bindString$ah$a(26, new valueOf(1, 44)), new bindString$ah$a(18, new valueOf(2, 17)), new bindString$ah$a(22, new valueOf(2, 13))), new bindString(4, new int[]{6, 26}, new bindString$ah$a(20, new valueOf(1, 80)), new bindString$ah$a(18, new valueOf(2, 32)), new bindString$ah$a(26, new valueOf(2, 24)), new bindString$ah$a(16, new valueOf(4, 9))), new bindString(5, new int[]{6, 30}, new bindString$ah$a(26, new valueOf(1, 108)), new bindString$ah$a(24, new valueOf(2, 43)), new bindString$ah$a(18, new valueOf(2, 15), new valueOf(2, 16)), new bindString$ah$a(22, new valueOf(2, 11), new valueOf(2, 12))), new bindString(6, new int[]{6, 34}, new bindString$ah$a(18, new valueOf(2, 68)), new bindString$ah$a(16, new valueOf(4, 27)), new bindString$ah$a(24, new valueOf(4, 19)), new bindString$ah$a(28, new valueOf(4, 15))), new bindString(7, new int[]{6, 22, 38}, new bindString$ah$a(20, new valueOf(2, 78)), new bindString$ah$a(18, new valueOf(4, 31)), new bindString$ah$a(18, new valueOf(2, 14), new valueOf(4, 15)), new bindString$ah$a(26, new valueOf(4, 13), new valueOf(1, 14))), new bindString(8, new int[]{6, 24, 42}, new bindString$ah$a(24, new valueOf(2, 97)), new bindString$ah$a(22, new valueOf(2, 38), new valueOf(2, 39)), new bindString$ah$a(22, new valueOf(4, 18), new valueOf(2, 19)), new bindString$ah$a(26, new valueOf(4, 14), new valueOf(2, 15))), new bindString(9, new int[]{6, 26, 46}, new bindString$ah$a(30, new valueOf(2, 116)), new bindString$ah$a(22, new valueOf(3, 36), new valueOf(2, 37)), new bindString$ah$a(20, new valueOf(4, 16), new valueOf(4, 17)), new bindString$ah$a(24, new valueOf(4, 12), new valueOf(4, 13))), new bindString(10, new int[]{6, 28, 50}, new bindString$ah$a(18, new valueOf(2, 68), new valueOf(2, 69)), new bindString$ah$a(26, new valueOf(4, 43), new valueOf(1, 44)), new bindString$ah$a(24, new valueOf(6, 19), new valueOf(2, 20)), new bindString$ah$a(28, new valueOf(6, 15), new valueOf(2, 16))), new bindString(11, new int[]{6, 30, 54}, new bindString$ah$a(20, new valueOf(4, 81)), new bindString$ah$a(30, new valueOf(1, 50), new valueOf(4, 51)), new bindString$ah$a(28, new valueOf(4, 22), new valueOf(4, 23)), new bindString$ah$a(24, new valueOf(3, 12), new valueOf(8, 13))), new bindString(12, new int[]{6, 32, 58}, new bindString$ah$a(24, new valueOf(2, 92), new valueOf(2, 93)), new bindString$ah$a(22, new valueOf(6, 36), new valueOf(2, 37)), new bindString$ah$a(26, new valueOf(4, 20), new valueOf(6, 21)), new bindString$ah$a(28, new valueOf(7, 14), new valueOf(4, 15))), new bindString(13, new int[]{6, 34, 62}, new bindString$ah$a(26, new valueOf(4, 107)), new bindString$ah$a(22, new valueOf(8, 37), new valueOf(1, 38)), new bindString$ah$a(24, new valueOf(8, 20), new valueOf(4, 21)), new bindString$ah$a(22, new valueOf(12, 11), new valueOf(4, 12))), new bindString(14, new int[]{6, 26, 46, 66}, new bindString$ah$a(30, new valueOf(3, 115), new valueOf(1, 116)), new bindString$ah$a(24, new valueOf(4, 40), new valueOf(5, 41)), new bindString$ah$a(20, new valueOf(11, 16), new valueOf(5, 17)), new bindString$ah$a(24, new valueOf(11, 12), new valueOf(5, 13))), new bindString(15, new int[]{6, 26, 48, 70}, new bindString$ah$a(22, new valueOf(5, 87), new valueOf(1, 88)), new bindString$ah$a(24, new valueOf(5, 41), new valueOf(5, 42)), new bindString$ah$a(30, new valueOf(5, 24), new valueOf(7, 25)), new bindString$ah$a(24, new valueOf(11, 12), new valueOf(7, 13))), new bindString(16, new int[]{6, 26, 50, 74}, new bindString$ah$a(24, new valueOf(5, 98), new valueOf(1, 99)), new bindString$ah$a(28, new valueOf(7, 45), new valueOf(3, 46)), new bindString$ah$a(24, new valueOf(15, 19), new valueOf(2, 20)), new bindString$ah$a(30, new valueOf(3, 15), new valueOf(13, 16))), new bindString(17, new int[]{6, 30, 54, 78}, new bindString$ah$a(28, new valueOf(1, 107), new valueOf(5, 108)), new bindString$ah$a(28, new valueOf(10, 46), new valueOf(1, 47)), new bindString$ah$a(28, new valueOf(1, 22), new valueOf(15, 23)), new bindString$ah$a(28, new valueOf(2, 14), new valueOf(17, 15))), new bindString(18, new int[]{6, 30, 56, 82}, new bindString$ah$a(30, new valueOf(5, 120), new valueOf(1, 121)), new bindString$ah$a(26, new valueOf(9, 43), new valueOf(4, 44)), new bindString$ah$a(28, new valueOf(17, 22), new valueOf(1, 23)), new bindString$ah$a(28, new valueOf(2, 14), new valueOf(19, 15))), new bindString(19, new int[]{6, 30, 58, 86}, new bindString$ah$a(28, new valueOf(3, 113), new valueOf(4, 114)), new bindString$ah$a(26, new valueOf(3, 44), new valueOf(11, 45)), new bindString$ah$a(26, new valueOf(17, 21), new valueOf(4, 22)), new bindString$ah$a(26, new valueOf(9, 13), new valueOf(16, 14))), new bindString(20, new int[]{6, 34, 62, 90}, new bindString$ah$a(28, new valueOf(3, 107), new valueOf(5, 108)), new bindString$ah$a(26, new valueOf(3, 41), new valueOf(13, 42)), new bindString$ah$a(30, new valueOf(15, 24), new valueOf(5, 25)), new bindString$ah$a(28, new valueOf(15, 15), new valueOf(10, 16))), new bindString(21, new int[]{6, 28, 50, 72, 94}, new bindString$ah$a(28, new valueOf(4, 116), new valueOf(4, 117)), new bindString$ah$a(26, new valueOf(17, 42)), new bindString$ah$a(28, new valueOf(17, 22), new valueOf(6, 23)), new bindString$ah$a(30, new valueOf(19, 16), new valueOf(6, 17))), new bindString(22, new int[]{6, 26, 50, 74, 98}, new bindString$ah$a(28, new valueOf(2, 111), new valueOf(7, 112)), new bindString$ah$a(28, new valueOf(17, 46)), new bindString$ah$a(30, new valueOf(7, 24), new valueOf(16, 25)), new bindString$ah$a(24, new valueOf(34, 13))), new bindString(23, new int[]{6, 30, 54, 78, 102}, new bindString$ah$a(30, new valueOf(4, 121), new valueOf(5, 122)), new bindString$ah$a(28, new valueOf(4, 47), new valueOf(14, 48)), new bindString$ah$a(30, new valueOf(11, 24), new valueOf(14, 25)), new bindString$ah$a(30, new valueOf(16, 15), new valueOf(14, 16))), new bindString(24, new int[]{6, 28, 54, 80, 106}, new bindString$ah$a(30, new valueOf(6, 117), new valueOf(4, 118)), new bindString$ah$a(28, new valueOf(6, 45), new valueOf(14, 46)), new bindString$ah$a(30, new valueOf(11, 24), new valueOf(16, 25)), new bindString$ah$a(30, new valueOf(30, 16), new valueOf(2, 17))), new bindString(25, new int[]{6, 32, 58, 84, 110}, new bindString$ah$a(26, new valueOf(8, 106), new valueOf(4, 107)), new bindString$ah$a(28, new valueOf(8, 47), new valueOf(13, 48)), new bindString$ah$a(30, new valueOf(7, 24), new valueOf(22, 25)), new bindString$ah$a(30, new valueOf(22, 15), new valueOf(13, 16))), new bindString(26, new int[]{6, 30, 58, 86, 114}, new bindString$ah$a(28, new valueOf(10, 114), new valueOf(2, 115)), new bindString$ah$a(28, new valueOf(19, 46), new valueOf(4, 47)), new bindString$ah$a(28, new valueOf(28, 22), new valueOf(6, 23)), new bindString$ah$a(30, new valueOf(33, 16), new valueOf(4, 17))), new bindString(27, new int[]{6, 34, 62, 90, 118}, new bindString$ah$a(30, new valueOf(8, 122), new valueOf(4, 123)), new bindString$ah$a(28, new valueOf(22, 45), new valueOf(3, 46)), new bindString$ah$a(30, new valueOf(8, 23), new valueOf(26, 24)), new bindString$ah$a(30, new valueOf(12, 15), new valueOf(28, 16))), new bindString(28, new int[]{6, 26, 50, 74, 98, 122}, new bindString$ah$a(30, new valueOf(3, 117), new valueOf(10, 118)), new bindString$ah$a(28, new valueOf(3, 45), new valueOf(23, 46)), new bindString$ah$a(30, new valueOf(4, 24), new valueOf(31, 25)), new bindString$ah$a(30, new valueOf(11, 15), new valueOf(31, 16))), new bindString(29, new int[]{6, 30, 54, 78, 102, 126}, new bindString$ah$a(30, new valueOf(7, 116), new valueOf(7, 117)), new bindString$ah$a(28, new valueOf(21, 45), new valueOf(7, 46)), new bindString$ah$a(30, new valueOf(1, 23), new valueOf(37, 24)), new bindString$ah$a(30, new valueOf(19, 15), new valueOf(26, 16))), new bindString(30, new int[]{6, 26, 52, 78, 104, 130}, new bindString$ah$a(30, new valueOf(5, 115), new valueOf(10, 116)), new bindString$ah$a(28, new valueOf(19, 47), new valueOf(10, 48)), new bindString$ah$a(30, new valueOf(15, 24), new valueOf(25, 25)), new bindString$ah$a(30, new valueOf(23, 15), new valueOf(25, 16))), new bindString(31, new int[]{6, 30, 56, 82, 108, 134}, new bindString$ah$a(30, new valueOf(13, 115), new valueOf(3, 116)), new bindString$ah$a(28, new valueOf(2, 46), new valueOf(29, 47)), new bindString$ah$a(30, new valueOf(42, 24), new valueOf(1, 25)), new bindString$ah$a(30, new valueOf(23, 15), new valueOf(28, 16))), new bindString(32, new int[]{6, 34, 60, 86, 112, 138}, new bindString$ah$a(30, new valueOf(17, 115)), new bindString$ah$a(28, new valueOf(10, 46), new valueOf(23, 47)), new bindString$ah$a(30, new valueOf(10, 24), new valueOf(35, 25)), new bindString$ah$a(30, new valueOf(19, 15), new valueOf(35, 16))), new bindString(33, new int[]{6, 30, 58, 86, 114, 142}, new bindString$ah$a(30, new valueOf(17, 115), new valueOf(1, 116)), new bindString$ah$a(28, new valueOf(14, 46), new valueOf(21, 47)), new bindString$ah$a(30, new valueOf(29, 24), new valueOf(19, 25)), new bindString$ah$a(30, new valueOf(11, 15), new valueOf(46, 16))), new bindString(34, new int[]{6, 34, 62, 90, 118, 146}, new bindString$ah$a(30, new valueOf(13, 115), new valueOf(6, 116)), new bindString$ah$a(28, new valueOf(14, 46), new valueOf(23, 47)), new bindString$ah$a(30, new valueOf(44, 24), new valueOf(7, 25)), new bindString$ah$a(30, new valueOf(59, 16), new valueOf(1, 17))), new bindString(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new bindString$ah$a(30, new valueOf(12, 121), new valueOf(7, 122)), new bindString$ah$a(28, new valueOf(12, 47), new valueOf(26, 48)), new bindString$ah$a(30, new valueOf(39, 24), new valueOf(14, 25)), new bindString$ah$a(30, new valueOf(22, 15), new valueOf(41, 16))), new bindString(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new bindString$ah$a(30, new valueOf(6, 121), new valueOf(14, 122)), new bindString$ah$a(28, new valueOf(6, 47), new valueOf(34, 48)), new bindString$ah$a(30, new valueOf(46, 24), new valueOf(10, 25)), new bindString$ah$a(30, new valueOf(2, 15), new valueOf(64, 16))), new bindString(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new bindString$ah$a(30, new valueOf(17, 122), new valueOf(4, 123)), new bindString$ah$a(28, new valueOf(29, 46), new valueOf(14, 47)), new bindString$ah$a(30, new valueOf(49, 24), new valueOf(10, 25)), new bindString$ah$a(30, new valueOf(24, 15), new valueOf(46, 16))), new bindString(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new bindString$ah$a(30, new valueOf(4, 122), new valueOf(18, 123)), new bindString$ah$a(28, new valueOf(13, 46), new valueOf(32, 47)), new bindString$ah$a(30, new valueOf(48, 24), new valueOf(14, 25)), new bindString$ah$a(30, new valueOf(42, 15), new valueOf(32, 16))), new bindString(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new bindString$ah$a(30, new valueOf(20, 117), new valueOf(4, 118)), new bindString$ah$a(28, new valueOf(40, 47), new valueOf(7, 48)), new bindString$ah$a(30, new valueOf(43, 24), new valueOf(22, 25)), new bindString$ah$a(30, new valueOf(10, 15), new valueOf(67, 16))), new bindString(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new bindString$ah$a(30, new valueOf(19, 118), new valueOf(6, 119)), new bindString$ah$a(28, new valueOf(18, 47), new valueOf(31, 48)), new bindString$ah$a(30, new valueOf(34, 24), new valueOf(34, 25)), new bindString$ah$a(30, new valueOf(20, 15), new valueOf(61, 16)))};
    }
}
