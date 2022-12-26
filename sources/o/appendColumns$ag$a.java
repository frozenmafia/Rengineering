package o;

import o.FrameworkSQLiteDatabase;
import o.appendColumns;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class appendColumns$ag$a implements FrameworkSQLiteDatabase.AnonymousClass2, Runnable {
    final appendColumns.values ah$a;
    Thread toString;
    final Runnable values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public appendColumns$ag$a(Runnable runnable, appendColumns.values valuesVar) {
        this.values = runnable;
        this.ah$a = valuesVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.toString = Thread.currentThread();
        try {
            this.values.run();
        } finally {
            dispose();
            this.toString = null;
        }
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public void dispose() {
        if (this.toString == Thread.currentThread()) {
            appendColumns.values valuesVar = this.ah$a;
            if (valuesVar instanceof animateOffsetToStartPosition) {
                ((animateOffsetToStartPosition) valuesVar).valueOf();
                return;
            }
        }
        this.ah$a.dispose();
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public boolean isDisposed() {
        return this.ah$a.isDisposed();
    }
}
