package kotlinx.serialization.descriptors;

import kotlin.jvm.internal.Lambda;
import o.FragmentStateAdapter;
import o.Styleable;
/* loaded from: classes5.dex */
public final class SerialDescriptorImpl$toString$1 extends Lambda implements Styleable.ChangeBounds<Integer, CharSequence> {
    final /* synthetic */ FragmentStateAdapter.FragmentMaxLifecycleEnforcer.AnonymousClass1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SerialDescriptorImpl$toString$1(FragmentStateAdapter.FragmentMaxLifecycleEnforcer.AnonymousClass1 anonymousClass1) {
        super(1);
        this.this$0 = anonymousClass1;
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ CharSequence invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final CharSequence invoke(int i) {
        return this.this$0.ah$a(i) + ": " + this.this$0.valueOf(i).ah$a();
    }
}
