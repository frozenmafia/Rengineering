package kotlinx.serialization.internal;

import com.sendbird.android.constant.StringSet;
import kotlin.jvm.internal.Lambda;
import o.FragmentStateAdapter;
import o.Styleable;
import o.containsItem;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes8.dex */
public final class MapEntrySerializer$descriptor$1 extends Lambda implements Styleable.ChangeBounds<FragmentStateAdapter.AnonymousClass3, setAnimationMatrix> {
    final /* synthetic */ containsItem<K> $keySerializer;
    final /* synthetic */ containsItem<V> $valueSerializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapEntrySerializer$descriptor$1(containsItem<K> containsitem, containsItem<V> containsitem2) {
        super(1);
        this.$keySerializer = containsitem;
        this.$valueSerializer = containsitem2;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(FragmentStateAdapter.AnonymousClass3 anonymousClass3) {
        invoke2(anonymousClass3);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(FragmentStateAdapter.AnonymousClass3 anonymousClass3) {
        runAnimators.ag$a(anonymousClass3, "$this$buildSerialDescriptor");
        FragmentStateAdapter.AnonymousClass3.valueOf(anonymousClass3, StringSet.key, this.$keySerializer.values(), null, false, 12, null);
        FragmentStateAdapter.AnonymousClass3.valueOf(anonymousClass3, "value", this.$valueSerializer.values(), null, false, 12, null);
    }
}
