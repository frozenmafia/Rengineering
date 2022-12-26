package o;

import java.io.IOException;
/* loaded from: classes.dex */
public class getTokenStore {
    private static getTokenStore valueOf;
    private static final Object values = new Object();
    getStateDrawableIndex ah$a = new getStateDrawableIndex(this);
    private okhttp3.Cache toString;

    private getTokenStore() {
    }

    public static getTokenStore valueOf() {
        if (valueOf == null) {
            synchronized (values) {
                valueOf = new getTokenStore();
            }
        }
        return valueOf;
    }

    public void ah$a() {
        okhttp3.Cache cache = this.toString;
        if (cache != null) {
            try {
                cache.evictAll();
            } catch (IOException e) {
                this.ah$a.ag$a(e);
            }
        }
    }
}
