package o;

import java.util.Arrays;
import org.apache.http.message.TokenParser;
/* loaded from: classes6.dex */
public final class getSelection {
    private static final int[] HaptikSDK$a;
    private static final int[] HaptikSDK$b;
    private static final int[] HaptikSDK$c;
    private static final int[] ag$a;
    private static final int[] ah$a;
    private static final int[] ah$b;
    private static final int[] invoke;
    private static final char[] toString;
    private static final int[] valueOf;
    private static final byte[] values;

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        toString = charArray;
        int length = charArray.length;
        values = new byte[length];
        for (int i = 0; i < length; i++) {
            values[i] = (byte) toString[i];
        }
        int[] iArr = new int[256];
        for (int i2 = 0; i2 < 32; i2++) {
            iArr[i2] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        ag$a = iArr;
        int[] iArr2 = new int[256];
        System.arraycopy(iArr, 0, iArr2, 0, 256);
        for (int i3 = 128; i3 < 256; i3++) {
            iArr2[i3] = (i3 & 224) == 192 ? 2 : (i3 & 240) == 224 ? 3 : (i3 & 248) == 240 ? 4 : -1;
        }
        HaptikSDK$b = iArr2;
        int[] iArr3 = new int[256];
        Arrays.fill(iArr3, -1);
        for (int i4 = 33; i4 < 256; i4++) {
            if (Character.isJavaIdentifierPart((char) i4)) {
                iArr3[i4] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        invoke = iArr3;
        int[] iArr4 = new int[256];
        System.arraycopy(iArr3, 0, iArr4, 0, 256);
        Arrays.fill(iArr4, 128, 128, 0);
        HaptikSDK$a = iArr4;
        int[] iArr5 = new int[256];
        int[] iArr6 = HaptikSDK$b;
        System.arraycopy(iArr6, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        valueOf = iArr5;
        int[] iArr7 = new int[256];
        System.arraycopy(iArr6, 128, iArr7, 128, 128);
        Arrays.fill(iArr7, 0, 32, -1);
        iArr7[32] = 1;
        iArr7[9] = 1;
        iArr7[10] = 10;
        iArr7[13] = 13;
        iArr7[47] = 47;
        iArr7[35] = 35;
        ah$b = iArr7;
        int[] iArr8 = new int[128];
        for (int i5 = 0; i5 < 32; i5++) {
            iArr8[i5] = -1;
        }
        iArr8[34] = 34;
        iArr8[92] = 92;
        iArr8[8] = 98;
        iArr8[9] = 116;
        iArr8[12] = 102;
        iArr8[10] = 110;
        iArr8[13] = 114;
        HaptikSDK$c = iArr8;
        int[] iArr9 = new int[256];
        ah$a = iArr9;
        Arrays.fill(iArr9, -1);
        for (int i6 = 0; i6 < 10; i6++) {
            ah$a[i6 + 48] = i6;
        }
        for (int i7 = 0; i7 < 6; i7++) {
            int[] iArr10 = ah$a;
            int i8 = i7 + 10;
            iArr10[i7 + 97] = i8;
            iArr10[i7 + 65] = i8;
        }
    }

    public static int[] invoke() {
        return ag$a;
    }

    public static int[] valueOf(int i) {
        if (i == 34) {
            return HaptikSDK$c;
        }
        return values.values.toString(i);
    }

    public static void valueOf(StringBuilder sb, String str) {
        int[] iArr = HaptikSDK$c;
        int length = iArr.length;
        int length2 = str.length();
        for (int i = 0; i < length2; i++) {
            char charAt = str.charAt(i);
            if (charAt >= length || iArr[charAt] == 0) {
                sb.append(charAt);
            } else {
                sb.append(TokenParser.ESCAPE);
                int i2 = iArr[charAt];
                if (i2 < 0) {
                    sb.append('u');
                    sb.append('0');
                    sb.append('0');
                    char[] cArr = toString;
                    sb.append(cArr[charAt >> 4]);
                    sb.append(cArr[charAt & 15]);
                } else {
                    sb.append((char) i2);
                }
            }
        }
    }

    public static char[] ah$a() {
        return (char[]) toString.clone();
    }

    public static byte[] values() {
        return (byte[]) values.clone();
    }

    /* loaded from: classes6.dex */
    static class values {
        public static final values values = new values();
        private int[][] valueOf = new int[128];

        private values() {
        }

        public int[] toString(int i) {
            int[] iArr = this.valueOf[i];
            if (iArr == null) {
                iArr = Arrays.copyOf(getSelection.HaptikSDK$c, 128);
                if (iArr[i] == 0) {
                    iArr[i] = -1;
                }
                this.valueOf[i] = iArr;
            }
            return iArr;
        }
    }
}
