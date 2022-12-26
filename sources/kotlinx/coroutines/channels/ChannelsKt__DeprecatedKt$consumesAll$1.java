package kotlinx.coroutines.channels;

import kotlin.jvm.internal.Lambda;
import o.ChangeScroll;
import o.Styleable;
import o.isStream;
import o.readIntArray;
import o.setAnimationMatrix;
/* loaded from: classes7.dex */
public final class ChannelsKt__DeprecatedKt$consumesAll$1 extends Lambda implements Styleable.ChangeBounds<Throwable, setAnimationMatrix> {
    final /* synthetic */ readIntArray<?>[] $channels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__DeprecatedKt$consumesAll$1(readIntArray<?>[] readintarrayArr) {
        super(1);
        this.$channels = readintarrayArr;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(Throwable th) {
        invoke2(th);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        Throwable th2 = null;
        for (readIntArray<?> readintarray : this.$channels) {
            try {
                isStream.toString(readintarray, th);
            } catch (Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                } else {
                    ChangeScroll.toString(th2, th3);
                }
            }
        }
        if (th2 != null) {
            throw th2;
        }
    }
}
