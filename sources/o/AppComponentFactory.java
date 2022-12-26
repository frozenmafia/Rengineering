package o;

import android.graphics.drawable.Drawable;
import com.sendbird.android.constant.StringSet;
import java.util.Collection;
import o.Styleable;
/* loaded from: classes3.dex */
public final class AppComponentFactory {
    private final boolean HaptikSDK$a;
    private final Collection<setAlarmClock> HaptikSDK$b;
    private final int HaptikSDK$c;
    private final int HaptikSDK$e;
    private final int ag$a;
    private final int ah$a;
    private final Drawable ah$b;
    private final float getInitSettings;
    private final int getSignupData;
    private final int invoke;
    private final boolean toString;
    private final int valueOf;
    private final Styleable.ChangeBounds<Integer, CharSequence> values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AppComponentFactory) {
            AppComponentFactory appComponentFactory = (AppComponentFactory) obj;
            return runAnimators.values(this.HaptikSDK$b, appComponentFactory.HaptikSDK$b) && this.ah$a == appComponentFactory.ah$a && this.ag$a == appComponentFactory.ag$a && this.getSignupData == appComponentFactory.getSignupData && this.valueOf == appComponentFactory.valueOf && runAnimators.values(this.values, appComponentFactory.values) && runAnimators.values(this.ah$b, appComponentFactory.ah$b) && this.HaptikSDK$c == appComponentFactory.HaptikSDK$c && this.invoke == appComponentFactory.invoke && this.HaptikSDK$e == appComponentFactory.HaptikSDK$e && this.toString == appComponentFactory.toString && runAnimators.values(Float.valueOf(this.getInitSettings), Float.valueOf(appComponentFactory.getInitSettings)) && this.HaptikSDK$a == appComponentFactory.HaptikSDK$a;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.HaptikSDK$b.hashCode();
        int i = this.ah$a;
        int i2 = this.ag$a;
        int i3 = this.getSignupData;
        int i4 = this.valueOf;
        int hashCode2 = this.values.hashCode();
        int hashCode3 = this.ah$b.hashCode();
        int i5 = this.HaptikSDK$c;
        int i6 = this.invoke;
        int i7 = this.HaptikSDK$e;
        boolean z = this.toString;
        int i8 = z;
        if (z != 0) {
            i8 = 1;
        }
        int floatToIntBits = Float.floatToIntBits(this.getInitSettings);
        boolean z2 = this.HaptikSDK$a;
        return (((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + i5) * 31) + i6) * 31) + i7) * 31) + i8) * 31) + floatToIntBits) * 31) + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        Collection<setAlarmClock> collection = this.HaptikSDK$b;
        int i = this.ah$a;
        int i2 = this.ag$a;
        int i3 = this.getSignupData;
        int i4 = this.valueOf;
        Styleable.ChangeBounds<Integer, CharSequence> changeBounds = this.values;
        Drawable drawable = this.ah$b;
        int i5 = this.HaptikSDK$c;
        int i6 = this.invoke;
        int i7 = this.HaptikSDK$e;
        boolean z = this.toString;
        float f = this.getInitSettings;
        boolean z2 = this.HaptikSDK$a;
        return "ReactionsConfig(reactions=" + collection + ", reactionSize=" + i + ", horizontalMargin=" + i2 + ", verticalMargin=" + i3 + ", popupColor=" + i4 + ", reactionTextProvider=" + changeBounds + ", textBackground=" + drawable + ", textColor=" + i5 + ", textHorizontalPadding=" + i6 + ", textVerticalPadding=" + i7 + ", isHapticFeedbackEnabled=" + z + ", textSize=" + f + ", shouldShowText=" + z2 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppComponentFactory(Collection<setAlarmClock> collection, int i, int i2, int i3, int i4, Styleable.ChangeBounds<? super Integer, ? extends CharSequence> changeBounds, Drawable drawable, int i5, int i6, int i7, boolean z, float f, boolean z2) {
        runAnimators.ag$a(collection, StringSet.reactions);
        runAnimators.ag$a(changeBounds, "reactionTextProvider");
        runAnimators.ag$a(drawable, "textBackground");
        this.HaptikSDK$b = collection;
        this.ah$a = i;
        this.ag$a = i2;
        this.getSignupData = i3;
        this.valueOf = i4;
        this.values = changeBounds;
        this.ah$b = drawable;
        this.HaptikSDK$c = i5;
        this.invoke = i6;
        this.HaptikSDK$e = i7;
        this.toString = z;
        this.getInitSettings = f;
        this.HaptikSDK$a = z2;
    }

    public final Collection<setAlarmClock> ah$b() {
        return this.HaptikSDK$b;
    }

    public final int ag$a() {
        return this.ah$a;
    }

    public final int valueOf() {
        return this.ag$a;
    }

    public final int getSignupData() {
        return this.getSignupData;
    }

    public final int values() {
        return this.valueOf;
    }

    public final Styleable.ChangeBounds<Integer, CharSequence> ah$a() {
        return this.values;
    }

    public final Drawable invoke() {
        return this.ah$b;
    }

    public final int HaptikSDK$b() {
        return this.HaptikSDK$c;
    }

    public final int HaptikSDK$a() {
        return this.invoke;
    }

    public final int HaptikSDK$e() {
        return this.HaptikSDK$e;
    }

    public final boolean HaptikWebView() {
        return this.toString;
    }

    public final float getInitSettings() {
        return this.getInitSettings;
    }

    public final boolean HaptikSDK$c() {
        return this.HaptikSDK$a;
    }
}
