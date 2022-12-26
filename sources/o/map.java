package o;

import com.app.dream11.core.service.graphql.api.type.ChannelCustomType;
import com.app.dream11.myprofile.profilerevamp.profilemapper.UserType;
import com.app.dream11.social.SocialHelper;
import java.util.List;
/* loaded from: classes3.dex */
public final class map {
    private final int HaptikSDK$a;
    private final String HaptikSDK$b;
    private final boolean HaptikSDK$c;
    private final String HaptikSDK$d;
    private final String HaptikSDK$e;
    private final Integer HaptikWebView;
    private final Integer a;
    private String ag$a;
    private final String ah$a;
    private final String ah$b;
    private final String ak;
    private SocialHelper.ConnectionStatus getInitSettings;
    private final Integer getSignupData;
    private final String invoke;
    private final UserType onXdkEvent;
    private final List<C0365constraints> toString;
    private final int valueOf;
    private ChannelCustomType values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof map) {
            map mapVar = (map) obj;
            return this.valueOf == mapVar.valueOf && runAnimators.values((Object) this.HaptikSDK$b, (Object) mapVar.HaptikSDK$b) && this.onXdkEvent == mapVar.onXdkEvent && runAnimators.values((Object) this.HaptikSDK$d, (Object) mapVar.HaptikSDK$d) && runAnimators.values((Object) this.invoke, (Object) mapVar.invoke) && runAnimators.values((Object) this.ah$b, (Object) mapVar.ah$b) && this.HaptikSDK$c == mapVar.HaptikSDK$c && runAnimators.values((Object) this.HaptikSDK$e, (Object) mapVar.HaptikSDK$e) && this.HaptikSDK$a == mapVar.HaptikSDK$a && this.getInitSettings == mapVar.getInitSettings && runAnimators.values((Object) this.ak, (Object) mapVar.ak) && runAnimators.values((Object) this.ag$a, (Object) mapVar.ag$a) && this.values == mapVar.values && runAnimators.values(this.a, mapVar.a) && runAnimators.values((Object) this.ah$a, (Object) mapVar.ah$a) && runAnimators.values(this.getSignupData, mapVar.getSignupData) && runAnimators.values(this.toString, mapVar.toString) && runAnimators.values(this.HaptikWebView, mapVar.HaptikWebView);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i = this.valueOf;
        String str = this.HaptikSDK$b;
        int hashCode = str == null ? 0 : str.hashCode();
        UserType userType = this.onXdkEvent;
        int hashCode2 = userType == null ? 0 : userType.hashCode();
        String str2 = this.HaptikSDK$d;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.invoke;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.ah$b;
        int hashCode5 = str4 == null ? 0 : str4.hashCode();
        boolean z = this.HaptikSDK$c;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        String str5 = this.HaptikSDK$e;
        int hashCode6 = str5 == null ? 0 : str5.hashCode();
        int i3 = this.HaptikSDK$a;
        SocialHelper.ConnectionStatus connectionStatus = this.getInitSettings;
        int hashCode7 = connectionStatus == null ? 0 : connectionStatus.hashCode();
        String str6 = this.ak;
        int hashCode8 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.ag$a;
        int hashCode9 = str7 == null ? 0 : str7.hashCode();
        ChannelCustomType channelCustomType = this.values;
        int hashCode10 = channelCustomType == null ? 0 : channelCustomType.hashCode();
        Integer num = this.a;
        int hashCode11 = num == null ? 0 : num.hashCode();
        String str8 = this.ah$a;
        int hashCode12 = str8 == null ? 0 : str8.hashCode();
        Integer num2 = this.getSignupData;
        int hashCode13 = num2 == null ? 0 : num2.hashCode();
        List<C0365constraints> list = this.toString;
        int hashCode14 = list == null ? 0 : list.hashCode();
        Integer num3 = this.HaptikWebView;
        return (((((((((((((((((((((((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i2) * 31) + hashCode6) * 31) + i3) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + (num3 == null ? 0 : num3.hashCode());
    }

    public String toString() {
        int i = this.valueOf;
        String str = this.HaptikSDK$b;
        UserType userType = this.onXdkEvent;
        String str2 = this.HaptikSDK$d;
        String str3 = this.invoke;
        String str4 = this.ah$b;
        boolean z = this.HaptikSDK$c;
        String str5 = this.HaptikSDK$e;
        int i2 = this.HaptikSDK$a;
        SocialHelper.ConnectionStatus connectionStatus = this.getInitSettings;
        String str6 = this.ak;
        String str7 = this.ag$a;
        ChannelCustomType channelCustomType = this.values;
        Integer num = this.a;
        String str8 = this.ah$a;
        Integer num2 = this.getSignupData;
        List<C0365constraints> list = this.toString;
        Integer num3 = this.HaptikWebView;
        return "MiniUserData(id=" + i + ", name=" + str + ", userType=" + userType + ", teamName=" + str2 + ", profilePicUrl=" + str3 + ", officialTickUrl=" + str4 + ", isMobileNumberVerified=" + z + ", userGuid=" + str5 + ", loyaltyLevel=" + i2 + ", socialConnectionStatus=" + connectionStatus + ", userLocation=" + str6 + ", channelUrl=" + str7 + ", customType=" + channelCustomType + ", winRate=" + num + ", contestSize=" + str8 + ", totalAwards=" + num2 + ", awards=" + list + ", totalScore=" + num3 + ")";
    }

    public map(int i, String str, UserType userType, String str2, String str3, String str4, boolean z, String str5, int i2, SocialHelper.ConnectionStatus connectionStatus, String str6, String str7, ChannelCustomType channelCustomType, Integer num, String str8, Integer num2, List<C0365constraints> list, Integer num3) {
        this.valueOf = i;
        this.HaptikSDK$b = str;
        this.onXdkEvent = userType;
        this.HaptikSDK$d = str2;
        this.invoke = str3;
        this.ah$b = str4;
        this.HaptikSDK$c = z;
        this.HaptikSDK$e = str5;
        this.HaptikSDK$a = i2;
        this.getInitSettings = connectionStatus;
        this.ak = str6;
        this.ag$a = str7;
        this.values = channelCustomType;
        this.a = num;
        this.ah$a = str8;
        this.getSignupData = num2;
        this.toString = list;
        this.HaptikWebView = num3;
    }

    public final int ah$a() {
        return this.valueOf;
    }

    public final String HaptikSDK$b() {
        return this.HaptikSDK$b;
    }

    public final UserType isLogoutPending() {
        return this.onXdkEvent;
    }

    public final String HaptikSDK$e() {
        return this.HaptikSDK$d;
    }

    public final String HaptikSDK$a() {
        return this.invoke;
    }

    public final String ah$b() {
        return this.ah$b;
    }

    public final boolean aj$a() {
        return this.HaptikSDK$c;
    }

    public final String HaptikWebView() {
        return this.HaptikSDK$e;
    }

    public final int invoke() {
        return this.HaptikSDK$a;
    }

    public final SocialHelper.ConnectionStatus HaptikSDK$c() {
        return this.getInitSettings;
    }

    public final void ag$a(SocialHelper.ConnectionStatus connectionStatus) {
        this.getInitSettings = connectionStatus;
    }

    public final String HaptikSDK$d() {
        return this.ak;
    }

    public final String values() {
        return this.ag$a;
    }

    public final void values(String str) {
        this.ag$a = str;
    }

    public final void toString(ChannelCustomType channelCustomType) {
        this.values = channelCustomType;
    }

    public final Integer ak() {
        return this.a;
    }

    public final String valueOf() {
        return this.ah$a;
    }

    public final Integer getInitSettings() {
        return this.getSignupData;
    }

    public final List<C0365constraints> ag$a() {
        return this.toString;
    }

    public final Integer getSignupData() {
        return this.HaptikWebView;
    }
}
