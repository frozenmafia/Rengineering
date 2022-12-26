package o;

import android.net.Uri;
import o.createWithBitmap;
/* loaded from: classes3.dex */
public final class createWithBitmap$getInitSettings$ah$a {
    private String ag$a;
    private int ah$a;
    private int ah$b;
    private Uri invoke;
    private String toString;
    private String valueOf;
    private String values;

    private createWithBitmap$getInitSettings$ah$a(createWithBitmap.getInitSettings getinitsettings) {
        this.invoke = getinitsettings.HaptikSDK$c;
        this.ag$a = getinitsettings.values;
        this.toString = getinitsettings.valueOf;
        this.ah$b = getinitsettings.invoke;
        this.ah$a = getinitsettings.toString;
        this.values = getinitsettings.ag$a;
        this.valueOf = getinitsettings.ah$a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public createWithBitmap$HaptikSDK$a valueOf() {
        return new createWithBitmap$HaptikSDK$a(this);
    }
}
