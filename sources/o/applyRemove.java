package o;
/* loaded from: classes7.dex */
public class applyRemove extends consumePostponedUpdates {
    private static final char[] ah$a = {'+'};
    private static final char[] valueOf = "0123456789ABCDEF".toCharArray();
    private final boolean[] toString;
    private final boolean values;

    public applyRemove(String str) {
        this(str, false);
    }

    @Deprecated
    public applyRemove(String str, boolean z) {
        if (str.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric ASCII characters are always 'safe' and should not be escaped.");
        }
        if (z && str.contains(com.dreampay.commons.constants.Constants.WHITE_SPACE)) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        if (str.contains("%")) {
            throw new IllegalArgumentException("The '%' character cannot be specified as 'safe'");
        }
        this.values = z;
        this.toString = toString(str);
    }

    private static boolean[] toString(String str) {
        char[] charArray = str.toCharArray();
        int i = 122;
        for (char c : charArray) {
            i = Math.max((int) c, i);
        }
        boolean[] zArr = new boolean[i + 1];
        for (int i2 = 48; i2 <= 57; i2++) {
            zArr[i2] = true;
        }
        for (int i3 = 65; i3 <= 90; i3++) {
            zArr[i3] = true;
        }
        for (int i4 = 97; i4 <= 122; i4++) {
            zArr[i4] = true;
        }
        for (char c2 : charArray) {
            zArr[c2] = true;
        }
        return zArr;
    }

    @Override // o.consumePostponedUpdates
    protected int values(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            boolean[] zArr = this.toString;
            if (charAt >= zArr.length || !zArr[charAt]) {
                break;
            }
            i++;
        }
        return i;
    }

    @Override // o.applyMove
    public String values(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            boolean[] zArr = this.toString;
            if (charAt >= zArr.length || !zArr[charAt]) {
                return ah$a(str, i);
            }
        }
        return str;
    }

    @Override // o.consumePostponedUpdates
    protected char[] toString(int i) {
        boolean[] zArr = this.toString;
        if (i >= zArr.length || !zArr[i]) {
            if (i == 32 && this.values) {
                return ah$a;
            }
            if (i <= 127) {
                char[] cArr = valueOf;
                return new char[]{'%', cArr[i >>> 4], cArr[i & 15]};
            } else if (i <= 2047) {
                char[] cArr2 = valueOf;
                char[] cArr3 = {'%', cArr2[(r14 >>> 4) | 12], cArr2[r14 & 15], '%', cArr2[(r14 & 3) | 8], cArr2[i & 15]};
                int i2 = i >>> 4;
                int i3 = i2 >>> 2;
                return cArr3;
            } else if (i <= 65535) {
                char[] cArr4 = valueOf;
                char[] cArr5 = {'%', 'E', cArr4[r14 >>> 2], '%', cArr4[(r14 & 3) | 8], cArr4[r14 & 15], '%', cArr4[(r14 & 3) | 8], cArr4[i & 15]};
                int i4 = i >>> 4;
                int i5 = i4 >>> 2;
                int i6 = i5 >>> 4;
                return cArr5;
            } else if (i <= 1114111) {
                char[] cArr6 = valueOf;
                char[] cArr7 = {'%', 'F', cArr6[(r14 >>> 2) & 7], '%', cArr6[(r14 & 3) | 8], cArr6[r14 & 15], '%', cArr6[(r14 & 3) | 8], cArr6[r14 & 15], '%', cArr6[(r14 & 3) | 8], cArr6[i & 15]};
                int i7 = i >>> 4;
                int i8 = i7 >>> 2;
                int i9 = i8 >>> 4;
                int i10 = i9 >>> 2;
                int i11 = i10 >>> 4;
                return cArr7;
            } else {
                throw new IllegalArgumentException("Invalid unicode character value " + i);
            }
        }
        return null;
    }
}
