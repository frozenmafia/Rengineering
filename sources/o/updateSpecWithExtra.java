package o;
/* loaded from: classes5.dex */
public class updateSpecWithExtra implements findFirstReferenceChildPosition {
    private final int ah$a;
    private final createFullSpanItemFromStart toString;
    private final long valueOf;

    private updateSpecWithExtra(long j, int i, createFullSpanItemFromStart createfullspanitemfromstart) {
        this.valueOf = j;
        this.ah$a = i;
        this.toString = createfullspanitemfromstart;
    }

    @Override // o.findFirstReferenceChildPosition
    public int ah$a() {
        return this.ah$a;
    }

    /* loaded from: classes5.dex */
    public static class toString {
        private long ah$a;
        private createFullSpanItemFromStart valueOf;
        private int values;

        private toString() {
        }

        public toString toString(long j) {
            this.ah$a = j;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public toString toString(int i) {
            this.values = i;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public toString ag$a(createFullSpanItemFromStart createfullspanitemfromstart) {
            this.valueOf = createfullspanitemfromstart;
            return this;
        }

        public updateSpecWithExtra ag$a() {
            return new updateSpecWithExtra(this.ah$a, this.values, this.valueOf);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static toString values() {
        return new toString();
    }
}
