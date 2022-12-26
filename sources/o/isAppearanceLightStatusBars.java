package o;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import o.removeOnControllableInsetsChangedListener;
/* loaded from: classes3.dex */
public class isAppearanceLightStatusBars implements removeOnControllableInsetsChangedListener<Drawable> {
    private final int valueOf;
    private final boolean values;

    public isAppearanceLightStatusBars(int i, boolean z) {
        this.valueOf = i;
        this.values = z;
    }

    @Override // o.removeOnControllableInsetsChangedListener
    /* renamed from: valueOf */
    public boolean values(Drawable drawable, removeOnControllableInsetsChangedListener.values valuesVar) {
        Drawable ag$a = valuesVar.ag$a();
        if (ag$a == null) {
            ag$a = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{ag$a, drawable});
        transitionDrawable.setCrossFadeEnabled(this.values);
        transitionDrawable.startTransition(this.valueOf);
        valuesVar.toString(transitionDrawable);
        return true;
    }
}
