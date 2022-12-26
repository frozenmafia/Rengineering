package o;

import com.app.dream11.chat.models.ChatMessageSectionKey$$ExternalSyntheticBackport0;
/* loaded from: classes4.dex */
public final class RatingBarBindingAdapter {
    private final int ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RatingBarBindingAdapter) && this.ag$a == ((RatingBarBindingAdapter) obj).ag$a;
    }

    public int hashCode() {
        return this.ag$a;
    }

    public String toString() {
        return "_Relative_Position_Int_(value=" + this.ag$a + ')';
    }

    /* renamed from: o.RatingBarBindingAdapter$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 {
        private final long ah$a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AnonymousClass1) && this.ah$a == ((AnonymousClass1) obj).ah$a;
        }

        public int hashCode() {
            return ChatMessageSectionKey$$ExternalSyntheticBackport0.m(this.ah$a);
        }

        public String toString() {
            return "_Round_Id_Long_(value=" + this.ah$a + ')';
        }

        public AnonymousClass1(long j) {
            this.ah$a = j;
        }

        public final long ah$a() {
            return this.ah$a;
        }
    }

    public RatingBarBindingAdapter(int i) {
        this.ag$a = i;
    }

    public final int valueOf() {
        return this.ag$a;
    }
}
