package com.google.ads.interactivemedia.v3.internal;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;
/* loaded from: classes4.dex */
final class nr {
    public static boolean a(Throwable th) {
        return th instanceof DeniedByServerException;
    }

    public static boolean b(Throwable th) {
        return th instanceof NotProvisionedException;
    }
}
