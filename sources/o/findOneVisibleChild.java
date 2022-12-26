package o;

import android.net.Uri;
import com.google.firebase.auth.zzc;
import java.util.Map;
import java.util.Set;
/* loaded from: classes7.dex */
public class findOneVisibleChild {
    private static final Map<String, Integer> valueOf = new zzc();
    private final String HaptikSDK$b;
    private final String HaptikSDK$c;
    private final String ag$a;
    private final String ah$a;
    private final String toString;
    private final String values;

    private findOneVisibleChild(String str) {
        String values = values(str, "apiKey");
        String values2 = values(str, "oobCode");
        String values3 = values(str, "mode");
        if (values == null || values2 == null || values3 == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", "apiKey", "oobCode", "mode"));
        }
        this.values = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(values);
        this.toString = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(values2);
        this.ag$a = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(values3);
        this.ah$a = values(str, "continueUrl");
        this.HaptikSDK$c = values(str, "languageCode");
        this.HaptikSDK$b = values(str, "tenantId");
    }

    public static findOneVisibleChild valueOf(String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        try {
            return new findOneVisibleChild(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static String values(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                return Uri.parse(com.google.android.gms.common.internal.Preconditions.checkNotEmpty(parse.getQueryParameter("link"))).getQueryParameter(str2);
            }
            return null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }

    public String ah$a() {
        return this.toString;
    }

    public final String values() {
        return this.HaptikSDK$b;
    }
}
