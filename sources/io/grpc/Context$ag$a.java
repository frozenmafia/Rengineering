package io.grpc;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import o.SlidingPaneLayout;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class Context$ag$a {
    static final Context$HaptikSDK$b ag$a;

    static {
        AtomicReference atomicReference = new AtomicReference();
        ag$a = values(atomicReference);
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            Context.toString.log(Level.FINE, "Storage override doesn't exist. Using default", th);
        }
    }

    private static Context$HaptikSDK$b values(AtomicReference<? super ClassNotFoundException> atomicReference) {
        try {
            return (Context$HaptikSDK$b) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(Context$HaptikSDK$b.class).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e) {
            atomicReference.set(e);
            return new SlidingPaneLayout.DragHelperCallback();
        } catch (Exception e2) {
            throw new RuntimeException("Storage override failed to initialize", e2);
        }
    }
}
