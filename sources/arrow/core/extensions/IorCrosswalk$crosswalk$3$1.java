package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.newSessionWithExtras;
import o.postMessage;
/* loaded from: classes6.dex */
public final class IorCrosswalk$crosswalk$3$1 extends Lambda implements Styleable.ChangeBounds<B, postMessage> {
    public static final IorCrosswalk$crosswalk$3$1 INSTANCE = new IorCrosswalk$crosswalk$3$1();

    IorCrosswalk$crosswalk$3$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ postMessage invoke(Object obj) {
        return invoke2((IorCrosswalk$crosswalk$3$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final postMessage invoke2(B b2) {
        return newSessionWithExtras.values(b2);
    }
}
