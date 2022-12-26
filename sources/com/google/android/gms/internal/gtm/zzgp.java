package com.google.android.gms.internal.gtm;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* loaded from: classes7.dex */
final class zzgp {

    /* loaded from: classes7.dex */
    static class zza {
        private static volatile ExecutorService zzaqx;

        private zza() {
        }

        public static ExecutorService zzr(Context context) {
            if (zzaqx == null) {
                synchronized (zza.class) {
                    if (zzaqx == null) {
                        zzaqx = new zzef(context, 1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new zzgq());
                    }
                }
            }
            return zzaqx;
        }
    }
}
