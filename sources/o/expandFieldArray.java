package o;

import java.text.DecimalFormat;
import o.MediaBrowserServiceCompat;
/* loaded from: classes7.dex */
public class expandFieldArray extends MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass1 {
    private DecimalFormat ag$a;

    public expandFieldArray(String str) {
        this.ag$a = new DecimalFormat(str);
    }

    @Override // o.MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass1
    public String valueOf(float f) {
        return this.ag$a.format(f);
    }
}
