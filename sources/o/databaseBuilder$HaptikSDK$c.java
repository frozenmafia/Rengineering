package o;

import java.util.concurrent.locks.LockSupport;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class databaseBuilder$HaptikSDK$c {
    static final databaseBuilder$HaptikSDK$c values = new databaseBuilder$HaptikSDK$c(false);
    volatile databaseBuilder$HaptikSDK$c ag$a;
    volatile Thread ah$a;

    databaseBuilder$HaptikSDK$c(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public databaseBuilder$HaptikSDK$c() {
        databaseBuilder.values.toString(this, Thread.currentThread());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void valueOf(databaseBuilder$HaptikSDK$c databasebuilder_haptiksdk_c) {
        databaseBuilder.values.toString(this, databasebuilder_haptiksdk_c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ah$a() {
        Thread thread = this.ah$a;
        if (thread != null) {
            this.ah$a = null;
            LockSupport.unpark(thread);
        }
    }
}
