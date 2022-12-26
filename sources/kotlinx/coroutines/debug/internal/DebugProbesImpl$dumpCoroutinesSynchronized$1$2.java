package kotlinx.coroutines.debug.internal;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.readSizeF;
/* loaded from: classes7.dex */
public final class DebugProbesImpl$dumpCoroutinesSynchronized$1$2 extends Lambda implements Styleable.ChangeBounds<readSizeF.toString<?>, Boolean> {
    public static final DebugProbesImpl$dumpCoroutinesSynchronized$1$2 INSTANCE = new DebugProbesImpl$dumpCoroutinesSynchronized$1$2();

    DebugProbesImpl$dumpCoroutinesSynchronized$1$2() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final Boolean invoke(readSizeF.toString<?> tostring) {
        boolean ag$a;
        ag$a = readSizeF.ah$a.ag$a(tostring);
        return Boolean.valueOf(!ag$a);
    }
}
