package o;

import o.FragmentLifecycleCallbacksDispatcher;
/* loaded from: classes4.dex */
public class setPrimaryItem {
    private Thread toString = null;

    public void ah$a() {
        Thread currentThread = Thread.currentThread();
        if (this.toString == null) {
            this.toString = currentThread;
        }
        FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder.ag$a(this.toString == currentThread);
    }
}
