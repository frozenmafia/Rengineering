package o;

import java.io.File;
/* loaded from: classes3.dex */
public final class getScaledVerticalScrollFactor$ag$a {
    private final String ag$a;
    private final File[] ah$a;
    private final long toString;
    final /* synthetic */ getScaledVerticalScrollFactor valueOf;
    private final long[] values;

    private getScaledVerticalScrollFactor$ag$a(getScaledVerticalScrollFactor getscaledverticalscrollfactor, String str, long j, File[] fileArr, long[] jArr) {
        this.valueOf = getscaledverticalscrollfactor;
        this.ag$a = str;
        this.toString = j;
        this.ah$a = fileArr;
        this.values = jArr;
    }

    public File valueOf(int i) {
        return this.ah$a[i];
    }
}
