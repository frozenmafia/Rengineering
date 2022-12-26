package o;

import com.app.dream11.core.service.graphql.api.type.NotificationType;
/* loaded from: classes3.dex */
public final class directMeasure extends androidx.databinding.BaseObservable {
    private androidx.databinding.ObservableField<String> HaptikSDK$b;
    private NotificationType HaptikSDK$c;
    private directMeasure$ah$a ag$a;
    private int ah$a;
    private androidx.databinding.ObservableField<Boolean> ah$b;
    private String invoke;
    private String toString;
    private androidx.databinding.ObservableField<String> valueOf;
    private String values;

    public directMeasure(directMeasure$ah$a directmeasure_ah_a) {
        runAnimators.ag$a(directmeasure_ah_a, "itemViewHandler");
        this.ag$a = directmeasure_ah_a;
        this.valueOf = new androidx.databinding.ObservableField<>("");
        this.HaptikSDK$b = new androidx.databinding.ObservableField<>("");
        this.ah$b = new androidx.databinding.ObservableField<>(false);
    }

    public final directMeasure$ah$a HaptikSDK$b() {
        return this.ag$a;
    }

    public final int ag$a() {
        return this.ah$a;
    }

    public final void toString(int i) {
        this.ah$a = i;
    }

    public final androidx.databinding.ObservableField<String> values() {
        return this.valueOf;
    }

    public final androidx.databinding.ObservableField<String> ah$b() {
        return this.HaptikSDK$b;
    }

    public final String HaptikSDK$a() {
        return this.invoke;
    }

    public final void ah$a(String str) {
        this.invoke = str;
    }

    public final void ag$a(String str) {
        this.toString = str;
    }

    public final String ah$a() {
        return this.toString;
    }

    public final String valueOf() {
        return this.values;
    }

    public final void valueOf(String str) {
        this.values = str;
    }

    public final androidx.databinding.ObservableField<Boolean> HaptikSDK$c() {
        return this.ah$b;
    }

    public final NotificationType invoke() {
        return this.HaptikSDK$c;
    }

    public final void values(NotificationType notificationType) {
        this.HaptikSDK$c = notificationType;
    }
}
