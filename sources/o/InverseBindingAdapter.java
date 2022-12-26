package o;

import com.app.dream11.chat.models.ChatMessageSectionKey$$ExternalSyntheticBackport0;
/* loaded from: classes4.dex */
public final class InverseBindingAdapter {
    private final long valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InverseBindingAdapter) && this.valueOf == ((InverseBindingAdapter) obj).valueOf;
    }

    public int hashCode() {
        return ChatMessageSectionKey$$ExternalSyntheticBackport0.m(this.valueOf);
    }

    public String toString() {
        return "_Competitoruse_Id_Long_(value=" + this.valueOf + ')';
    }

    public InverseBindingAdapter(long j) {
        this.valueOf = j;
    }

    public final long ah$a() {
        return this.valueOf;
    }
}
