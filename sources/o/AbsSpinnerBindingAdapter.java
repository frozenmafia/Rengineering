package o;

import com.app.dream11.chat.models.ChatMessageSectionKey$$ExternalSyntheticBackport0;
/* loaded from: classes4.dex */
public final class AbsSpinnerBindingAdapter {
    private final long ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbsSpinnerBindingAdapter) && this.ag$a == ((AbsSpinnerBindingAdapter) obj).ag$a;
    }

    public int hashCode() {
        return ChatMessageSectionKey$$ExternalSyntheticBackport0.m(this.ag$a);
    }

    public String toString() {
        return "_Otheer_user_id_Long(value=" + this.ag$a + ')';
    }

    public AbsSpinnerBindingAdapter(long j) {
        this.ag$a = j;
    }

    public final long ah$a() {
        return this.ag$a;
    }
}
