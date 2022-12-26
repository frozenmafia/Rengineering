package o;

import o.Fragment;
/* loaded from: classes4.dex */
public class onPreAttached {
    public static int valueOf(int... iArr) {
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(iArr.length > 0));
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (iArr[i2] > i) {
                i = iArr[i2];
            }
        }
        return i;
    }
}
