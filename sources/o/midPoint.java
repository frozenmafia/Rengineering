package o;

import java.security.GeneralSecurityException;
import o.DiffUtil;
/* loaded from: classes7.dex */
public interface midPoint<B, P> {
    Class<B> ag$a();

    Class<P> valueOf();

    P valueOf(DiffUtil.Callback<B> callback) throws GeneralSecurityException;
}
