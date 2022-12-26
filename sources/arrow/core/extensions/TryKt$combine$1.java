package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.ITrustedWebActivityService;
import o.Styleable;
import o.isCaptioningEnabled;
/* loaded from: classes6.dex */
public final class TryKt$combine$1 extends Lambda implements Styleable.ChangeBounds<A, ITrustedWebActivityService<? extends A>> {
    final /* synthetic */ isCaptioningEnabled $SG;
    final /* synthetic */ ITrustedWebActivityService $b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TryKt$combine$1(ITrustedWebActivityService iTrustedWebActivityService, isCaptioningEnabled iscaptioningenabled) {
        super(1);
        this.$b = iTrustedWebActivityService;
        this.$SG = iscaptioningenabled;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((TryKt$combine$1) obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.core.extensions.TryKt$combine$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<A, A> {
        final /* synthetic */ Object $a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Object obj) {
            super(1);
            this.$a = obj;
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [A, java.lang.Object] */
        @Override // o.Styleable.ChangeBounds
        public final A invoke(A a) {
            return TryKt$combine$1.this.$SG.toString(this.$a, a);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final ITrustedWebActivityService<A> invoke(A a) {
        return this.$b.ag$a(new AnonymousClass1(a));
    }
}
