package kotlinx.coroutines.channels;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.isStream;
import o.readIntArray;
import o.setAnimationMatrix;
/* loaded from: classes7.dex */
public final class BroadcastKt$broadcast$1 extends Lambda implements Styleable.ChangeBounds<Throwable, setAnimationMatrix> {
    final /* synthetic */ readIntArray<E> $this_broadcast;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BroadcastKt$broadcast$1(readIntArray<? extends E> readintarray) {
        super(1);
        this.$this_broadcast = readintarray;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(Throwable th) {
        invoke2(th);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        isStream.toString((readIntArray<?>) this.$this_broadcast, th);
    }
}
