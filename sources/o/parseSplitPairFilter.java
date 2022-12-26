package o;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
public class parseSplitPairFilter extends DisplayFeature {
    private DisplayFeature values;

    public final DisplayFeature values() {
        return this.values;
    }

    public parseSplitPairFilter(DisplayFeature displayFeature) {
        runAnimators.ag$a(displayFeature, "delegate");
        this.values = displayFeature;
    }

    public final parseSplitPairFilter toString(DisplayFeature displayFeature) {
        runAnimators.ag$a(displayFeature, "delegate");
        this.values = displayFeature;
        return this;
    }

    @Override // o.DisplayFeature
    public DisplayFeature ag$a(long j, TimeUnit timeUnit) {
        runAnimators.ag$a(timeUnit, "unit");
        return this.values.ag$a(j, timeUnit);
    }

    @Override // o.DisplayFeature
    public long F_() {
        return this.values.F_();
    }

    @Override // o.DisplayFeature
    public boolean ah$b() {
        return this.values.ah$b();
    }

    @Override // o.DisplayFeature
    public long G_() {
        return this.values.G_();
    }

    @Override // o.DisplayFeature
    public DisplayFeature ah$a(long j) {
        return this.values.ah$a(j);
    }

    @Override // o.DisplayFeature
    public DisplayFeature D_() {
        return this.values.D_();
    }

    @Override // o.DisplayFeature
    public DisplayFeature C_() {
        return this.values.C_();
    }

    @Override // o.DisplayFeature
    public void E_() throws IOException {
        this.values.E_();
    }
}
