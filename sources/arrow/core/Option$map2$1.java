package arrow.core;

import kotlin.TypeCastException;
import kotlin.jvm.internal.Lambda;
import o.AudioAttributesImplApi21Parcelizer;
import o.ICustomTabsCallback;
import o.ICustomTabsService;
import o.Styleable;
/* loaded from: classes6.dex */
public final class Option$map2$1 extends Lambda implements Styleable.ChangeBounds<A, ICustomTabsService.Stub.Proxy<? extends R>> {
    final /* synthetic */ Styleable.ChangeBounds $f;
    final /* synthetic */ ICustomTabsCallback.Default $fb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Option$map2$1(ICustomTabsCallback.Default r1, Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$fb = r1;
        this.$f = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Option$map2$1) obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.core.Option$map2$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<B, R> {
        final /* synthetic */ Object $a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Object obj) {
            super(1);
            this.$a = obj;
        }

        /* JADX WARN: Type inference failed for: r3v2, types: [R, java.lang.Object] */
        @Override // o.Styleable.ChangeBounds
        public final R invoke(B b2) {
            return Option$map2$1.this.$f.invoke(AudioAttributesImplApi21Parcelizer.ag$a(this.$a, b2));
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsService.Stub.Proxy<R> invoke(A a) {
        ICustomTabsCallback.Default r0 = this.$fb;
        if (r0 != null) {
            return ((ICustomTabsService.Stub.Proxy) r0).ag$a(new AnonymousClass1(a));
        }
        throw new TypeCastException("null cannot be cast to non-null type arrow.core.Option<A>");
    }
}
