package o;

import o.AppCompatActivity;
/* loaded from: classes.dex */
public final class supportShouldUpRecreateTask {
    private androidx.databinding.ObservableField<String> HaptikSDK$a;
    private final enableHomeButtonByDefault HaptikSDK$b;
    private androidx.databinding.ObservableField<String> ag$a;
    private androidx.databinding.ObservableField<Boolean> ah$a;
    private final AppCompatActivity.AnonymousClass1 ah$b;
    private androidx.databinding.ObservableField<String> toString;
    private androidx.databinding.ObservableField<String> valueOf;
    private androidx.databinding.ObservableField<String> values;

    public supportShouldUpRecreateTask(enableHomeButtonByDefault enablehomebuttonbydefault, AppCompatActivity.AnonymousClass1 anonymousClass1) {
        runAnimators.ag$a(enablehomebuttonbydefault, "resourceProvider");
        runAnimators.ag$a(anonymousClass1, "payIfYouWinHandler");
        this.HaptikSDK$b = enablehomebuttonbydefault;
        this.ah$b = anonymousClass1;
        this.values = new androidx.databinding.ObservableField<>();
        this.valueOf = new androidx.databinding.ObservableField<>();
        this.ag$a = new androidx.databinding.ObservableField<>();
        this.HaptikSDK$a = new androidx.databinding.ObservableField<>();
        this.ah$a = new androidx.databinding.ObservableField<>(false);
        this.toString = new androidx.databinding.ObservableField<>();
    }

    public final AppCompatActivity.AnonymousClass1 HaptikSDK$c() {
        return this.ah$b;
    }

    public final androidx.databinding.ObservableField<String> ah$a() {
        return this.values;
    }

    public final androidx.databinding.ObservableField<String> values() {
        return this.valueOf;
    }

    public final androidx.databinding.ObservableField<String> ag$a() {
        return this.ag$a;
    }

    public final androidx.databinding.ObservableField<String> invoke() {
        return this.HaptikSDK$a;
    }

    public final androidx.databinding.ObservableField<Boolean> ah$b() {
        return this.ah$a;
    }

    public final androidx.databinding.ObservableField<String> valueOf() {
        return this.toString;
    }
}
