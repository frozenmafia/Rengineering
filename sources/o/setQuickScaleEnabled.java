package o;

import o.Styleable;
/* loaded from: classes3.dex */
public final class setQuickScaleEnabled extends isQuickScaleEnabled {
    public int valueOf;
    public boolean values;

    @Override // o.isQuickScaleEnabled
    public void toString(float f) {
        if (this.values) {
            return;
        }
        int i = 1;
        this.values = true;
        int i2 = this.valueOf;
        if (1 > i2) {
            return;
        }
        while (true) {
            Styleable.ArcMotion<setAnimationMatrix> arcMotion = this.ah$a;
            if (arcMotion != null) {
                arcMotion.invoke();
            }
            if (i == i2) {
                return;
            }
            i++;
        }
    }

    @Override // o.isQuickScaleEnabled
    public boolean ag$a() {
        return this.values;
    }
}
