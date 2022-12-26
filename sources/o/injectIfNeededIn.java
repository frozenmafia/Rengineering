package o;

import android.view.View;
/* loaded from: classes4.dex */
public final class injectIfNeededIn implements View.OnClickListener {
    final int ag$a;
    final injectIfNeededIn$ah$a values;

    public injectIfNeededIn(injectIfNeededIn$ah$a injectifneededin_ah_a, int i) {
        this.values = injectifneededin_ah_a;
        this.ag$a = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.values.toString(this.ag$a, view);
    }
}
