package arrow.core;

import kotlin.TypeCastException;
import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.Styleable;
import o.newSession;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ListK$ap$1 extends Lambda implements Styleable.ChangeBounds<A, newSession<? extends B>> {
    final /* synthetic */ ICustomTabsCallback.Default $ff;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ListK$ap$1(ICustomTabsCallback.Default r1) {
        super(1);
        this.$ff = r1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.core.ListK$ap$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<Styleable.ChangeBounds<? super A, ? extends B>, B> {
        final /* synthetic */ Object $a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Object obj) {
            super(1);
            this.$a = obj;
        }

        @Override // o.Styleable.ChangeBounds
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((Styleable.ChangeBounds<? super A, ? extends Object>) obj);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [B, java.lang.Object] */
        public final B invoke(Styleable.ChangeBounds<? super A, ? extends B> changeBounds) {
            runAnimators.valueOf(changeBounds, "f");
            return changeBounds.invoke(this.$a);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((ListK$ap$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final newSession<B> invoke(A a) {
        ICustomTabsCallback.Default r0 = this.$ff;
        if (r0 != null) {
            return ((newSession) r0).ah$a(new AnonymousClass1(a));
        }
        throw new TypeCastException("null cannot be cast to non-null type arrow.core.ListK<A>");
    }
}
