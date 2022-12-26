package o;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.request.Postprocessor;
import java.util.LinkedList;
import java.util.List;
import o.FragmentActivity;
/* loaded from: classes4.dex */
public class addTargets implements Postprocessor {
    private final List<Postprocessor> ag$a;

    public static Postprocessor ag$a(List<Postprocessor> list) {
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            return new addTargets(list);
        }
        return null;
    }

    private addTargets(List<Postprocessor> list) {
        this.ag$a = new LinkedList(list);
    }

    @Override // com.facebook.imagepipeline.request.Postprocessor
    public String getName() {
        StringBuilder sb = new StringBuilder();
        for (Postprocessor postprocessor : this.ag$a) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(postprocessor.getName());
        }
        sb.insert(0, "MultiPostProcessor (");
        sb.append(")");
        return sb.toString();
    }

    @Override // com.facebook.imagepipeline.request.Postprocessor
    public requireActivity getPostprocessorCacheKey() {
        LinkedList linkedList = new LinkedList();
        for (Postprocessor postprocessor : this.ag$a) {
            linkedList.push(postprocessor.getPostprocessorCacheKey());
        }
        return new requireFragmentManager(linkedList);
    }

    @Override // com.facebook.imagepipeline.request.Postprocessor
    public FragmentActivity.AnonymousClass1<Bitmap> process(Bitmap bitmap, PlatformBitmapFactory platformBitmapFactory) {
        FragmentActivity.AnonymousClass1<Bitmap> anonymousClass1 = null;
        try {
            FragmentActivity.AnonymousClass1<Bitmap> anonymousClass12 = null;
            for (Postprocessor postprocessor : this.ag$a) {
                anonymousClass1 = postprocessor.process(anonymousClass12 != null ? anonymousClass12.HaptikSDK$c() : bitmap, platformBitmapFactory);
                FragmentActivity.AnonymousClass1.valueOf(anonymousClass12);
                anonymousClass12 = anonymousClass1.clone();
            }
            return anonymousClass1.clone();
        } finally {
            FragmentActivity.AnonymousClass1.valueOf(anonymousClass1);
        }
    }
}
