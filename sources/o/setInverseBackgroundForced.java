package o;

import com.app.dream11.contest.FomoData;
/* loaded from: classes.dex */
public final class setInverseBackgroundForced {
    private final String HaptikSDK$b;
    private final double ag$a;
    private final FomoData ah$a;
    private final int ah$b;
    private final double invoke;
    private final enableHomeButtonByDefault toString;
    private final int valueOf;
    private final String values;

    public setInverseBackgroundForced(enableHomeButtonByDefault enablehomebuttonbydefault, FomoData fomoData) {
        runAnimators.ag$a(enablehomebuttonbydefault, "resourceProvider");
        runAnimators.ag$a(fomoData, "fomoData");
        this.toString = enablehomebuttonbydefault;
        this.ah$a = fomoData;
        this.invoke = fomoData.getWiningAmount();
        this.values = fomoData.getProfileUrl();
        this.HaptikSDK$b = fomoData.getTeamName();
        this.ah$b = fomoData.getTeamId();
        this.ag$a = fomoData.getPoints();
        this.valueOf = fomoData.getRank();
    }

    public final FomoData values() {
        return this.ah$a;
    }

    public final String ah$a() {
        enableHomeButtonByDefault enablehomebuttonbydefault = this.toString;
        String loadfont = loadFont.toString(this.invoke);
        runAnimators.ah$a(loadfont, "getFormatedAmount(winingAmount)");
        return enablehomebuttonbydefault.valueOf(com.app.dream11Pro.R.string.res_0x7f12051c, loadfont);
    }

    public final String ah$b() {
        return this.toString.valueOf(com.app.dream11Pro.R.string.res_0x7f12051d, new Object[0]);
    }

    public final String invoke() {
        return this.HaptikSDK$b;
    }

    public final String HaptikSDK$b() {
        double d = this.invoke;
        if (d > 0.0d) {
            enableHomeButtonByDefault enablehomebuttonbydefault = this.toString;
            String loadfont = loadFont.toString(d);
            runAnimators.ah$a(loadfont, "getFormatedAmount(winingAmount)");
            return enablehomebuttonbydefault.valueOf(com.app.dream11Pro.R.string.res_0x7f120e52, loadfont);
        }
        return this.toString.valueOf(com.app.dream11Pro.R.string.res_0x7f120e35, new Object[0]);
    }

    public final String valueOf() {
        return this.values;
    }

    public final String ag$a() {
        String loadfont = loadFont.toString(this.ag$a);
        runAnimators.ah$a(loadfont, "getFormatedAmount(points)");
        return loadfont;
    }

    public final String HaptikSDK$c() {
        String ag$a = loadFont.ag$a(this.valueOf);
        runAnimators.ah$a(ag$a, "getFormatedAmount(rank)");
        return ag$a;
    }

    public final String HaptikSDK$a() {
        return this.toString.valueOf(com.app.dream11Pro.R.string.res_0x7f120c90, Integer.valueOf(this.ah$b));
    }
}
