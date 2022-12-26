package kotlinx.serialization.descriptors;

import kotlin.jvm.internal.Lambda;
import o.FragmentStateAdapter;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes8.dex */
public final class SerialDescriptorsKt$buildClassSerialDescriptor$1 extends Lambda implements Styleable.ChangeBounds<FragmentStateAdapter.AnonymousClass3, setAnimationMatrix> {
    public static final SerialDescriptorsKt$buildClassSerialDescriptor$1 INSTANCE = new SerialDescriptorsKt$buildClassSerialDescriptor$1();

    SerialDescriptorsKt$buildClassSerialDescriptor$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(FragmentStateAdapter.AnonymousClass3 anonymousClass3) {
        runAnimators.ag$a(anonymousClass3, "$this$null");
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(FragmentStateAdapter.AnonymousClass3 anonymousClass3) {
        invoke2(anonymousClass3);
        return setAnimationMatrix.ag$a;
    }
}
