package com.appsamurai.storyly.exoplayer2.core.upstream;

import android.os.Looper;
import android.os.SystemClock;
import com.appsamurai.storyly.exoplayer2.core.upstream.Loader;
import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import o.FingerprintManagerCompat;
import o.getElevationDegrees;
/* loaded from: classes3.dex */
public final class Loader {
    private final ExecutorService HaptikSDK$a;
    private Loader$ah$a<? extends values> ah$a;
    private IOException ah$b;
    public static final valueOf values = ah$a(false, C.TIME_UNSET);
    public static final valueOf ag$a = ah$a(true, C.TIME_UNSET);
    public static final valueOf toString = new valueOf(2, C.TIME_UNSET);
    public static final valueOf valueOf = new valueOf(3, C.TIME_UNSET);

    /* loaded from: classes3.dex */
    public interface toString {
        void HaptikSDK$e();
    }

    /* loaded from: classes3.dex */
    public interface values {
        void ah$a() throws IOException;

        void valueOf();
    }

    /* loaded from: classes3.dex */
    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    /* loaded from: classes3.dex */
    public static final class valueOf {
        private final int ag$a;
        private final long values;

        private valueOf(int i, long j) {
            this.ag$a = i;
            this.values = j;
        }

        public boolean valueOf() {
            int i = this.ag$a;
            return i == 0 || i == 1;
        }
    }

    public Loader(String str) {
        this.HaptikSDK$a = getElevationDegrees.values("ExoPlayer:Loader:" + str);
    }

    public static valueOf ah$a(boolean z, long j) {
        return new valueOf(z ? 1 : 0, j);
    }

    public boolean ag$a() {
        return this.ah$b != null;
    }

    public void valueOf() {
        this.ah$b = null;
    }

    public <T extends values> long ah$a(T t, Loader$ag$a<T> loader$ag$a, int i) {
        this.ah$b = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new Loader$ah$a(this, (Looper) FingerprintManagerCompat.ag$a(Looper.myLooper()), t, loader$ag$a, i, elapsedRealtime).valueOf(0L);
        return elapsedRealtime;
    }

    public boolean values() {
        return this.ah$a != null;
    }

    public void ah$a() {
        ((Loader$ah$a) FingerprintManagerCompat.ag$a(this.ah$a)).valueOf(false);
    }

    public void HaptikSDK$c() {
        valueOf(null);
    }

    public void valueOf(final toString tostring) {
        Loader$ah$a<? extends values> loader$ah$a = this.ah$a;
        if (loader$ah$a != null) {
            loader$ah$a.valueOf(true);
        }
        if (tostring != null) {
            this.HaptikSDK$a.execute(new Runnable(tostring) { // from class: com.appsamurai.storyly.exoplayer2.core.upstream.Loader$HaptikSDK$c
                private final Loader.toString ah$a;

                {
                    this.ah$a = tostring;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.ah$a.HaptikSDK$e();
                }
            });
        }
        this.HaptikSDK$a.shutdown();
    }

    public void HaptikSDK$b() throws IOException {
        ag$a(Integer.MIN_VALUE);
    }

    public void ag$a(int i) throws IOException {
        IOException iOException = this.ah$b;
        if (iOException != null) {
            throw iOException;
        }
        Loader$ah$a<? extends values> loader$ah$a = this.ah$a;
        if (loader$ah$a != null) {
            if (i == Integer.MIN_VALUE) {
                i = loader$ah$a.ah$a;
            }
            loader$ah$a.values(i);
        }
    }
}
