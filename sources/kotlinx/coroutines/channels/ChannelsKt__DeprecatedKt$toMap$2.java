package kotlinx.coroutines.channels;

import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.readCollection;
import o.readIntArray;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class ChannelsKt__DeprecatedKt$toMap$2<K, V, M extends Map<? super K, ? super V>> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;

    public ChannelsKt__DeprecatedKt$toMap$2(setPatternPath<? super ChannelsKt__DeprecatedKt$toMap$2> setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return readCollection.values((readIntArray) null, (Map) null, (setPatternPath<? super Map>) this);
    }
}
