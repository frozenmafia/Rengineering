package com.google.android.gms.internal.base;

import android.os.Build;
/* loaded from: classes5.dex */
final class zan {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zaa() {
        return Build.VERSION.SDK_INT >= 33 || Build.VERSION.CODENAME.charAt(0) == 'T';
    }
}
