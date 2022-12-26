package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.Styleable;
import o.runAnimators;
import o.setDefaultImpl;
/* loaded from: classes6.dex */
public final class EitherApply$apEval$2$1 extends Lambda implements Styleable.ChangeBounds<ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends Object, ? extends L>, ? extends Styleable.ChangeBounds<? super A, ? extends B>>, setDefaultImpl<? extends L, ? extends B>> {
    final /* synthetic */ Object $r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EitherApply$apEval$2$1(Object obj) {
        super(1);
        this.$r = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.core.extensions.EitherApply$apEval$2$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<Styleable.ChangeBounds<? super A, ? extends B>, B> {
        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((Styleable.ChangeBounds<? super A, ? extends Object>) obj);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [B, java.lang.Object] */
        public final B invoke(Styleable.ChangeBounds<? super A, ? extends B> changeBounds) {
            runAnimators.valueOf(changeBounds, "f");
            return changeBounds.invoke(EitherApply$apEval$2$1.this.$r);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final setDefaultImpl<L, B> invoke(ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<Object, ? extends L>, ? extends Styleable.ChangeBounds<? super A, ? extends B>> r2) {
        runAnimators.valueOf(r2, "it");
        return ((setDefaultImpl) r2).values(new AnonymousClass1());
    }
}
