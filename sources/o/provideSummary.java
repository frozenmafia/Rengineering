package o;

import java.util.Objects;
import o.provideSummary;
/* loaded from: classes7.dex */
public abstract class provideSummary {

    /* loaded from: classes7.dex */
    public static abstract class valueOf {
        public abstract valueOf ah$a(Iterable<setDialogTitle> iterable);

        public abstract valueOf ah$a(byte[] bArr);

        public abstract provideSummary values();
    }

    public abstract Iterable<setDialogTitle> ag$a();

    public abstract byte[] ah$a();

    public static valueOf valueOf() {
        return new valueOf() { // from class: o.onSetInitialValue$ag$a
            private Iterable<setDialogTitle> ag$a;
            private byte[] ah$a;

            @Override // o.provideSummary.valueOf
            public provideSummary.valueOf ah$a(Iterable<setDialogTitle> iterable) {
                Objects.requireNonNull(iterable, "Null events");
                this.ag$a = iterable;
                return this;
            }

            @Override // o.provideSummary.valueOf
            public provideSummary.valueOf ah$a(byte[] bArr) {
                this.ah$a = bArr;
                return this;
            }

            @Override // o.provideSummary.valueOf
            public provideSummary values() {
                String str = "";
                if (this.ag$a == null) {
                    str = " events";
                }
                if (!str.isEmpty()) {
                    throw new IllegalStateException("Missing required properties:" + str);
                }
                return new onSetInitialValue(this.ag$a, this.ah$a);
            }
        };
    }
}
