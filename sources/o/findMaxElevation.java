package o;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import o.DiffUtil;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public abstract class findMaxElevation implements DiffUtil.Diagonal {
    public abstract int HaptikSDK$b();

    public abstract int ah$a();

    public abstract computeScrollExtent ah$b() throws GeneralSecurityException;

    public abstract findLastPartiallyOrCompletelyInvisibleChild toString(byte[] bArr) throws GeneralSecurityException;

    public abstract int valueOf();

    public abstract int values();

    @Override // o.DiffUtil.Diagonal
    public OutputStream valueOf(OutputStream outputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        return new findPartiallyOrCompletelyInvisibleChildClosestToEnd(this, outputStream, bArr);
    }

    @Override // o.DiffUtil.Diagonal
    public InputStream values(InputStream inputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        return new findPartiallyOrCompletelyInvisibleChildClosestToStart(this, inputStream, bArr);
    }
}
