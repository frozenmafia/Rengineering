package o;

import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes7.dex */
public final class __assign {
    public static boolean valueOf(AtomicReference<dataStart> atomicReference, dataStart datastart, Class<?> cls) {
        Objects.requireNonNull(datastart, "next is null");
        if (atomicReference.compareAndSet(null, datastart)) {
            return true;
        }
        datastart.dispose();
        if (atomicReference.get() != DisposableHelper.DISPOSED) {
            ah$a(cls);
            return false;
        }
        return false;
    }

    public static boolean values(AtomicReference<getSidecarVersion> atomicReference, getSidecarVersion getsidecarversion, Class<?> cls) {
        Objects.requireNonNull(getsidecarversion, "next is null");
        if (atomicReference.compareAndSet(null, getsidecarversion)) {
            return true;
        }
        getsidecarversion.cancel();
        if (atomicReference.get() != SubscriptionHelper.CANCELLED) {
            ah$a(cls);
            return false;
        }
        return false;
    }

    public static String ag$a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    public static void ah$a(Class<?> cls) {
        endMetadataList.valueOf(new ProtocolViolationException(ag$a(cls.getName())));
    }
}
