package com.appsamurai.storyly.exoplayer2.datasource.upstream;

import android.system.ErrnoException;
import android.system.OsConstants;
/* loaded from: classes3.dex */
final class FileDataSource$ah$a {
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean values(Throwable th) {
        return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
    }
}
