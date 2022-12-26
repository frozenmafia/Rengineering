package kotlinx.coroutines.channels;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.isStream;
import o.readIntArray;
import o.setAnimationMatrix;
/* loaded from: classes7.dex */
public final class ChannelsKt__DeprecatedKt$consumes$1 extends Lambda implements Styleable.ChangeBounds<Throwable, setAnimationMatrix> {
    final /* synthetic */ readIntArray<?> $this_consumes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__DeprecatedKt$consumes$1(readIntArray<?> readintarray) {
        super(1);
        this.$this_consumes = readintarray;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(Throwable th) {
        invoke2(th);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        isStream.toString(this.$this_consumes, th);
    }
}
