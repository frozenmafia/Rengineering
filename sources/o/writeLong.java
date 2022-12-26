package o;

import kotlinx.coroutines.flow.FlowKt__DistinctKt$defaultAreEquivalent$1;
import kotlinx.coroutines.flow.FlowKt__DistinctKt$defaultKeySelector$1;
import o.Styleable;
/* loaded from: classes7.dex */
public final /* synthetic */ class writeLong {
    private static final Styleable.ChangeBounds<Object, Object> toString = FlowKt__DistinctKt$defaultKeySelector$1.INSTANCE;
    private static final Transition<Object, Object, Boolean> ag$a = FlowKt__DistinctKt$defaultAreEquivalent$1.INSTANCE;

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> writeByteArray<T> valueOf(writeByteArray<? extends T> writebytearray) {
        return writebytearray instanceof deprecatedIds ? writebytearray : values(writebytearray, toString, ag$a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> writeByteArray<T> values(writeByteArray<? extends T> writebytearray, Styleable.ChangeBounds<? super T, ? extends Object> changeBounds, Transition<Object, Object, Boolean> transition) {
        if (writebytearray instanceof writeCharSequence) {
            writeCharSequence writecharsequence = (writeCharSequence) writebytearray;
            if (writecharsequence.values == changeBounds && writecharsequence.toString == transition) {
                return writebytearray;
            }
        }
        return new writeCharSequence(writebytearray, changeBounds, transition);
    }
}
