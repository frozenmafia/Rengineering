package o;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
/* loaded from: classes2.dex */
public final /* synthetic */ class savePresenterStates implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ savePresenterStates ag$a = new savePresenterStates();

    private /* synthetic */ savePresenterStates() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        GoogleSignInAccount signInAccount;
        signInAccount = ((GoogleSignInResult) obj).getSignInAccount();
        return signInAccount;
    }
}
