package o;

import com.app.dream11.newmycontests.model.CardVm;
import java.util.ArrayList;
/* loaded from: classes3.dex */
public final class resetSolverVariables {
    private int ah$a = -1;
    private final androidx.databinding.ObservableField<String> valueOf = new androidx.databinding.ObservableField<>("");
    private ArrayList<optimizeFor> ag$a = new ArrayList<>();
    private androidx.databinding.ObservableField<Boolean> toString = new androidx.databinding.ObservableField<>(false);
    private final androidx.databinding.ObservableArrayList<CardVm> values = new androidx.databinding.ObservableArrayList<>();

    public final void ag$a(int i) {
        this.ah$a = i;
    }

    public final int valueOf() {
        return this.ah$a;
    }

    public final androidx.databinding.ObservableField<String> invoke() {
        return this.valueOf;
    }

    public final ArrayList<optimizeFor> values() {
        return this.ag$a;
    }

    public final androidx.databinding.ObservableField<Boolean> HaptikSDK$a() {
        return this.toString;
    }

    public final androidx.databinding.ObservableArrayList<CardVm> ag$a() {
        return this.values;
    }

    public final void ah$a() {
        this.ah$a = -1;
        this.valueOf.set("");
        this.ag$a.clear();
        this.toString.set(false);
        this.values.clear();
    }
}
