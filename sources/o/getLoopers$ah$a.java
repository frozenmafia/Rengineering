package o;

import o.getLoopers;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class getLoopers$ah$a implements dataStart, Runnable {
    final Runnable ag$a;
    Thread valueOf;
    final getLoopers.toString values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getLoopers$ah$a(Runnable runnable, getLoopers.toString tostring) {
        this.ag$a = runnable;
        this.values = tostring;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.valueOf = Thread.currentThread();
        try {
            this.ag$a.run();
        } finally {
        }
    }

    @Override // o.dataStart
    public void dispose() {
        if (this.valueOf == Thread.currentThread()) {
            getLoopers.toString tostring = this.values;
            if (tostring instanceof addWidth) {
                ((addWidth) tostring).valueOf();
                return;
            }
        }
        this.values.dispose();
    }

    @Override // o.dataStart
    public boolean isDisposed() {
        return this.values.isDisposed();
    }
}
