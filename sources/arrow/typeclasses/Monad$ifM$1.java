package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.Styleable;
/* loaded from: classes6.dex */
public final class Monad$ifM$1 extends Lambda implements Styleable.ChangeBounds<Boolean, ICustomTabsCallback.Default<? extends F, ? extends B>> {
    final /* synthetic */ Styleable.ArcMotion $ifFalse;
    final /* synthetic */ Styleable.ArcMotion $ifTrue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Monad$ifM$1(Styleable.ArcMotion arcMotion, Styleable.ArcMotion arcMotion2) {
        super(1);
        this.$ifTrue = arcMotion;
        this.$ifFalse = arcMotion2;
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ Object invoke(Boolean bool) {
        return invoke(bool.booleanValue());
    }

    public final ICustomTabsCallback.Default<F, B> invoke(boolean z) {
        return (ICustomTabsCallback.Default) (z ? this.$ifTrue : this.$ifFalse).invoke();
    }
}
