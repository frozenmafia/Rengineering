package o;

import java.security.GeneralSecurityException;
import o.DiffUtil;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class drawVertical implements midPoint<calculateDiff, calculateDiff> {
    private static final java.util.logging.Logger ag$a = java.util.logging.Logger.getLogger(drawVertical.class.getName());

    drawVertical() {
    }

    @Override // o.midPoint
    /* renamed from: values */
    public calculateDiff valueOf(DiffUtil.Callback<calculateDiff> callback) throws GeneralSecurityException {
        return new drawVertical$ag$a(callback);
    }

    @Override // o.midPoint
    public Class<calculateDiff> valueOf() {
        return calculateDiff.class;
    }

    @Override // o.midPoint
    public Class<calculateDiff> ag$a() {
        return calculateDiff.class;
    }

    public static void values() throws GeneralSecurityException {
        DiffUtil.valueOf(new drawVertical());
    }
}
