package o;

import com.app.dream11.core.service.graphql.api.fragment.NetworkInfoFragment;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public final class start {
    private String toString;
    private final setEnterFadeDuration valueOf;
    private final enableHomeButtonByDefault values;

    public start(NetworkInfoFragment networkInfoFragment, enableHomeButtonByDefault enablehomebuttonbydefault) {
        runAnimators.ag$a(enablehomebuttonbydefault, "resourceProvider");
        this.values = enablehomebuttonbydefault;
        setEnterFadeDuration setenterfadeduration = new setEnterFadeDuration(networkInfoFragment, enablehomebuttonbydefault);
        this.valueOf = setenterfadeduration;
        this.toString = setenterfadeduration.ah$a();
    }

    public final setEnterFadeDuration ah$a() {
        return this.valueOf;
    }

    public final int values() {
        return this.valueOf.HaptikSDK$b();
    }

    public final ArrayList<tryShow> valueOf() {
        return this.valueOf.valueOf();
    }

    public final String ag$a() {
        return this.toString;
    }

    public final void valueOf(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.toString = str;
    }
}
