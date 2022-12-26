package o;

import com.app.dream11.chat.models.ChatMessageSectionKey$$ExternalSyntheticBackport0;
/* loaded from: classes4.dex */
public final class addMapper {
    private final long values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof addMapper) && this.values == ((addMapper) obj).values;
    }

    public int hashCode() {
        return ChatMessageSectionKey$$ExternalSyntheticBackport0.m(this.values);
    }

    public String toString() {
        return "_Contest_Size_Long_(value=" + this.values + ')';
    }

    public addMapper(long j) {
        this.values = j;
    }

    public final long ag$a() {
        return this.values;
    }
}
