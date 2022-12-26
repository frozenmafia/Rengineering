package o;

import android.os.Handler;
import android.os.Message;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import o.getLoopers;
/* loaded from: classes5.dex */
final class setProgressBackgroundColorSchemeResource extends getLoopers {
    private final Handler ag$a;
    private final boolean values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setProgressBackgroundColorSchemeResource(Handler handler, boolean z) {
        this.ag$a = handler;
        this.values = z;
    }

    @Override // o.getLoopers
    public dataStart values(Runnable runnable, long j, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run == null");
        Objects.requireNonNull(timeUnit, "unit == null");
        valueOf valueof = new valueOf(this.ag$a, endMetadataList.ah$a(runnable));
        Message obtain = Message.obtain(this.ag$a, valueof);
        if (this.values) {
            obtain.setAsynchronous(true);
        }
        this.ag$a.sendMessageDelayed(obtain, timeUnit.toMillis(j));
        return valueof;
    }

    @Override // o.getLoopers
    public getLoopers.toString ag$a() {
        return new values(this.ag$a, this.values);
    }

    /* loaded from: classes5.dex */
    static final class values extends getLoopers.toString {
        private volatile boolean ah$a;
        private final Handler toString;
        private final boolean values;

        values(Handler handler, boolean z) {
            this.toString = handler;
            this.values = z;
        }

        @Override // o.getLoopers.toString
        public dataStart valueOf(Runnable runnable, long j, TimeUnit timeUnit) {
            Objects.requireNonNull(runnable, "run == null");
            Objects.requireNonNull(timeUnit, "unit == null");
            if (this.ah$a) {
                return increment.valueOf();
            }
            valueOf valueof = new valueOf(this.toString, endMetadataList.ah$a(runnable));
            Message obtain = Message.obtain(this.toString, valueof);
            obtain.obj = this;
            if (this.values) {
                obtain.setAsynchronous(true);
            }
            this.toString.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            if (this.ah$a) {
                this.toString.removeCallbacks(valueof);
                return increment.valueOf();
            }
            return valueof;
        }

        @Override // o.dataStart
        public void dispose() {
            this.ah$a = true;
            this.toString.removeCallbacksAndMessages(this);
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return this.ah$a;
        }
    }

    /* loaded from: classes5.dex */
    static final class valueOf implements Runnable, dataStart {
        private volatile boolean ag$a;
        private final Handler ah$a;
        private final Runnable values;

        valueOf(Handler handler, Runnable runnable) {
            this.ah$a = handler;
            this.values = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.values.run();
            } catch (Throwable th) {
                endMetadataList.valueOf(th);
            }
        }

        @Override // o.dataStart
        public void dispose() {
            this.ah$a.removeCallbacks(this);
            this.ag$a = true;
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return this.ag$a;
        }
    }
}
