package kotlinx.serialization.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.Lambda;
import o.FragmentStateAdapter;
import o.Styleable;
import o.ViewPager2;
import o.containsItem;
import o.notifyBeginFakeDrag;
/* loaded from: classes5.dex */
public final class PluginGeneratedSerialDescriptor$typeParameterDescriptors$2 extends Lambda implements Styleable.ArcMotion<FragmentStateAdapter.DataSetChangeObserver[]> {
    final /* synthetic */ ViewPager2.AccessibilityProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginGeneratedSerialDescriptor$typeParameterDescriptors$2(ViewPager2.AccessibilityProvider accessibilityProvider) {
        super(0);
        this.this$0 = accessibilityProvider;
    }

    @Override // o.Styleable.ArcMotion
    public final FragmentStateAdapter.DataSetChangeObserver[] invoke() {
        notifyBeginFakeDrag notifybeginfakedrag;
        ArrayList arrayList;
        containsItem<?>[] valueOf;
        notifybeginfakedrag = this.this$0.HaptikSDK$c;
        if (notifybeginfakedrag == null || (valueOf = notifybeginfakedrag.valueOf()) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(valueOf.length);
            for (containsItem<?> containsitem : valueOf) {
                arrayList2.add(containsitem.values());
            }
            arrayList = arrayList2;
        }
        return ViewPager2.AnonymousClass3.valueOf(arrayList);
    }
}
