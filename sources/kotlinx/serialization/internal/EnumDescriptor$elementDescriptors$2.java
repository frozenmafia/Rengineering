package kotlinx.serialization.internal;

import kotlin.jvm.internal.Lambda;
import o.FragmentStateAdapter;
import o.Styleable;
import o.dispatchSelected;
import o.updateFragmentMaxLifecycle$ah$a;
/* loaded from: classes8.dex */
public final class EnumDescriptor$elementDescriptors$2 extends Lambda implements Styleable.ArcMotion<FragmentStateAdapter.DataSetChangeObserver[]> {
    final /* synthetic */ int $elementsCount;
    final /* synthetic */ String $name;
    final /* synthetic */ dispatchSelected this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnumDescriptor$elementDescriptors$2(int i, String str, dispatchSelected dispatchselected) {
        super(0);
        this.$elementsCount = i;
        this.$name = str;
        this.this$0 = dispatchselected;
    }

    @Override // o.Styleable.ArcMotion
    public final FragmentStateAdapter.DataSetChangeObserver[] invoke() {
        int i = this.$elementsCount;
        FragmentStateAdapter.DataSetChangeObserver[] dataSetChangeObserverArr = new FragmentStateAdapter.DataSetChangeObserver[i];
        for (int i2 = 0; i2 < i; i2++) {
            dataSetChangeObserverArr[i2] = FragmentStateAdapter.FragmentMaxLifecycleEnforcer.AnonymousClass3.ag$a(this.$name + '.' + this.this$0.ah$a(i2), updateFragmentMaxLifecycle$ah$a.toString, new FragmentStateAdapter.DataSetChangeObserver[0], null, 8, null);
        }
        return dataSetChangeObserverArr;
    }
}
