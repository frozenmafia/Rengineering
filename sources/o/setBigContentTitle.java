package o;

import com.app.dream11.dream11.messagepool.NotifyType;
/* loaded from: classes3.dex */
public final class setBigContentTitle extends setPaddingRelative {
    private final getConfirmLabel ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setBigContentTitle) && runAnimators.values(this.ah$a, ((setBigContentTitle) obj).ah$a);
    }

    public int hashCode() {
        return this.ah$a.hashCode();
    }

    public String toString() {
        getConfirmLabel getconfirmlabel = this.ah$a;
        return "FollowUnFollowStatus(data=" + getconfirmlabel + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setBigContentTitle(getConfirmLabel getconfirmlabel) {
        super(NotifyType.UPDATE_FOLLOW_STATUS);
        runAnimators.ag$a(getconfirmlabel, "data");
        this.ah$a = getconfirmlabel;
    }

    public final getConfirmLabel ah$a() {
        return this.ah$a;
    }
}
