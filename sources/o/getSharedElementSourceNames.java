package o;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import kotlin.text.Regex;
/* loaded from: classes4.dex */
public final class getSharedElementSourceNames {
    public static final getSharedElementSourceNames valueOf = new getSharedElementSourceNames();

    private getSharedElementSourceNames() {
    }

    public static final boolean valueOf(View view) {
        if (isStateAtLeast.values(getSharedElementSourceNames.class)) {
            return false;
        }
        try {
            if (view instanceof TextView) {
                getSharedElementSourceNames getsharedelementsourcenames = valueOf;
                if (!getsharedelementsourcenames.values((TextView) view) && !getsharedelementsourcenames.valueOf((TextView) view) && !getsharedelementsourcenames.ag$a((TextView) view) && !getsharedelementsourcenames.HaptikSDK$b((TextView) view) && !getsharedelementsourcenames.ah$a((TextView) view)) {
                    if (!getsharedelementsourcenames.toString((TextView) view)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            isStateAtLeast.values(th, getSharedElementSourceNames.class);
            return false;
        }
    }

    private final boolean values(TextView textView) {
        if (isStateAtLeast.values(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 128) {
                return true;
            }
            return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
            return false;
        }
    }

    private final boolean toString(TextView textView) {
        if (isStateAtLeast.values(this)) {
            return false;
        }
        try {
            boolean z = true;
            if (textView.getInputType() == 32) {
                return true;
            }
            getSharedElementTargetNames getsharedelementtargetnames = getSharedElementTargetNames.valueOf;
            String HaptikSDK$b = getSharedElementTargetNames.HaptikSDK$b(textView);
            if (HaptikSDK$b != null) {
                if (HaptikSDK$b.length() != 0) {
                    z = false;
                }
                if (z) {
                    return false;
                }
                return Patterns.EMAIL_ADDRESS.matcher(HaptikSDK$b).matches();
            }
            return false;
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
            return false;
        }
    }

    private final boolean ag$a(TextView textView) {
        if (isStateAtLeast.values(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 96;
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
            return false;
        }
    }

    private final boolean HaptikSDK$b(TextView textView) {
        if (isStateAtLeast.values(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 112;
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
            return false;
        }
    }

    private final boolean ah$a(TextView textView) {
        if (isStateAtLeast.values(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 3;
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
            return false;
        }
    }

    private final boolean valueOf(TextView textView) {
        int i;
        if (isStateAtLeast.values(this)) {
            return false;
        }
        try {
            getSharedElementTargetNames getsharedelementtargetnames = getSharedElementTargetNames.valueOf;
            String replace = new Regex("\\s").replace(getSharedElementTargetNames.HaptikSDK$b(textView), "");
            int length = replace.length();
            if (length >= 12 && length <= 19) {
                int i2 = length - 1;
                if (i2 >= 0) {
                    boolean z = false;
                    i = 0;
                    while (true) {
                        int i3 = i2 - 1;
                        char charAt = replace.charAt(i2);
                        if (!Character.isDigit(charAt)) {
                            return false;
                        }
                        int values = transformMatrixToLocal.values(charAt);
                        if (z && (values = values * 2) > 9) {
                            values = (values % 10) + 1;
                        }
                        i += values;
                        z = !z;
                        if (i3 < 0) {
                            break;
                        }
                        i2 = i3;
                    }
                } else {
                    i = 0;
                }
                return i % 10 == 0;
            }
            return false;
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
            return false;
        }
    }
}
