package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.readIntArray;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class ReceiveChannel$receiveOrNull$1<E> extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;

    public ReceiveChannel$receiveOrNull$1(setPatternPath<? super ReceiveChannel$receiveOrNull$1> setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return readIntArray.toString.ah$a(null, this);
    }
}
