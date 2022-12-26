package o;

import android.os.Process;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import o.ViewKt$doOnLayout$$inlined$doOnNextLayout$1;
import o.WindowInsetsControllerCompat;
/* loaded from: classes3.dex */
final class setInvisible {
    private final ReferenceQueue<ViewKt$doOnLayout$$inlined$doOnNextLayout$1<?>> HaptikSDK$b;
    final Map<getDescendants, toString> ag$a;
    private final boolean ah$a;
    private final Executor invoke;
    private volatile values toString;
    private volatile boolean valueOf;
    private ViewKt$doOnLayout$$inlined$doOnNextLayout$1.values values;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface values {
        void ag$a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setInvisible(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: o.setInvisible.4
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(final Runnable runnable) {
                return new Thread(new Runnable() { // from class: o.setInvisible.4.4
                    @Override // java.lang.Runnable
                    public void run() {
                        Process.setThreadPriority(10);
                        runnable.run();
                    }
                }, "glide-active-resources");
            }
        }));
    }

    setInvisible(boolean z, Executor executor) {
        this.ag$a = new HashMap();
        this.HaptikSDK$b = new ReferenceQueue<>();
        this.ah$a = z;
        this.invoke = executor;
        executor.execute(new Runnable() { // from class: o.setInvisible.2
            @Override // java.lang.Runnable
            public void run() {
                setInvisible.this.ah$a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void toString(ViewKt$doOnLayout$$inlined$doOnNextLayout$1.values valuesVar) {
        synchronized (valuesVar) {
            synchronized (this) {
                this.values = valuesVar;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ah$a(getDescendants getdescendants, ViewKt$doOnLayout$$inlined$doOnNextLayout$1<?> viewKt$doOnLayout$$inlined$doOnNextLayout$1) {
        synchronized (this) {
            toString put = this.ag$a.put(getdescendants, new toString(getdescendants, viewKt$doOnLayout$$inlined$doOnNextLayout$1, this.HaptikSDK$b, this.ah$a));
            if (put != null) {
                put.values();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ag$a(getDescendants getdescendants) {
        synchronized (this) {
            toString remove = this.ag$a.remove(getdescendants);
            if (remove != null) {
                remove.values();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewKt$doOnLayout$$inlined$doOnNextLayout$1<?> valueOf(getDescendants getdescendants) {
        synchronized (this) {
            toString tostring = this.ag$a.get(getdescendants);
            if (tostring == null) {
                return null;
            }
            ViewKt$doOnLayout$$inlined$doOnNextLayout$1<?> viewKt$doOnLayout$$inlined$doOnNextLayout$1 = (ViewKt$doOnLayout$$inlined$doOnNextLayout$1) tostring.get();
            if (viewKt$doOnLayout$$inlined$doOnNextLayout$1 == null) {
                ag$a(tostring);
            }
            return viewKt$doOnLayout$$inlined$doOnNextLayout$1;
        }
    }

    void ag$a(toString tostring) {
        synchronized (this) {
            this.ag$a.remove(tostring.ah$a);
            if (tostring.values && tostring.valueOf != null) {
                this.values.values(tostring.ah$a, new ViewKt$doOnLayout$$inlined$doOnNextLayout$1<>(tostring.valueOf, true, false, tostring.ah$a, this.values));
            }
        }
    }

    void ah$a() {
        while (!this.valueOf) {
            try {
                ag$a((toString) this.HaptikSDK$b.remove());
                values valuesVar = this.toString;
                if (valuesVar != null) {
                    valuesVar.ag$a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class toString extends WeakReference<ViewKt$doOnLayout$$inlined$doOnNextLayout$1<?>> {
        final getDescendants ah$a;
        ViewKt$postDelayed$runnable$1<?> valueOf;
        final boolean values;

        toString(getDescendants getdescendants, ViewKt$doOnLayout$$inlined$doOnNextLayout$1<?> viewKt$doOnLayout$$inlined$doOnNextLayout$1, ReferenceQueue<? super ViewKt$doOnLayout$$inlined$doOnNextLayout$1<?>> referenceQueue, boolean z) {
            super(viewKt$doOnLayout$$inlined$doOnNextLayout$1, referenceQueue);
            this.ah$a = (getDescendants) WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(getdescendants);
            this.valueOf = (viewKt$doOnLayout$$inlined$doOnNextLayout$1.HaptikSDK$b() && z) ? (ViewKt$postDelayed$runnable$1) WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(viewKt$doOnLayout$$inlined$doOnNextLayout$1.ah$a()) : null;
            this.values = viewKt$doOnLayout$$inlined$doOnNextLayout$1.HaptikSDK$b();
        }

        void values() {
            this.valueOf = null;
            clear();
        }
    }
}
