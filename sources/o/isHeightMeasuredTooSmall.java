package o;

import com.app.dream11.notifications.usersubscribednotification.UserSubScribedNotificationItemData$onItemClick$1;
import o.Styleable;
/* loaded from: classes3.dex */
public final class isHeightMeasuredTooSmall {
    private final String ag$a;
    private final int ah$a;
    private final String invoke;
    private androidx.databinding.ObservableField<Boolean> toString;
    private final Styleable.ArcMotion<setAnimationMatrix> valueOf;
    private createAlignedConstraints$ag$a values;

    public isHeightMeasuredTooSmall(String str, int i, String str2) {
        runAnimators.ag$a(str, "name");
        runAnimators.ag$a(str2, "type");
        this.ag$a = str;
        this.ah$a = i;
        this.invoke = str2;
        this.toString = new androidx.databinding.ObservableField<>(false);
        this.valueOf = new UserSubScribedNotificationItemData$onItemClick$1(this);
    }

    public final String HaptikSDK$c() {
        return this.invoke;
    }

    public final String ag$a() {
        return this.ag$a;
    }

    public final int valueOf() {
        return this.ah$a;
    }

    public final void ah$a(createAlignedConstraints$ag$a createalignedconstraints_ag_a) {
        this.values = createalignedconstraints_ag_a;
    }

    public final createAlignedConstraints$ag$a values() {
        return this.values;
    }

    public final androidx.databinding.ObservableField<Boolean> HaptikSDK$b() {
        return this.toString;
    }

    public final Styleable.ArcMotion<setAnimationMatrix> ah$a() {
        return this.valueOf;
    }
}
