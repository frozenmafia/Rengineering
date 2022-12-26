package o;
/* loaded from: classes3.dex */
public interface skipEntityForward {
    long ag$a();

    toString ah$a(long j);

    boolean ah$a();

    /* loaded from: classes3.dex */
    public static final class toString {
        public final skipTagBackward ag$a;
        public final skipTagBackward valueOf;

        public toString(skipTagBackward skiptagbackward) {
            this(skiptagbackward, skiptagbackward);
        }

        public toString(skipTagBackward skiptagbackward, skipTagBackward skiptagbackward2) {
            this.valueOf = (skipTagBackward) FingerprintManagerCompat.toString(skiptagbackward);
            this.ag$a = (skipTagBackward) FingerprintManagerCompat.toString(skiptagbackward2);
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.valueOf);
            if (this.valueOf.equals(this.ag$a)) {
                str = "";
            } else {
                str = ", " + this.ag$a;
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            toString tostring = (toString) obj;
            return this.valueOf.equals(tostring.valueOf) && this.ag$a.equals(tostring.ag$a);
        }

        public int hashCode() {
            return (this.valueOf.hashCode() * 31) + this.ag$a.hashCode();
        }
    }
}
