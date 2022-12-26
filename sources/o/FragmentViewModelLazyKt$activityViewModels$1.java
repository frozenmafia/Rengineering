package o;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.views.text.TextTransform;
/* loaded from: classes4.dex */
public class FragmentViewModelLazyKt$activityViewModels$1 {
    private boolean ag$a = true;
    private float valueOf = Float.NaN;
    private float ah$a = Float.NaN;
    private float values = Float.NaN;
    private float HaptikSDK$b = Float.NaN;
    private float toString = Float.NaN;
    private TextTransform invoke = TextTransform.UNSET;

    public FragmentViewModelLazyKt$activityViewModels$1 valueOf(FragmentViewModelLazyKt$activityViewModels$1 fragmentViewModelLazyKt$activityViewModels$1) {
        float f;
        float f2;
        FragmentViewModelLazyKt$activityViewModels$1 fragmentViewModelLazyKt$activityViewModels$12 = new FragmentViewModelLazyKt$activityViewModels$1();
        fragmentViewModelLazyKt$activityViewModels$12.ag$a = this.ag$a;
        fragmentViewModelLazyKt$activityViewModels$12.valueOf = !Float.isNaN(fragmentViewModelLazyKt$activityViewModels$1.valueOf) ? fragmentViewModelLazyKt$activityViewModels$1.valueOf : this.valueOf;
        fragmentViewModelLazyKt$activityViewModels$12.ah$a = !Float.isNaN(fragmentViewModelLazyKt$activityViewModels$1.ah$a) ? fragmentViewModelLazyKt$activityViewModels$1.ah$a : this.ah$a;
        fragmentViewModelLazyKt$activityViewModels$12.values = !Float.isNaN(fragmentViewModelLazyKt$activityViewModels$1.values) ? fragmentViewModelLazyKt$activityViewModels$1.values : this.values;
        if (!Float.isNaN(fragmentViewModelLazyKt$activityViewModels$1.HaptikSDK$b)) {
            f = fragmentViewModelLazyKt$activityViewModels$1.HaptikSDK$b;
        } else {
            f = this.HaptikSDK$b;
        }
        fragmentViewModelLazyKt$activityViewModels$12.HaptikSDK$b = f;
        if (!Float.isNaN(fragmentViewModelLazyKt$activityViewModels$1.toString)) {
            f2 = fragmentViewModelLazyKt$activityViewModels$1.toString;
        } else {
            f2 = this.toString;
        }
        fragmentViewModelLazyKt$activityViewModels$12.toString = f2;
        fragmentViewModelLazyKt$activityViewModels$12.invoke = fragmentViewModelLazyKt$activityViewModels$1.invoke != TextTransform.UNSET ? fragmentViewModelLazyKt$activityViewModels$1.invoke : this.invoke;
        return fragmentViewModelLazyKt$activityViewModels$12;
    }

    public boolean values() {
        return this.ag$a;
    }

    public void valueOf(boolean z) {
        this.ag$a = z;
    }

    public float HaptikSDK$c() {
        return this.valueOf;
    }

    public void valueOf(float f) {
        this.valueOf = f;
    }

    public float HaptikSDK$a() {
        return this.ah$a;
    }

    public void ag$a(float f) {
        this.ah$a = f;
    }

    public float HaptikSDK$b() {
        return this.values;
    }

    public void ah$a(float f) {
        this.values = f;
    }

    public float getInitSettings() {
        return this.HaptikSDK$b;
    }

    public void values(float f) {
        if (f != 0.0f && f < 1.0f) {
            throw new JSApplicationIllegalArgumentException("maxFontSizeMultiplier must be NaN, 0, or >= 1");
        }
        this.HaptikSDK$b = f;
    }

    public float ah$b() {
        return this.toString;
    }

    public void toString(float f) {
        this.toString = f;
    }

    public TextTransform HaptikSDK$e() {
        return this.invoke;
    }

    public void values(TextTransform textTransform) {
        this.invoke = textTransform;
    }

    public int ag$a() {
        double ceil;
        float f = !Float.isNaN(this.valueOf) ? this.valueOf : 14.0f;
        if (this.ag$a) {
            ceil = Math.ceil(PixelUtil.toPixelFromSP(f, invoke()));
        } else {
            ceil = Math.ceil(PixelUtil.toPixelFromDIP(f));
        }
        return (int) ceil;
    }

    public float ah$a() {
        float pixelFromDIP;
        if (Float.isNaN(this.ah$a)) {
            return Float.NaN;
        }
        if (this.ag$a) {
            pixelFromDIP = PixelUtil.toPixelFromSP(this.ah$a, invoke());
        } else {
            pixelFromDIP = PixelUtil.toPixelFromDIP(this.ah$a);
        }
        return !Float.isNaN(this.toString) && (this.toString > pixelFromDIP ? 1 : (this.toString == pixelFromDIP ? 0 : -1)) > 0 ? this.toString : pixelFromDIP;
    }

    public float valueOf() {
        float pixelFromDIP;
        if (Float.isNaN(this.values)) {
            return Float.NaN;
        }
        if (this.ag$a) {
            pixelFromDIP = PixelUtil.toPixelFromSP(this.values, invoke());
        } else {
            pixelFromDIP = PixelUtil.toPixelFromDIP(this.values);
        }
        return pixelFromDIP / ag$a();
    }

    public float invoke() {
        if (Float.isNaN(this.HaptikSDK$b)) {
            return 0.0f;
        }
        return this.HaptikSDK$b;
    }

    public String toString() {
        return "TextAttributes {\n  getAllowFontScaling(): " + values() + "\n  getFontSize(): " + HaptikSDK$c() + "\n  getEffectiveFontSize(): " + ag$a() + "\n  getHeightOfTallestInlineViewOrImage(): " + ah$b() + "\n  getLetterSpacing(): " + HaptikSDK$b() + "\n  getEffectiveLetterSpacing(): " + valueOf() + "\n  getLineHeight(): " + HaptikSDK$a() + "\n  getEffectiveLineHeight(): " + ah$a() + "\n  getTextTransform(): " + HaptikSDK$e() + "\n  getMaxFontSizeMultiplier(): " + getInitSettings() + "\n  getEffectiveMaxFontSizeMultiplier(): " + invoke() + "\n}";
    }
}
