package o;

import android.text.Html;
import com.fancode.payment.GetPaymentPassesQuery$HaptikSDK$d;
import com.fancode.payment.GetPaymentPassesQuery$ag$a;
import o.Visibility;
/* loaded from: classes4.dex */
public final class changeActiveCounter extends androidx.databinding.BaseObservable {
    private boolean ag$a;
    public valueOf ah$a;
    private String HaptikSDK$c = "";
    private String valueOf = "";
    private String values = "";
    private String ah$b = "";
    private String toString = "";

    /* loaded from: classes4.dex */
    public interface valueOf {
        void ah$a(changeActiveCounter changeactivecounter, int i);
    }

    public final valueOf ag$a() {
        valueOf valueof = this.ah$a;
        if (valueof != null) {
            return valueof;
        }
        runAnimators.valueOf("handler");
        return null;
    }

    public final void toString(valueOf valueof) {
        runAnimators.ag$a(valueof, "<set-?>");
        this.ah$a = valueof;
    }

    public final String HaptikSDK$c() {
        return this.valueOf;
    }

    public final String valueOf() {
        return this.values;
    }

    public final String HaptikSDK$a() {
        return this.ah$b;
    }

    public final String values() {
        return this.toString;
    }

    public final boolean ah$a() {
        return this.ag$a;
    }

    public final void toString(String str) {
        runAnimators.ag$a(str, "productId");
        this.ah$b = str;
        notifyChange();
    }

    public final void values(GetPaymentPassesQuery$HaptikSDK$d getPaymentPassesQuery$HaptikSDK$d, boolean z) {
        this.toString = (getPaymentPassesQuery$HaptikSDK$d != null ? getPaymentPassesQuery$HaptikSDK$d.values() : null) != null ? Visibility.Mode.HaptikSDK$a((CharSequence) Html.fromHtml(getPaymentPassesQuery$HaptikSDK$d.values()).toString()).toString() : "";
        this.HaptikSDK$c = (getPaymentPassesQuery$HaptikSDK$d != null ? getPaymentPassesQuery$HaptikSDK$d.HaptikWebView() : null) != null ? getPaymentPassesQuery$HaptikSDK$d.HaptikWebView() : "";
        this.valueOf = (getPaymentPassesQuery$HaptikSDK$d != null ? getPaymentPassesQuery$HaptikSDK$d.invoke() : null) != null ? getPaymentPassesQuery$HaptikSDK$d.invoke() : "";
        this.ag$a = z;
        notifyChange();
    }

    public final void values(GetPaymentPassesQuery$ag$a getPaymentPassesQuery$ag$a) {
        this.values = (getPaymentPassesQuery$ag$a != null ? getPaymentPassesQuery$ag$a.ag$a() : null) != null ? getPaymentPassesQuery$ag$a.ag$a() : "";
        notifyChange();
    }
}
