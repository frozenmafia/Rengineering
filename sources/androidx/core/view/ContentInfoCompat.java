package androidx.core.view;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ContentInfo;
import android.view.ViewConfiguration;
import androidx.core.util.Preconditions;
import androidx.core.util.Predicate;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import o.getShort;
/* loaded from: classes.dex */
public final class ContentInfoCompat {
    public static final int FLAG_CONVERT_TO_PLAIN_TEXT = 1;
    public static final int SOURCE_APP = 0;
    public static final int SOURCE_AUTOFILL = 4;
    public static final int SOURCE_CLIPBOARD = 1;
    public static final int SOURCE_DRAG_AND_DROP = 3;
    public static final int SOURCE_INPUT_METHOD = 2;
    public static final int SOURCE_PROCESS_TEXT = 5;
    private final Compat mCompat;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface BuilderCompat {
        ContentInfoCompat build();

        void setClip(ClipData clipData);

        void setExtras(Bundle bundle);

        void setFlags(int i);

        void setLinkUri(Uri uri);

        void setSource(int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface Compat {
        ClipData getClip();

        Bundle getExtras();

        int getFlags();

        Uri getLinkUri();

        int getSource();

        ContentInfo getWrapped();
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Flags {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Source {
    }

    static String sourceToString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    static String flagsToString(int i) {
        return (i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i);
    }

    ContentInfoCompat(Compat compat) {
        this.mCompat = compat;
    }

    public static ContentInfoCompat toContentInfoCompat(ContentInfo contentInfo) {
        return new ContentInfoCompat(new Compat31Impl(contentInfo));
    }

    public ContentInfo toContentInfo() {
        return this.mCompat.getWrapped();
    }

    public String toString() {
        return this.mCompat.toString();
    }

    public ClipData getClip() {
        return this.mCompat.getClip();
    }

    public int getSource() {
        return this.mCompat.getSource();
    }

    public int getFlags() {
        return this.mCompat.getFlags();
    }

    public Uri getLinkUri() {
        return this.mCompat.getLinkUri();
    }

    public Bundle getExtras() {
        return this.mCompat.getExtras();
    }

    public Pair<ContentInfoCompat, ContentInfoCompat> partition(Predicate<ClipData.Item> predicate) {
        ClipData clip = this.mCompat.getClip();
        if (clip.getItemCount() == 1) {
            boolean test = predicate.test(clip.getItemAt(0));
            return Pair.create(test ? this : null, test ? null : this);
        }
        Pair<ClipData, ClipData> partition = partition(clip, predicate);
        if (partition.first == null) {
            return Pair.create(null, this);
        }
        if (partition.second == null) {
            return Pair.create(this, null);
        }
        return Pair.create(new Builder(this).setClip((ClipData) partition.first).build(), new Builder(this).setClip((ClipData) partition.second).build());
    }

    static Pair<ClipData, ClipData> partition(ClipData clipData, Predicate<ClipData.Item> predicate) {
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i = 0; i < clipData.getItemCount(); i++) {
            ClipData.Item itemAt = clipData.getItemAt(i);
            if (predicate.test(itemAt)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        if (arrayList == null) {
            return Pair.create(null, clipData);
        }
        if (arrayList2 == null) {
            return Pair.create(clipData, null);
        }
        return Pair.create(buildClipData(clipData.getDescription(), arrayList), buildClipData(clipData.getDescription(), arrayList2));
    }

    static ClipData buildClipData(ClipDescription clipDescription, List<ClipData.Item> list) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), list.get(0));
        for (int i = 1; i < list.size(); i++) {
            clipData.addItem(list.get(i));
        }
        return clipData;
    }

    public static Pair<ContentInfo, ContentInfo> partition(ContentInfo contentInfo, java.util.function.Predicate<ClipData.Item> predicate) {
        return Api31Impl.partition(contentInfo, predicate);
    }

    /* loaded from: classes6.dex */
    static final class Api31Impl {
        private Api31Impl() {
        }

        public static Pair<ContentInfo, ContentInfo> partition(ContentInfo contentInfo, final java.util.function.Predicate<ClipData.Item> predicate) {
            ClipData clip = contentInfo.getClip();
            if (clip.getItemCount() == 1) {
                boolean test = predicate.test(clip.getItemAt(0));
                ContentInfo contentInfo2 = test ? contentInfo : null;
                if (test) {
                    contentInfo = null;
                }
                return Pair.create(contentInfo2, contentInfo);
            }
            predicate.getClass();
            Pair<ClipData, ClipData> partition = ContentInfoCompat.partition(clip, new Predicate() { // from class: androidx.core.view.ContentInfoCompat$Api31Impl$$ExternalSyntheticLambda0
                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    return predicate.test((ClipData.Item) obj);
                }
            });
            if (partition.first == null) {
                return Pair.create(null, contentInfo);
            }
            if (partition.second == null) {
                return Pair.create(contentInfo, null);
            }
            return Pair.create(new ContentInfo.Builder(contentInfo).setClip((ClipData) partition.first).build(), new ContentInfo.Builder(contentInfo).setClip((ClipData) partition.second).build());
        }
    }

    /* loaded from: classes.dex */
    static final class CompatImpl implements Compat {
        private static char ag$a = 0;
        private static long ah$a = 7885982076837032535L;
        private static int toString = 1;
        private static int valueOf;
        private static int values;
        private final ClipData mClip;
        private final Bundle mExtras;
        private final int mFlags;
        private final Uri mLinkUri;
        private final int mSource;

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public ContentInfo getWrapped() {
            int i = values + 107;
            toString = i % 128;
            int i2 = i % 2;
            int i3 = toString + 37;
            values = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }

        CompatImpl(BuilderCompatImpl builderCompatImpl) {
            this.mClip = (ClipData) Preconditions.checkNotNull(builderCompatImpl.mClip);
            this.mSource = Preconditions.checkArgumentInRange(builderCompatImpl.mSource, 0, 5, ah$a(new char[]{25561, 30364, 40404, 41913}, ViewConfiguration.getMinimumFlingVelocity() >> 16, new char[]{62039, 51959, 41706, 28016}, (char) (TextUtils.indexOf("", "", 0, 0) + 47517), new char[]{40126, 36932, 6777, 10879, 45450, 15171}).intern());
            this.mFlags = Preconditions.checkFlagsArgument(builderCompatImpl.mFlags, 1);
            this.mLinkUri = builderCompatImpl.mLinkUri;
            this.mExtras = builderCompatImpl.mExtras;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public ClipData getClip() {
            int i = toString + 93;
            values = i % 128;
            int i2 = i % 2;
            ClipData clipData = this.mClip;
            try {
                int i3 = toString + 117;
                values = i3 % 128;
                int i4 = i3 % 2;
                return clipData;
            } catch (Exception e) {
                throw e;
            }
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getSource() {
            int i = toString + 13;
            values = i % 128;
            int i2 = i % 2;
            try {
                int i3 = this.mSource;
                int i4 = toString + 107;
                values = i4 % 128;
                if (i4 % 2 != 0) {
                    Object[] objArr = null;
                    int length = objArr.length;
                    return i3;
                }
                return i3;
            } catch (Exception e) {
                throw e;
            }
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getFlags() {
            int i = values + 3;
            toString = i % 128;
            int i2 = i % 2;
            int i3 = this.mFlags;
            int i4 = toString + 25;
            values = i4 % 128;
            if ((i4 % 2 != 0 ? '%' : '=') != '%') {
                return i3;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return i3;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public Uri getLinkUri() {
            int i = toString + 43;
            values = i % 128;
            if ((i % 2 != 0 ? (char) 27 : '!') != '!') {
                try {
                    int i2 = 21 / 0;
                    return this.mLinkUri;
                } catch (Exception e) {
                    throw e;
                }
            }
            return this.mLinkUri;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public Bundle getExtras() {
            int i = values + 7;
            toString = i % 128;
            int i2 = i % 2;
            Bundle bundle = this.mExtras;
            int i3 = toString + 21;
            values = i3 % 128;
            if (!(i3 % 2 == 0)) {
                int i4 = 7 / 0;
                return bundle;
            }
            return bundle;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.mClip.getDescription());
            sb.append(", source=");
            sb.append(ContentInfoCompat.sourceToString(this.mSource));
            sb.append(", flags=");
            sb.append(ContentInfoCompat.flagsToString(this.mFlags));
            String str2 = "";
            if ((this.mLinkUri == null ? 'X' : '(') != 'X') {
                str = ", hasLinkUri(" + this.mLinkUri.toString().length() + ")";
            } else {
                int i = values + 71;
                toString = i % 128;
                int i2 = i % 2;
                str = "";
            }
            sb.append(str);
            if (!(this.mExtras != null)) {
                int i3 = values + 77;
                toString = i3 % 128;
                int i4 = i3 % 2;
            } else {
                str2 = ", hasExtras";
            }
            try {
                sb.append(str2);
                sb.append("}");
                return sb.toString();
            } catch (Exception e) {
                throw e;
            }
        }

        private static String ah$a(char[] cArr, int i, char[] cArr2, char c, char[] cArr3) {
            String str;
            synchronized (getShort.toString) {
                char[] cArr4 = (char[]) cArr.clone();
                char[] cArr5 = (char[]) cArr2.clone();
                cArr4[0] = (char) (c ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i));
                int length = cArr3.length;
                char[] cArr6 = new char[length];
                getShort.valueOf = 0;
                while (getShort.valueOf < length) {
                    int i2 = (getShort.valueOf + 2) % 4;
                    int i3 = (getShort.valueOf + 3) % 4;
                    getShort.values = (char) (((cArr4[getShort.valueOf % 4] * 32718) + cArr5[i2]) % 65535);
                    cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                    cArr4[i3] = getShort.values;
                    cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ ah$a) ^ valueOf) ^ ag$a);
                    getShort.valueOf++;
                }
                str = new String(cArr6);
            }
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class Compat31Impl implements Compat {
        private final ContentInfo mWrapped;

        Compat31Impl(ContentInfo contentInfo) {
            this.mWrapped = (ContentInfo) Preconditions.checkNotNull(contentInfo);
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public ContentInfo getWrapped() {
            return this.mWrapped;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public ClipData getClip() {
            return this.mWrapped.getClip();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getSource() {
            return this.mWrapped.getSource();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getFlags() {
            return this.mWrapped.getFlags();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public Uri getLinkUri() {
            return this.mWrapped.getLinkUri();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public Bundle getExtras() {
            return this.mWrapped.getExtras();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.mWrapped + "}";
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        private final BuilderCompat mBuilderCompat;

        public Builder(ContentInfoCompat contentInfoCompat) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.mBuilderCompat = new BuilderCompat31Impl(contentInfoCompat);
            } else {
                this.mBuilderCompat = new BuilderCompatImpl(contentInfoCompat);
            }
        }

        public Builder(ClipData clipData, int i) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.mBuilderCompat = new BuilderCompat31Impl(clipData, i);
            } else {
                this.mBuilderCompat = new BuilderCompatImpl(clipData, i);
            }
        }

        public Builder setClip(ClipData clipData) {
            this.mBuilderCompat.setClip(clipData);
            return this;
        }

        public Builder setSource(int i) {
            this.mBuilderCompat.setSource(i);
            return this;
        }

        public Builder setFlags(int i) {
            this.mBuilderCompat.setFlags(i);
            return this;
        }

        public Builder setLinkUri(Uri uri) {
            this.mBuilderCompat.setLinkUri(uri);
            return this;
        }

        public Builder setExtras(Bundle bundle) {
            this.mBuilderCompat.setExtras(bundle);
            return this;
        }

        public ContentInfoCompat build() {
            return this.mBuilderCompat.build();
        }
    }

    /* loaded from: classes.dex */
    static final class BuilderCompatImpl implements BuilderCompat {
        ClipData mClip;
        Bundle mExtras;
        int mFlags;
        Uri mLinkUri;
        int mSource;

        BuilderCompatImpl(ClipData clipData, int i) {
            this.mClip = clipData;
            this.mSource = i;
        }

        BuilderCompatImpl(ContentInfoCompat contentInfoCompat) {
            this.mClip = contentInfoCompat.getClip();
            this.mSource = contentInfoCompat.getSource();
            this.mFlags = contentInfoCompat.getFlags();
            this.mLinkUri = contentInfoCompat.getLinkUri();
            this.mExtras = contentInfoCompat.getExtras();
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setClip(ClipData clipData) {
            this.mClip = clipData;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setSource(int i) {
            this.mSource = i;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setFlags(int i) {
            this.mFlags = i;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setLinkUri(Uri uri) {
            this.mLinkUri = uri;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setExtras(Bundle bundle) {
            this.mExtras = bundle;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public ContentInfoCompat build() {
            return new ContentInfoCompat(new CompatImpl(this));
        }
    }

    /* loaded from: classes.dex */
    static final class BuilderCompat31Impl implements BuilderCompat {
        private final ContentInfo.Builder mPlatformBuilder;

        BuilderCompat31Impl(ClipData clipData, int i) {
            this.mPlatformBuilder = new ContentInfo.Builder(clipData, i);
        }

        BuilderCompat31Impl(ContentInfoCompat contentInfoCompat) {
            this.mPlatformBuilder = new ContentInfo.Builder(contentInfoCompat.toContentInfo());
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setClip(ClipData clipData) {
            this.mPlatformBuilder.setClip(clipData);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setSource(int i) {
            this.mPlatformBuilder.setSource(i);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setFlags(int i) {
            this.mPlatformBuilder.setFlags(i);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setLinkUri(Uri uri) {
            this.mPlatformBuilder.setLinkUri(uri);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setExtras(Bundle bundle) {
            this.mPlatformBuilder.setExtras(bundle);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public ContentInfoCompat build() {
            return new ContentInfoCompat(new Compat31Impl(this.mPlatformBuilder.build()));
        }
    }
}
