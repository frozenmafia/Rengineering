package o;

import com.app.dream11.core.service.graphql.api.fragment.NetworkInfoFragment;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public final class cloneConstantState {
    private final setEnterFadeDuration ag$a;
    private String toString;
    private final enableHomeButtonByDefault valueOf;

    public cloneConstantState(NetworkInfoFragment networkInfoFragment, enableHomeButtonByDefault enablehomebuttonbydefault) {
        runAnimators.ag$a(enablehomebuttonbydefault, "resourceProvider");
        this.valueOf = enablehomebuttonbydefault;
        setEnterFadeDuration setenterfadeduration = new setEnterFadeDuration(networkInfoFragment, enablehomebuttonbydefault);
        this.ag$a = setenterfadeduration;
        this.toString = setenterfadeduration.ah$a();
    }

    public final setEnterFadeDuration ag$a() {
        return this.ag$a;
    }

    public final int valueOf() {
        return this.ag$a.HaptikSDK$b();
    }

    public final ArrayList<tryShow> values() {
        return this.ag$a.valueOf();
    }

    public final void ag$a(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.toString = str;
    }

    public final String ah$a() {
        return this.toString;
    }
}
