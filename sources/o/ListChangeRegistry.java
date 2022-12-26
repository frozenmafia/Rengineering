package o;

import com.app.dream11.chat.models.ChatMessageSectionKey$$ExternalSyntheticBackport0;
/* loaded from: classes4.dex */
public final class ListChangeRegistry {
    private final int values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ListChangeRegistry) && this.values == ((ListChangeRegistry) obj).values;
    }

    public int hashCode() {
        return this.values;
    }

    public String toString() {
        return "_Contest_Category_Int_(value=" + this.values + ')';
    }

    /* loaded from: classes4.dex */
    public final class ListChanges {
        private final long valueOf;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ListChanges) && this.valueOf == ((ListChanges) obj).valueOf;
        }

        public int hashCode() {
            return ChatMessageSectionKey$$ExternalSyntheticBackport0.m(this.valueOf);
        }

        public String toString() {
            return "_Contest_Id_Long_(value=" + this.valueOf + ')';
        }

        public ListChanges(long j) {
            this.valueOf = j;
        }

        public final long valueOf() {
            return this.valueOf;
        }
    }

    /* renamed from: o.ListChangeRegistry$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 {
        private final int values;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AnonymousClass1) && this.values == ((AnonymousClass1) obj).values;
        }

        public int hashCode() {
            return this.values;
        }

        public String toString() {
            return "_Contest_Size_Int_(value=" + this.values + ')';
        }

        public AnonymousClass1(int i) {
            this.values = i;
        }

        public final int ag$a() {
            return this.values;
        }
    }

    public ListChangeRegistry(int i) {
        this.values = i;
    }

    public final int ag$a() {
        return this.values;
    }
}
