package arrow.core.extensions;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.newSession;
import o.receiveFile;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ListKUnzip$unzip$2 extends Lambda implements Styleable.ChangeBounds<List<? extends A>, newSession<? extends A>> {
    public static final ListKUnzip$unzip$2 INSTANCE = new ListKUnzip$unzip$2();

    ListKUnzip$unzip$2() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final newSession<A> invoke(List<? extends A> list) {
        runAnimators.valueOf(list, "it");
        return receiveFile.valueOf(list);
    }
}
