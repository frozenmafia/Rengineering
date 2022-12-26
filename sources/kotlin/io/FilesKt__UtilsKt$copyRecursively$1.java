package kotlin.io;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.runAnimators;
/* loaded from: classes7.dex */
public final class FilesKt__UtilsKt$copyRecursively$1 extends Lambda implements Transition {
    public static final FilesKt__UtilsKt$copyRecursively$1 INSTANCE = new FilesKt__UtilsKt$copyRecursively$1();

    FilesKt__UtilsKt$copyRecursively$1() {
        super(2);
    }

    @Override // o.Transition
    public final Void invoke(File file, IOException iOException) {
        runAnimators.ag$a(file, "<anonymous parameter 0>");
        runAnimators.ag$a(iOException, "exception");
        throw iOException;
    }
}
