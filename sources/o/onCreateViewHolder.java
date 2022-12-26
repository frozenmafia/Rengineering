package o;
/* loaded from: classes7.dex */
public final class onCreateViewHolder extends isGroupExpandable {
    private final float valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.isGroupExpandable
    public boolean HaptikSDK$c() {
        return true;
    }

    public onCreateViewHolder(float f) {
        this.valueOf = f - 0.001f;
    }

    @Override // o.isGroupExpandable
    public void ag$a(float f, float f2, float f3, areContentsTheSame arecontentsthesame) {
        float sqrt = (float) ((this.valueOf * Math.sqrt(2.0d)) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(this.valueOf, 2.0d) - Math.pow(sqrt, 2.0d));
        arecontentsthesame.ah$a(f2 - sqrt, ((float) (-((this.valueOf * Math.sqrt(2.0d)) - this.valueOf))) + sqrt2);
        arecontentsthesame.toString(f2, (float) (-((this.valueOf * Math.sqrt(2.0d)) - this.valueOf)));
        arecontentsthesame.toString(f2 + sqrt, ((float) (-((this.valueOf * Math.sqrt(2.0d)) - this.valueOf))) + sqrt2);
    }
}
