package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.Styleable;
import o.onPostMessage;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class AndThen$flatMap$1 extends Lambda implements Styleable.ChangeBounds<ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends Object, ? extends A>, ? extends C>, onPostMessage<A, C>> {
    public static final AndThen$flatMap$1 INSTANCE = new AndThen$flatMap$1();

    AndThen$flatMap$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final onPostMessage<A, C> invoke(ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<Object, ? extends A>, ? extends C> r2) {
        runAnimators.valueOf(r2, "it");
        return (onPostMessage) r2;
    }
}
