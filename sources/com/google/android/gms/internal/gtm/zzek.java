package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
/* loaded from: classes7.dex */
final class zzek extends Thread implements zzej {
    private static zzek zzanw;
    private volatile boolean closed;
    private final LinkedBlockingQueue<Runnable> zzahb;
    private volatile boolean zzahc;
    private volatile zzem zzanx;
    private final Context zzrm;
    private final Clock zzsd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzek zzq(Context context) {
        if (zzanw == null) {
            zzanw = new zzek(context);
        }
        return zzanw;
    }

    private zzek(Context context) {
        super("GAThread");
        this.zzahb = new LinkedBlockingQueue<>();
        this.zzahc = false;
        this.closed = false;
        this.zzsd = DefaultClock.getInstance();
        if (context != null) {
            this.zzrm = context.getApplicationContext();
        } else {
            this.zzrm = context;
        }
        start();
    }

    @Override // com.google.android.gms.internal.gtm.zzej
    public final void zzb(String str, String str2, String str3, Map<String, String> map, String str4) {
        zzc(new zzel(this, this, this.zzsd.currentTimeMillis(), str, str2, str3, map, str4));
    }

    @Override // com.google.android.gms.internal.gtm.zzej
    public final void zzc(Runnable runnable) {
        this.zzahb.add(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                try {
                    Runnable take = this.zzahb.take();
                    if (!this.zzahc) {
                        take.run();
                    }
                } catch (InterruptedException e) {
                    zzev.zzaw(e.toString());
                }
            } catch (Exception e2) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                PrintStream printStream = new PrintStream(byteArrayOutputStream);
                zzpf.zza(e2, printStream);
                printStream.flush();
                String str = new String(byteArrayOutputStream.toByteArray());
                zzev.zzav(str.length() != 0 ? "Error on Google TagManager Thread: ".concat(str) : new String("Error on Google TagManager Thread: "));
                zzev.zzav("Google TagManager is shutting down.");
                this.zzahc = true;
            }
        }
    }
}
