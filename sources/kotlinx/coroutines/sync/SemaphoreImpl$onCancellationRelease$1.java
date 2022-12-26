package kotlinx.coroutines.sync;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.itemForViewHolder;
import o.setAnimationMatrix;
/* loaded from: classes7.dex */
public final class SemaphoreImpl$onCancellationRelease$1 extends Lambda implements Styleable.ChangeBounds<Throwable, setAnimationMatrix> {
    final /* synthetic */ itemForViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SemaphoreImpl$onCancellationRelease$1(itemForViewHolder itemforviewholder) {
        super(1);
        this.this$0 = itemforviewholder;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(Throwable th) {
        invoke2(th);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.this$0.ah$a();
    }
}
