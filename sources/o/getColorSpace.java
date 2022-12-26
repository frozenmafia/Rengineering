package o;

import com.app.dream11.core.service.graphql.api.type.VerificationType;
import com.sendbird.android.constant.StringSet;
/* loaded from: classes3.dex */
public final class getColorSpace extends androidx.databinding.BaseObservable {
    private VerificationType HaptikSDK$a;
    private boolean HaptikSDK$b;
    private String HaptikSDK$c;
    private String HaptikSDK$d;
    private String HaptikWebView;
    private String ag$a;
    private boolean ah$a;
    private String ah$b;
    private String getInitSettings;
    private int getSignupData;
    private boolean invoke;
    private int toString;
    private final values valueOf;
    private boolean values;

    /* loaded from: classes3.dex */
    public interface values {
        void ah$a(getColorSpace getcolorspace);

        void valueOf(getColorSpace getcolorspace);
    }

    public getColorSpace(VerificationType verificationType, String str, String str2, String str3, String str4, String str5, boolean z, int i, int i2, boolean z2, boolean z3, values valuesVar, String str6) {
        runAnimators.ag$a(verificationType, StringSet.key);
        runAnimators.ag$a(str, "headerTitle");
        runAnimators.ag$a(str2, "subtitle");
        runAnimators.ag$a(str3, "value");
        runAnimators.ag$a(str4, "message");
        runAnimators.ag$a(str5, "status");
        runAnimators.ag$a(valuesVar, "iVerifyAccountHandler");
        this.HaptikSDK$a = verificationType;
        this.ag$a = str;
        this.getInitSettings = str2;
        this.HaptikSDK$d = str3;
        this.ah$b = str4;
        this.HaptikWebView = str5;
        this.invoke = z;
        this.toString = i;
        this.getSignupData = i2;
        this.values = z2;
        this.HaptikSDK$b = z3;
        this.valueOf = valuesVar;
        this.HaptikSDK$c = str6;
        this.ah$a = true;
    }

    public final boolean HaptikSDK$a() {
        return this.HaptikSDK$b;
    }

    public final String HaptikSDK$b() {
        return this.HaptikSDK$c;
    }

    public final String HaptikSDK$c() {
        return this.ah$b;
    }

    public final String HaptikSDK$d() {
        return this.HaptikSDK$d;
    }

    public final int HaptikSDK$e() {
        return this.getSignupData;
    }

    public final boolean HaptikWebView() {
        return this.values;
    }

    public final int ag$a() {
        return this.toString;
    }

    public final values ah$a() {
        return this.valueOf;
    }

    public final String ah$b() {
        return this.HaptikWebView;
    }

    public final String getInitSettings() {
        return this.getInitSettings;
    }

    public final boolean getSignupData() {
        return this.invoke;
    }

    public final VerificationType invoke() {
        return this.HaptikSDK$a;
    }

    public final String valueOf() {
        return this.ag$a;
    }

    public final void values(boolean z) {
        this.ah$a = z;
    }

    public final boolean values() {
        return this.ah$a;
    }
}
