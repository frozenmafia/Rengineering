package o;

import com.app.dream11.chat.models.ChatMessageSectionKey$$ExternalSyntheticBackport0;
/* loaded from: classes4.dex */
public final class ViewDataBindingKtx {
    private final String ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ViewDataBindingKtx) && runAnimators.values((Object) this.ah$a, (Object) ((ViewDataBindingKtx) obj).ah$a);
    }

    public int hashCode() {
        return this.ah$a.hashCode();
    }

    public String toString() {
        return "_Mode_String(value=" + this.ah$a + ')';
    }

    public ViewDataBindingKtx(String str) {
        runAnimators.ag$a(str, "value");
        this.ah$a = str;
    }

    public final String values() {
        return this.ah$a;
    }

    /* loaded from: classes4.dex */
    public final class StateFlowListener {
        private final long toString;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateFlowListener) && this.toString == ((StateFlowListener) obj).toString;
        }

        public int hashCode() {
            return ChatMessageSectionKey$$ExternalSyntheticBackport0.m(this.toString);
        }

        public String toString() {
            return "_New_Member_User_Id_Long___(value=" + this.toString + ')';
        }

        public StateFlowListener(long j) {
            this.toString = j;
        }

        public final long values() {
            return this.toString;
        }
    }
}
