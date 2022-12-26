package o;

import com.app.dream11.chat.models.ChatMessageSectionKey$$ExternalSyntheticBackport0;
/* loaded from: classes4.dex */
public final class ObservableBoolean {
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ObservableBoolean) && runAnimators.values((Object) this.values, (Object) ((ObservableBoolean) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "_Current_Team_Name_String__(value=" + this.values + ')';
    }

    public ObservableBoolean(String str) {
        runAnimators.ag$a(str, "value");
        this.values = str;
    }

    public final String ah$a() {
        return this.values;
    }

    /* renamed from: o.ObservableBoolean$1  reason: invalid class name */
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
            return "_Current_Size_Long_(value=" + this.ah$a + ')';
        }

        public AnonymousClass1(long j) {
            this.ah$a = j;
        }

        public final long values() {
            return this.ah$a;
        }
    }
}
