package o;

import com.app.dream11.core.service.graphql.api.type.UserType;
/* loaded from: classes3.dex */
public final class getUser {
    private final getConversationTitle HaptikSDK$b;
    private final UserType HaptikSDK$c;
    private final int ag$a;
    private final String ah$a;
    private final String ah$b;
    private final String invoke;
    private final String toString;
    private final String valueOf;
    private final String values;

    public getUser(int i, String str, String str2, UserType userType, String str3, String str4, String str5, getConversationTitle getconversationtitle, String str6) {
        runAnimators.ag$a(str, "teamName");
        runAnimators.ag$a(str2, "profilePic");
        runAnimators.ag$a(getconversationtitle, "socialConnectionData");
        this.ag$a = i;
        this.invoke = str;
        this.values = str2;
        this.HaptikSDK$c = userType;
        this.valueOf = str3;
        this.toString = str4;
        this.ah$b = str5;
        this.HaptikSDK$b = getconversationtitle;
        this.ah$a = str6;
    }

    public final String HaptikSDK$b() {
        return this.invoke;
    }

    public final int ah$a() {
        return this.ag$a;
    }

    public final String ah$b() {
        return this.values;
    }

    public final String HaptikSDK$c() {
        return this.ah$b;
    }

    public final String ag$a() {
        return this.toString;
    }

    public final UserType invoke() {
        return this.HaptikSDK$c;
    }

    public final String values() {
        return this.valueOf;
    }

    public final getConversationTitle HaptikSDK$a() {
        return this.HaptikSDK$b;
    }

    public final String valueOf() {
        return this.ah$a;
    }
}
