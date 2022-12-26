package kotlinx.serialization.internal;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.ViewPager2;
import o.containsItem;
import o.handlesRvGetAccessibilityClassName;
import o.notifyBeginFakeDrag;
/* loaded from: classes5.dex */
public final class PluginGeneratedSerialDescriptor$childSerializers$2 extends Lambda implements Styleable.ArcMotion<containsItem<?>[]> {
    final /* synthetic */ ViewPager2.AccessibilityProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginGeneratedSerialDescriptor$childSerializers$2(ViewPager2.AccessibilityProvider accessibilityProvider) {
        super(0);
        this.this$0 = accessibilityProvider;
    }

    @Override // o.Styleable.ArcMotion
    public final containsItem<?>[] invoke() {
        notifyBeginFakeDrag notifybeginfakedrag;
        notifybeginfakedrag = this.this$0.HaptikSDK$c;
        containsItem<?>[] ah$a = notifybeginfakedrag == null ? null : notifybeginfakedrag.ah$a();
        return ah$a == null ? handlesRvGetAccessibilityClassName.ag$a : ah$a;
    }
}
