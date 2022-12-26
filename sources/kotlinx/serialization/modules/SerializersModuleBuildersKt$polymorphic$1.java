package kotlinx.serialization.modules;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getBigInteger;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes8.dex */
public final class SerializersModuleBuildersKt$polymorphic$1 extends Lambda implements Styleable.ChangeBounds<getBigInteger<? super Base>, setAnimationMatrix> {
    public static final SerializersModuleBuildersKt$polymorphic$1 INSTANCE = new SerializersModuleBuildersKt$polymorphic$1();

    public SerializersModuleBuildersKt$polymorphic$1() {
        super(1);
    }

    public final void invoke(getBigInteger<? super Base> getbiginteger) {
        runAnimators.ag$a(getbiginteger, "$this$null");
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(Object obj) {
        invoke((getBigInteger) obj);
        return setAnimationMatrix.ag$a;
    }
}
