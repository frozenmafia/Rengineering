package o;

import java.io.File;
/* loaded from: classes3.dex */
public class updateLayoutParams<DataType> implements y$ah$a {
    private final ViewGroupKt<DataType> ah$a;
    private final setMargins toString;
    private final DataType values;

    public updateLayoutParams(ViewGroupKt<DataType> viewGroupKt, DataType datatype, setMargins setmargins) {
        this.ah$a = viewGroupKt;
        this.values = datatype;
        this.toString = setmargins;
    }

    @Override // o.y$ah$a
    public boolean valueOf(File file) {
        return this.ah$a.ah$a(this.values, file, this.toString);
    }
}
