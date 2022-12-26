package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.payment.deposit.paymentoffers.PaymentOffer;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes3.dex */
public abstract class setTitleInt extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected PaymentOffer ag$a;
    public final D11TextView ah$a;
    public final D11TextView toString;
    @androidx.databinding.Bindable
    protected validateParams valueOf;
    public final ImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setTitleInt(Object obj, View view, int i, D11TextView d11TextView, ImageView imageView, D11TextView d11TextView2) {
        super(obj, view, i);
        this.toString = d11TextView;
        this.values = imageView;
        this.ah$a = d11TextView2;
    }
}
