package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class setUpdatesContinuously extends setDefaultValues$ag$a {
    private byte ah$a;
    private int valueOf;
    private boolean values;

    @Override // o.setDefaultValues$ag$a
    public final setDefaultValues ag$a() {
        if (this.ah$a != 3) {
            StringBuilder sb = new StringBuilder();
            if ((this.ah$a & 1) == 0) {
                sb.append(" appUpdateType");
            }
            if ((this.ah$a & 2) == 0) {
                sb.append(" allowAssetPackDeletion");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new setMin(this.valueOf, this.values, null);
    }

    @Override // o.setDefaultValues$ag$a
    public final setDefaultValues$ag$a toString(boolean z) {
        this.values = z;
        this.ah$a = (byte) (this.ah$a | 2);
        return this;
    }

    public final setDefaultValues$ag$a values(int i) {
        this.valueOf = i;
        this.ah$a = (byte) (this.ah$a | 1);
        return this;
    }
}
