package o;

import android.app.Application;
import com.google.android.exoplayer2.util.MimeTypes;
/* loaded from: classes4.dex */
public final class unregisterInitCallback {
    private static Application ag$a;
    public static final unregisterInitCallback ah$a = new unregisterInitCallback();

    private unregisterInitCallback() {
    }

    public final void ag$a(Application application) {
        runAnimators.ag$a(application, MimeTypes.BASE_TYPE_APPLICATION);
        ag$a = application;
    }

    public final Application ag$a() {
        return ag$a;
    }
}
