package o;

import android.os.Bundle;
import java.math.BigDecimal;
import java.util.Currency;
/* loaded from: classes4.dex */
final class onCreateAnimation$ah$a {
    private Bundle ah$a;
    private BigDecimal toString;
    private Currency values;

    public onCreateAnimation$ah$a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        runAnimators.ag$a(bigDecimal, "purchaseAmount");
        runAnimators.ag$a(currency, "currency");
        runAnimators.ag$a(bundle, com.apxor.androidsdk.core.ce.Constants.PARAMETERS);
        this.toString = bigDecimal;
        this.values = currency;
        this.ah$a = bundle;
    }

    public final BigDecimal ag$a() {
        return this.toString;
    }

    public final Bundle valueOf() {
        return this.ah$a;
    }

    public final Currency values() {
        return this.values;
    }
}
