package o;

import android.util.Log;
import java.lang.reflect.Method;
/* loaded from: classes4.dex */
public final class getSharedElementEnterTransition {
    private static Class<?> ah$a;
    public static final getSharedElementEnterTransition ag$a = new getSharedElementEnterTransition();
    private static final String valueOf = getSharedElementEnterTransition.class.getCanonicalName();

    private getSharedElementEnterTransition() {
    }

    private final Class<?> values() {
        Class<?> cls = Class.forName("com.unity3d.player.UnityPlayer");
        runAnimators.ah$a(cls, "forName(UNITY_PLAYER_CLASS)");
        return cls;
    }

    public static final void ah$a(String str, String str2, String str3) {
        try {
            if (ah$a == null) {
                ah$a = ag$a.values();
            }
            Class<?> cls = ah$a;
            if (cls != null) {
                Method method = cls.getMethod("UnitySendMessage", String.class, String.class, String.class);
                runAnimators.ah$a(method, "unityPlayer.getMethod(\n              UNITY_SEND_MESSAGE_METHOD, String::class.java, String::class.java, String::class.java)");
                Class<?> cls2 = ah$a;
                if (cls2 != null) {
                    method.invoke(cls2, str, str2, str3);
                    return;
                } else {
                    runAnimators.valueOf("unityPlayer");
                    throw null;
                }
            }
            runAnimators.valueOf("unityPlayer");
            throw null;
        } catch (Exception e) {
            Log.e(valueOf, "Failed to send message to Unity", e);
        }
    }

    public static final void valueOf() {
        ah$a("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
    }

    public static final void values(String str) {
        ah$a("UnityFacebookSDKPlugin", "OnReceiveMapping", str);
    }
}
