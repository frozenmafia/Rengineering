package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import o.setFragmentResult;
/* loaded from: classes4.dex */
public class FragmentLifecycleCallbacksDispatcher {

    /* loaded from: classes.dex */
    public class FragmentLifecycleCallbacksHolder {
        public static <T> T valueOf(T t) {
            return t;
        }

        public static <T> T ag$a(T t, String str) {
            if (t != null) {
                return t;
            }
            throw new AssertionError(str);
        }

        public static <T> T ag$a(T t) {
            if (t != null) {
                return t;
            }
            throw new AssertionError();
        }

        public static void ag$a(boolean z) {
            if (!z) {
                throw new AssertionError();
            }
        }

        public static void ah$a(boolean z, String str) {
            if (!z) {
                throw new AssertionError(str);
            }
        }

        public static AssertionError ah$a() {
            throw new AssertionError();
        }
    }

    public static FragmentLayoutInflaterFactory valueOf(Context context, AttributeSet attributeSet) {
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("GenericDraweeHierarchyBuilder#inflateBuilder");
        }
        FragmentLayoutInflaterFactory valueOf = valueOf(new FragmentLayoutInflaterFactory(context.getResources()), context, attributeSet);
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.endSection();
        }
        return valueOf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:281:0x01cd, code lost:
        if (r14 != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x01d3, code lost:
        if (r9 == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x01d5, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x01e8, code lost:
        if (r15 != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x01ea, code lost:
        r4 = true;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static o.FragmentLayoutInflaterFactory valueOf(o.FragmentLayoutInflaterFactory r17, android.content.Context r18, android.util.AttributeSet r19) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.FragmentLifecycleCallbacksDispatcher.valueOf(o.FragmentLayoutInflaterFactory, android.content.Context, android.util.AttributeSet):o.FragmentLayoutInflaterFactory");
    }

    private static RoundingParams toString(FragmentLayoutInflaterFactory fragmentLayoutInflaterFactory) {
        if (fragmentLayoutInflaterFactory.onXdkEvent() == null) {
            fragmentLayoutInflaterFactory.ah$a(new RoundingParams());
        }
        return fragmentLayoutInflaterFactory.onXdkEvent();
    }

    private static Drawable toString(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        return context.getResources().getDrawable(resourceId);
    }

    private static setFragmentResult.valueOf ah$a(TypedArray typedArray, int i) {
        switch (typedArray.getInt(i, -2)) {
            case -1:
                return null;
            case 0:
                return setFragmentResult.valueOf.HaptikSDK$a;
            case 1:
                return setFragmentResult.valueOf.ah$b;
            case 2:
                return setFragmentResult.valueOf.values;
            case 3:
                return setFragmentResult.valueOf.HaptikSDK$c;
            case 4:
                return setFragmentResult.valueOf.ag$a;
            case 5:
                return setFragmentResult.valueOf.ah$a;
            case 6:
                return setFragmentResult.valueOf.toString;
            case 7:
                return setFragmentResult.valueOf.HaptikSDK$e;
            case 8:
                return setFragmentResult.valueOf.valueOf;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }
}
