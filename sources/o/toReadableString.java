package o;

import com.app.dream11.core.event.EventType;
import com.app.dream11.model.FeatureUpdate;
/* loaded from: classes3.dex */
public final class toReadableString extends FeatureUpdate {
    private final String valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public toReadableString(String str) {
        super(EventType.PROMO_CODE_RECEIVED);
        runAnimators.ag$a(str, "promoCode");
        this.valueOf = str;
    }

    public final String ag$a() {
        return this.valueOf;
    }
}
