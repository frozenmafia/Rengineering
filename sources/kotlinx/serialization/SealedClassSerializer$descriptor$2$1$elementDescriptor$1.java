package kotlinx.serialization;

import kotlin.jvm.internal.Lambda;
import o.FragmentStateAdapter;
import o.Styleable;
import o.containsItem;
import o.runAnimators;
import o.scheduleGracePeriodEnd;
import o.setAnimationMatrix;
/* loaded from: classes8.dex */
final class SealedClassSerializer$descriptor$2$1$elementDescriptor$1 extends Lambda implements Styleable.ChangeBounds<FragmentStateAdapter.AnonymousClass3, setAnimationMatrix> {
    final /* synthetic */ containsItem<? extends T>[] $subclassSerializers;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SealedClassSerializer$descriptor$2$1$elementDescriptor$1(containsItem<? extends T>[] containsitemArr) {
        super(1);
        this.$subclassSerializers = containsitemArr;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(FragmentStateAdapter.AnonymousClass3 anonymousClass3) {
        invoke2(anonymousClass3);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(FragmentStateAdapter.AnonymousClass3 anonymousClass3) {
        runAnimators.ag$a(anonymousClass3, "$this$buildSerialDescriptor");
        for (scheduleGracePeriodEnd schedulegraceperiodend : this.$subclassSerializers) {
            FragmentStateAdapter.DataSetChangeObserver values = schedulegraceperiodend.values();
            FragmentStateAdapter.AnonymousClass3.valueOf(anonymousClass3, values.ah$a(), values, null, false, 12, null);
        }
    }
}
