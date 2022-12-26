package androidx.work;

import androidx.work.OneTimeWorkRequest;
import o.Styleable;
import o.copyViewImage;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class OneTimeWorkRequestKt {
    public static final OneTimeWorkRequest.Builder setInputMerger(OneTimeWorkRequest.Builder builder, copyViewImage<? extends InputMerger> copyviewimage) {
        runAnimators.ag$a(builder, "<this>");
        runAnimators.ag$a(copyviewimage, "inputMerger");
        OneTimeWorkRequest.Builder inputMerger = builder.setInputMerger(Styleable.ChangeTransform.ah$a(copyviewimage));
        runAnimators.ah$a(inputMerger, "setInputMerger(inputMerger.java)");
        return inputMerger;
    }
}
