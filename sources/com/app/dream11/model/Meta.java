package com.app.dream11.model;

import o.isClosed;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class Meta {
    private static char[] ah$a = {'^', 183, 182, 187, 191};
    private static int toString = 0;
    private static int valueOf = 1;
    private final String token;

    public static /* synthetic */ Meta copy$default(Meta meta, String str, int i, Object obj) {
        if (((i & 1) != 0 ? (char) 7 : 'a') != 'a') {
            int i2 = valueOf + 19;
            toString = i2 % 128;
            int i3 = i2 % 2;
            try {
                str = meta.token;
            } catch (Exception e) {
                throw e;
            }
        }
        Meta copy = meta.copy(str);
        int i4 = valueOf + 17;
        toString = i4 % 128;
        if ((i4 % 2 != 0 ? '*' : (char) 27) != '*') {
            return copy;
        }
        Object obj2 = null;
        super.hashCode();
        return copy;
    }

    public final String component1() {
        int i = toString + 3;
        valueOf = i % 128;
        int i2 = i % 2;
        String str = this.token;
        try {
            int i3 = valueOf + 83;
            toString = i3 % 128;
            if (!(i3 % 2 == 0)) {
                int i4 = 5 / 0;
                return str;
            }
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final Meta copy(String str) {
        runAnimators.ag$a(str, values(true, new int[]{0, 5, 78, 0}, new byte[]{0, 1, 0, 0, 1}).intern());
        Meta meta = new Meta(str);
        int i = valueOf + 29;
        toString = i % 128;
        if (i % 2 == 0) {
            return meta;
        }
        Object obj = null;
        super.hashCode();
        return meta;
    }

    public boolean equals(Object obj) {
        int i = toString + 5;
        valueOf = i % 128;
        int i2 = i % 2;
        if (this != obj) {
            return (!(obj instanceof Meta) ? '?' : '\n') != '?' && runAnimators.values((Object) this.token, (Object) ((Meta) obj).token);
        }
        int i3 = toString + 15;
        valueOf = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 55 / 0;
            return true;
        }
        return true;
    }

    public int hashCode() {
        int i = valueOf + 71;
        toString = i % 128;
        int i2 = i % 2;
        int hashCode = this.token.hashCode();
        int i3 = valueOf + 45;
        toString = i3 % 128;
        if (!(i3 % 2 != 0)) {
            return hashCode;
        }
        int i4 = 19 / 0;
        return hashCode;
    }

    public String toString() {
        try {
            String str = this.token;
            StringBuilder sb = new StringBuilder();
            sb.append("Meta(token=");
            sb.append(str);
            sb.append(")");
            String sb2 = sb.toString();
            int i = toString + 115;
            valueOf = i % 128;
            if ((i % 2 == 0 ? ')' : '7') != ')') {
                return sb2;
            }
            int i2 = 8 / 0;
            return sb2;
        } catch (Exception e) {
            throw e;
        }
    }

    public Meta(String str) {
        runAnimators.ag$a(str, values(true, new int[]{0, 5, 78, 0}, new byte[]{0, 1, 0, 0, 1}).intern());
        this.token = str;
    }

    public final String getToken() {
        try {
            int i = valueOf + 31;
            toString = i % 128;
            int i2 = i % 2;
            String str = this.token;
            int i3 = valueOf + 103;
            toString = i3 % 128;
            if ((i3 % 2 != 0 ? 'E' : '$') != 'E') {
                return str;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String values(boolean z, int[] iArr, byte[] bArr) {
        String str;
        synchronized (isClosed.ah$a) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(ah$a, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                isClosed.ag$a = 0;
                char c = 0;
                while (isClosed.ag$a < i2) {
                    if (bArr[isClosed.ag$a] == 1) {
                        cArr2[isClosed.ag$a] = (char) (((cArr[isClosed.ag$a] << 1) + 1) - c);
                    } else {
                        cArr2[isClosed.ag$a] = (char) ((cArr[isClosed.ag$a] << 1) - c);
                    }
                    c = cArr2[isClosed.ag$a];
                    isClosed.ag$a++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                isClosed.ag$a = 0;
                while (isClosed.ag$a < i2) {
                    cArr4[isClosed.ag$a] = cArr[(i2 - isClosed.ag$a) - 1];
                    isClosed.ag$a++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                isClosed.ag$a = 0;
                while (isClosed.ag$a < i2) {
                    cArr[isClosed.ag$a] = (char) (cArr[isClosed.ag$a] - iArr[2]);
                    isClosed.ag$a++;
                }
            }
            str = new String(cArr);
        }
        return str;
    }
}
