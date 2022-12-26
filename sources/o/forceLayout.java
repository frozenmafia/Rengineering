package o;

import com.app.dream11.model.ErrorModel;
import java.util.List;
/* loaded from: classes3.dex */
public class forceLayout {
    private final String ag$a;
    private ErrorModel ah$a;
    private List<applyConstraintsFromLayoutParams> values;

    public forceLayout(ErrorModel errorModel, List<applyConstraintsFromLayoutParams> list, String str) {
        runAnimators.ag$a(list, "depositSectionList");
        this.ah$a = errorModel;
        this.values = list;
        this.ag$a = str;
    }

    public final List<applyConstraintsFromLayoutParams> valueOf() {
        return this.values;
    }

    public final String values() {
        return this.ag$a;
    }
}
