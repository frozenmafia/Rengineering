package o;

import android.os.Handler;
import android.os.Looper;
import com.facebook.internal.instrument.InstrumentData;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import o.DefaultSpecialEffectsController;
/* loaded from: classes4.dex */
public final class isStateAtLeast {
    private static boolean valueOf;
    public static final isStateAtLeast toString = new isStateAtLeast();
    private static final Set<Object> values = Collections.newSetFromMap(new WeakHashMap());

    public static final boolean ag$a() {
        return false;
    }

    private isStateAtLeast() {
    }

    public static final void valueOf() {
        valueOf = true;
    }

    public static final void values(Throwable th, Object obj) {
        runAnimators.ag$a(obj, "o");
        if (valueOf) {
            values.add(obj);
            DefaultSpecialEffectsController.AnonymousClass8 anonymousClass8 = DefaultSpecialEffectsController.AnonymousClass8.values;
            if (onDestroyView.values) {
                enqueueAction enqueueaction = enqueueAction.ag$a;
                enqueueAction.valueOf(th);
                InstrumentData.values valuesVar = InstrumentData.values.ah$a;
                InstrumentData.values.valueOf(th, InstrumentData.Type.CrashShield).valueOf();
            }
            ag$a(th);
        }
    }

    public static final boolean values(Object obj) {
        runAnimators.ag$a(obj, "o");
        return values.contains(obj);
    }

    public static final void ag$a(Throwable th) {
        if (ag$a()) {
            new Handler(Looper.getMainLooper()).post(new values(th));
        }
    }

    /* loaded from: classes4.dex */
    public static final class values implements Runnable {
        final /* synthetic */ Throwable ah$a;

        values(Throwable th) {
            this.ah$a = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (isStateAtLeast.values(this)) {
                return;
            }
            try {
                throw new RuntimeException(this.ah$a);
            } catch (Throwable th) {
                isStateAtLeast.values(th, this);
            }
        }
    }
}
