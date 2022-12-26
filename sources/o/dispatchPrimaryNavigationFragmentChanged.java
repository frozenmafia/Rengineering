package o;

import com.facebook.FacebookException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import o.dispatchPrimaryNavigationFragmentChanged;
/* loaded from: classes6.dex */
public final class dispatchPrimaryNavigationFragmentChanged {
    public static final valueOf values = new valueOf(null);
    private toString ag$a;
    private final int ah$a;
    private toString ah$b;
    private final ReentrantLock invoke;
    private int toString;
    private final Executor valueOf;

    /* loaded from: classes6.dex */
    public interface values {
        boolean ah$a();

        void values();
    }

    public dispatchPrimaryNavigationFragmentChanged() {
        this(0, null, 3, null);
    }

    public dispatchPrimaryNavigationFragmentChanged(int i) {
        this(i, null, 2, null);
    }

    public final values valueOf(Runnable runnable) {
        runAnimators.ag$a(runnable, "callback");
        return valueOf(this, runnable, false, 2, null);
    }

    public dispatchPrimaryNavigationFragmentChanged(int i, Executor executor) {
        runAnimators.ag$a(executor, "executor");
        this.ah$a = i;
        this.valueOf = executor;
        this.invoke = new ReentrantLock();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ dispatchPrimaryNavigationFragmentChanged(int r1, java.util.concurrent.Executor r2, int r3, o.getTargetTypes r4) {
        /*
            r0 = this;
            r4 = r3 & 1
            if (r4 == 0) goto L6
            r1 = 8
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto L10
            o.DefaultSpecialEffectsController$8 r2 = o.DefaultSpecialEffectsController.AnonymousClass8.values
            java.util.concurrent.Executor r2 = o.DefaultSpecialEffectsController.AnonymousClass8.HaptikWebView()
        L10:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dispatchPrimaryNavigationFragmentChanged.<init>(int, java.util.concurrent.Executor, int, o.getTargetTypes):void");
    }

    /* loaded from: classes6.dex */
    public static final class valueOf {
        public /* synthetic */ valueOf(getTargetTypes gettargettypes) {
            this();
        }

        private valueOf() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void ah$a(boolean z) {
            if (!z) {
                throw new FacebookException("Validation failed");
            }
        }
    }

    public static /* synthetic */ values valueOf(dispatchPrimaryNavigationFragmentChanged dispatchprimarynavigationfragmentchanged, Runnable runnable, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return dispatchprimarynavigationfragmentchanged.toString(runnable, z);
    }

    public final values toString(Runnable runnable, boolean z) {
        runAnimators.ag$a(runnable, "callback");
        toString tostring = new toString(this, runnable);
        ReentrantLock reentrantLock = this.invoke;
        reentrantLock.lock();
        try {
            this.ag$a = tostring.ag$a(this.ag$a, z);
            setAnimationMatrix setanimationmatrix = setAnimationMatrix.ag$a;
            reentrantLock.unlock();
            ah$a();
            return tostring;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    private final void ah$a() {
        ah$a(null);
    }

    private final void ah$a(toString tostring) {
        toString tostring2;
        this.invoke.lock();
        if (tostring != null) {
            this.ah$b = tostring.ah$a(this.ah$b);
            this.toString--;
        }
        if (this.toString < this.ah$a) {
            tostring2 = this.ag$a;
            if (tostring2 != null) {
                this.ag$a = tostring2.ah$a(tostring2);
                this.ah$b = tostring2.ag$a(this.ah$b, false);
                this.toString++;
                tostring2.ah$a(true);
            }
        } else {
            tostring2 = null;
        }
        this.invoke.unlock();
        if (tostring2 != null) {
            ag$a(tostring2);
        }
    }

    private final void ag$a(final toString tostring) {
        this.valueOf.execute(new Runnable() { // from class: o.dispatchOnAttachFragment
            @Override // java.lang.Runnable
            public final void run() {
                dispatchPrimaryNavigationFragmentChanged.values(dispatchPrimaryNavigationFragmentChanged.toString.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void values(toString tostring, dispatchPrimaryNavigationFragmentChanged dispatchprimarynavigationfragmentchanged) {
        runAnimators.ag$a(tostring, "$node");
        runAnimators.ag$a(dispatchprimarynavigationfragmentchanged, "this$0");
        try {
            tostring.ag$a().run();
        } finally {
            dispatchprimarynavigationfragmentchanged.ah$a(tostring);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public final class toString implements values {
        private final Runnable ag$a;
        private toString ah$a;
        private toString toString;
        final /* synthetic */ dispatchPrimaryNavigationFragmentChanged valueOf;
        private boolean values;

        public toString(dispatchPrimaryNavigationFragmentChanged dispatchprimarynavigationfragmentchanged, Runnable runnable) {
            runAnimators.ag$a(dispatchprimarynavigationfragmentchanged, "this$0");
            runAnimators.ag$a(runnable, "callback");
            this.valueOf = dispatchprimarynavigationfragmentchanged;
            this.ag$a = runnable;
        }

        public final Runnable ag$a() {
            return this.ag$a;
        }

        public void ah$a(boolean z) {
            this.values = z;
        }

        public boolean valueOf() {
            return this.values;
        }

        @Override // o.dispatchPrimaryNavigationFragmentChanged.values
        public boolean ah$a() {
            ReentrantLock reentrantLock = this.valueOf.invoke;
            dispatchPrimaryNavigationFragmentChanged dispatchprimarynavigationfragmentchanged = this.valueOf;
            reentrantLock.lock();
            try {
                if (!valueOf()) {
                    dispatchprimarynavigationfragmentchanged.ag$a = ah$a(dispatchprimarynavigationfragmentchanged.ag$a);
                    reentrantLock.unlock();
                    return true;
                }
                setAnimationMatrix setanimationmatrix = setAnimationMatrix.ag$a;
                reentrantLock.unlock();
                return false;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        @Override // o.dispatchPrimaryNavigationFragmentChanged.values
        public void values() {
            ReentrantLock reentrantLock = this.valueOf.invoke;
            dispatchPrimaryNavigationFragmentChanged dispatchprimarynavigationfragmentchanged = this.valueOf;
            reentrantLock.lock();
            try {
                if (!valueOf()) {
                    dispatchprimarynavigationfragmentchanged.ag$a = ah$a(dispatchprimarynavigationfragmentchanged.ag$a);
                    dispatchprimarynavigationfragmentchanged.ag$a = ag$a(dispatchprimarynavigationfragmentchanged.ag$a, true);
                }
                setAnimationMatrix setanimationmatrix = setAnimationMatrix.ag$a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final toString ag$a(toString tostring, boolean z) {
            dispatchPrimaryNavigationFragmentChanged.values.ah$a(this.ah$a == null);
            dispatchPrimaryNavigationFragmentChanged.values.ah$a(this.toString == null);
            if (tostring == null) {
                this.toString = this;
                this.ah$a = this;
                tostring = this;
            } else {
                this.ah$a = tostring;
                toString tostring2 = tostring.toString;
                this.toString = tostring2;
                if (tostring2 != null) {
                    tostring2.ah$a = this;
                }
                toString tostring3 = this.ah$a;
                if (tostring3 != null) {
                    tostring3.toString = tostring2 == null ? null : tostring2.ah$a;
                }
            }
            if (tostring != null) {
                return z ? this : tostring;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        public final toString ah$a(toString tostring) {
            dispatchPrimaryNavigationFragmentChanged.values.ah$a(this.ah$a != null);
            dispatchPrimaryNavigationFragmentChanged.values.ah$a(this.toString != null);
            if (tostring == this && (tostring = this.ah$a) == this) {
                tostring = null;
            }
            toString tostring2 = this.ah$a;
            if (tostring2 != null) {
                tostring2.toString = this.toString;
            }
            toString tostring3 = this.toString;
            if (tostring3 != null) {
                tostring3.ah$a = tostring2;
            }
            this.toString = null;
            this.ah$a = null;
            return tostring;
        }
    }
}
