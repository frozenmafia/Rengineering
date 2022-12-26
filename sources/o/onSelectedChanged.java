package o;

import java.security.GeneralSecurityException;
import o.DiffUtil;
/* loaded from: classes7.dex */
public class onSelectedChanged implements midPoint<DiffUtil.Diagonal, DiffUtil.Diagonal> {
    onSelectedChanged() {
    }

    @Override // o.midPoint
    /* renamed from: ah$a */
    public DiffUtil.Diagonal valueOf(DiffUtil.Callback<DiffUtil.Diagonal> callback) throws GeneralSecurityException {
        return new isLongPressDragEnabled(callback);
    }

    @Override // o.midPoint
    public Class<DiffUtil.Diagonal> valueOf() {
        return DiffUtil.Diagonal.class;
    }

    @Override // o.midPoint
    public Class<DiffUtil.Diagonal> ag$a() {
        return DiffUtil.Diagonal.class;
    }
}
