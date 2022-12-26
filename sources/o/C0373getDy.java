package o;

import android.os.Process;
import com.google.android.gms.common.internal.Objects;
/* renamed from: o.getDy  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C0373getDy {
    private static int ag$a = 1;
    private static long ah$a = 5952925154661517196L;
    private static int valueOf;
    private String values;

    public C0373getDy(String str) {
        this.values = str;
    }

    public String ah$a() {
        int i = valueOf + 19;
        ag$a = i % 128;
        int i2 = i % 2;
        String str = this.values;
        int i3 = ag$a + 41;
        valueOf = i3 % 128;
        if ((i3 % 2 != 0 ? (char) 28 : (char) 22) != 22) {
            Object obj = null;
            super.hashCode();
            return str;
        }
        return str;
    }

    public int hashCode() {
        int i = ag$a + 109;
        valueOf = i % 128;
        if ((i % 2 != 0 ? (char) 2 : (char) 3) != 2) {
            try {
                Object[] objArr = new Object[1];
                objArr[0] = this.values;
                try {
                    return Objects.hashCode(objArr);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        return Objects.hashCode(this.values);
    }

    public String toString() {
        Objects.ToStringHelper stringHelper;
        String values;
        int i = valueOf + 87;
        ag$a = i % 128;
        if (i % 2 != 0) {
            stringHelper = Objects.toStringHelper(this);
            values = values(new char[]{18424, 59258, 1749, 42530, 50566}, 41113 - (Process.myTid() >> 22));
        } else {
            stringHelper = Objects.toStringHelper(this);
            values = values(new char[]{18424, 59258, 1749, 42530, 50566}, (Process.myTid() - 104) * 41113);
        }
        return stringHelper.add(values.intern(), this.values).toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0021, code lost:
        if ((!(r4 instanceof o.C0373getDy)) != true) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
        if ((r4 instanceof o.C0373getDy) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002a, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002b, code lost:
        r4 = com.google.android.gms.common.internal.Objects.equal(r3.values, ((o.C0373getDy) r4).values);
        r0 = o.C0373getDy.valueOf + 43;
        o.C0373getDy.ag$a = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = o.C0373getDy.valueOf     // Catch: java.lang.Exception -> L42
            int r0 = r0 + 99
            int r1 = r0 % 128
            o.C0373getDy.ag$a = r1     // Catch: java.lang.Exception -> L42
            int r0 = r0 % 2
            r1 = 56
            if (r0 != 0) goto L11
            r0 = 76
            goto L13
        L11:
            r0 = 56
        L13:
            r2 = 0
            if (r0 == r1) goto L26
            boolean r0 = r4 instanceof o.C0373getDy     // Catch: java.lang.Exception -> L40
            r1 = 43
            int r1 = r1 / r2
            r1 = 1
            if (r0 != 0) goto L20
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            if (r0 == r1) goto L2a
            goto L2b
        L24:
            r4 = move-exception
            throw r4
        L26:
            boolean r0 = r4 instanceof o.C0373getDy     // Catch: java.lang.Exception -> L40
            if (r0 != 0) goto L2b
        L2a:
            return r2
        L2b:
            o.getDy r4 = (o.C0373getDy) r4
            java.lang.String r0 = r3.values
            java.lang.String r4 = r4.values
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r0, r4)
            int r0 = o.C0373getDy.valueOf
            int r0 = r0 + 43
            int r1 = r0 % 128
            o.C0373getDy.ag$a = r1
            int r0 = r0 % 2
            return r4
        L40:
            r4 = move-exception
            throw r4
        L42:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0373getDy.equals(java.lang.Object):boolean");
    }

    private static String values(char[] cArr, int i) {
        String str;
        synchronized (isBeforeFirst.toString) {
            isBeforeFirst.ah$a = i;
            char[] cArr2 = new char[cArr.length];
            isBeforeFirst.valueOf = 0;
            while (isBeforeFirst.valueOf < cArr.length) {
                cArr2[isBeforeFirst.valueOf] = (char) ((cArr[isBeforeFirst.valueOf] ^ (isBeforeFirst.valueOf * isBeforeFirst.ah$a)) ^ ah$a);
                isBeforeFirst.valueOf++;
            }
            str = new String(cArr2);
        }
        return str;
    }
}
