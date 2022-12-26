package o;

import android.net.Uri;
import android.os.Bundle;
import o.createWithBitmap;
/* loaded from: classes3.dex */
public final /* synthetic */ class createWithContentUri implements getColorFilter$ah$a {
    public static final /* synthetic */ createWithContentUri valueOf = new createWithContentUri();

    private /* synthetic */ createWithContentUri() {
    }

    @Override // o.getColorFilter$ah$a
    public final getColorFilter ah$a(Bundle bundle) {
        createWithBitmap.invoke ag$a;
        ag$a = new createWithBitmap.invoke.values().toString((Uri) bundle.getParcelable(Integer.toString(0, 36))).ah$a(bundle.getString(Integer.toString(1, 36))).ag$a(bundle.getBundle(Integer.toString(2, 36))).ag$a();
        return ag$a;
    }
}
