package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public final class ajc {
    private final List a = new ArrayList(1);

    public final void a(AdErrorEvent.AdErrorListener adErrorListener) {
        this.a.add(adErrorListener);
    }

    public final void b() {
        this.a.clear();
    }

    public final void c(AdErrorEvent adErrorEvent) {
        for (AdErrorEvent.AdErrorListener adErrorListener : this.a) {
            adErrorListener.onAdError(adErrorEvent);
        }
    }

    public final void d(AdErrorEvent.AdErrorListener adErrorListener) {
        this.a.remove(adErrorListener);
    }

    public final String toString() {
        String obj = this.a.toString();
        return "ErrorListenerSupport [errorListeners=" + obj + "]";
    }
}
