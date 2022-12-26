package o;

import com.app.dream11.chat.models.ChatMessageSectionKey$$ExternalSyntheticBackport0;
/* loaded from: classes4.dex */
public final class setValidator {
    private final long ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setValidator) && this.ah$a == ((setValidator) obj).ah$a;
    }

    public int hashCode() {
        return ChatMessageSectionKey$$ExternalSyntheticBackport0.m(this.ah$a);
    }

    public String toString() {
        return "_Other_user_id_Long(value=" + this.ah$a + ')';
    }

    public setValidator(long j) {
        this.ah$a = j;
    }

    public final long valueOf() {
        return this.ah$a;
    }
}
