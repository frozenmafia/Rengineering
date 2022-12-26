package o;

import com.app.dream11.core.service.graphql.api.type.UserType;
import com.app.dream11.social.pendingrequest.RequestComponentType;
/* loaded from: classes3.dex */
public class setContentInfo extends androidx.databinding.BaseObservable {
    UserType HaptikSDK$a;
    String HaptikSDK$b;
    String HaptikSDK$c;
    boolean ag$a;
    String ah$a;
    String ah$b;
    setSettingsText invoke = new setSettingsText("FollowFollowerList", RequestComponentType.REQUEST_INDICATOR_ICON, null);
    setContentInfo$ag$a toString;
    boolean valueOf;
    boolean values;

    public setSettingsText HaptikSDK$c() {
        return this.invoke;
    }

    public void values(String str) {
        this.HaptikSDK$c = str;
        notifyPropertyChanged(androidx.databinding.library.baseAdapters.BR.url);
    }

    @androidx.databinding.Bindable
    public String ag$a() {
        return this.HaptikSDK$b;
    }

    public void ah$a(String str) {
        this.HaptikSDK$b = str;
        notifyPropertyChanged(256);
    }

    @androidx.databinding.Bindable
    public setContentInfo$ag$a valueOf() {
        return this.toString;
    }

    public void toString(setContentInfo$ag$a setcontentinfo_ag_a) {
        this.toString = setcontentinfo_ag_a;
        notifyPropertyChanged(143);
    }

    @androidx.databinding.Bindable
    public String values() {
        return this.ah$a;
    }

    public void ag$a(String str) {
        this.ah$a = str;
        notifyPropertyChanged(204);
    }

    @androidx.databinding.Bindable
    public boolean HaptikSDK$b() {
        return this.valueOf;
    }

    @androidx.databinding.Bindable
    public boolean HaptikSDK$a() {
        return this.values;
    }

    public void values(boolean z) {
        this.values = z;
        notifyPropertyChanged(354);
    }

    @androidx.databinding.Bindable
    public boolean invoke() {
        return this.ag$a;
    }

    public void ag$a(boolean z) {
        this.ag$a = z;
        notifyPropertyChanged(239);
    }

    @androidx.databinding.Bindable
    public String ah$a() {
        return this.ah$b;
    }

    public void toString(String str) {
        this.ah$b = str;
        notifyPropertyChanged(266);
    }

    @androidx.databinding.Bindable
    public UserType ah$b() {
        return this.HaptikSDK$a;
    }

    public void valueOf(UserType userType) {
        this.HaptikSDK$a = userType;
        notifyPropertyChanged(androidx.databinding.library.baseAdapters.BR.userType);
    }
}
