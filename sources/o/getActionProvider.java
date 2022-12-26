package o;

import com.app.dream11.core.performance.D11PerformanceTracker$sendEvent$1;
import o.FontResourcesParserCompat;
import o.Styleable;
/* loaded from: classes2.dex */
public final class getActionProvider {
    private values valueOf;
    private boolean ah$a = true;
    private final attachCompleter ag$a = new attachCompleter();
    private final String toString = "D11PerformanceTracker";

    /* loaded from: classes2.dex */
    public interface values {
        boolean values();
    }

    public final void toString(values valuesVar) {
        runAnimators.ag$a(valuesVar, "shouldTrackEventListener");
        this.valueOf = valuesVar;
    }

    public final void ag$a(String str, String str2, String str3, String str4) {
        runAnimators.ag$a(str4, "eventName");
        if (this.ah$a) {
            values valuesVar = this.valueOf;
            boolean z = true;
            if (valuesVar != null && valuesVar.values()) {
                String str5 = str;
                if (str5 != null && str5.length() != 0) {
                    z = false;
                }
                if (z) {
                    return;
                }
                toString(str, str2, str3, str4);
                this.ah$a = false;
            }
        }
    }

    public final void toString(String str, String str2, String str3) {
        String str4 = str;
        if (str4 == null || str4.length() == 0) {
            return;
        }
        ag$a(this, str, str2, str3, null, 8, null);
    }

    public final void valueOf(String str, String str2, String str3, String str4) {
        String str5 = str;
        if (str5 == null || str5.length() == 0) {
            return;
        }
        toString(str, str2, str3, str4);
    }

    static /* synthetic */ void ag$a(getActionProvider getactionprovider, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 8) != 0) {
            str4 = "";
        }
        getactionprovider.toString(str, str2, str3, str4);
    }

    private final void toString(String str, String str2, String str3, String str4) {
        FontResourcesParserCompat.ProviderResourceEntry.ah$a((Styleable.ArcMotion<setAnimationMatrix>) new D11PerformanceTracker$sendEvent$1(str4, str, str2, str3, this));
    }
}
