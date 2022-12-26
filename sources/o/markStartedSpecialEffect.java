package o;

import com.facebook.share.model.GameRequestContent;
/* loaded from: classes6.dex */
public class markStartedSpecialEffect {
    public static void ag$a(GameRequestContent gameRequestContent) {
        attachController.ah$a((Object) gameRequestContent.HaptikSDK$a(), "message");
        if ((gameRequestContent.HaptikSDK$c() != null) ^ (gameRequestContent.ah$a() == GameRequestContent.ActionType.ASKFOR || gameRequestContent.ah$a() == GameRequestContent.ActionType.SEND)) {
            throw new IllegalArgumentException("Object id should be provided if and only if action type is send or askfor");
        }
        int i = gameRequestContent.HaptikSDK$b() != null ? 1 : 0;
        if (gameRequestContent.ah$b() != null) {
            i++;
        }
        if (gameRequestContent.valueOf() != null) {
            i++;
        }
        if (i > 1) {
            throw new IllegalArgumentException("Parameters to, filters and suggestions are mutually exclusive");
        }
    }
}
