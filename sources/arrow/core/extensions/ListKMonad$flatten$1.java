package arrow.core.extensions;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.newSession;
import o.receiveFile;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ListKMonad$flatten$1 extends Lambda implements Styleable.ChangeBounds<List<? extends A>, newSession<? extends A>> {
    public static final ListKMonad$flatten$1 INSTANCE = new ListKMonad$flatten$1();

    ListKMonad$flatten$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final newSession<A> invoke(List<? extends A> list) {
        runAnimators.valueOf(list, "it");
        return receiveFile.valueOf(list);
    }
}
