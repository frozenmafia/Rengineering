package o;

import com.conviva.api.SystemSettings;
import java.util.List;
/* loaded from: classes4.dex */
public class CompoundButtonCompat implements setCheckMarkTintList {
    SystemSettings HaptikSDK$a;
    constrainEdgeValue HaptikSDK$b;
    getEdgeValue ag$a;
    String ah$a;
    String toString;
    int valueOf;
    List<String> values;

    public CompoundButtonCompat(getEdgeValue getedgevalue, constrainEdgeValue constrainedgevalue, SystemSettings systemSettings, List<String> list, String str) {
        this.ag$a = getedgevalue;
        this.HaptikSDK$b = constrainedgevalue;
        this.HaptikSDK$a = systemSettings;
        this.values = list;
        this.ah$a = str;
    }

    public void values(String str) {
        ag$a(str, SystemSettings.LogLevel.DEBUG);
    }

    public void ah$a(String str) {
        ag$a(str, SystemSettings.LogLevel.INFO);
    }

    public void HaptikSDK$a(String str) {
        ag$a(str, SystemSettings.LogLevel.WARNING);
    }

    @Override // o.setCheckMarkTintList
    public void toString(String str) {
        ag$a(str, SystemSettings.LogLevel.ERROR);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.CompoundButtonCompat$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] ag$a;

        static {
            int[] iArr = new int[SystemSettings.LogLevel.values().length];
            ag$a = iArr;
            try {
                iArr[SystemSettings.LogLevel.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ag$a[SystemSettings.LogLevel.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ag$a[SystemSettings.LogLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ag$a[SystemSettings.LogLevel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ag$a[SystemSettings.LogLevel.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public void ag$a(String str, SystemSettings.LogLevel logLevel) {
        int i = AnonymousClass2.ag$a[logLevel.ordinal()];
        boolean z = true;
        if (i == 1 ? this.HaptikSDK$a.values != SystemSettings.LogLevel.DEBUG : i == 2 ? !(this.HaptikSDK$a.values == SystemSettings.LogLevel.DEBUG || this.HaptikSDK$a.values == SystemSettings.LogLevel.INFO) : !(i == 3 ? this.HaptikSDK$a.values == SystemSettings.LogLevel.DEBUG || this.HaptikSDK$a.values == SystemSettings.LogLevel.INFO || this.HaptikSDK$a.values == SystemSettings.LogLevel.WARNING : i == 4 && (this.HaptikSDK$a.values == SystemSettings.LogLevel.DEBUG || this.HaptikSDK$a.values == SystemSettings.LogLevel.INFO || this.HaptikSDK$a.values == SystemSettings.LogLevel.WARNING || this.HaptikSDK$a.values == SystemSettings.LogLevel.ERROR))) {
            z = false;
        }
        if (z) {
            String values = values(str, logLevel);
            this.values.add(values);
            this.ag$a.valueOf(values, logLevel);
        }
    }

    private String ah$b(String str) {
        String str2 = this.toString;
        if (str2 == null || str2.isEmpty()) {
            return str;
        }
        return "[" + this.toString + "] " + str;
    }

    public String ag$a(String str) {
        String str2 = this.ah$a;
        if (str2 == null || str2.isEmpty()) {
            return str;
        }
        return "[" + this.ah$a + "] " + str;
    }

    private String invoke(String str) {
        String str2 = this.ah$a;
        if (str2 == null || str2.isEmpty()) {
            return str;
        }
        return "[Conviva] " + str;
    }

    private String HaptikSDK$b(String str) {
        String format = String.format("%.2f", Double.valueOf(this.HaptikSDK$b.ah$a() / 1000.0d));
        return "[" + format + "] " + str;
    }

    private String toString(String str, SystemSettings.LogLevel logLevel) {
        String values = values(logLevel);
        String str2 = this.ah$a;
        if (str2 == null || str2.isEmpty()) {
            return str;
        }
        return "[" + values + "] " + str;
    }

    private String HaptikSDK$c(String str) {
        if (this.valueOf > 0) {
            return "sid=" + this.valueOf + com.dreampay.commons.constants.Constants.WHITE_SPACE + str;
        }
        return str;
    }

    public void ah$a(int i) {
        this.valueOf = i;
    }

    @Override // o.setCheckMarkTintList
    public void valueOf(String str) {
        this.toString = str;
    }

    private String values(String str, SystemSettings.LogLevel logLevel) {
        return invoke(HaptikSDK$b(toString(ag$a(ah$b(HaptikSDK$c(str))), logLevel)));
    }

    private static String values(SystemSettings.LogLevel logLevel) {
        int i = AnonymousClass2.ag$a[logLevel.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "INFO";
            }
            if (i == 3) {
                return "WARNING";
            }
            if (i == 4) {
                return "ERROR";
            }
            if (i != 5) {
                return "";
            }
        }
        return "NONE";
    }
}
