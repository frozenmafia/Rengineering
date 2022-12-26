package o;

import com.app.dream11.chat.models.ChatMessageSectionKey$$ExternalSyntheticBackport0;
/* loaded from: classes4.dex */
public final class event {
    private final long ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof event) && this.ag$a == ((event) obj).ag$a;
    }

    public int hashCode() {
        return ChatMessageSectionKey$$ExternalSyntheticBackport0.m(this.ag$a);
    }

    public String toString() {
        return "_Competitor_userid_Long(value=" + this.ag$a + ')';
    }

    public event(long j) {
        this.ag$a = j;
    }

    public final long ah$a() {
        return this.ag$a;
    }
}
