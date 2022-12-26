package o;

import android.os.Bundle;
import o.TintAwareDrawable;
/* loaded from: classes3.dex */
public final /* synthetic */ class WrappedDrawable implements getColorFilter$ah$a {
    public static final /* synthetic */ WrappedDrawable values = new WrappedDrawable();

    private /* synthetic */ WrappedDrawable() {
    }

    @Override // o.getColorFilter$ah$a
    public final getColorFilter ah$a(Bundle bundle) {
        TintAwareDrawable.valueOf values2;
        values2 = TintAwareDrawable.valueOf.values(bundle);
        return values2;
    }
}
