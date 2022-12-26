package o;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.Route;
/* loaded from: classes5.dex */
public final class isSplitSupported {
    private static int[] toString = {-537955157, -1806249835, -1376050373, -718005982, 1418885431, 1258064266, 327613433, 280501385, -1799924649, -1020093913, 332792459, -565341593, -583047238, -1187472211, 1273051556, 1421952514, -97999289, -1747035934};
    private final Set<Route> valueOf = new LinkedHashSet();

    public final void values(Route route) {
        synchronized (this) {
            runAnimators.ag$a(route, "failedRoute");
            this.valueOf.add(route);
        }
    }

    public final void ag$a(Route route) {
        synchronized (this) {
            runAnimators.ag$a(route, toString(new int[]{1198267841, 1903980554, -97348317, 1859765285}, 4 - TextUtils.lastIndexOf("", '0', 0)).intern());
            this.valueOf.remove(route);
        }
    }

    public final boolean ah$a(Route route) {
        boolean contains;
        synchronized (this) {
            runAnimators.ag$a(route, toString(new int[]{1198267841, 1903980554, -97348317, 1859765285}, 5 - Drawable.resolveOpacity(0, 0)).intern());
            contains = this.valueOf.contains(route);
        }
        return contains;
    }

    private static String toString(int[] iArr, int i) {
        String str;
        synchronized (getDouble.ag$a) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) toString.clone();
            getDouble.toString = 0;
            while (getDouble.toString < iArr.length) {
                cArr[0] = (char) (iArr[getDouble.toString] >> 16);
                cArr[1] = (char) iArr[getDouble.toString];
                cArr[2] = (char) (iArr[getDouble.toString + 1] >> 16);
                cArr[3] = (char) iArr[getDouble.toString + 1];
                getDouble.valueOf = (cArr[0] << 16) + cArr[1];
                getDouble.values = (cArr[2] << 16) + cArr[3];
                getDouble.values(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = getDouble.valueOf ^ iArr2[i2];
                    getDouble.valueOf = i3;
                    getDouble.values = getDouble.toString(i3) ^ getDouble.values;
                    int i4 = getDouble.valueOf;
                    getDouble.valueOf = getDouble.values;
                    getDouble.values = i4;
                }
                int i5 = getDouble.valueOf;
                getDouble.valueOf = getDouble.values;
                getDouble.values = i5;
                getDouble.values = i5 ^ iArr2[16];
                getDouble.valueOf ^= iArr2[17];
                int i6 = getDouble.valueOf;
                int i7 = getDouble.values;
                cArr[0] = (char) (getDouble.valueOf >>> 16);
                cArr[1] = (char) getDouble.valueOf;
                cArr[2] = (char) (getDouble.values >>> 16);
                cArr[3] = (char) getDouble.values;
                getDouble.values(iArr2);
                cArr2[getDouble.toString << 1] = cArr[0];
                cArr2[(getDouble.toString << 1) + 1] = cArr[1];
                cArr2[(getDouble.toString << 1) + 2] = cArr[2];
                cArr2[(getDouble.toString << 1) + 3] = cArr[3];
                getDouble.toString += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
