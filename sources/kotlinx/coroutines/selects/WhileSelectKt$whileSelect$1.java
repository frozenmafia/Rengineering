package kotlinx.coroutines.selects;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ViewPager;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class WhileSelectKt$whileSelect$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public WhileSelectKt$whileSelect$1(setPatternPath<? super WhileSelectKt$whileSelect$1> setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ViewPager.SimpleOnPageChangeListener.values(null, this);
    }
}
