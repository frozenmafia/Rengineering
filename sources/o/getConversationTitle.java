package o;

import com.app.dream11.social.SocialHelper;
/* loaded from: classes3.dex */
public final class getConversationTitle {
    private final String ag$a;
    private SocialHelper.ConnectionStatus ah$a;

    public getConversationTitle(String str, SocialHelper.ConnectionStatus connectionStatus) {
        runAnimators.ag$a(str, "userGuid");
        runAnimators.ag$a(connectionStatus, "connectionStatus");
        this.ag$a = str;
        this.ah$a = connectionStatus;
    }

    public final SocialHelper.ConnectionStatus ah$a() {
        return this.ah$a;
    }

    public final void ah$a(SocialHelper.ConnectionStatus connectionStatus) {
        runAnimators.ag$a(connectionStatus, "<set-?>");
        this.ah$a = connectionStatus;
    }

    public final String valueOf() {
        return this.ag$a;
    }
}
