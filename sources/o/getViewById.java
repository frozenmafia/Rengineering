package o;

import com.app.dream11.payment.deposit.paymentoffers.PaymentOffer;
import java.util.List;
/* loaded from: classes3.dex */
public final class getViewById {
    private final validateParams ag$a;
    private final int ah$a;
    private final List<PaymentOffer> ah$b;
    private final enableHomeButtonByDefault toString;
    private final int valueOf;
    private androidx.databinding.ObservableField<String> values;

    public getViewById(validateParams validateparams, enableHomeButtonByDefault enablehomebuttonbydefault, List<PaymentOffer> list, int i) {
        runAnimators.ag$a(validateparams, "mHandler");
        runAnimators.ag$a(enablehomebuttonbydefault, "iResourceProvider");
        runAnimators.ag$a(list, "paymentOffers");
        this.ag$a = validateparams;
        this.toString = enablehomebuttonbydefault;
        this.ah$b = list;
        this.ah$a = i;
        int size = list.size();
        this.values = new androidx.databinding.ObservableField<>(" (" + size + ")");
        this.valueOf = com.app.dream11Pro.R.anim.res_0x7f01000d;
    }

    public final validateParams valueOf() {
        return this.ag$a;
    }

    public final List<PaymentOffer> ah$a() {
        return this.ah$b;
    }

    public final int ag$a() {
        return this.ah$a;
    }

    public final androidx.databinding.ObservableField<String> values() {
        return this.values;
    }
}
