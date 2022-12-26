package o;

import com.fancode.livestream.type.DRMSecurityLevel;
import com.fancode.livestream.type.DRMType;
import o.ComponentActivity;
/* loaded from: classes4.dex */
public final class getCoroutineScope$ah$a {
    private DRMType ah$a;
    private ComponentActivity.AnonymousClass5<DRMSecurityLevel> valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getCoroutineScope$ah$a() {
        ComponentActivity.AnonymousClass5<DRMSecurityLevel> ag$a;
        ag$a = ComponentActivity.AnonymousClass5.ag$a.ag$a();
        this.valueOf = ag$a;
    }

    public getCoroutineScope$ah$a ag$a(DRMType dRMType) {
        this.ah$a = dRMType;
        return this;
    }

    public getCoroutineScope$ah$a toString(DRMSecurityLevel dRMSecurityLevel) {
        this.valueOf = ComponentActivity.AnonymousClass5.toString(dRMSecurityLevel);
        return this;
    }

    public getCoroutineScope ah$a() {
        OnBackPressedDispatcherKt.values(this.ah$a, "drmType == null");
        return new getCoroutineScope(this.ah$a, this.valueOf);
    }
}
