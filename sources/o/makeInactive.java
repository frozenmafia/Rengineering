package o;

import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.uimanager.debug.NotThreadSafeViewHierarchyUpdateDebugListener;
/* loaded from: classes6.dex */
public class makeInactive implements NotThreadSafeBridgeIdleDebugListener, NotThreadSafeViewHierarchyUpdateDebugListener {
    private final instantiateItem valueOf = instantiateItem.ag$a(20);
    private final instantiateItem ah$a = instantiateItem.ag$a(20);
    private final instantiateItem toString = instantiateItem.ag$a(20);
    private final instantiateItem ag$a = instantiateItem.ag$a(20);
    private volatile boolean values = true;

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public void onTransitionToBridgeIdle() {
        synchronized (this) {
            this.valueOf.ah$a(System.nanoTime());
        }
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public void onTransitionToBridgeBusy() {
        synchronized (this) {
            this.ah$a.ah$a(System.nanoTime());
        }
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public void onBridgeDestroyed() {
        synchronized (this) {
        }
    }

    @Override // com.facebook.react.uimanager.debug.NotThreadSafeViewHierarchyUpdateDebugListener
    public void onViewHierarchyUpdateEnqueued() {
        synchronized (this) {
            this.toString.ah$a(System.nanoTime());
        }
    }

    @Override // com.facebook.react.uimanager.debug.NotThreadSafeViewHierarchyUpdateDebugListener
    public void onViewHierarchyUpdateFinished() {
        synchronized (this) {
            this.ag$a.ah$a(System.nanoTime());
        }
    }

    public boolean values(long j, long j2) {
        boolean z;
        synchronized (this) {
            boolean values = values(this.ag$a, j, j2);
            boolean valueOf = valueOf(j, j2);
            z = true;
            if (!values && (!valueOf || values(this.toString, j, j2))) {
                z = false;
            }
            ah$a(this.valueOf, j2);
            ah$a(this.ah$a, j2);
            ah$a(this.toString, j2);
            ah$a(this.ag$a, j2);
            this.values = valueOf;
        }
        return z;
    }

    private static boolean values(instantiateItem instantiateitem, long j, long j2) {
        for (int i = 0; i < instantiateitem.values(); i++) {
            long valueOf = instantiateitem.valueOf(i);
            if (valueOf >= j && valueOf < j2) {
                return true;
            }
        }
        return false;
    }

    private static long ah$a(instantiateItem instantiateitem, long j, long j2) {
        long j3 = -1;
        for (int i = 0; i < instantiateitem.values(); i++) {
            long valueOf = instantiateitem.valueOf(i);
            if (valueOf >= j && valueOf < j2) {
                j3 = valueOf;
            } else if (valueOf >= j2) {
                break;
            }
        }
        return j3;
    }

    private boolean valueOf(long j, long j2) {
        long ah$a = ah$a(this.valueOf, j, j2);
        long ah$a2 = ah$a(this.ah$a, j, j2);
        if (ah$a == -1 && ah$a2 == -1) {
            return this.values;
        }
        return ah$a > ah$a2;
    }

    private static void ah$a(instantiateItem instantiateitem, long j) {
        int values = instantiateitem.values();
        int i = 0;
        for (int i2 = 0; i2 < values; i2++) {
            if (instantiateitem.valueOf(i2) < j) {
                i++;
            }
        }
        if (i > 0) {
            for (int i3 = 0; i3 < values - i; i3++) {
                instantiateitem.toString(i3, instantiateitem.valueOf(i3 + i));
            }
            instantiateitem.values(i);
        }
    }
}
