package o;

import com.app.dream11.core.service.PermissionEnum;
/* loaded from: classes3.dex */
public final class colRemoveAt$ah$a extends colRemoveAt {
    private final PermissionEnum toString;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public colRemoveAt$ah$a(PermissionEnum permissionEnum) {
        super(null);
        runAnimators.ag$a(permissionEnum, "permissionEnum");
        this.toString = permissionEnum;
    }

    public final PermissionEnum values() {
        return this.toString;
    }
}
