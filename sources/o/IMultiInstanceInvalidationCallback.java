package o;

import android.content.Context;
import com.microsoft.fraudprotection.androidsdk.FPRunnableType;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;
import o.FtsOptions;
/* loaded from: classes5.dex */
public class IMultiInstanceInvalidationCallback {
    private final String ag$a;
    private final int values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public IMultiInstanceInvalidationCallback(int i, String str) {
        this.values = i;
        this.ag$a = str;
    }

    /* loaded from: classes5.dex */
    abstract class Stub implements Runnable {
        onConflict HaptikSDK$b;
        Context ag$a;
        FPRunnableType ah$a;
        String invoke;
        Ignore toString;
        String valueOf;
        InvalidationTracker values;

        /* loaded from: classes5.dex */
        public class Proxy<T> {
            private T ah$a;
            private FPRunnableType toString;
            private boolean valueOf;
            private IMultiInstanceInvalidationCallback values;

            /* JADX INFO: Access modifiers changed from: package-private */
            public Proxy(FPRunnableType fPRunnableType) {
                this.toString = fPRunnableType;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public Proxy(FPRunnableType fPRunnableType, T t) {
                this.toString = fPRunnableType;
                this.ah$a = t;
                this.valueOf = true;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public Proxy(FPRunnableType fPRunnableType, IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback) {
                this.toString = fPRunnableType;
                this.values = iMultiInstanceInvalidationCallback;
                this.valueOf = false;
            }

            public boolean valueOf() {
                return this.valueOf;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public void valueOf(boolean z) {
                this.valueOf = z;
            }

            public T ag$a() {
                return this.ah$a;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public void ah$a(T t) {
                this.ah$a = t;
            }

            public IMultiInstanceInvalidationCallback values() {
                return this.values;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public void toString(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback) {
                this.values = iMultiInstanceInvalidationCallback;
                this.valueOf = false;
            }

            public FPRunnableType ah$a() {
                return this.toString;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Stub(FPRunnableType fPRunnableType, String str, String str2, Context context, Ignore ignore, onConflict onconflict, InvalidationTracker invalidationTracker) {
            this.ah$a = fPRunnableType;
            this.invoke = str;
            this.valueOf = str2;
            this.ag$a = context;
            this.toString = ignore;
            this.HaptikSDK$b = onconflict;
            this.values = invalidationTracker;
        }
    }

    public IMultiInstanceInvalidationCallback(String str) {
        this.ag$a = str;
        this.values = -1;
    }

    /* loaded from: classes5.dex */
    public class Default {
        private final AtomicInteger values = new AtomicInteger();
        private final LinkedBlockingDeque<FtsOptions.MatchInfo> ag$a = new LinkedBlockingDeque<>();

        public void toString(String str, String str2) {
            this.ag$a.add(new FtsOptions.MatchInfo(this.values.getAndIncrement(), str, str2));
        }

        public List<FtsOptions.MatchInfo> values() {
            ArrayList arrayList = new ArrayList();
            while (!this.ag$a.isEmpty()) {
                arrayList.add(this.ag$a.remove());
            }
            return arrayList;
        }
    }

    public int values() {
        return this.values;
    }

    public String ah$a() {
        return this.ag$a;
    }

    public String toString() {
        return "FPError{errorCode=" + this.values + ", errorMessage=" + this.ag$a + "}";
    }
}
