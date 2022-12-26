package o;

import android.content.Context;
import com.app.dream11.social.SocialHelper;
import com.sendbird.android.constant.StringSet;
import o.setColorized;
/* loaded from: classes3.dex */
public final class setChronometerCountDown {
    private final String HaptikSDK$a;
    private final String HaptikSDK$b;
    private String HaptikSDK$c;
    private final int HaptikWebView;
    private final String ag$a;
    private final String ah$a;
    private final String ah$b;
    private final setColorized.toString invoke;
    private final SocialHelper.ConnectionStatus toString;
    private final Context valueOf;
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof setChronometerCountDown) {
            setChronometerCountDown setchronometercountdown = (setChronometerCountDown) obj;
            return this.toString == setchronometercountdown.toString && runAnimators.values((Object) this.values, (Object) setchronometercountdown.values) && runAnimators.values((Object) this.ah$b, (Object) setchronometercountdown.ah$b) && this.HaptikWebView == setchronometercountdown.HaptikWebView && runAnimators.values((Object) this.HaptikSDK$a, (Object) setchronometercountdown.HaptikSDK$a) && runAnimators.values((Object) this.ag$a, (Object) setchronometercountdown.ag$a) && runAnimators.values(this.invoke, setchronometercountdown.invoke) && runAnimators.values(this.valueOf, setchronometercountdown.valueOf) && runAnimators.values((Object) this.HaptikSDK$b, (Object) setchronometercountdown.HaptikSDK$b) && runAnimators.values((Object) this.ah$a, (Object) setchronometercountdown.ah$a) && runAnimators.values((Object) this.HaptikSDK$c, (Object) setchronometercountdown.HaptikSDK$c);
        }
        return false;
    }

    public int hashCode() {
        SocialHelper.ConnectionStatus connectionStatus = this.toString;
        int hashCode = connectionStatus == null ? 0 : connectionStatus.hashCode();
        String str = this.values;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.ah$b;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        int i = this.HaptikWebView;
        String str3 = this.HaptikSDK$a;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.ag$a;
        int hashCode5 = str4 == null ? 0 : str4.hashCode();
        int hashCode6 = this.invoke.hashCode();
        Context context = this.valueOf;
        int hashCode7 = context == null ? 0 : context.hashCode();
        String str5 = this.HaptikSDK$b;
        int hashCode8 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.ah$a;
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (str6 != null ? str6.hashCode() : 0)) * 31) + this.HaptikSDK$c.hashCode();
    }

    public String toString() {
        SocialHelper.ConnectionStatus connectionStatus = this.toString;
        String str = this.values;
        String str2 = this.ah$b;
        int i = this.HaptikWebView;
        String str3 = this.HaptikSDK$a;
        String str4 = this.ag$a;
        setColorized.toString tostring = this.invoke;
        Context context = this.valueOf;
        String str5 = this.HaptikSDK$b;
        String str6 = this.ah$a;
        String str7 = this.HaptikSDK$c;
        return "MessageButtonData(connectionStatus=" + connectionStatus + ", channelUrl=" + str + ", teamName=" + str2 + ", userId=" + i + ", userGuid=" + str3 + ", currentLevel=" + str4 + ", handler=" + tostring + ", context=" + context + ", source=" + str5 + ", flow=" + str6 + ", reason=" + str7 + ")";
    }

    public setChronometerCountDown(SocialHelper.ConnectionStatus connectionStatus, String str, String str2, int i, String str3, String str4, setColorized.toString tostring, Context context, String str5, String str6, String str7) {
        runAnimators.ag$a(tostring, "handler");
        runAnimators.ag$a(str7, StringSet.reason);
        this.toString = connectionStatus;
        this.values = str;
        this.ah$b = str2;
        this.HaptikWebView = i;
        this.HaptikSDK$a = str3;
        this.ag$a = str4;
        this.invoke = tostring;
        this.valueOf = context;
        this.HaptikSDK$b = str5;
        this.ah$a = str6;
        this.HaptikSDK$c = str7;
    }

    public /* synthetic */ setChronometerCountDown(SocialHelper.ConnectionStatus connectionStatus, String str, String str2, int i, String str3, String str4, setColorized.toString tostring, Context context, String str5, String str6, String str7, int i2, getTargetTypes gettargettypes) {
        this(connectionStatus, str, str2, i, str3, str4, tostring, context, str5, str6, (i2 & 1024) != 0 ? "" : str7);
    }

    public final SocialHelper.ConnectionStatus values() {
        return this.toString;
    }

    public final String valueOf() {
        return this.values;
    }

    public final int HaptikSDK$c() {
        return this.HaptikWebView;
    }

    public final String ag$a() {
        return this.ag$a;
    }

    public final setColorized.toString ah$b() {
        return this.invoke;
    }

    public final String invoke() {
        return this.HaptikSDK$b;
    }

    public final String ah$a() {
        return this.ah$a;
    }

    public final String HaptikSDK$b() {
        return this.HaptikSDK$c;
    }
}
