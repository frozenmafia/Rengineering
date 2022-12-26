package o;

import com.app.dream11.di.CoreModule;
import java.util.Objects;
/* loaded from: classes.dex */
public final class addMenuItem implements MasterKey<setPreventCornerOverlap<setPaddingRelative>> {
    private final CoreModule values;

    public addMenuItem(CoreModule coreModule) {
        this.values = coreModule;
    }

    @Override // javax.inject.Provider
    /* renamed from: values */
    public setPreventCornerOverlap<setPaddingRelative> ah$a() {
        return ah$a(this.values);
    }

    public static addMenuItem ag$a(CoreModule coreModule) {
        return new addMenuItem(coreModule);
    }

    public static setPreventCornerOverlap<setPaddingRelative> ah$a(CoreModule coreModule) {
        return (setPreventCornerOverlap) Objects.requireNonNull(coreModule.valueOf(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
