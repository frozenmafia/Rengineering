package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
/* loaded from: classes7.dex */
public abstract class EntityBuffer<T> extends AbstractDataBuffer<T> {
    private boolean zaa;
    private ArrayList zab;

    protected EntityBuffer(DataHolder dataHolder) {
        super(dataHolder);
        this.zaa = false;
    }

    private final void zab() {
        synchronized (this) {
            if (!this.zaa) {
                int count = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getCount();
                ArrayList arrayList = new ArrayList();
                this.zab = arrayList;
                if (count > 0) {
                    arrayList.add(0);
                    String primaryDataMarkerColumn = getPrimaryDataMarkerColumn();
                    String string = this.mDataHolder.getString(primaryDataMarkerColumn, 0, this.mDataHolder.getWindowIndex(0));
                    for (int i = 1; i < count; i++) {
                        int windowIndex = this.mDataHolder.getWindowIndex(i);
                        String string2 = this.mDataHolder.getString(primaryDataMarkerColumn, i, windowIndex);
                        if (string2 == null) {
                            throw new NullPointerException("Missing value for markerColumn: " + primaryDataMarkerColumn + ", at row: " + i + ", for window: " + windowIndex);
                        }
                        if (!string2.equals(string)) {
                            this.zab.add(Integer.valueOf(i));
                            string = string2;
                        }
                    }
                }
                this.zaa = true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
        if (r5.mDataHolder.getString(r3, r6, r2) == null) goto L19;
     */
    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T get(int r6) {
        /*
            r5 = this;
            r5.zab()
            int r0 = r5.zaa(r6)
            r1 = 1
            if (r6 < 0) goto L73
            java.util.ArrayList r2 = r5.zab
            int r2 = r2.size()
            if (r6 != r2) goto L13
            goto L73
        L13:
            java.util.ArrayList r2 = r5.zab
            int r2 = r2.size()
            int r2 = r2 - r1
            if (r6 != r2) goto L35
            com.google.android.gms.common.data.DataHolder r2 = r5.mDataHolder
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.android.gms.common.data.DataHolder r2 = (com.google.android.gms.common.data.DataHolder) r2
            int r2 = r2.getCount()
            java.util.ArrayList r3 = r5.zab
            java.lang.Object r3 = r3.get(r6)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L4f
        L35:
            java.util.ArrayList r2 = r5.zab
            int r3 = r6 + 1
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.util.ArrayList r3 = r5.zab
            java.lang.Object r3 = r3.get(r6)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
        L4f:
            int r2 = r2 - r3
            if (r2 != r1) goto L71
            int r6 = r5.zaa(r6)
            com.google.android.gms.common.data.DataHolder r2 = r5.mDataHolder
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.android.gms.common.data.DataHolder r2 = (com.google.android.gms.common.data.DataHolder) r2
            int r2 = r2.getWindowIndex(r6)
            java.lang.String r3 = r5.getChildDataMarkerColumn()
            if (r3 == 0) goto L74
            com.google.android.gms.common.data.DataHolder r4 = r5.mDataHolder
            java.lang.String r6 = r4.getString(r3, r6, r2)
            if (r6 != 0) goto L74
            goto L73
        L71:
            r1 = r2
            goto L74
        L73:
            r1 = 0
        L74:
            java.lang.Object r6 = r5.getEntry(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.EntityBuffer.get(int):java.lang.Object");
    }

    protected String getChildDataMarkerColumn() {
        return null;
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public int getCount() {
        zab();
        return this.zab.size();
    }

    protected abstract T getEntry(int i, int i2);

    protected abstract String getPrimaryDataMarkerColumn();

    final int zaa(int i) {
        if (i < 0 || i >= this.zab.size()) {
            throw new IllegalArgumentException("Position " + i + " is out of bounds for this buffer");
        }
        return ((Integer) this.zab.get(i)).intValue();
    }
}
