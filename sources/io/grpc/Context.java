package io.grpc;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.SlidingPaneLayout;
/* loaded from: classes7.dex */
public class Context {
    private static final SlidingPaneLayout.AccessibilityDelegate<Object<?>, Object> ah$b;
    static final Logger toString = Logger.getLogger(Context.class.getName());
    public static final Context values;
    private valueOf HaptikSDK$c = new Context$ah$a(this, null);
    final values ag$a;
    final int ah$a;
    private ArrayList<toString> invoke;
    final SlidingPaneLayout.AccessibilityDelegate<Object<?>, Object> valueOf;

    /* loaded from: classes7.dex */
    public interface valueOf {
        void values(Context context);
    }

    static {
        SlidingPaneLayout.AccessibilityDelegate<Object<?>, Object> accessibilityDelegate = new SlidingPaneLayout.AccessibilityDelegate<>();
        ah$b = accessibilityDelegate;
        values = new Context(null, accessibilityDelegate);
    }

    private Context(Context context, SlidingPaneLayout.AccessibilityDelegate<Object<?>, Object> accessibilityDelegate) {
        this.ag$a = ag$a(context);
        this.valueOf = accessibilityDelegate;
        int i = context == null ? 0 : context.ah$a + 1;
        this.ah$a = i;
        ag$a(i);
    }

    boolean values() {
        return this.ag$a != null;
    }

    public Context valueOf() {
        Context valueOf2 = Context$ag$a.ag$a.valueOf(this);
        return valueOf2 == null ? values : valueOf2;
    }

    public void toString(Context context) {
        toString(context, "toAttach");
        Context$ag$a.ag$a.ag$a(this, context);
    }

    public boolean invoke() {
        values valuesVar = this.ag$a;
        if (valuesVar == null) {
            return false;
        }
        return valuesVar.invoke();
    }

    public Throwable ah$a() {
        values valuesVar = this.ag$a;
        if (valuesVar == null) {
            return null;
        }
        return valuesVar.ah$a();
    }

    public void values(valueOf valueof) {
        if (values()) {
            synchronized (this) {
                ArrayList<toString> arrayList = this.invoke;
                if (arrayList != null) {
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        } else if (this.invoke.get(size).ah$a == valueof) {
                            this.invoke.remove(size);
                            break;
                        } else {
                            size--;
                        }
                    }
                    if (this.invoke.isEmpty()) {
                        values valuesVar = this.ag$a;
                        if (valuesVar != null) {
                            valuesVar.values(this.HaptikSDK$c);
                        }
                        this.invoke = null;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void HaptikSDK$b() {
        if (values()) {
            synchronized (this) {
                ArrayList<toString> arrayList = this.invoke;
                if (arrayList == null) {
                    return;
                }
                this.invoke = null;
                for (int i = 0; i < arrayList.size(); i++) {
                    if (!(arrayList.get(i).ah$a instanceof Context$ah$a)) {
                        arrayList.get(i).ah$a();
                    }
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (arrayList.get(i2).ah$a instanceof Context$ah$a) {
                        arrayList.get(i2).ah$a();
                    }
                }
                values valuesVar = this.ag$a;
                if (valuesVar != null) {
                    valuesVar.values(this.HaptikSDK$c);
                }
            }
        }
    }

    /* renamed from: io.grpc.Context$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ Runnable ag$a;
        final /* synthetic */ Context valueOf;

        @Override // java.lang.Runnable
        public void run() {
            Context valueOf = this.valueOf.valueOf();
            try {
                this.ag$a.run();
            } finally {
                this.valueOf.toString(valueOf);
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class values extends Context implements Closeable {
        private ScheduledFuture<?> HaptikSDK$a;
        private boolean HaptikSDK$b;
        private final Context HaptikSDK$c;
        private Throwable ah$b;

        @Override // io.grpc.Context
        boolean values() {
            return true;
        }

        @Override // io.grpc.Context
        public Context valueOf() {
            return this.HaptikSDK$c.valueOf();
        }

        @Override // io.grpc.Context
        public void toString(Context context) {
            this.HaptikSDK$c.toString(context);
        }

        public boolean valueOf(Throwable th) {
            boolean z;
            synchronized (this) {
                z = false;
                if (!this.HaptikSDK$b) {
                    this.HaptikSDK$b = true;
                    ScheduledFuture<?> scheduledFuture = this.HaptikSDK$a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.HaptikSDK$a = null;
                    }
                    this.ah$b = th;
                    z = true;
                }
            }
            if (z) {
                HaptikSDK$b();
            }
            return z;
        }

        @Override // io.grpc.Context
        public boolean invoke() {
            synchronized (this) {
                if (this.HaptikSDK$b) {
                    return true;
                }
                if (super.invoke()) {
                    valueOf(super.ah$a());
                    return true;
                }
                return false;
            }
        }

        @Override // io.grpc.Context
        public Throwable ah$a() {
            if (invoke()) {
                return this.ah$b;
            }
            return null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            valueOf(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public final class toString implements Runnable {
        final valueOf ah$a;
        private final Executor valueOf;
        final /* synthetic */ Context values;

        void ah$a() {
            try {
                this.valueOf.execute(this);
            } catch (Throwable th) {
                Context.toString.log(Level.INFO, "Exception notifying context listener", th);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.ah$a.values(this.values);
        }
    }

    static <T> T toString(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* loaded from: classes7.dex */
    enum DirectExecutor implements Executor {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Context.DirectExecutor";
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    static values ag$a(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof values) {
            return (values) context;
        }
        return context.ag$a;
    }

    private static void ag$a(int i) {
        if (i == 1000) {
            toString.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }
}
