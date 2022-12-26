package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.readByteArray;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class ProduceKt$awaitClose$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public ProduceKt$awaitClose$1(setPatternPath<? super ProduceKt$awaitClose$1> setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return readByteArray.ah$a(null, null, this);
    }
}
