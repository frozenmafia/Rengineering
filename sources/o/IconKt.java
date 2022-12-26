package o;

import android.os.Bundle;
import o.IconCompat;
/* loaded from: classes3.dex */
public final /* synthetic */ class IconKt implements getColorFilter$ah$a {
    public static final /* synthetic */ IconKt values = new IconKt();

    private /* synthetic */ IconKt() {
    }

    @Override // o.getColorFilter$ah$a
    public final getColorFilter ah$a(Bundle bundle) {
        IconCompat.IconType values2;
        values2 = IconCompat.IconType.values(bundle);
        return values2;
    }
}
