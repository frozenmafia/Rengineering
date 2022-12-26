package androidx.window.layout;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes6.dex */
final class SidecarAdapter$translate$checkedFeature$4 extends Lambda implements Styleable.ChangeBounds<SidecarDisplayFeature, Boolean> {
    public static final SidecarAdapter$translate$checkedFeature$4 INSTANCE = new SidecarAdapter$translate$checkedFeature$4();

    SidecarAdapter$translate$checkedFeature$4() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
        runAnimators.ag$a(sidecarDisplayFeature, "$this$require");
        return Boolean.valueOf(sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0);
    }
}
