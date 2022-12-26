package o;

import android.view.View;
import com.dream11.design.textview.D11TextView;
import o.AnimatedStateListDrawableCompat;
import o.TooltipCompatHandler;
/* loaded from: classes3.dex */
public abstract class iteratorWithAdditions extends androidx.databinding.ViewDataBinding {
    public final TooltipCompatHandler.AnonymousClass1 ag$a;
    public final TooltipCompatHandler.AnonymousClass1 ah$a;
    public final TooltipCompatHandler.AnonymousClass1 toString;
    @androidx.databinding.Bindable
    protected AnimatedStateListDrawableCompat.AnonymousClass1 valueOf;
    public final D11TextView values;

    public abstract void toString(AnimatedStateListDrawableCompat.AnonymousClass1 anonymousClass1);

    /* JADX INFO: Access modifiers changed from: protected */
    public iteratorWithAdditions(Object obj, View view, int i, TooltipCompatHandler.AnonymousClass1 anonymousClass1, TooltipCompatHandler.AnonymousClass1 anonymousClass12, TooltipCompatHandler.AnonymousClass1 anonymousClass13, D11TextView d11TextView) {
        super(obj, view, i);
        this.ah$a = anonymousClass1;
        this.ag$a = anonymousClass12;
        this.toString = anonymousClass13;
        this.values = d11TextView;
    }
}
