package o;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public final class isWriteAheadLoggingEnabled {
    private final List<getPath> ag$a;
    private final getPageSize values;

    public isWriteAheadLoggingEnabled(getPageSize getpagesize) {
        this.values = getpagesize;
        ArrayList arrayList = new ArrayList();
        this.ag$a = arrayList;
        arrayList.add(new getPath(getpagesize, new int[]{1}));
    }

    private getPath ah$a(int i) {
        if (i >= this.ag$a.size()) {
            List<getPath> list = this.ag$a;
            getPath getpath = list.get(list.size() - 1);
            for (int size = this.ag$a.size(); size <= i; size++) {
                getPageSize getpagesize = this.values;
                getpath = getpath.ah$a(new getPath(getpagesize, new int[]{1, getpagesize.toString((size - 1) + getpagesize.valueOf())}));
                this.ag$a.add(getpath);
            }
        }
        return this.ag$a.get(i);
    }

    public void valueOf(int[] iArr, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        getPath ah$a = ah$a(i);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] values = new getPath(this.values, iArr2).values(i, 1).values(ah$a)[1].values();
        int length2 = i - values.length;
        for (int i2 = 0; i2 < length2; i2++) {
            iArr[length + i2] = 0;
        }
        System.arraycopy(values, 0, iArr, length + length2, values.length);
    }
}
