package kotlinx.coroutines.debug.internal;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.readParcelable;
import o.readSizeF;
import o.setAnimationMatrix;
/* loaded from: classes7.dex */
public final class DebugProbesImpl$startWeakRefCleanerThread$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    public static final DebugProbesImpl$startWeakRefCleanerThread$1 INSTANCE = new DebugProbesImpl$startWeakRefCleanerThread$1();

    DebugProbesImpl$startWeakRefCleanerThread$1() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        readParcelable readparcelable;
        readparcelable = readSizeF.values;
        readparcelable.ah$b();
    }
}
