package o;

import com.dream11.androidhelpers.adapters.BaseAdapter$ag$a;
import com.dream11.design.textview.D11TextView;
import o.AnyRes;
/* loaded from: classes3.dex */
public final class invalidateMeasures extends resolveRightShadow {
    private final String toString;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public invalidateMeasures(String str, int i) {
        super(i);
        runAnimators.ag$a(str, "headerName");
        this.toString = str;
    }

    @Override // o.resolveRightShadow, com.dream11.androidhelpers.adapters.BaseAdapter
    public void values(BaseAdapter$ag$a baseAdapter$ag$a, int i) {
        runAnimators.ag$a(baseAdapter$ag$a, "holder");
        super.values(baseAdapter$ag$a, i);
        ((D11TextView) baseAdapter$ag$a.ag$a().findViewById(AnyRes.values.tvHeaderName)).setText(this.toString);
    }
}
