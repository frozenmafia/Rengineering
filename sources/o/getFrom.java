package o;

import com.app.dream11.chat.models.ChatMessageSectionKey$$ExternalSyntheticBackport0;
/* loaded from: classes4.dex */
public final class getFrom {
    private final long valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getFrom) && this.valueOf == ((getFrom) obj).valueOf;
    }

    public int hashCode() {
        return ChatMessageSectionKey$$ExternalSyntheticBackport0.m(this.valueOf);
    }

    public String toString() {
        return "_Inviter_User_Id_Long__(value=" + this.valueOf + ')';
    }

    public getFrom(long j) {
        this.valueOf = j;
    }

    public final long ah$a() {
        return this.valueOf;
    }
}
