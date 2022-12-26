package o;

import java.io.IOException;
import java.security.GeneralSecurityException;
import o.DefaultItemAnimator;
/* loaded from: classes7.dex */
public final class runPendingAnimations {
    public static DefaultItemAnimator.MoveInfo toString(DefaultItemAnimator.AnonymousClass6 anonymousClass6) throws GeneralSecurityException, IOException {
        return DefaultItemAnimator.MoveInfo.valueOf(anonymousClass6.ah$a());
    }

    public static void toString(DefaultItemAnimator.MoveInfo moveInfo, DefaultItemAnimator.ChangeInfo changeInfo) throws IOException {
        changeInfo.ah$a(moveInfo.ah$a());
    }
}
