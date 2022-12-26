package o;

import android.content.Context;
import com.facebook.AccessToken;
import com.facebook.appevents.AppEventsLogger;
import java.util.Map;
import java.util.concurrent.Executor;
/* loaded from: classes4.dex */
public final class generateActivityResultKey$ah$a {
    public /* synthetic */ generateActivityResultKey$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    private generateActivityResultKey$ah$a() {
    }

    public final AppEventsLogger.FlushBehavior ah$a() {
        return ensureAnimationInfo.toString.ah$a();
    }

    public final Executor values() {
        return ensureAnimationInfo.toString.values();
    }

    public final String valueOf() {
        return ensureAnimationInfo.toString.HaptikSDK$c();
    }

    public final void valueOf(Map<String, String> map) {
        runAnimators.ag$a(map, "ud");
        getEnterAnim getenteranim = getEnterAnim.ah$a;
        getEnterAnim.toString(map);
    }

    public final generateActivityResultKey valueOf(Context context, String str) {
        return new generateActivityResultKey(context, str);
    }

    public final generateActivityResultKey values(String str, String str2, AccessToken accessToken) {
        runAnimators.ag$a(str, "activityName");
        return new generateActivityResultKey(str, str2, accessToken);
    }
}
