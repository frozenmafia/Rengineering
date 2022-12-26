package o;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.IInterface;
/* loaded from: classes.dex */
class HaptikSDK$b$ag$a {
    private final boolean HaptikSDK$b;
    private final cr HaptikSDK$c;
    private values ag$a;
    private final ResolveInfo ah$a;
    private IInterface toString;
    final /* synthetic */ HaptikSDK$b valueOf;
    private Intent values;

    public HaptikSDK$b$ag$a(HaptikSDK$b haptikSDK$b, cr crVar, IInterface iInterface, values valuesVar, boolean z, ResolveInfo resolveInfo, Intent intent) {
        this.valueOf = haptikSDK$b;
        this.HaptikSDK$c = crVar;
        this.toString = iInterface;
        valueOf(valuesVar);
        this.HaptikSDK$b = z;
        this.ah$a = resolveInfo;
        this.values = intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ResolveInfo ah$b() {
        return this.ah$a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void valueOf(values valuesVar) {
        this.ag$a = valuesVar;
    }

    public IInterface ag$a() {
        return this.toString;
    }

    public values ah$a() {
        return this.ag$a;
    }

    public Intent valueOf() {
        return this.values;
    }

    public cr values() {
        return this.HaptikSDK$c;
    }

    public void values(Intent intent) {
        this.values = intent;
    }

    public void values(IInterface iInterface) {
        this.toString = iInterface;
    }
}
