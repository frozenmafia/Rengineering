package arrow.core.extensions;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.newSession;
import o.receiveFile;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ListKUnzip$unzip$3 extends Lambda implements Styleable.ChangeBounds<List<? extends B>, newSession<? extends B>> {
    public static final ListKUnzip$unzip$3 INSTANCE = new ListKUnzip$unzip$3();

    ListKUnzip$unzip$3() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final newSession<B> invoke(List<? extends B> list) {
        runAnimators.valueOf(list, "it");
        return receiveFile.valueOf(list);
    }
}
