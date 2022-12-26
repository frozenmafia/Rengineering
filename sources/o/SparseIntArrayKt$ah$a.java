package o;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SparseIntArrayKt$ah$a {
    public final Set<String> ag$a;
    public final String ah$a;
    public final String toString;
    public final int valueOf;

    private SparseIntArrayKt$ah$a(String str, int i, String str2, Set<String> set) {
        this.valueOf = i;
        this.ah$a = str;
        this.toString = str2;
        this.ag$a = set;
    }

    public static SparseIntArrayKt$ah$a values(String str, int i) {
        String str2;
        String trim = str.trim();
        FingerprintManagerCompat.toString(!trim.isEmpty());
        int indexOf = trim.indexOf(com.dreampay.commons.constants.Constants.WHITE_SPACE);
        if (indexOf == -1) {
            str2 = "";
        } else {
            String trim2 = trim.substring(indexOf).trim();
            trim = trim.substring(0, indexOf);
            str2 = trim2;
        }
        String[] ah$a = getElevationDegrees.ah$a(trim, "\\.");
        String str3 = ah$a[0];
        HashSet hashSet = new HashSet();
        for (int i2 = 1; i2 < ah$a.length; i2++) {
            hashSet.add(ah$a[i2]);
        }
        return new SparseIntArrayKt$ah$a(str3, i, str2, hashSet);
    }

    public static SparseIntArrayKt$ah$a ah$a() {
        return new SparseIntArrayKt$ah$a("", 0, "", Collections.emptySet());
    }
}
