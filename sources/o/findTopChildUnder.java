package o;

import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class findTopChildUnder implements getViewHorizontalDragRange {
    private static int ag$a = 104;
    private static int ah$a = 0;
    private static int valueOf = 1;
    private final getDrawableFromResource toString;
    private final setCurrentTabTag values;

    public boolean equals(Object obj) {
        try {
            if ((this == obj ? '\t' : 'A') != 'A') {
                int i = valueOf + 101;
                ah$a = i % 128;
                int i2 = i % 2;
                return true;
            }
            if ((obj instanceof findTopChildUnder ? ':' : 'A') != ':') {
                int i3 = ah$a + 45;
                valueOf = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            try {
                findTopChildUnder findtopchildunder = (findTopChildUnder) obj;
                if (!runAnimators.values(this.toString, findtopchildunder.toString)) {
                    int i5 = ah$a + 97;
                    valueOf = i5 % 128;
                    int i6 = i5 % 2;
                    return false;
                }
                if (!runAnimators.values(this.values, findtopchildunder.values)) {
                    int i7 = valueOf + 1;
                    ah$a = i7 % 128;
                    int i8 = i7 % 2;
                    return false;
                }
                return true;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public int hashCode() {
        int i = valueOf + 75;
        ah$a = i % 128;
        int i2 = i % 2;
        int hashCode = (this.toString.hashCode() * 31) + this.values.hashCode();
        try {
            int i3 = valueOf + 119;
            ah$a = i3 % 128;
            int i4 = i3 % 2;
            return hashCode;
        } catch (Exception e) {
            throw e;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:7:0x002d
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public java.lang.String toString() {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SearchCancelled(_interaction="
            r0.append(r1)     // Catch: java.lang.Exception -> L2f
            o.getDrawableFromResource r1 = r3.toString     // Catch: java.lang.Exception -> L2f
            r0.append(r1)     // Catch: java.lang.Exception -> L2f
            java.lang.String r1 = ", _source="
            r0.append(r1)
            o.setCurrentTabTag r1 = r3.values
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            int r1 = o.findTopChildUnder.ah$a
            int r1 = r1 + 97
            int r2 = r1 % 128
            o.findTopChildUnder.valueOf = r2
            int r1 = r1 % 2
            return r0
        L2d:
            r0 = move-exception
            throw r0
        L2f:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.findTopChildUnder.toString():java.lang.String");
    }

    public findTopChildUnder(getDrawableFromResource getdrawablefromresource, setCurrentTabTag setcurrenttabtag) {
        runAnimators.ag$a(getdrawablefromresource, "_interaction");
        runAnimators.ag$a(setcurrenttabtag, "_source");
        this.toString = getdrawablefromresource;
        this.values = setcurrenttabtag;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "SearchCancelled");
        hashMap.put("interaction", this.toString.ag$a());
        hashMap.put(ag$a(4 - MotionEvent.axisFromString(""), 213 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), false, 6 - View.getDefaultSize(0, 0), new char[]{2, '\b', 5, 65526, 65528, 6}).intern(), this.values.ah$a());
        int i = valueOf + 109;
        ah$a = i % 128;
        int i2 = i % 2;
        return hashMap;
    }

    private static String ag$a(int i, int i2, boolean z, int i3, char[] cArr) {
        String str;
        synchronized (isAfterLast.valueOf) {
            char[] cArr2 = new char[i3];
            isAfterLast.values = 0;
            while (isAfterLast.values < i3) {
                isAfterLast.ag$a = cArr[isAfterLast.values];
                cArr2[isAfterLast.values] = (char) (isAfterLast.ag$a + i2);
                int i4 = isAfterLast.values;
                cArr2[i4] = (char) (cArr2[i4] - ag$a);
                isAfterLast.values++;
            }
            if (i > 0) {
                isAfterLast.toString = i;
                char[] cArr3 = new char[i3];
                System.arraycopy(cArr2, 0, cArr3, 0, i3);
                System.arraycopy(cArr3, 0, cArr2, i3 - isAfterLast.toString, isAfterLast.toString);
                System.arraycopy(cArr3, isAfterLast.toString, cArr2, 0, i3 - isAfterLast.toString);
            }
            if (z) {
                char[] cArr4 = new char[i3];
                isAfterLast.values = 0;
                while (isAfterLast.values < i3) {
                    cArr4[isAfterLast.values] = cArr2[(i3 - isAfterLast.values) - 1];
                    isAfterLast.values++;
                }
                cArr2 = cArr4;
            }
            str = new String(cArr2);
        }
        return str;
    }
}
