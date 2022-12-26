package kotlinx.coroutines.debug.internal;

import kotlin.jvm.internal.Lambda;
import o.PropertyValuesHolderUtils;
import o.Styleable;
import o.Transition;
import o.readSizeF;
/* loaded from: classes7.dex */
public final class DebugProbesImpl$dumpCoroutinesInfoImpl$1$3 extends Lambda implements Styleable.ChangeBounds<readSizeF.toString<?>, R> {
    final /* synthetic */ Transition<readSizeF.toString<?>, PropertyValuesHolderUtils, R> $create;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DebugProbesImpl$dumpCoroutinesInfoImpl$1$3(Transition<? super readSizeF.toString<?>, ? super PropertyValuesHolderUtils, ? extends R> transition) {
        super(1);
        this.$create = transition;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [R, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final R invoke(readSizeF.toString<?> tostring) {
        boolean ag$a;
        PropertyValuesHolderUtils ah$a;
        ag$a = readSizeF.ah$a.ag$a(tostring);
        if (ag$a || (ah$a = tostring.ah$a.ah$a()) == null) {
            return null;
        }
        return this.$create.invoke(tostring, ah$a);
    }
}
