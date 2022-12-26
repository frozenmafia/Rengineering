package o;

import java.util.Objects;
import o.tryGetViewHolderForPositionByDeadline;
/* loaded from: classes5.dex */
public abstract class tryGetViewHolderForPositionByDeadline {

    /* loaded from: classes7.dex */
    public static abstract class valueOf {
        public abstract valueOf ag$a(long j);

        public abstract valueOf ag$a(String str);

        public abstract valueOf valueOf(long j);

        public abstract tryGetViewHolderForPositionByDeadline values();
    }

    public abstract String ah$a();

    public abstract long valueOf();

    public abstract long values();

    public static valueOf ag$a() {
        return new valueOf() { // from class: o.getViewForPosition$ah$a
            private Long ah$a;
            private String toString;
            private Long valueOf;

            @Override // o.tryGetViewHolderForPositionByDeadline.valueOf
            public tryGetViewHolderForPositionByDeadline.valueOf ag$a(String str) {
                Objects.requireNonNull(str, "Null token");
                this.toString = str;
                return this;
            }

            @Override // o.tryGetViewHolderForPositionByDeadline.valueOf
            public tryGetViewHolderForPositionByDeadline.valueOf valueOf(long j) {
                this.valueOf = Long.valueOf(j);
                return this;
            }

            @Override // o.tryGetViewHolderForPositionByDeadline.valueOf
            public tryGetViewHolderForPositionByDeadline.valueOf ag$a(long j) {
                this.ah$a = Long.valueOf(j);
                return this;
            }

            @Override // o.tryGetViewHolderForPositionByDeadline.valueOf
            public tryGetViewHolderForPositionByDeadline values() {
                String str = "";
                if (this.toString == null) {
                    str = " token";
                }
                if (this.valueOf == null) {
                    str = str + " tokenExpirationTimestamp";
                }
                if (this.ah$a == null) {
                    str = str + " tokenCreationTimestamp";
                }
                if (!str.isEmpty()) {
                    throw new IllegalStateException("Missing required properties:" + str);
                }
                return new getViewForPosition(this.toString, this.valueOf.longValue(), this.ah$a.longValue());
            }
        };
    }
}
