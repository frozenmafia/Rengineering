package o;

import com.fancode.livestream.type.DRMSecurityLevel;
import com.fancode.livestream.type.DRMType;
import java.io.IOException;
import o.ComponentActivity;
/* loaded from: classes4.dex */
public final class getCoroutineScope implements ComponentActivity.AnonymousClass6 {
    private volatile transient int ag$a;
    private volatile transient boolean ah$a;
    private final ComponentActivity.AnonymousClass5<DRMSecurityLevel> toString;
    private final DRMType values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getCoroutineScope(DRMType dRMType, ComponentActivity.AnonymousClass5<DRMSecurityLevel> anonymousClass5) {
        this.values = dRMType;
        this.toString = anonymousClass5;
    }

    public DRMSecurityLevel ag$a() {
        return this.toString.values;
    }

    public static getCoroutineScope$ah$a values() {
        return new getCoroutineScope$ah$a();
    }

    @Override // o.ComponentActivity.AnonymousClass6
    public remove marshaller() {
        return new remove() { // from class: o.getCoroutineScope.4
            @Override // o.remove
            public void marshal(OnBackPressedCallback onBackPressedCallback) throws IOException {
                onBackPressedCallback.ah$a("drmType", getCoroutineScope.this.values.rawValue());
                if (getCoroutineScope.this.toString.valueOf) {
                    onBackPressedCallback.ah$a("securityLevel", getCoroutineScope.this.toString.values != 0 ? ((DRMSecurityLevel) getCoroutineScope.this.toString.values).rawValue() : null);
                }
            }
        };
    }

    public int hashCode() {
        if (!this.ah$a) {
            this.ag$a = ((this.values.hashCode() ^ 1000003) * 1000003) ^ this.toString.hashCode();
            this.ah$a = true;
        }
        return this.ag$a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof getCoroutineScope) {
            getCoroutineScope getcoroutinescope = (getCoroutineScope) obj;
            return this.values.equals(getcoroutinescope.values) && this.toString.equals(getcoroutinescope.toString);
        }
        return false;
    }
}
