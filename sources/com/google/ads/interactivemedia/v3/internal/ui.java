package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class ui {
    public static final ui a = new ui(new bf[0]);

    /* renamed from: b  reason: collision with root package name */
    public final int f1299b;
    private final avb c;
    private int d;

    public ui(bf... bfVarArr) {
        this.c = avb.n(bfVarArr);
        this.f1299b = bfVarArr.length;
        int i = 0;
        while (i < this.c.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.c.size(); i3++) {
                if (((bf) this.c.get(i)).equals(this.c.get(i3))) {
                    cc.c("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final int a(bf bfVar) {
        int indexOf = this.c.indexOf(bfVar);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final bf b(int i) {
        return (bf) this.c.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ui uiVar = (ui) obj;
        return this.f1299b == uiVar.f1299b && this.c.equals(uiVar.c);
    }

    public final int hashCode() {
        int i = this.d;
        if (i == 0) {
            int hashCode = this.c.hashCode();
            this.d = hashCode;
            return hashCode;
        }
        return i;
    }
}
