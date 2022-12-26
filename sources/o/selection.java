package o;

import android.os.Handler;
import android.os.Message;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import o.FrameworkSQLiteDatabase;
import o.appendColumns;
/* loaded from: classes5.dex */
final class selection extends appendColumns {
    private final Handler values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public selection(Handler handler) {
        this.values = handler;
    }

    @Override // o.appendColumns
    public FrameworkSQLiteDatabase.AnonymousClass2 valueOf(Runnable runnable, long j, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run == null");
        Objects.requireNonNull(timeUnit, "unit == null");
        selection$ag$a selection_ag_a = new selection$ag$a(this.values, setProgressBackgroundColor.ag$a(runnable));
        this.values.postDelayed(selection_ag_a, timeUnit.toMillis(j));
        return selection_ag_a;
    }

    @Override // o.appendColumns
    public appendColumns.values ah$a() {
        return new values(this.values);
    }

    /* loaded from: classes5.dex */
    static final class values extends appendColumns.values {
        private final Handler ag$a;
        private volatile boolean values;

        values(Handler handler) {
            this.ag$a = handler;
        }

        @Override // o.appendColumns.values
        public FrameworkSQLiteDatabase.AnonymousClass2 ah$a(Runnable runnable, long j, TimeUnit timeUnit) {
            Objects.requireNonNull(runnable, "run == null");
            Objects.requireNonNull(timeUnit, "unit == null");
            if (this.values) {
                return isDelegate.ag$a();
            }
            selection$ag$a selection_ag_a = new selection$ag$a(this.ag$a, setProgressBackgroundColor.ag$a(runnable));
            Message obtain = Message.obtain(this.ag$a, selection_ag_a);
            obtain.obj = this;
            this.ag$a.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            if (this.values) {
                this.ag$a.removeCallbacks(selection_ag_a);
                return isDelegate.ag$a();
            }
            return selection_ag_a;
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            this.values = true;
            this.ag$a.removeCallbacksAndMessages(this);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return this.values;
        }
    }
}
