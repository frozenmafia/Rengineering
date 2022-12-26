package com.google.ads.interactivemedia.v3.internal;

import android.system.ErrnoException;
import android.system.OsConstants;
/* loaded from: classes4.dex */
final class dj {
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Throwable th) {
        return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
    }
}
