package o;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class setLogo {
    public static final setLogo ah$a = new setLogo();

    private setLogo() {
    }

    public final CharSequence values(String str, double d, int i, boolean z, enableHomeButtonByDefault enablehomebuttonbydefault, double d2) {
        String valueOf;
        runAnimators.ag$a(enablehomebuttonbydefault, "resourceProvider");
        Object loadfont = loadFont.toString(d);
        String loadfont2 = loadFont.toString(d2);
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            runAnimators.ah$a(loadfont, "discountedAmountString");
            runAnimators.ah$a(loadfont2, "formattedEntryFee");
            valueOf = enablehomebuttonbydefault.valueOf(com.app.dream11Pro.R.string.res_0x7f120c83, loadfont, loadfont2);
        } else {
            runAnimators.ah$a(loadfont, "discountedAmountString");
            runAnimators.ah$a(loadfont2, "formattedEntryFee");
            valueOf = enablehomebuttonbydefault.valueOf(com.app.dream11Pro.R.string.res_0x7f120c84, loadfont, loadfont2, str);
        }
        ArrayList arrayList = new ArrayList();
        String str3 = valueOf;
        arrayList.add(new getStackedTabMaxWidth(str3, loadfont2, null, Integer.valueOf(z ? com.app.dream11Pro.R.string.res_0x7f12000c : com.app.dream11Pro.R.string.res_0x7f12000e), Integer.valueOf(i), false, true));
        return enablehomebuttonbydefault.values(str3, arrayList);
    }
}
