package o;

import android.graphics.Bitmap;
/* loaded from: classes.dex */
public class setPlaybackToRemote {
    private final int HaptikSDK$c;
    private Bitmap ag$a;
    private final String ah$a;
    private final int toString;
    private final String valueOf;
    private final String values;

    public setPlaybackToRemote(int i, int i2, String str, String str2, String str3) {
        this.HaptikSDK$c = i;
        this.toString = i2;
        this.values = str;
        this.valueOf = str2;
        this.ah$a = str3;
    }

    public int HaptikSDK$b() {
        return this.HaptikSDK$c;
    }

    public int valueOf() {
        return this.toString;
    }

    public String values() {
        return this.values;
    }

    public String ah$a() {
        return this.valueOf;
    }

    public Bitmap ag$a() {
        return this.ag$a;
    }

    public void values(Bitmap bitmap) {
        this.ag$a = bitmap;
    }
}
