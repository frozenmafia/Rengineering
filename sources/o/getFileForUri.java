package o;

import o.getFileForUri;
import o.loadFont;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class getFileForUri {
    private final androidx.databinding.ObservableField<String> HaptikSDK$c;
    private final androidx.databinding.ObservableDouble ag$a;
    private final androidx.databinding.ObservableField<String> ah$a;
    private final androidx.databinding.ObservableField<String> ah$b;
    private final androidx.databinding.ObservableDouble toString;
    private final androidx.databinding.ObservableField<String> valueOf = new androidx.databinding.ObservableField<>();
    private final androidx.databinding.ObservableBoolean values = new androidx.databinding.ObservableBoolean();

    public getFileForUri() {
        androidx.databinding.ObservableDouble observableDouble = new androidx.databinding.ObservableDouble();
        this.toString = observableDouble;
        androidx.databinding.ObservableDouble observableDouble2 = new androidx.databinding.ObservableDouble();
        this.ag$a = observableDouble2;
        this.ah$b = new androidx.databinding.ObservableField<>();
        final androidx.databinding.Observable[] observableArr = {observableDouble};
        this.HaptikSDK$c = new androidx.databinding.ObservableField<String>(observableArr) { // from class: com.app.dream11.teamselection.playerinfo.vm.PlayerInfoHeaderVM$readablePlayerPoints$1
            @Override // androidx.databinding.ObservableField
            public String get() {
                String loadfont = loadFont.toString(getFileForUri.this.valueOf().get());
                runAnimators.ah$a(loadfont, "getFormatedAmount(playerPoints.get())");
                return loadfont;
            }
        };
        final androidx.databinding.Observable[] observableArr2 = {observableDouble2};
        this.ah$a = new androidx.databinding.ObservableField<String>(observableArr2) { // from class: com.app.dream11.teamselection.playerinfo.vm.PlayerInfoHeaderVM$readablePlayerCredits$1
            @Override // androidx.databinding.ObservableField
            public String get() {
                return String.valueOf(getFileForUri.this.ah$a().get());
            }
        };
    }

    public final androidx.databinding.ObservableField<String> ag$a() {
        return this.valueOf;
    }

    public final androidx.databinding.ObservableBoolean invoke() {
        return this.values;
    }

    public final androidx.databinding.ObservableDouble valueOf() {
        return this.toString;
    }

    public final androidx.databinding.ObservableDouble ah$a() {
        return this.ag$a;
    }

    public final androidx.databinding.ObservableField<String> HaptikSDK$a() {
        return this.ah$b;
    }

    public final androidx.databinding.ObservableField<String> ah$b() {
        return this.HaptikSDK$c;
    }

    public final androidx.databinding.ObservableField<String> values() {
        return this.ah$a;
    }
}
