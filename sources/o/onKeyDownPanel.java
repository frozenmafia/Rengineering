package o;

import com.app.dream11.contest.buypass.BuyNowDialogVM$onBuyNow$1;
import com.app.dream11.contest.buypass.BuyNowDialogVM$onCashBonusClick$1;
import com.app.dream11.contest.buypass.BuyNowDialogVM$onClose$1;
import com.app.dream11.contest.buypass.BuyNowFlowState;
import com.app.dream11.ui.databinding.RxObservableField;
import o.Styleable;
/* loaded from: classes.dex */
public final class onKeyDownPanel extends androidx.databinding.BaseObservable {
    private final valueOf HaptikSDK$a;
    private final RxObservableField<String> HaptikSDK$b;
    private final Styleable.ArcMotion<setAnimationMatrix> HaptikSDK$c;
    private final RxObservableField<String> HaptikSDK$d;
    private final RxObservableField<String> HaptikSDK$e;
    private final RxObservableField<String> HaptikWebView;
    private final RxObservableField<Double> ag$a;
    private final RxObservableField<String> ah$a;
    private final Styleable.ArcMotion<setAnimationMatrix> ah$b;
    private final RxObservableField<Boolean> aj$a;
    private final RxObservableField<Boolean> getInitSettings;
    private final RxObservableField<Boolean> getSignupData;
    private final Styleable.ArcMotion<setAnimationMatrix> invoke;
    private final RxObservableField<String> toString;
    private final RxObservableField<String> valueOf;
    private final RxObservableField<String> values;

    /* loaded from: classes.dex */
    public interface valueOf {
        void HaptikSDK$b();

        void ag$a();

        void ah$a();
    }

    public onKeyDownPanel(valueOf valueof) {
        runAnimators.ag$a(valueof, "handler");
        this.HaptikSDK$a = valueof;
        this.invoke = new BuyNowDialogVM$onClose$1(this);
        this.ah$b = new BuyNowDialogVM$onBuyNow$1(this);
        this.HaptikSDK$c = new BuyNowDialogVM$onCashBonusClick$1(this);
        this.ah$a = new RxObservableField<>("");
        this.HaptikSDK$d = new RxObservableField<>("");
        this.HaptikWebView = new RxObservableField<>("");
        this.aj$a = new RxObservableField<>(false);
        this.HaptikSDK$e = new RxObservableField<>("");
        this.valueOf = new RxObservableField<>("");
        this.getSignupData = new RxObservableField<>(false);
        this.ag$a = new RxObservableField<>(Double.valueOf(0.0d));
        this.HaptikSDK$b = new RxObservableField<>("");
        this.getInitSettings = new RxObservableField<>(false);
        this.toString = new RxObservableField<>("");
        this.values = new RxObservableField<>("");
    }

    public final Styleable.ArcMotion<setAnimationMatrix> HaptikSDK$b() {
        return this.invoke;
    }

    public final Styleable.ArcMotion<setAnimationMatrix> ah$b() {
        return this.ah$b;
    }

    public final Styleable.ArcMotion<setAnimationMatrix> HaptikSDK$c() {
        return this.HaptikSDK$c;
    }

    public final RxObservableField<String> ag$a() {
        return this.ah$a;
    }

    public final RxObservableField<String> getSignupData() {
        return this.HaptikSDK$d;
    }

    public final RxObservableField<String> HaptikSDK$e() {
        return this.HaptikWebView;
    }

    public final RxObservableField<Boolean> ak() {
        return this.aj$a;
    }

    public final RxObservableField<String> HaptikWebView() {
        return this.HaptikSDK$e;
    }

    public final RxObservableField<String> valueOf() {
        return this.valueOf;
    }

    public final RxObservableField<Boolean> HaptikSDK$d() {
        return this.getSignupData;
    }

    public final RxObservableField<Double> values() {
        return this.ag$a;
    }

    public final RxObservableField<String> HaptikSDK$a() {
        return this.HaptikSDK$b;
    }

    public final RxObservableField<Boolean> getInitSettings() {
        return this.getInitSettings;
    }

    public final RxObservableField<String> invoke() {
        return this.toString;
    }

    public final RxObservableField<String> ah$a() {
        return this.values;
    }

    public final void toString(BuyNowFlowState buyNowFlowState) {
        runAnimators.ag$a(buyNowFlowState, "buyNowFlowState");
        this.ah$a.set(buyNowFlowState.getTotalAvailableAmount());
        this.HaptikSDK$d.set(buyNowFlowState.getPurchaseTitle());
        String purchaseSubTitle = buyNowFlowState.getPurchaseSubTitle();
        if (purchaseSubTitle != null) {
            ak().set(true);
            HaptikSDK$e().set(purchaseSubTitle);
        }
        this.HaptikSDK$e.set(buyNowFlowState.getPurchaseAmount());
        this.valueOf.set(buyNowFlowState.getUsableCashBonusAmount());
        Double cashBonusBlockedAmount = buyNowFlowState.getCashBonusBlockedAmount();
        if (cashBonusBlockedAmount != null) {
            double doubleValue = cashBonusBlockedAmount.doubleValue();
            HaptikSDK$d().set(true);
            values().set(Double.valueOf(doubleValue));
        }
        this.HaptikSDK$b.set(buyNowFlowState.getPayableAmount());
        String disclaimerMessage = buyNowFlowState.getDisclaimerMessage();
        if (disclaimerMessage != null) {
            getInitSettings().set(true);
            invoke().set(disclaimerMessage);
        }
        this.values.set(buyNowFlowState.getCtaText());
    }
}
