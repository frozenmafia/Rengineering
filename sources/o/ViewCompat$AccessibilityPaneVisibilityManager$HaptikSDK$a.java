package o;

import com.bugsnag.android.ThreadSendPolicy;
import o.ViewCompat;
/* loaded from: classes6.dex */
public final class ViewCompat$AccessibilityPaneVisibilityManager$HaptikSDK$a extends ViewCompat.AccessibilityPaneVisibilityManager {
    public final String HaptikSDK$a;
    public final ThreadSendPolicy HaptikSDK$b;
    public final boolean ag$a;
    public final String ah$a;
    public final String invoke;
    public final String toString;
    public final int valueOf;
    public final String values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewCompat$AccessibilityPaneVisibilityManager$HaptikSDK$a(String str, boolean z, String str2, String str3, String str4, String str5, int i, ThreadSendPolicy threadSendPolicy) {
        super(null);
        runAnimators.valueOf(str, "apiKey");
        runAnimators.valueOf(str5, "lastRunInfoPath");
        runAnimators.valueOf(threadSendPolicy, "sendThreads");
        this.values = str;
        this.ag$a = z;
        this.ah$a = str2;
        this.toString = str3;
        this.HaptikSDK$a = str4;
        this.invoke = str5;
        this.valueOf = i;
        this.HaptikSDK$b = threadSendPolicy;
    }
}
