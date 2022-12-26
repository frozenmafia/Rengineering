package o;

import com.giphy.sdk.analytics.models.enums.ActionType;
import com.giphy.sdk.analytics.models.enums.EventType;
/* loaded from: classes4.dex */
public final class getStatus$ah$a {
    private String HaptikSDK$a;
    private String HaptikSDK$b;
    private int HaptikSDK$c;
    private String HaptikSDK$d;
    private long HaptikSDK$e;
    private String HaptikWebView;
    public ActionType ag$a;
    public String ah$a;
    private String ah$b;
    private String getSignupData;
    private EventType invoke;
    public String toString;
    public String valueOf;
    public String values;

    public final String HaptikSDK$d() {
        String str = this.valueOf;
        if (str == null) {
            runAnimators.valueOf("userId");
        }
        return str;
    }

    public final String HaptikSDK$c() {
        String str = this.toString;
        if (str == null) {
            runAnimators.valueOf("loggedInUserId");
        }
        return str;
    }

    public final String ah$b() {
        return this.HaptikSDK$b;
    }

    public final String values() {
        String str = this.ah$a;
        if (str == null) {
            runAnimators.valueOf("analyticsResponsePayload");
        }
        return str;
    }

    public final String getInitSettings() {
        return this.HaptikSDK$d;
    }

    public final EventType ag$a() {
        return this.invoke;
    }

    public final String HaptikSDK$a() {
        String str = this.values;
        if (str == null) {
            runAnimators.valueOf("mediaId");
        }
        return str;
    }

    public final String HaptikSDK$e() {
        return this.HaptikWebView;
    }

    public final ActionType valueOf() {
        ActionType actionType = this.ag$a;
        if (actionType == null) {
            runAnimators.valueOf("actionType");
        }
        return actionType;
    }

    public final String getSignupData() {
        return this.getSignupData;
    }

    public final long HaptikWebView() {
        return this.HaptikSDK$e;
    }

    public final String ah$a() {
        return this.ah$b;
    }

    public final int invoke() {
        return this.HaptikSDK$c;
    }

    public final String HaptikSDK$b() {
        return this.HaptikSDK$a;
    }

    public final void values(String str, String str2, String str3, String str4, String str5, EventType eventType, String str6, String str7, ActionType actionType, String str8, String str9, int i, String str10) {
        runAnimators.ag$a(str, "userId");
        runAnimators.ag$a(str2, "loggedInUserId");
        runAnimators.ag$a(str4, "analyticsResponsePayload");
        runAnimators.ag$a(str6, "mediaId");
        runAnimators.ag$a(actionType, "actionType");
        this.valueOf = str;
        this.toString = str2;
        this.HaptikSDK$b = str3;
        this.ah$a = str4;
        this.HaptikSDK$d = str5;
        this.invoke = eventType;
        this.values = str6;
        this.HaptikWebView = str7;
        this.ag$a = actionType;
        this.getSignupData = str8;
        this.HaptikSDK$e = System.currentTimeMillis();
        this.ah$b = str9;
        this.HaptikSDK$c = i;
        this.HaptikSDK$a = str10;
    }
}
