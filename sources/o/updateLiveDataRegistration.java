package o;

import com.app.dream11.chat.models.ChatMessageSectionKey$$ExternalSyntheticBackport0;
/* loaded from: classes4.dex */
public final class updateLiveDataRegistration {
    private final long values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof updateLiveDataRegistration) && this.values == ((updateLiveDataRegistration) obj).values;
    }

    public int hashCode() {
        return ChatMessageSectionKey$$ExternalSyntheticBackport0.m(this.values);
    }

    public String toString() {
        return "_League_Id_Long_(value=" + this.values + ')';
    }

    public updateLiveDataRegistration(long j) {
        this.values = j;
    }

    public final long ag$a() {
        return this.values;
    }
}
