package o;

import com.app.dream11.core.service.graphql.api.type.MyConnectionStatus;
import com.app.dream11.core.service.graphql.api.type.UserType;
/* loaded from: classes3.dex */
public final class getWhenIfShowing {
    private final createHeadsUpContentView HaptikSDK$a;
    private final String HaptikSDK$b;
    private final String HaptikSDK$c;
    private final int ag$a;
    private final MyConnectionStatus ah$a;
    private final String ah$b;
    private final UserType getSignupData;
    private final String invoke;
    private final String toString;
    private final String valueOf;
    private boolean values;

    public getWhenIfShowing(int i, String str, String str2, String str3, UserType userType, String str4, String str5, MyConnectionStatus myConnectionStatus, String str6, boolean z, createHeadsUpContentView createheadsupcontentview) {
        runAnimators.ag$a(str, "teamName");
        runAnimators.ag$a(str2, "profilePic");
        runAnimators.ag$a(str3, "userGuid");
        runAnimators.ag$a(myConnectionStatus, "connectionStatus");
        runAnimators.ag$a(createheadsupcontentview, "mHandler");
        this.ag$a = i;
        this.ah$b = str;
        this.HaptikSDK$b = str2;
        this.HaptikSDK$c = str3;
        this.getSignupData = userType;
        this.invoke = str4;
        this.valueOf = str5;
        this.ah$a = myConnectionStatus;
        this.toString = str6;
        this.values = z;
        this.HaptikSDK$a = createheadsupcontentview;
    }

    public final String HaptikSDK$a() {
        return this.HaptikSDK$b;
    }

    public final int ag$a() {
        return this.ag$a;
    }

    public final String ah$b() {
        return this.ah$b;
    }

    public final String HaptikSDK$b() {
        return this.HaptikSDK$c;
    }

    public final UserType getSignupData() {
        return this.getSignupData;
    }

    public final String invoke() {
        return this.invoke;
    }

    public final String ah$a() {
        return this.valueOf;
    }

    public final MyConnectionStatus valueOf() {
        return this.ah$a;
    }

    public final String values() {
        return this.toString;
    }

    public final boolean getInitSettings() {
        return this.values;
    }

    public final createHeadsUpContentView HaptikSDK$c() {
        return this.HaptikSDK$a;
    }
}
