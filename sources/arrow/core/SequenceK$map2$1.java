package arrow.core;

import kotlin.TypeCastException;
import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.ICustomTabsService;
import o.Styleable;
import o.cancel;
/* loaded from: classes6.dex */
public final class SequenceK$map2$1 extends Lambda implements Styleable.ChangeBounds<A, ICustomTabsService.Stub<? extends Z>> {
    final /* synthetic */ Styleable.ChangeBounds $f;
    final /* synthetic */ ICustomTabsCallback.Default $fb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SequenceK$map2$1(ICustomTabsCallback.Default r1, Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$fb = r1;
        this.$f = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((SequenceK$map2$1) obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.core.SequenceK$map2$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<B, Z> {
        final /* synthetic */ Object $a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Object obj) {
            super(1);
            this.$a = obj;
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, Z] */
        @Override // o.Styleable.ChangeBounds
        public final Z invoke(B b2) {
            return SequenceK$map2$1.this.$f.invoke(new cancel(this.$a, b2));
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsService.Stub<Z> invoke(A a) {
        ICustomTabsCallback.Default r0 = this.$fb;
        if (r0 != null) {
            return ((ICustomTabsService.Stub) r0).values(new AnonymousClass1(a));
        }
        throw new TypeCastException("null cannot be cast to non-null type arrow.core.SequenceK<A>");
    }
}
