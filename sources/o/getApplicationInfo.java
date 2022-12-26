package o;

import o.MediaBrowserServiceCompat;
/* loaded from: classes7.dex */
public class getApplicationInfo implements MediaBrowserServiceCompat.MediaBrowserServiceImplApi26.MediaBrowserServiceApi26 {
    private final float values;

    public getApplicationInfo(float f) {
        this.values = f;
    }

    @Override // o.MediaBrowserServiceCompat.MediaBrowserServiceImplApi26.MediaBrowserServiceApi26
    public float values(MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass6 anonymousClass6, MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass2 anonymousClass2) {
        return this.values;
    }
}
