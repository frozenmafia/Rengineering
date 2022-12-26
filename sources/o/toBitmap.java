package o;

import android.os.Bundle;
/* loaded from: classes3.dex */
public final class toBitmap implements getColorFilter {
    public static final toBitmap ah$a = new toBitmap(0, 0, 0);
    public static final getColorFilter$ah$a<toBitmap> values = Cdefault.values;
    public final int ag$a;
    public final int toString;
    public final int valueOf;

    /* renamed from: o.toBitmap$default  reason: invalid class name */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class Cdefault implements getColorFilter$ah$a {
        public static final /* synthetic */ Cdefault values = new Cdefault();

        private /* synthetic */ Cdefault() {
        }

        @Override // o.getColorFilter$ah$a
        public final getColorFilter ah$a(Bundle bundle) {
            return toBitmap.values(bundle);
        }
    }

    public toBitmap(int i, int i2, int i3) {
        this.toString = i;
        this.valueOf = i2;
        this.ag$a = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof toBitmap) {
            toBitmap tobitmap = (toBitmap) obj;
            return this.toString == tobitmap.toString && this.valueOf == tobitmap.valueOf && this.ag$a == tobitmap.ag$a;
        }
        return false;
    }

    public int hashCode() {
        int i = this.toString;
        return ((((i + androidx.databinding.library.baseAdapters.BR.userTeamVM) * 31) + this.valueOf) * 31) + this.ag$a;
    }

    @Override // o.getColorFilter
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(Integer.toString(0, 36), this.toString);
        bundle.putInt(Integer.toString(1, 36), this.valueOf);
        bundle.putInt(Integer.toString(2, 36), this.ag$a);
        return bundle;
    }

    static /* synthetic */ toBitmap values(Bundle bundle) {
        return new toBitmap(bundle.getInt(Integer.toString(0, 36), 0), bundle.getInt(Integer.toString(1, 36), 0), bundle.getInt(Integer.toString(2, 36), 0));
    }
}
