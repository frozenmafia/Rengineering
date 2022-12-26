package o;

import com.app.dream11.chat.models.ChatMessageSectionKey$$ExternalSyntheticBackport0;
/* loaded from: classes4.dex */
public final class setNumeric {
    private final long ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setNumeric) && this.ag$a == ((setNumeric) obj).ag$a;
    }

    public int hashCode() {
        return ChatMessageSectionKey$$ExternalSyntheticBackport0.m(this.ag$a);
    }

    public String toString() {
        return "_Time_Spent_Long_(value=" + this.ag$a + ')';
    }

    public setNumeric(long j) {
        this.ag$a = j;
    }

    public final long valueOf() {
        return this.ag$a;
    }
}
