package o;

import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.core.ImagePipelineFactory;
import java.util.List;
/* loaded from: classes4.dex */
public class replaceTargets {
    public static replaceTargets$ag$a toString(int i, int i2, List<mergeTransitionsInSequence> list) {
        return ah$a(i, i2, list, 1.0d);
    }

    public static replaceTargets$ag$a ah$a(int i, int i2, List<mergeTransitionsInSequence> list, double d) {
        if (list.isEmpty()) {
            return new replaceTargets$ag$a(null, null);
        }
        if (list.size() == 1) {
            return new replaceTargets$ag$a(list.get(0), null);
        }
        if (i <= 0 || i2 <= 0) {
            return new replaceTargets$ag$a(null, null);
        }
        ImagePipeline imagePipeline = ImagePipelineFactory.getInstance().getImagePipeline();
        double d2 = i * i2;
        double d3 = Double.MAX_VALUE;
        mergeTransitionsInSequence mergetransitionsinsequence = null;
        mergeTransitionsInSequence mergetransitionsinsequence2 = null;
        double d4 = Double.MAX_VALUE;
        for (mergeTransitionsInSequence mergetransitionsinsequence3 : list) {
            double abs = Math.abs(1.0d - (mergetransitionsinsequence3.HaptikSDK$c() / (d2 * d)));
            if (abs < d3) {
                mergetransitionsinsequence2 = mergetransitionsinsequence3;
                d3 = abs;
            }
            if (abs < d4 && (imagePipeline.isInBitmapMemoryCache(mergetransitionsinsequence3.ah$a()) || imagePipeline.isInDiskCacheSync(mergetransitionsinsequence3.ah$a()))) {
                mergetransitionsinsequence = mergetransitionsinsequence3;
                d4 = abs;
            }
        }
        if (mergetransitionsinsequence != null && mergetransitionsinsequence2 != null && mergetransitionsinsequence.getInitSettings().equals(mergetransitionsinsequence2.getInitSettings())) {
            mergetransitionsinsequence = null;
        }
        return new replaceTargets$ag$a(mergetransitionsinsequence2, mergetransitionsinsequence);
    }
}
