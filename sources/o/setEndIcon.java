package o;

import android.view.View;
import o.Constraints;
import o.SafeIterableMap;
/* loaded from: classes3.dex */
public abstract class setEndIcon extends androidx.databinding.ViewDataBinding {
    public final setPrompt HaptikSDK$a;
    public final onHover HaptikSDK$c;
    @androidx.databinding.Bindable
    protected Constraints.LayoutParams ag$a;
    public final clearAnchorPos ah$a;
    public final SafeIterableMap.IteratorWithAdditions invoke;
    public final shouldBeUsed toString;
    public final View valueOf;
    public final View values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setEndIcon(Object obj, View view, int i, View view2, View view3, shouldBeUsed shouldbeused, clearAnchorPos clearanchorpos, setPrompt setprompt, SafeIterableMap.IteratorWithAdditions iteratorWithAdditions, onHover onhover) {
        super(obj, view, i);
        this.valueOf = view2;
        this.values = view3;
        this.toString = shouldbeused;
        this.ah$a = clearanchorpos;
        this.HaptikSDK$a = setprompt;
        this.invoke = iteratorWithAdditions;
        this.HaptikSDK$c = onhover;
    }
}
