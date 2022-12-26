package o;
/* loaded from: classes7.dex */
public abstract class consumePostponedUpdates extends applyMove {
    protected abstract char[] toString(int i);

    protected abstract int values(CharSequence charSequence, int i, int i2);

    /* JADX INFO: Access modifiers changed from: protected */
    public final String ah$a(String str, int i) {
        char[] cArr;
        int length = str.length();
        cArr = updatePositionWithPostponed.toString.get();
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int valueOf = valueOf(str, i, length);
            if (valueOf < 0) {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
            char[] consumepostponedupdates = toString(valueOf);
            int i4 = (Character.isSupplementaryCodePoint(valueOf) ? 2 : 1) + i;
            if (consumepostponedupdates != null) {
                int i5 = i - i2;
                int i6 = i3 + i5;
                int length2 = consumepostponedupdates.length + i6;
                if (cArr.length < length2) {
                    cArr = values(cArr, i3, ((length2 + length) - i) + 32);
                }
                if (i5 > 0) {
                    str.getChars(i2, i, cArr, i3);
                    i3 = i6;
                }
                if (consumepostponedupdates.length > 0) {
                    System.arraycopy(consumepostponedupdates, 0, cArr, i3, consumepostponedupdates.length);
                    i3 += consumepostponedupdates.length;
                }
                i2 = i4;
            }
            i = values(str, i4, length);
        }
        int i7 = length - i2;
        if (i7 > 0) {
            int i8 = i7 + i3;
            if (cArr.length < i8) {
                cArr = values(cArr, i3, i8);
            }
            str.getChars(i2, length, cArr, i3);
            i3 = i8;
        }
        return new String(cArr, 0, i3);
    }

    protected static int valueOf(CharSequence charSequence, int i, int i2) {
        if (i < i2) {
            int i3 = i + 1;
            char charAt = charSequence.charAt(i);
            if (charAt < 55296 || charAt > 57343) {
                return charAt;
            }
            if (charAt > 56319) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected low surrogate character '");
                sb.append(charAt);
                sb.append("' with value ");
                sb.append((int) charAt);
                sb.append(" at index ");
                sb.append(i3 - 1);
                throw new IllegalArgumentException(sb.toString());
            } else if (i3 == i2) {
                return -charAt;
            } else {
                char charAt2 = charSequence.charAt(i3);
                if (Character.isLowSurrogate(charAt2)) {
                    return Character.toCodePoint(charAt, charAt2);
                }
                throw new IllegalArgumentException("Expected low surrogate but got char '" + charAt2 + "' with value " + ((int) charAt2) + " at index " + i3);
            }
        }
        throw new IndexOutOfBoundsException("Index exceeds specified range");
    }

    private static char[] values(char[] cArr, int i, int i2) {
        char[] cArr2 = new char[i2];
        if (i > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i);
        }
        return cArr2;
    }
}
