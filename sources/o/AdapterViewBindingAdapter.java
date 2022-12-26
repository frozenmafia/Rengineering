package o;

import com.app.dream11.chat.models.ChatMessageSectionKey$$ExternalSyntheticBackport0;
/* loaded from: classes4.dex */
public final class AdapterViewBindingAdapter {
    private final long ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AdapterViewBindingAdapter) && this.ah$a == ((AdapterViewBindingAdapter) obj).ah$a;
    }

    public int hashCode() {
        return ChatMessageSectionKey$$ExternalSyntheticBackport0.m(this.ah$a);
    }

    public String toString() {
        return "_Other_User_Id_Long__(value=" + this.ah$a + ')';
    }

    public AdapterViewBindingAdapter(long j) {
        this.ah$a = j;
    }

    public final long values() {
        return this.ah$a;
    }

    /* loaded from: classes4.dex */
    public final class OnItemSelectedComponentListener {
        private final String ah$a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnItemSelectedComponentListener) && runAnimators.values((Object) this.ah$a, (Object) ((OnItemSelectedComponentListener) obj).ah$a);
        }

        public int hashCode() {
            return this.ah$a.hashCode();
        }

        public String toString() {
            return "_Other_user_id_String(value=" + this.ah$a + ')';
        }

        public OnItemSelectedComponentListener(String str) {
            runAnimators.ag$a(str, "value");
            this.ah$a = str;
        }

        public final String ah$a() {
            return this.ah$a;
        }
    }

    /* loaded from: classes4.dex */
    public final class OnNothingSelected {
        private final int ah$a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnNothingSelected) && this.ah$a == ((OnNothingSelected) obj).ah$a;
        }

        public int hashCode() {
            return this.ah$a;
        }

        public String toString() {
            return "_Page_Viewed_Int_(value=" + this.ah$a + ')';
        }

        public OnNothingSelected(int i) {
            this.ah$a = i;
        }

        public final int ah$a() {
            return this.ah$a;
        }
    }

    /* loaded from: classes4.dex */
    public final class OnItemSelected {
        private final int toString;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnItemSelected) && this.toString == ((OnItemSelected) obj).toString;
        }

        public int hashCode() {
            return this.toString;
        }

        public String toString() {
            return "_Overall_Position_Int_(value=" + this.toString + ')';
        }

        public OnItemSelected(int i) {
            this.toString = i;
        }

        public final int ah$a() {
            return this.toString;
        }
    }
}
