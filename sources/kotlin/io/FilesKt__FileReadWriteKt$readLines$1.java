package kotlin.io;

import java.util.ArrayList;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes7.dex */
public final class FilesKt__FileReadWriteKt$readLines$1 extends Lambda implements Styleable.ChangeBounds<String, setAnimationMatrix> {
    final /* synthetic */ ArrayList<String> $result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FilesKt__FileReadWriteKt$readLines$1(ArrayList<String> arrayList) {
        super(1);
        this.$result = arrayList;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(String str) {
        invoke2(str);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        runAnimators.ag$a(str, "it");
        this.$result.add(str);
    }
}
