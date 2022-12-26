package kotlinx.serialization.internal;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.ViewPager2;
/* loaded from: classes5.dex */
public final class PluginGeneratedSerialDescriptor$toString$1 extends Lambda implements Styleable.ChangeBounds<Integer, CharSequence> {
    final /* synthetic */ ViewPager2.AccessibilityProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginGeneratedSerialDescriptor$toString$1(ViewPager2.AccessibilityProvider accessibilityProvider) {
        super(1);
        this.this$0 = accessibilityProvider;
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ CharSequence invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final CharSequence invoke(int i) {
        return this.this$0.ah$a(i) + ": " + this.this$0.valueOf(i).ah$a();
    }
}
