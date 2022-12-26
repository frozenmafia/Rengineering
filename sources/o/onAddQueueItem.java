package o;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
/* loaded from: classes.dex */
public class onAddQueueItem<T> {
    public static Executor ah$a = Executors.newCachedThreadPool();
    private volatile setSessionActivity<T> ag$a;
    private final Handler toString;
    private final Set<setRatingType<T>> valueOf;
    private final Set<setRatingType<Throwable>> values;

    public onAddQueueItem(Callable<setSessionActivity<T>> callable) {
        this(callable, false);
    }

    public onAddQueueItem(Callable<setSessionActivity<T>> callable, boolean z) {
        this.valueOf = new LinkedHashSet(1);
        this.values = new LinkedHashSet(1);
        this.toString = new Handler(Looper.getMainLooper());
        this.ag$a = null;
        if (z) {
            try {
                valueOf(callable.call());
                return;
            } catch (Throwable th) {
                valueOf(new setSessionActivity<>(th));
                return;
            }
        }
        ah$a.execute(new valueOf(callable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void valueOf(setSessionActivity<T> setsessionactivity) {
        if (this.ag$a != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.ag$a = setsessionactivity;
        ah$a();
    }

    public onAddQueueItem<T> ah$a(setRatingType<T> setratingtype) {
        synchronized (this) {
            setSessionActivity<T> setsessionactivity = this.ag$a;
            if (setsessionactivity != null && setsessionactivity.ah$a() != null) {
                setratingtype.valueOf(setsessionactivity.ah$a());
            }
            this.valueOf.add(setratingtype);
        }
        return this;
    }

    public onAddQueueItem<T> ag$a(setRatingType<T> setratingtype) {
        synchronized (this) {
            this.valueOf.remove(setratingtype);
        }
        return this;
    }

    public onAddQueueItem<T> values(setRatingType<Throwable> setratingtype) {
        synchronized (this) {
            setSessionActivity<T> setsessionactivity = this.ag$a;
            if (setsessionactivity != null && setsessionactivity.valueOf() != null) {
                setratingtype.valueOf(setsessionactivity.valueOf());
            }
            this.values.add(setratingtype);
        }
        return this;
    }

    public onAddQueueItem<T> toString(setRatingType<Throwable> setratingtype) {
        synchronized (this) {
            this.values.remove(setratingtype);
        }
        return this;
    }

    private void ah$a() {
        this.toString.post(new Runnable() { // from class: o.handleMediaPlayPauseIfPendingOnHandler
            @Override // java.lang.Runnable
            public final void run() {
                onAddQueueItem.this.values();
            }
        });
    }

    public /* synthetic */ void values() {
        setSessionActivity<T> setsessionactivity = this.ag$a;
        if (setsessionactivity == null) {
            return;
        }
        if (setsessionactivity.ah$a() != null) {
            toString((onAddQueueItem<T>) setsessionactivity.ah$a());
        } else {
            ah$a(setsessionactivity.valueOf());
        }
    }

    private void toString(T t) {
        synchronized (this) {
            for (setRatingType setratingtype : new ArrayList(this.valueOf)) {
                setratingtype.valueOf(t);
            }
        }
    }

    private void ah$a(Throwable th) {
        synchronized (this) {
            ArrayList<setRatingType> arrayList = new ArrayList(this.values);
            if (arrayList.isEmpty()) {
                ResultReceiver.values("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            for (setRatingType setratingtype : arrayList) {
                setratingtype.valueOf(th);
            }
        }
    }

    /* loaded from: classes.dex */
    class valueOf extends FutureTask<setSessionActivity<T>> {
        valueOf(Callable<setSessionActivity<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (isCancelled()) {
                return;
            }
            try {
                onAddQueueItem.this.valueOf(get());
            } catch (InterruptedException | ExecutionException e) {
                onAddQueueItem.this.valueOf(new setSessionActivity(e));
            }
        }
    }
}
