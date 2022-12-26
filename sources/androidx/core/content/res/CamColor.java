package androidx.core.content.res;

import androidx.core.graphics.ColorUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CamColor {
    private static final float CHROMA_SEARCH_ENDPOINT = 0.4f;
    private static final float DE_MAX = 1.0f;
    private static final float DL_MAX = 0.2f;
    private static final float LIGHTNESS_SEARCH_ENDPOINT = 0.01f;
    private final float mAstar;
    private final float mBstar;
    private final float mChroma;
    private final float mHue;
    private final float mJ;
    private final float mJstar;
    private final float mM;
    private final float mQ;
    private final float mS;

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getHue() {
        return this.mHue;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getChroma() {
        return this.mChroma;
    }

    float getJ() {
        return this.mJ;
    }

    float getQ() {
        return this.mQ;
    }

    float getM() {
        return this.mM;
    }

    float getS() {
        return this.mS;
    }

    float getJStar() {
        return this.mJstar;
    }

    float getAStar() {
        return this.mAstar;
    }

    float getBStar() {
        return this.mBstar;
    }

    CamColor(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.mHue = f;
        this.mChroma = f2;
        this.mJ = f3;
        this.mQ = f4;
        this.mM = f5;
        this.mS = f6;
        this.mJstar = f7;
        this.mAstar = f8;
        this.mBstar = f9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int toColor(float f, float f2, float f3) {
        return toColor(f, f2, f3, ViewingConditions.DEFAULT);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CamColor fromColor(int i) {
        return fromColorInViewingConditions(i, ViewingConditions.DEFAULT);
    }

    static CamColor fromColorInViewingConditions(int i, ViewingConditions viewingConditions) {
        float pow;
        float[] xyzFromInt = CamUtils.xyzFromInt(i);
        float[][] fArr = CamUtils.XYZ_TO_CAM16RGB;
        float f = xyzFromInt[0];
        float f2 = fArr[0][0];
        float f3 = xyzFromInt[1];
        float f4 = fArr[0][1];
        float f5 = xyzFromInt[2];
        float f6 = fArr[0][2];
        float f7 = xyzFromInt[0];
        float f8 = fArr[1][0];
        float f9 = xyzFromInt[1];
        float f10 = fArr[1][1];
        float f11 = xyzFromInt[2];
        float f12 = fArr[1][2];
        float f13 = xyzFromInt[0];
        float f14 = fArr[2][0];
        float f15 = xyzFromInt[1];
        float f16 = fArr[2][1];
        float f17 = xyzFromInt[2];
        float f18 = fArr[2][2];
        float f19 = viewingConditions.getRgbD()[0] * ((f * f2) + (f3 * f4) + (f5 * f6));
        float f20 = viewingConditions.getRgbD()[1] * ((f7 * f8) + (f9 * f10) + (f11 * f12));
        float f21 = viewingConditions.getRgbD()[2] * ((f13 * f14) + (f15 * f16) + (f17 * f18));
        float pow2 = (float) Math.pow((viewingConditions.getFl() * Math.abs(f19)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((viewingConditions.getFl() * Math.abs(f20)) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((viewingConditions.getFl() * Math.abs(f21)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f19) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f20) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f21) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d = signum3;
        float f22 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d)) / 11.0f;
        float f23 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f24 = signum2 * 20.0f;
        float f25 = (((signum * 20.0f) + f24) + (21.0f * signum3)) / 20.0f;
        float f26 = (((signum * 40.0f) + f24) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f23, f22)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f27 = atan2;
        float f28 = (3.1415927f * f27) / 180.0f;
        float pow5 = ((float) Math.pow((f26 * viewingConditions.getNbb()) / viewingConditions.getAw(), viewingConditions.getC() * viewingConditions.getZ())) * 100.0f;
        float c = 4.0f / viewingConditions.getC();
        float sqrt = (float) Math.sqrt(pow5 / 100.0f);
        float aw = viewingConditions.getAw();
        float flRoot = viewingConditions.getFlRoot();
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f27) < 20.14d ? 360.0f + f27 : f27) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * viewingConditions.getNc()) * viewingConditions.getNcb()) * ((float) Math.sqrt((f22 * f22) + (f23 * f23)))) / (f25 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        float flRoot2 = pow6 * viewingConditions.getFlRoot();
        float f29 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((0.0228f * flRoot2) + 1.0f)) * 43.85965f;
        double d2 = f28;
        return new CamColor(f27, pow6, pow5, flRoot * c * sqrt * (aw + 4.0f), flRoot2, ((float) Math.sqrt((pow * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f, f29, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    private static CamColor fromJch(float f, float f2, float f3) {
        return fromJchInFrame(f, f2, f3, ViewingConditions.DEFAULT);
    }

    private static CamColor fromJchInFrame(float f, float f2, float f3, ViewingConditions viewingConditions) {
        double d;
        float sqrt = (float) Math.sqrt(f / 100.0d);
        float aw = viewingConditions.getAw();
        float flRoot = viewingConditions.getFlRoot();
        float flRoot2 = viewingConditions.getFlRoot() * f2;
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((flRoot2 * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new CamColor(f3, f2, f, (4.0f / viewingConditions.getC()) * sqrt * (aw + 4.0f) * flRoot, flRoot2, ((float) Math.sqrt(((f2 / ((float) Math.sqrt(d))) * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f, f4, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    float distance(CamColor camColor) {
        float jStar = getJStar() - camColor.getJStar();
        float aStar = getAStar() - camColor.getAStar();
        float bStar = getBStar() - camColor.getBStar();
        return (float) (Math.pow(Math.sqrt((jStar * jStar) + (aStar * aStar) + (bStar * bStar)), 0.63d) * 1.41d);
    }

    int viewedInSrgb() {
        return viewed(ViewingConditions.DEFAULT);
    }

    int viewed(ViewingConditions viewingConditions) {
        float f;
        float pow = (float) Math.pow(((((double) getChroma()) == 0.0d || ((double) getJ()) == 0.0d) ? 0.0f : getChroma() / ((float) Math.sqrt(getJ() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d), 1.1111111111111112d);
        double hue = (getHue() * 3.1415927f) / 180.0f;
        float cos = (float) (Math.cos(2.0d + hue) + 3.8d);
        float nc = viewingConditions.getNc();
        float ncb = viewingConditions.getNcb();
        float aw = (viewingConditions.getAw() * ((float) Math.pow(getJ() / 100.0d, (1.0d / viewingConditions.getC()) / viewingConditions.getZ()))) / viewingConditions.getNbb();
        float sin = (float) Math.sin(hue);
        float cos2 = (float) Math.cos(hue);
        float f2 = (((0.305f + aw) * 23.0f) * pow) / (((((((cos * 0.25f) * 3846.1538f) * nc) * ncb) * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f3 = cos2 * f2;
        float f4 = f2 * sin;
        float f5 = aw * 460.0f;
        float f6 = (((451.0f * f3) + f5) + (288.0f * f4)) / 1403.0f;
        float f7 = ((f5 - (891.0f * f3)) - (261.0f * f4)) / 1403.0f;
        float pow2 = (float) Math.pow((float) Math.max(0.0d, (Math.abs(f7) * 27.13d) / (400.0d - Math.abs(f7))), 2.380952380952381d);
        float max = (float) Math.max(0.0d, (Math.abs(f) * 27.13d) / (400.0d - Math.abs(f)));
        float signum = ((Math.signum(f6) * (100.0f / viewingConditions.getFl())) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f6) * 27.13d) / (400.0d - Math.abs(f6))), 2.380952380952381d))) / viewingConditions.getRgbD()[0];
        float signum2 = ((Math.signum(f7) * (100.0f / viewingConditions.getFl())) * pow2) / viewingConditions.getRgbD()[1];
        float signum3 = ((Math.signum(((f5 - (f3 * 220.0f)) - (f4 * 6300.0f)) / 1403.0f) * (100.0f / viewingConditions.getFl())) * ((float) Math.pow(max, 2.380952380952381d))) / viewingConditions.getRgbD()[2];
        float[][] fArr = CamUtils.CAM16RGB_TO_XYZ;
        return ColorUtils.XYZToColor((fArr[0][0] * signum) + (fArr[0][1] * signum2) + (fArr[0][2] * signum3), (fArr[1][0] * signum) + (fArr[1][1] * signum2) + (fArr[1][2] * signum3), (signum * fArr[2][0]) + (signum2 * fArr[2][1]) + (signum3 * fArr[2][2]));
    }

    static int toColor(float f, float f2, float f3, ViewingConditions viewingConditions) {
        if (f2 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
            return CamUtils.intFromLStar(f3);
        }
        float min = f < 0.0f ? 0.0f : Math.min(360.0f, f);
        float f4 = f2;
        CamColor camColor = null;
        float f5 = 0.0f;
        boolean z = true;
        while (Math.abs(f5 - f2) >= CHROMA_SEARCH_ENDPOINT) {
            CamColor findCamByJ = findCamByJ(min, f4, f3);
            if (z) {
                if (findCamByJ != null) {
                    return findCamByJ.viewed(viewingConditions);
                }
                z = false;
            } else if (findCamByJ == null) {
                f2 = f4;
            } else {
                f5 = f4;
                camColor = findCamByJ;
            }
            f4 = ((f2 - f5) / 2.0f) + f5;
        }
        if (camColor == null) {
            return CamUtils.intFromLStar(f3);
        }
        return camColor.viewed(viewingConditions);
    }

    private static CamColor findCamByJ(float f, float f2, float f3) {
        float f4 = 1000.0f;
        CamColor camColor = null;
        float f5 = 1000.0f;
        float f6 = 100.0f;
        float f7 = 0.0f;
        while (Math.abs(f7 - f6) > LIGHTNESS_SEARCH_ENDPOINT) {
            float f8 = ((f6 - f7) / 2.0f) + f7;
            int viewedInSrgb = fromJch(f8, f2, f).viewedInSrgb();
            float lStarFromInt = CamUtils.lStarFromInt(viewedInSrgb);
            float abs = Math.abs(f3 - lStarFromInt);
            if (abs < 0.2f) {
                CamColor fromColor = fromColor(viewedInSrgb);
                float distance = fromColor.distance(fromJch(fromColor.getJ(), fromColor.getChroma(), f));
                if (distance <= 1.0f) {
                    camColor = fromColor;
                    f4 = abs;
                    f5 = distance;
                }
            }
            if (f4 == 0.0f && f5 == 0.0f) {
                break;
            } else if (lStarFromInt < f3) {
                f7 = f8;
            } else {
                f6 = f8;
            }
        }
        return camColor;
    }
}
