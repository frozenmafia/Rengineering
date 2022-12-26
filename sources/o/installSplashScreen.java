package o;
/* loaded from: classes3.dex */
public final class installSplashScreen implements install {
    private boolean ag$a;
    private long ah$a;
    private typeToString toString = typeToString.ah$a;
    private final hasEnrolledFingerprints valueOf;
    private long values;

    public installSplashScreen(hasEnrolledFingerprints hasenrolledfingerprints) {
        this.valueOf = hasenrolledfingerprints;
    }

    public void ah$a() {
        if (this.ag$a) {
            return;
        }
        this.ah$a = this.valueOf.valueOf();
        this.ag$a = true;
    }

    public void values() {
        if (this.ag$a) {
            toString(valueOf());
            this.ag$a = false;
        }
    }

    public void toString(long j) {
        this.values = j;
        if (this.ag$a) {
            this.ah$a = this.valueOf.valueOf();
        }
    }

    @Override // o.install
    public long valueOf() {
        long values;
        long j = this.values;
        if (this.ag$a) {
            long valueOf = this.valueOf.valueOf() - this.ah$a;
            if (this.toString.values == 1.0f) {
                values = getElevationDegrees.ah$a(valueOf);
            } else {
                values = this.toString.values(valueOf);
            }
            return j + values;
        }
        return j;
    }

    @Override // o.install
    public void ah$a(typeToString typetostring) {
        if (this.ag$a) {
            toString(valueOf());
        }
        this.toString = typetostring;
    }

    @Override // o.install
    public typeToString ag$a() {
        return this.toString;
    }
}
