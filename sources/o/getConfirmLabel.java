package o;

import com.app.dream11.core.service.graphql.api.type.MyConnectionStatus;
/* loaded from: classes3.dex */
public final class getConfirmLabel {
    private final String ah$a;
    private final MyConnectionStatus valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getConfirmLabel) {
            getConfirmLabel getconfirmlabel = (getConfirmLabel) obj;
            return this.valueOf == getconfirmlabel.valueOf && runAnimators.values((Object) this.ah$a, (Object) getconfirmlabel.ah$a);
        }
        return false;
    }

    public int hashCode() {
        return (this.valueOf.hashCode() * 31) + this.ah$a.hashCode();
    }

    public String toString() {
        MyConnectionStatus myConnectionStatus = this.valueOf;
        String str = this.ah$a;
        return "ContactConnectionStatusUpdate(socialConnectionStatus=" + myConnectionStatus + ", userGuid=" + str + ")";
    }

    public getConfirmLabel(MyConnectionStatus myConnectionStatus, String str) {
        runAnimators.ag$a(myConnectionStatus, "socialConnectionStatus");
        runAnimators.ag$a(str, "userGuid");
        this.valueOf = myConnectionStatus;
        this.ah$a = str;
    }

    public final MyConnectionStatus ah$a() {
        return this.valueOf;
    }

    public final String values() {
        return this.ah$a;
    }
}
