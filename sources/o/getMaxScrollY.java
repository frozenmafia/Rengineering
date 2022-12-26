package o;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import o.AccessibilityNodeProviderCompat;
/* loaded from: classes4.dex */
public class getMaxScrollY implements AccessibilityRecordCompat {
    private final CleverTapInstanceConfig ag$a;
    private AccessibilityNodeProviderCompat.AccessibilityNodeProviderApi26 ah$a;

    public getMaxScrollY(CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.ag$a = cleverTapInstanceConfig;
        ag$a();
    }

    @Override // o.AccessibilityRecordCompat
    public AccessibilityNodeProviderCompat.AccessibilityNodeProviderApi26 values() {
        return this.ah$a;
    }

    @Override // o.AccessibilityRecordCompat
    public boolean ah$a(String str) {
        boolean ah$a = this.ah$a.ah$a(str);
        CleverTapInstanceConfig cleverTapInstanceConfig = this.ag$a;
        cleverTapInstanceConfig.valueOf("ON_USER_LOGIN", "isIdentity [Key: " + str + " , Value: " + ah$a + "]");
        return ah$a;
    }

    private void ag$a() {
        this.ah$a = AccessibilityNodeProviderCompat.AccessibilityNodeProviderApi26.ag$a();
        CleverTapInstanceConfig cleverTapInstanceConfig = this.ag$a;
        cleverTapInstanceConfig.valueOf("ON_USER_LOGIN", "LegacyIdentityRepo Setting the default IdentitySet[" + this.ah$a + "]");
    }
}
