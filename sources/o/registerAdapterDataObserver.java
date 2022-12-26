package o;

import java.lang.Thread;
/* loaded from: classes5.dex */
public interface registerAdapterDataObserver {
    public static final registerAdapterDataObserver values = new registerAdapterDataObserver() { // from class: o.registerAdapterDataObserver.5
        @Override // o.registerAdapterDataObserver
        public void values(Thread thread, String str) {
            thread.setName(str);
        }

        @Override // o.registerAdapterDataObserver
        public void valueOf(Thread thread, boolean z) {
            thread.setDaemon(z);
        }

        @Override // o.registerAdapterDataObserver
        public void valueOf(Thread thread, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
    };

    void valueOf(Thread thread, Thread.UncaughtExceptionHandler uncaughtExceptionHandler);

    void valueOf(Thread thread, boolean z);

    void values(Thread thread, String str);
}
