package o;
/* loaded from: classes7.dex */
public class onSearch {
    public static final onSearch$ah$a onRelationshipValidationResult = new onSearch$ah$a() { // from class: o.onSearch.2
        @Override // o.onSearch$ah$a, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return f;
        }
    };
    public static final onSearch$ah$a a = new onSearch$ah$a() { // from class: o.onSearch.12
        @Override // o.onSearch$ah$a, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return f * f;
        }
    };
    public static final onSearch$ah$a extraCallback = new onSearch$ah$a() { // from class: o.onSearch.23
        @Override // o.onSearch$ah$a, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (-f) * (f - 2.0f);
        }
    };
    public static final onSearch$ah$a HaptikSDK$d = new onSearch$ah$a() { // from class: o.onSearch.25
        @Override // o.onSearch$ah$a, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f * 2.0f;
            if (f2 < 1.0f) {
                return 0.5f * f2 * f2;
            }
            float f3 = f2 - 1.0f;
            return ((f3 * (f3 - 2.0f)) - 1.0f) * (-0.5f);
        }
    };
    public static final onSearch$ah$a ah$a = new onSearch$ah$a() { // from class: o.onSearch.22
        @Override // o.onSearch$ah$a, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (float) Math.pow(f, 3.0d);
        }
    };
    public static final onSearch$ah$a ICustomTabsCallback = new onSearch$ah$a() { // from class: o.onSearch.21
        @Override // o.onSearch$ah$a, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return ((float) Math.pow(f - 1.0f, 3.0d)) + 1.0f;
        }
    };
    public static final onSearch$ah$a HaptikSDK$a = new onSearch$ah$a() { // from class: o.onSearch.30
        @Override // o.onSearch$ah$a, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float pow;
            float f2 = f * 2.0f;
            if (f2 < 1.0f) {
                pow = (float) Math.pow(f2, 3.0d);
            } else {
                pow = ((float) Math.pow(f2 - 2.0f, 3.0d)) + 2.0f;
            }
            return pow * 0.5f;
        }
    };
    public static final onSearch$ah$a ak = new onSearch$ah$a() { // from class: o.onSearch.26
        @Override // o.onSearch$ah$a, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (float) Math.pow(f, 4.0d);
        }
    };
    public static final onSearch$ah$a ICustomTabsCallback$Default = new onSearch$ah$a() { // from class: o.onSearch.27
        @Override // o.onSearch$ah$a, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return -(((float) Math.pow(f - 1.0f, 4.0d)) - 1.0f);
        }
    };
    public static final onSearch$ah$a getInitSettings = new onSearch$ah$a() { // from class: o.onSearch.5
        @Override // o.onSearch$ah$a, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float pow;
            float f2;
            float f3 = f * 2.0f;
            if (f3 < 1.0f) {
                pow = (float) Math.pow(f3, 4.0d);
                f2 = 0.5f;
            } else {
                pow = ((float) Math.pow(f3 - 2.0f, 4.0d)) - 2.0f;
                f2 = -0.5f;
            }
            return pow * f2;
        }
    };
    public static final onSearch$ah$a onXdkEvent = new onSearch$ah$a() { // from class: o.onSearch.4
        @Override // o.onSearch$ah$a, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (-((float) Math.cos(f * 1.5707963267948966d))) + 1.0f;
        }
    };
    public static final onSearch$ah$a onMessageChannelReady = new onSearch$ah$a() { // from class: o.onSearch.3
        @Override // o.onSearch$ah$a, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (float) Math.sin(f * 1.5707963267948966d);
        }
    };
    public static final onSearch$ah$a HaptikWebView = new onSearch$ah$a() { // from class: o.onSearch.1
        @Override // o.onSearch$ah$a, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (((float) Math.cos(f * 3.141592653589793d)) - 1.0f) * (-0.5f);
        }
    };
    public static final onSearch$ah$a invoke = new onSearch$ah$a() { // from class: o.onSearch.10
        @Override // o.onSearch$ah$a, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            if (f == 0.0f) {
                return 0.0f;
            }
            return (float) Math.pow(2.0d, (f - 1.0f) * 10.0f);
        }
    };
    public static final onSearch$ah$a ak$b = new onSearch$ah$a() { // from class: o.onSearch.7
        @Override // o.onSearch$ah$a, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            if (f == 1.0f) {
                return 1.0f;
            }
            return -((float) Math.pow(2.0d, (f + 1.0f) * (-10.0f)));
        }
    };
    public static final onSearch$ah$a HaptikSDK$e = new onSearch$ah$a() { // from class: o.onSearch.9
        @Override // o.onSearch$ah$a, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2;
            if (f == 0.0f) {
                return 0.0f;
            }
            if (f == 1.0f) {
                return 1.0f;
            }
            float f3 = f * 2.0f;
            if (f3 < 1.0f) {
                f2 = (float) Math.pow(2.0d, (f3 - 1.0f) * 10.0f);
            } else {
                f2 = (-((float) Math.pow(2.0d, (f3 - 1.0f) * (-10.0f)))) + 2.0f;
            }
            return f2 * 0.5f;
        }
    };
    public static final onSearch$ah$a values = new onSearch$ah$a() { // from class: o.onSearch.6
        @Override // o.onSearch$ah$a, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return -(((float) Math.sqrt(1.0f - (f * f))) - 1.0f);
        }
    };
    public static final onSearch$ah$a ak$a = new onSearch$ah$a() { // from class: o.onSearch.8
        @Override // o.onSearch$ah$a, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (float) Math.sqrt(1.0f - (f2 * f2));
        }
    };
    public static final onSearch$ah$a HaptikSDK$b = new onSearch$ah$a() { // from class: o.onSearch.13
        @Override // o.onSearch$ah$a, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float sqrt;
            float f2;
            float f3 = f * 2.0f;
            if (f3 < 1.0f) {
                sqrt = ((float) Math.sqrt(1.0f - (f3 * f3))) - 1.0f;
                f2 = -0.5f;
            } else {
                float f4 = f3 - 2.0f;
                sqrt = ((float) Math.sqrt(1.0f - (f4 * f4))) + 1.0f;
                f2 = 0.5f;
            }
            return sqrt * f2;
        }
    };
    public static final onSearch$ah$a toString = new onSearch$ah$a() { // from class: o.onSearch.15
        @Override // o.onSearch$ah$a, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            if (f == 0.0f) {
                return 0.0f;
            }
            if (f == 1.0f) {
                return 1.0f;
            }
            float f2 = f - 1.0f;
            return -(((float) Math.pow(2.0d, 10.0f * f2)) * ((float) Math.sin(((f2 - (((float) Math.asin(1.0d)) * 0.047746483f)) * 6.2831855f) / 0.3f)));
        }
    };
    public static final onSearch$ah$a extraCallbackWithResult = new onSearch$ah$a() { // from class: o.onSearch.14
        @Override // o.onSearch$ah$a, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            if (f == 0.0f) {
                return 0.0f;
            }
            if (f == 1.0f) {
                return 1.0f;
            }
            return (((float) Math.pow(2.0d, (-10.0f) * f)) * ((float) Math.sin(((f - (((float) Math.asin(1.0d)) * 0.047746483f)) * 6.2831855f) / 0.3f))) + 1.0f;
        }
    };
    public static final onSearch$ah$a getSignupData = new onSearch$ah$a() { // from class: o.onSearch.11
        @Override // o.onSearch$ah$a, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            if (f == 0.0f) {
                return 0.0f;
            }
            float f2 = f * 2.0f;
            if (f2 == 2.0f) {
                return 1.0f;
            }
            float asin = ((float) Math.asin(1.0d)) * 0.07161972f;
            if (f2 < 1.0f) {
                float f3 = f2 - 1.0f;
                return ((float) Math.pow(2.0d, 10.0f * f3)) * ((float) Math.sin(((f3 * 1.0f) - asin) * 6.2831855f * 2.2222223f)) * (-0.5f);
            }
            float f4 = f2 - 1.0f;
            return (((float) Math.pow(2.0d, (-10.0f) * f4)) * 0.5f * ((float) Math.sin(((f4 * 1.0f) - asin) * 6.2831855f * 2.2222223f))) + 1.0f;
        }
    };
    public static final onSearch$ah$a valueOf = new onSearch$ah$a() { // from class: o.onSearch.19
        @Override // o.onSearch$ah$a, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return f * f * ((f * 2.70158f) - 1.70158f);
        }
    };
    public static final onSearch$ah$a isLogoutPending = new onSearch$ah$a() { // from class: o.onSearch.16
        @Override // o.onSearch$ah$a, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * ((f2 * 2.70158f) + 1.70158f)) + 1.0f;
        }
    };
    public static final onSearch$ah$a ah$b = new onSearch$ah$a() { // from class: o.onSearch.17
        @Override // o.onSearch$ah$a, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f * 2.0f;
            if (f2 < 1.0f) {
                return f2 * f2 * ((f2 * 3.5949094f) - 2.5949094f) * 0.5f;
            }
            float f3 = f2 - 2.0f;
            return ((f3 * f3 * ((f3 * 3.5949094f) + 2.5949094f)) + 2.0f) * 0.5f;
        }
    };
    public static final onSearch$ah$a ag$a = new onSearch$ah$a() { // from class: o.onSearch.18
        @Override // o.onSearch$ah$a, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return 1.0f - onSearch.aj$a.getInterpolation(1.0f - f);
        }
    };
    public static final onSearch$ah$a aj$a = new onSearch$ah$a() { // from class: o.onSearch.20
        @Override // o.onSearch$ah$a, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            if (f < 0.36363637f) {
                return 7.5625f * f * f;
            }
            if (f < 0.72727275f) {
                float f2 = f - 0.54545456f;
                return (7.5625f * f2 * f2) + 0.75f;
            } else if (f < 0.90909094f) {
                float f3 = f - 0.8181818f;
                return (7.5625f * f3 * f3) + 0.9375f;
            } else {
                float f4 = f - 0.95454544f;
                return (7.5625f * f4 * f4) + 0.984375f;
            }
        }
    };
    public static final onSearch$ah$a HaptikSDK$c = new onSearch$ah$a() { // from class: o.onSearch.24
        @Override // o.onSearch$ah$a, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            if (f < 0.5f) {
                return onSearch.ag$a.getInterpolation(f * 2.0f) * 0.5f;
            }
            return (onSearch.aj$a.getInterpolation((f * 2.0f) - 1.0f) * 0.5f) + 0.5f;
        }
    };
}
