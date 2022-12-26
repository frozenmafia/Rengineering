package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.Styleable;
import o.getRatingStyle;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class Foldable$traverse_$1 extends Lambda implements Styleable.ArcMotion<ICustomTabsCallback.Default<? extends G, ? extends setAnimationMatrix>> {
    final /* synthetic */ getRatingStyle $GA;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Foldable$traverse_$1(getRatingStyle getratingstyle) {
        super(0);
        this.$GA = getratingstyle;
    }

    @Override // o.Styleable.ArcMotion
    public final ICustomTabsCallback.Default<G, setAnimationMatrix> invoke() {
        return this.$GA.values(setAnimationMatrix.ag$a);
    }
}
