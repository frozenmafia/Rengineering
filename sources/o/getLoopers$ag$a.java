package o;

import o.getLoopers;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class getLoopers$ag$a implements dataStart, Runnable {
    volatile boolean ah$a;
    final getLoopers.toString toString;
    final Runnable valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getLoopers$ag$a(Runnable runnable, getLoopers.toString tostring) {
        this.valueOf = runnable;
        this.toString = tostring;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.ah$a) {
            return;
        }
        try {
            this.valueOf.run();
        } catch (Throwable th) {
            dispose();
            endMetadataList.valueOf(th);
            throw th;
        }
    }

    @Override // o.dataStart
    public void dispose() {
        this.ah$a = true;
        this.toString.dispose();
    }

    @Override // o.dataStart
    public boolean isDisposed() {
        return this.ah$a;
    }
}
