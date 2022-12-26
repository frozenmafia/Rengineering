package o;

import android.graphics.Bitmap;
/* loaded from: classes6.dex */
public final class getViewFragment {
    private final Exception ag$a;
    private final Bitmap ah$a;
    private final isMenuAvailable toString;
    private final boolean valueOf;

    public getViewFragment(isMenuAvailable ismenuavailable, Exception exc, boolean z, Bitmap bitmap) {
        runAnimators.ag$a(ismenuavailable, "request");
        this.toString = ismenuavailable;
        this.ag$a = exc;
        this.valueOf = z;
        this.ah$a = bitmap;
    }

    public final isMenuAvailable ah$a() {
        return this.toString;
    }

    public final Exception values() {
        return this.ag$a;
    }

    public final boolean valueOf() {
        return this.valueOf;
    }

    public final Bitmap ag$a() {
        return this.ah$a;
    }
}
