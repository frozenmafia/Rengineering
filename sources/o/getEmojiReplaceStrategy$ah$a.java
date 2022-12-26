package o;

import com.dreampay.commons.upi.UpiApp;
/* loaded from: classes4.dex */
public final class getEmojiReplaceStrategy$ah$a extends getEmojiReplaceStrategy {
    private final UpiApp valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getEmojiReplaceStrategy$ah$a) && runAnimators.values(this.valueOf, ((getEmojiReplaceStrategy$ah$a) obj).valueOf);
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }

    public String toString() {
        return "AppInfo(appInfo=" + this.valueOf + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getEmojiReplaceStrategy$ah$a(UpiApp upiApp) {
        super(null);
        runAnimators.ag$a(upiApp, "appInfo");
        this.valueOf = upiApp;
    }

    public final UpiApp values() {
        return this.valueOf;
    }
}
