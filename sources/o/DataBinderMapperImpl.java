package o;
/* loaded from: classes6.dex */
public final class DataBinderMapperImpl {
    private final int ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DataBinderMapperImpl) && this.ah$a == ((DataBinderMapperImpl) obj).ah$a;
    }

    public int hashCode() {
        return this.ah$a;
    }

    public String toString() {
        return "_Channel_Unread_Count_Int__(value=" + this.ah$a + ')';
    }

    /* loaded from: classes4.dex */
    public final class InnerLayoutIdLookup {
        private final int ah$a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InnerLayoutIdLookup) && this.ah$a == ((InnerLayoutIdLookup) obj).ah$a;
        }

        public int hashCode() {
            return this.ah$a;
        }

        public String toString() {
            return "_Winning_Template_Id_Int__(value=" + this.ah$a + ')';
        }

        public InnerLayoutIdLookup(int i) {
            this.ah$a = i;
        }

        public final int values() {
            return this.ah$a;
        }
    }

    /* loaded from: classes4.dex */
    public final class InnerBrLookup {
        private final String values;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InnerBrLookup) && runAnimators.values((Object) this.values, (Object) ((InnerBrLookup) obj).values);
        }

        public int hashCode() {
            return this.values.hashCode();
        }

        public String toString() {
            return "_Visit_utm_term_String(value=" + this.values + ')';
        }

        public InnerBrLookup(String str) {
            runAnimators.ag$a(str, "value");
            this.values = str;
        }

        public final String valueOf() {
            return this.values;
        }
    }

    public DataBinderMapperImpl(int i) {
        this.ah$a = i;
    }

    public final int valueOf() {
        return this.ah$a;
    }
}
