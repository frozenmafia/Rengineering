package kotlinx.coroutines.flow.internal;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.excludeObject;
import o.setAnimationMatrix;
import o.setPatternPath;
import o.writeCharArray;
/* loaded from: classes7.dex */
public final /* synthetic */ class SafeCollectorKt$emitFun$1 extends FunctionReferenceImpl implements excludeObject<writeCharArray<? super Object>, Object, setPatternPath<? super setAnimationMatrix>, Object> {
    public static final SafeCollectorKt$emitFun$1 INSTANCE = new SafeCollectorKt$emitFun$1();

    SafeCollectorKt$emitFun$1() {
        super(3, writeCharArray.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // o.excludeObject
    public /* bridge */ /* synthetic */ Object invoke(writeCharArray<? super Object> writechararray, Object obj, setPatternPath<? super setAnimationMatrix> setpatternpath) {
        return invoke2((writeCharArray<Object>) writechararray, obj, setpatternpath);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(writeCharArray<Object> writechararray, Object obj, setPatternPath<? super setAnimationMatrix> setpatternpath) {
        return writechararray.emit(obj, setpatternpath);
    }
}
