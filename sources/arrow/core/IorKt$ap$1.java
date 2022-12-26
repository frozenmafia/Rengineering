package arrow.core;

import kotlin.TypeCastException;
import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.Styleable;
import o.postMessage;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class IorKt$ap$1 extends Lambda implements Styleable.ChangeBounds<B, postMessage<? extends A, ? extends D>> {
    final /* synthetic */ ICustomTabsCallback.Default $ff;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IorKt$ap$1(ICustomTabsCallback.Default r1) {
        super(1);
        this.$ff = r1;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((IorKt$ap$1) obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.core.IorKt$ap$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<Styleable.ChangeBounds<? super B, ? extends D>, D> {
        final /* synthetic */ Object $a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Object obj) {
            super(1);
            this.$a = obj;
        }

        @Override // o.Styleable.ChangeBounds
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((Styleable.ChangeBounds<? super B, ? extends Object>) obj);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [D, java.lang.Object] */
        public final D invoke(Styleable.ChangeBounds<? super B, ? extends D> changeBounds) {
            runAnimators.valueOf(changeBounds, "f");
            return changeBounds.invoke(this.$a);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final postMessage<A, D> invoke(B b2) {
        ICustomTabsCallback.Default r0 = this.$ff;
        if (r0 != null) {
            return ((postMessage) r0).ah$a(new AnonymousClass1(b2));
        }
        throw new TypeCastException("null cannot be cast to non-null type arrow.core.Ior<A, B>");
    }
}
