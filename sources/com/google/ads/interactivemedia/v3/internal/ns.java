package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaDrm;
/* loaded from: classes4.dex */
final class ns {
    public static int a(Throwable th) {
        return cp.i(cp.j(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
    }

    public static boolean b(Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }
}
