package o;

import com.app.dream11.core.service.graphql.api.fragment.DepositOption;
import com.app.dream11.core.service.graphql.api.type.DepositOptionStatus;
/* loaded from: classes3.dex */
public final class getViewWidget {
    private final resolveSystem ag$a;
    private final DepositOption ah$a;
    private final enableHomeButtonByDefault toString;

    public getViewWidget(resolveSystem resolvesystem, enableHomeButtonByDefault enablehomebuttonbydefault, DepositOption depositOption) {
        runAnimators.ag$a(resolvesystem, "mHandler");
        runAnimators.ag$a(enablehomebuttonbydefault, "iResourceProvider");
        runAnimators.ag$a(depositOption, "paymentTypeGql");
        this.ag$a = resolvesystem;
        this.toString = enablehomebuttonbydefault;
        this.ah$a = depositOption;
    }

    public final resolveSystem ah$a() {
        return this.ag$a;
    }

    public final DepositOption values() {
        return this.ah$a;
    }

    public final String valueOf() {
        String statusText = this.ah$a.getStatusText();
        boolean z = true;
        if (!(statusText == null || statusText.length() == 0)) {
            return this.ah$a.getStatusText();
        }
        DepositOption.PaymentOffer paymentOffer = this.ah$a.getPaymentOffer();
        String offerText = paymentOffer == null ? null : paymentOffer.getOfferText();
        if (offerText != null && offerText.length() != 0) {
            z = false;
        }
        if (z) {
            return "";
        }
        DepositOption.PaymentOffer paymentOffer2 = this.ah$a.getPaymentOffer();
        if (paymentOffer2 == null) {
            return null;
        }
        return paymentOffer2.getOfferText();
    }

    public final int ag$a() {
        enableHomeButtonByDefault enablehomebuttonbydefault = this.toString;
        String statusText = this.ah$a.getStatusText();
        return enablehomebuttonbydefault.ag$a(!(statusText == null || statusText.length() == 0) ? com.app.dream11Pro.R.color.d11_color_text__warningDark : com.app.dream11Pro.R.color.d11_color_text__neutralMedium);
    }

    public final boolean HaptikSDK$b() {
        return this.ah$a.getStatus() == DepositOptionStatus.UP || this.ah$a.getStatus() == DepositOptionStatus.FLUCTUATING;
    }

    public final boolean ah$b() {
        String statusText = this.ah$a.getStatusText();
        return statusText == null || statusText.length() == 0;
    }

    public final boolean HaptikSDK$c() {
        DepositOption.PaymentOffer paymentOffer = this.ah$a.getPaymentOffer();
        String offerText = paymentOffer == null ? null : paymentOffer.getOfferText();
        if (offerText == null || offerText.length() == 0) {
            String statusText = this.ah$a.getStatusText();
            return !(statusText == null || statusText.length() == 0);
        }
        return true;
    }
}
