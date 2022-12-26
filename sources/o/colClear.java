package o;

import o.Styleable;
/* loaded from: classes3.dex */
public final class colClear implements Styleable.ArcMotion {
    final valueOf valueOf;
    final int values;

    /* loaded from: classes3.dex */
    public interface valueOf {
        setAnimationMatrix ah$a(int i);
    }

    public colClear(valueOf valueof, int i) {
        this.valueOf = valueof;
        this.values = i;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: values */
    public setAnimationMatrix invoke() {
        return this.valueOf.ah$a(this.values);
    }
}
