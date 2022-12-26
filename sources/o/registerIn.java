package o;

import com.fancode.payment.type.ApplyCouponInput$marshaller$1$1;
import java.util.List;
import o.ComponentActivity;
/* loaded from: classes6.dex */
public final class registerIn implements ComponentActivity.AnonymousClass6 {
    private final String ag$a;
    private final List<String> toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof registerIn) {
            registerIn registerin = (registerIn) obj;
            return runAnimators.values((Object) this.ag$a, (Object) registerin.ag$a) && runAnimators.values(this.toString, registerin.toString);
        }
        return false;
    }

    public int hashCode() {
        return (this.ag$a.hashCode() * 31) + this.toString.hashCode();
    }

    public String toString() {
        String str = this.ag$a;
        List<String> list = this.toString;
        return "ApplyCouponInput(couponCode=" + str + ", productIds=" + list + ")";
    }

    /* loaded from: classes6.dex */
    public static final class toString implements remove {
        public toString() {
        }

        @Override // o.remove
        public void marshal(OnBackPressedCallback onBackPressedCallback) {
            runAnimators.valueOf(onBackPressedCallback, "writer");
            onBackPressedCallback.ah$a("couponCode", registerIn.this.values());
            onBackPressedCallback.ah$a("productIds", new ApplyCouponInput$marshaller$1$1(registerIn.this));
        }
    }

    public final String values() {
        return this.ag$a;
    }

    public final List<String> ag$a() {
        return this.toString;
    }

    @Override // o.ComponentActivity.AnonymousClass6
    public remove marshaller() {
        remove$ah$a remove_ah_a = remove.ag$a;
        return new toString();
    }
}
