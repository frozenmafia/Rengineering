package o;

import com.app.dream11.core.service.graphql.api.type.UserType;
import o.NotificationCompat;
/* loaded from: classes3.dex */
public final class makeBigContentView {
    private final String HaptikSDK$a;
    private final String HaptikSDK$b;
    private final Integer ag$a;
    private final Integer ah$a;
    private final UserType ah$b;
    private final NotificationCompat.Extender toString;
    private final getConversationTitle valueOf;
    private final boolean values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof makeBigContentView) {
            makeBigContentView makebigcontentview = (makeBigContentView) obj;
            return runAnimators.values(this.valueOf, makebigcontentview.valueOf) && runAnimators.values((Object) this.HaptikSDK$a, (Object) makebigcontentview.HaptikSDK$a) && runAnimators.values((Object) this.HaptikSDK$b, (Object) makebigcontentview.HaptikSDK$b) && runAnimators.values(this.ah$a, makebigcontentview.ah$a) && runAnimators.values(this.ag$a, makebigcontentview.ag$a) && this.ah$b == makebigcontentview.ah$b && this.values == makebigcontentview.values && runAnimators.values(this.toString, makebigcontentview.toString);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.valueOf.hashCode();
        String str = this.HaptikSDK$a;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.HaptikSDK$b;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.ah$a;
        int hashCode4 = num == null ? 0 : num.hashCode();
        Integer num2 = this.ag$a;
        int hashCode5 = num2 == null ? 0 : num2.hashCode();
        UserType userType = this.ah$b;
        int hashCode6 = userType == null ? 0 : userType.hashCode();
        boolean z = this.values;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        NotificationCompat.Extender extender = this.toString;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i) * 31) + (extender != null ? extender.hashCode() : 0);
    }

    public String toString() {
        getConversationTitle getconversationtitle = this.valueOf;
        String str = this.HaptikSDK$a;
        String str2 = this.HaptikSDK$b;
        Integer num = this.ah$a;
        Integer num2 = this.ag$a;
        UserType userType = this.ah$b;
        boolean z = this.values;
        NotificationCompat.Extender extender = this.toString;
        return "FollowUnFollowInputData(socialConnectionData=" + getconversationtitle + ", teamName=" + str + ", source=" + str2 + ", position=" + num + ", id=" + num2 + ", userType=" + userType + ", isPrimaryButton=" + z + ", callback=" + extender + ")";
    }

    public makeBigContentView(getConversationTitle getconversationtitle, String str, String str2, Integer num, Integer num2, UserType userType, boolean z, NotificationCompat.Extender extender) {
        runAnimators.ag$a(getconversationtitle, "socialConnectionData");
        this.valueOf = getconversationtitle;
        this.HaptikSDK$a = str;
        this.HaptikSDK$b = str2;
        this.ah$a = num;
        this.ag$a = num2;
        this.ah$b = userType;
        this.values = z;
        this.toString = extender;
    }

    public /* synthetic */ makeBigContentView(getConversationTitle getconversationtitle, String str, String str2, Integer num, Integer num2, UserType userType, boolean z, NotificationCompat.Extender extender, int i, getTargetTypes gettargettypes) {
        this(getconversationtitle, str, str2, num, num2, userType, (i & 64) != 0 ? true : z, (i & 128) != 0 ? null : extender);
    }

    public final getConversationTitle ah$a() {
        return this.valueOf;
    }

    public final String HaptikSDK$b() {
        return this.HaptikSDK$a;
    }

    public final String ah$b() {
        return this.HaptikSDK$b;
    }

    public final Integer values() {
        return this.ah$a;
    }

    public final UserType HaptikSDK$a() {
        return this.ah$b;
    }

    public final boolean invoke() {
        return this.values;
    }

    public final Integer valueOf() {
        return this.ag$a;
    }

    public final NotificationCompat.Extender ag$a() {
        return this.toString;
    }
}
