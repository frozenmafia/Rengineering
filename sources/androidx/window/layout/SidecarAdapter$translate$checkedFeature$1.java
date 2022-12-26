package androidx.window.layout;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes6.dex */
final class SidecarAdapter$translate$checkedFeature$1 extends Lambda implements Styleable.ChangeBounds<SidecarDisplayFeature, Boolean> {
    public static final SidecarAdapter$translate$checkedFeature$1 INSTANCE = new SidecarAdapter$translate$checkedFeature$1();

    SidecarAdapter$translate$checkedFeature$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
        runAnimators.ag$a(sidecarDisplayFeature, "$this$require");
        boolean z = true;
        if (sidecarDisplayFeature.getType() != 1 && sidecarDisplayFeature.getType() != 2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
