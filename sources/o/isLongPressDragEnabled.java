package o;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import o.DiffUtil;
/* loaded from: classes7.dex */
final class isLongPressDragEnabled implements DiffUtil.Diagonal {
    DiffUtil.Callback<DiffUtil.Diagonal> toString;

    public isLongPressDragEnabled(DiffUtil.Callback<DiffUtil.Diagonal> callback) throws GeneralSecurityException {
        if (callback.ah$a() == null) {
            throw new GeneralSecurityException("Missing primary primitive.");
        }
        this.toString = callback;
    }

    @Override // o.DiffUtil.Diagonal
    public InputStream values(InputStream inputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        return new hasDragFlag(this.toString, inputStream, bArr);
    }

    @Override // o.DiffUtil.Diagonal
    public OutputStream valueOf(OutputStream outputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        return this.toString.ah$a().valueOf().valueOf(outputStream, bArr);
    }
}
