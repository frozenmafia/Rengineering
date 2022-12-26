package com.appsamurai.storyly.exoplayer2.core.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.appsamurai.storyly.exoplayer2.core.upstream.Loader;
import com.appsamurai.storyly.exoplayer2.core.upstream.Loader.values;
import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import o.FingerprintManagerCompat;
import o.SupportMenuItem;
import o.getBasebandCn0DbHz;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Loader$ah$a<T extends Loader.values> extends Handler implements Runnable {
    private int HaptikSDK$a;
    private final T HaptikSDK$b;
    private final long HaptikSDK$c;
    private boolean ag$a;
    public final int ah$a;
    private volatile boolean ah$b;
    private Thread invoke;
    private IOException toString;
    private Loader$ag$a<T> valueOf;
    final /* synthetic */ Loader values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Loader$ah$a(Loader loader, Looper looper, T t, Loader$ag$a<T> loader$ag$a, int i, long j) {
        super(looper);
        this.values = loader;
        this.HaptikSDK$b = t;
        this.valueOf = loader$ag$a;
        this.ah$a = i;
        this.HaptikSDK$c = j;
    }

    public void values(int i) throws IOException {
        IOException iOException = this.toString;
        if (iOException != null && this.HaptikSDK$a > i) {
            throw iOException;
        }
    }

    public void valueOf(long j) {
        Loader$ah$a loader$ah$a;
        loader$ah$a = this.values.ah$a;
        FingerprintManagerCompat.ah$a(loader$ah$a == null);
        this.values.ah$a = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            values();
        }
    }

    public void valueOf(boolean z) {
        this.ah$b = z;
        this.toString = null;
        if (hasMessages(0)) {
            this.ag$a = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.ag$a = true;
                this.HaptikSDK$b.valueOf();
                Thread thread = this.invoke;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            valueOf();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ((Loader$ag$a) FingerprintManagerCompat.toString(this.valueOf)).ah$a(this.HaptikSDK$b, elapsedRealtime, elapsedRealtime - this.HaptikSDK$c, true);
            this.valueOf = null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        try {
            synchronized (this) {
                z = !this.ag$a;
                this.invoke = Thread.currentThread();
            }
            if (z) {
                getBasebandCn0DbHz.toString("load:" + this.HaptikSDK$b.getClass().getSimpleName());
                try {
                    this.HaptikSDK$b.ah$a();
                    getBasebandCn0DbHz.ag$a();
                } catch (Throwable th) {
                    getBasebandCn0DbHz.ag$a();
                    throw th;
                }
            }
            synchronized (this) {
                this.invoke = null;
                Thread.interrupted();
            }
            if (this.ah$b) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e) {
            if (this.ah$b) {
                return;
            }
            obtainMessage(2, e).sendToTarget();
        } catch (OutOfMemoryError e2) {
            if (this.ah$b) {
                return;
            }
            SupportMenuItem.toString("LoadTask", "OutOfMemory error loading stream", e2);
            obtainMessage(2, new Loader.UnexpectedLoaderException(e2)).sendToTarget();
        } catch (Error e3) {
            if (!this.ah$b) {
                SupportMenuItem.toString("LoadTask", "Unexpected error loading stream", e3);
                obtainMessage(3, e3).sendToTarget();
            }
            throw e3;
        } catch (Exception e4) {
            if (this.ah$b) {
                return;
            }
            SupportMenuItem.toString("LoadTask", "Unexpected exception loading stream", e4);
            obtainMessage(2, new Loader.UnexpectedLoaderException(e4)).sendToTarget();
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i;
        int i2;
        int i3;
        long j;
        long ag$a;
        if (this.ah$b) {
            return;
        }
        if (message.what == 0) {
            values();
        } else if (message.what == 3) {
            throw ((Error) message.obj);
        } else {
            valueOf();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = elapsedRealtime - this.HaptikSDK$c;
            Loader$ag$a loader$ag$a = (Loader$ag$a) FingerprintManagerCompat.toString(this.valueOf);
            if (this.ag$a) {
                loader$ag$a.ah$a(this.HaptikSDK$b, elapsedRealtime, j2, false);
                return;
            }
            int i4 = message.what;
            if (i4 == 1) {
                try {
                    loader$ag$a.valueOf(this.HaptikSDK$b, elapsedRealtime, j2);
                } catch (RuntimeException e) {
                    SupportMenuItem.toString("LoadTask", "Unexpected exception handling load completed", e);
                    this.values.ah$b = new Loader.UnexpectedLoaderException(e);
                }
            } else if (i4 != 2) {
            } else {
                IOException iOException = (IOException) message.obj;
                this.toString = iOException;
                int i5 = this.HaptikSDK$a + 1;
                this.HaptikSDK$a = i5;
                Loader.valueOf values = loader$ag$a.values(this.HaptikSDK$b, elapsedRealtime, j2, iOException, i5);
                i = values.ag$a;
                if (i != 3) {
                    i2 = values.ag$a;
                    if (i2 != 2) {
                        i3 = values.ag$a;
                        if (i3 == 1) {
                            this.HaptikSDK$a = 1;
                        }
                        j = values.values;
                        if (j != C.TIME_UNSET) {
                            ag$a = values.values;
                        } else {
                            ag$a = ag$a();
                        }
                        valueOf(ag$a);
                        return;
                    }
                    return;
                }
                this.values.ah$b = this.toString;
            }
        }
    }

    private void values() {
        ExecutorService executorService;
        Loader$ah$a loader$ah$a;
        this.toString = null;
        executorService = this.values.HaptikSDK$a;
        loader$ah$a = this.values.ah$a;
        executorService.execute((Runnable) FingerprintManagerCompat.toString(loader$ah$a));
    }

    private void valueOf() {
        this.values.ah$a = null;
    }

    private long ag$a() {
        return Math.min((this.HaptikSDK$a - 1) * 1000, 5000);
    }
}
