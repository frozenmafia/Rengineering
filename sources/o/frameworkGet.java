package o;

import com.bugsnag.android.Severity;
import java.io.IOException;
import o.setBackgroundTintMode;
/* loaded from: classes3.dex */
public final class frameworkGet implements setBackgroundTintMode.toString {
    private final String HaptikSDK$c;
    final boolean ag$a;
    private Severity ah$a;
    private boolean invoke;
    private final String toString;
    private final String valueOf;
    private final Severity values;

    public static frameworkGet ah$a(String str) {
        return toString(str, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static frameworkGet toString(String str, Severity severity, String str2) {
        if (str.equals("strictMode") && setActivated.valueOf(str2)) {
            throw new IllegalArgumentException("No reason supplied for strictmode");
        }
        if (!str.equals("strictMode") && !str.equals("log") && !setActivated.valueOf(str2)) {
            throw new IllegalArgumentException("attributeValue should not be supplied");
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1876197364:
                if (str.equals("strictMode")) {
                    c = 0;
                    break;
                }
                break;
            case -1773746641:
                if (str.equals("userCallbackSetSeverity")) {
                    c = 1;
                    break;
                }
                break;
            case -1591166708:
                if (str.equals("unhandledException")) {
                    c = 2;
                    break;
                }
                break;
            case -1107031998:
                if (str.equals("userSpecifiedSeverity")) {
                    c = 3;
                    break;
                }
                break;
            case -845696980:
                if (str.equals("handledError")) {
                    c = 4;
                    break;
                }
                break;
            case -573976797:
                if (str.equals("anrError")) {
                    c = 5;
                    break;
                }
                break;
            case 107332:
                if (str.equals("log")) {
                    c = 6;
                    break;
                }
                break;
            case 87505361:
                if (str.equals("unhandledPromiseRejection")) {
                    c = 7;
                    break;
                }
                break;
            case 561970291:
                if (str.equals("handledException")) {
                    c = '\b';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new frameworkGet(str, Severity.WARNING, true, true, str2, "violationType");
            case 1:
            case 3:
                return new frameworkGet(str, severity, false, false, null, null);
            case 2:
            case 5:
            case 7:
                return new frameworkGet(str, Severity.ERROR, true, true, null, null);
            case 4:
            case '\b':
                return new frameworkGet(str, Severity.WARNING, false, false, null, null);
            case 6:
                return new frameworkGet(str, severity, false, false, str2, "level");
            default:
                throw new IllegalArgumentException("Invalid argument for severityReason: '" + str + '\'');
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public frameworkGet(String str, Severity severity, boolean z, boolean z2, String str2, String str3) {
        this.HaptikSDK$c = str;
        this.invoke = z;
        this.ag$a = z2;
        this.values = severity;
        this.ah$a = severity;
        this.toString = str2;
        this.valueOf = str3;
    }

    String valueOf() {
        return this.values == this.ah$a ? this.HaptikSDK$c : "userCallbackSetSeverity";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Severity values() {
        return this.ah$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean invoke() {
        return this.invoke;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean ah$b() {
        return this.invoke != this.ag$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String ag$a() {
        return this.toString;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String ah$a() {
        return this.valueOf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String HaptikSDK$a() {
        return this.HaptikSDK$c;
    }

    @Override // o.setBackgroundTintMode.toString
    public void toStream(setBackgroundTintMode setbackgroundtintmode) throws IOException {
        setbackgroundtintmode.values().ag$a("type").valueOf(valueOf()).ag$a("unhandledOverridden").values(ah$b());
        if (this.valueOf != null && this.toString != null) {
            setbackgroundtintmode.ag$a(com.apxor.androidsdk.core.ce.Constants.ATTRIBUTES).values().ag$a(this.valueOf).valueOf(this.toString).ag$a();
        }
        setbackgroundtintmode.ag$a();
    }
}
