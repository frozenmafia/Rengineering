package o;

import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes5.dex */
public class stopInterceptRequestLayout {
    private final boolean HaptikSDK$a;
    private final String HaptikSDK$c;
    private final com.google.firebase.database.logging.Logger ag$a;
    private final String ah$a;
    private final String ah$b;
    private final String toString;
    private final setRecycledViewPool valueOf;
    private final ScheduledExecutorService values;

    public stopInterceptRequestLayout(com.google.firebase.database.logging.Logger logger, setRecycledViewPool setrecycledviewpool, ScheduledExecutorService scheduledExecutorService, boolean z, String str, String str2, String str3, String str4) {
        this.ag$a = logger;
        this.valueOf = setrecycledviewpool;
        this.values = scheduledExecutorService;
        this.HaptikSDK$a = z;
        this.ah$a = str;
        this.ah$b = str2;
        this.toString = str3;
        this.HaptikSDK$c = str4;
    }

    public com.google.firebase.database.logging.Logger HaptikSDK$c() {
        return this.ag$a;
    }

    public setRecycledViewPool ah$a() {
        return this.valueOf;
    }

    public ScheduledExecutorService values() {
        return this.values;
    }

    public boolean invoke() {
        return this.HaptikSDK$a;
    }

    public String ag$a() {
        return this.ah$a;
    }

    public String HaptikSDK$a() {
        return this.ah$b;
    }

    public String HaptikSDK$b() {
        return this.HaptikSDK$c;
    }

    public String valueOf() {
        return this.toString;
    }
}
