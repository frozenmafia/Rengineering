package kotlin.io;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes7.dex */
public final class FilesKt__UtilsKt$copyRecursively$2 extends Lambda implements Transition<File, IOException, setAnimationMatrix> {
    final /* synthetic */ Transition<File, IOException, OnErrorAction> $onError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FilesKt__UtilsKt$copyRecursively$2(Transition<? super File, ? super IOException, ? extends OnErrorAction> transition) {
        super(2);
        this.$onError = transition;
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(File file, IOException iOException) {
        invoke2(file, iOException);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(File file, IOException iOException) {
        runAnimators.ag$a(file, "f");
        runAnimators.ag$a(iOException, "e");
        if (this.$onError.invoke(file, iOException) == OnErrorAction.TERMINATE) {
            throw new TerminateException(file);
        }
    }
}
