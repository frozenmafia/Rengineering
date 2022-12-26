package kotlinx.coroutines.debug.internal;

import kotlin.jvm.internal.Lambda;
import o.PropertyValuesHolderUtils;
import o.Styleable;
import o.readSizeF;
/* loaded from: classes7.dex */
public final class DebugProbesImpl$dumpDebuggerInfo$$inlined$dumpCoroutinesInfoImpl$1 extends Lambda implements Styleable.ChangeBounds<readSizeF.toString<?>, DebuggerInfo> {
    public DebugProbesImpl$dumpDebuggerInfo$$inlined$dumpCoroutinesInfoImpl$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final DebuggerInfo invoke(readSizeF.toString<?> tostring) {
        boolean ag$a;
        PropertyValuesHolderUtils ah$a;
        ag$a = readSizeF.ah$a.ag$a(tostring);
        if (ag$a || (ah$a = tostring.ah$a.ah$a()) == null) {
            return null;
        }
        return new DebuggerInfo(tostring.ah$a, ah$a);
    }
}
