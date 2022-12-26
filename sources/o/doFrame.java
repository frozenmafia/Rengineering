package o;

import com.app.dream11.chat.models.ChatMessageSectionKey$$ExternalSyntheticBackport0;
/* loaded from: classes4.dex */
public final class doFrame {
    private final long valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof doFrame) && this.valueOf == ((doFrame) obj).valueOf;
    }

    public int hashCode() {
        return ChatMessageSectionKey$$ExternalSyntheticBackport0.m(this.valueOf);
    }

    public String toString() {
        return "_Message_Id_Long_(value=" + this.valueOf + ')';
    }

    public doFrame(long j) {
        this.valueOf = j;
    }

    public final long ag$a() {
        return this.valueOf;
    }
}
