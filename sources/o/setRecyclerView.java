package o;

import com.google.firebase.encoders.proto.Protobuf;
import java.lang.annotation.Annotation;
/* loaded from: classes7.dex */
public final class setRecyclerView {
    private Protobuf.IntEncoding ag$a = Protobuf.IntEncoding.DEFAULT;
    private int valueOf;

    public setRecyclerView values(int i) {
        this.valueOf = i;
        return this;
    }

    public static setRecyclerView values() {
        return new setRecyclerView();
    }

    public Protobuf ag$a() {
        return new values(this.valueOf, this.ag$a);
    }

    /* loaded from: classes7.dex */
    static final class values implements Protobuf {
        private final Protobuf.IntEncoding ag$a;
        private final int toString;

        values(int i, Protobuf.IntEncoding intEncoding) {
            this.toString = i;
            this.ag$a = intEncoding;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return Protobuf.class;
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public int values() {
            return this.toString;
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public Protobuf.IntEncoding ag$a() {
            return this.ag$a;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Protobuf) {
                Protobuf protobuf = (Protobuf) obj;
                return this.toString == protobuf.values() && this.ag$a.equals(protobuf.ag$a());
            }
            return false;
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (this.toString ^ 14552422) + (this.ag$a.hashCode() ^ 2041407134);
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.toString + "intEncoding=" + this.ag$a + ')';
        }
    }
}
