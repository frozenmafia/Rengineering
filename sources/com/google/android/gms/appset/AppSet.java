package com.google.android.gms.appset;

import android.content.Context;
import com.google.android.gms.internal.appset.zzr;
/* loaded from: classes5.dex */
public final class AppSet {
    private AppSet() {
    }

    public static AppSetIdClient getClient(Context context) {
        return new zzr(context);
    }
}
