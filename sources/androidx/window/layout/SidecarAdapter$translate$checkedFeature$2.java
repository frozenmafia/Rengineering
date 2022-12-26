package androidx.window.layout;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes6.dex */
final class SidecarAdapter$translate$checkedFeature$2 extends Lambda implements Styleable.ChangeBounds<SidecarDisplayFeature, Boolean> {
    public static final SidecarAdapter$translate$checkedFeature$2 INSTANCE = new SidecarAdapter$translate$checkedFeature$2();

    SidecarAdapter$translate$checkedFeature$2() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
        runAnimators.ag$a(sidecarDisplayFeature, "$this$require");
        return Boolean.valueOf((sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true);
    }
}
