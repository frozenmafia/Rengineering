package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.util.Base64;
import com.sendbird.android.constant.StringSet;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.concurrent.Executor;
import o.Fragment;
import o.FragmentLifecycleCallbacksDispatcher;
import org.apache.http.protocol.HTTP;
/* loaded from: classes4.dex */
public class FragmentAnim implements animateRemoveFragment {
    private static final FragmentAnim valueOf = new FragmentAnim();

    /* renamed from: o.FragmentAnim$3 */
    /* loaded from: classes4.dex */
    public interface AnonymousClass3 {

        /* renamed from: o.FragmentAnim$3$valueOf */
        /* loaded from: classes4.dex */
        public interface valueOf {
            void valueOf(String str, String str2);
        }

        Bitmap decodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options);

        void setBitmapCreator(transitToAnimResourceId transittoanimresourceid);

        void setWebpErrorLogger(valueOf valueof);
    }

    /* loaded from: classes4.dex */
    public interface AnimationOrAnimator<T> {
        boolean close();

        Map<String, Object> getExtras();

        Throwable getFailureCause();

        float getProgress();

        T getResult();

        boolean hasMultipleResults();

        boolean hasResult();

        boolean isFinished();

        void subscribe(addDisappearingFragmentView<T> adddisappearingfragmentview, Executor executor);
    }

    /* renamed from: o.FragmentAnim$2 */
    /* loaded from: classes4.dex */
    public class AnonymousClass2 {
        private static int HaptikSDK$c = 1;
        private static int ag$a;
        private static final Uri ah$a;
        private static char toString;
        private static int valueOf;
        private static long values;

        static void valueOf() {
            valueOf = 0;
            values = 0L;
            toString = (char) 24767;
        }

        /* renamed from: o.FragmentAnim$2$1 */
        /* loaded from: classes4.dex */
        public class AnonymousClass1 {
            private static final byte[] HaptikSDK$a;
            private static final byte[] HaptikSDK$b;
            private static final byte[] HaptikSDK$c;
            public static AnonymousClass3 ag$a;
            private static final byte[] ah$a;
            private static boolean ah$b;
            private static final byte[] invoke;
            public static final boolean toString;
            public static final boolean valueOf;
            public static final boolean values;

            static {
                toString = Build.VERSION.SDK_INT <= 17;
                valueOf = Build.VERSION.SDK_INT >= 14;
                values = ag$a();
                ag$a = null;
                ah$b = false;
                HaptikSDK$c = valueOf("RIFF");
                ah$a = valueOf("WEBP");
                HaptikSDK$a = valueOf("VP8 ");
                HaptikSDK$b = valueOf("VP8L");
                invoke = valueOf("VP8X");
            }

            public static AnonymousClass3 valueOf() {
                if (ah$b) {
                    return ag$a;
                }
                AnonymousClass3 anonymousClass3 = null;
                try {
                    anonymousClass3 = (AnonymousClass3) Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance();
                } catch (Throwable unused) {
                }
                ah$b = true;
                return anonymousClass3;
            }

            private static byte[] valueOf(String str) {
                try {
                    return str.getBytes(HTTP.ASCII);
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("ASCII not found!", e);
                }
            }

            private static boolean ag$a() {
                if (Build.VERSION.SDK_INT < 17) {
                    return false;
                }
                if (Build.VERSION.SDK_INT == 17) {
                    byte[] decode = Base64.decode("UklGRkoAAABXRUJQVlA4WAoAAAAQAAAAAAAAAAAAQUxQSAwAAAARBxAR/Q9ERP8DAABWUDggGAAAABQBAJ0BKgEAAQAAAP4AAA3AAP7mtQAAAA==", 0);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                    if (options.outHeight != 1 || options.outWidth != 1) {
                        return false;
                    }
                }
                return true;
            }

            public static boolean ah$a(byte[] bArr, int i) {
                return toString(bArr, i + 12, invoke) && ((bArr[i + 20] & 2) == 2);
            }

            public static boolean valueOf(byte[] bArr, int i) {
                return toString(bArr, i + 12, HaptikSDK$a);
            }

            public static boolean toString(byte[] bArr, int i, int i2) {
                if (i2 >= 21) {
                    if (toString(bArr, i + 12, invoke)) {
                        return true;
                    }
                }
                return false;
            }

            public static boolean values(byte[] bArr, int i) {
                return toString(bArr, i + 12, invoke) && ((bArr[i + 20] & 16) == 16);
            }

            public static boolean values(byte[] bArr, int i, int i2) {
                if (i2 >= 20 && toString(bArr, i, HaptikSDK$c)) {
                    if (toString(bArr, i + 8, ah$a)) {
                        return true;
                    }
                }
                return false;
            }

            public static boolean toString(byte[] bArr, int i, byte[] bArr2) {
                if (bArr2 == null || bArr == null || bArr2.length + i > bArr.length) {
                    return false;
                }
                for (int i2 = 0; i2 < bArr2.length; i2++) {
                    if (bArr[i2 + i] != bArr2[i2]) {
                        return false;
                    }
                }
                return true;
            }
        }

        static {
            try {
                valueOf();
                ah$a = Uri.withAppendedPath((Uri) FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder.valueOf(ContactsContract.AUTHORITY_URI), "display_photo");
                int i = ag$a + 67;
                HaptikSDK$c = i % 128;
                if (!(i % 2 == 0)) {
                    return;
                }
                Object[] objArr = null;
                int length = objArr.length;
            } catch (Exception e) {
                throw e;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0015, code lost:
            if ((r3 != null) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0023, code lost:
            if ((r3 == null ? '/' : '\f') != '\f') goto L7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0025, code lost:
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0026, code lost:
            r0 = new java.net.URL(r3.toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x002f, code lost:
            r3 = o.FragmentAnim.AnonymousClass2.HaptikSDK$c + 61;
            o.FragmentAnim.AnonymousClass2.ag$a = r3 % 128;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0039, code lost:
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x003a, code lost:
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0040, code lost:
            throw new java.lang.RuntimeException(r3);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.net.URL HaptikSDK$e(android.net.Uri r3) {
            /*
                int r0 = o.FragmentAnim.AnonymousClass2.HaptikSDK$c
                int r0 = r0 + 71
                int r1 = r0 % 128
                o.FragmentAnim.AnonymousClass2.ag$a = r1
                int r0 = r0 % 2
                r1 = 0
                if (r0 == 0) goto L1a
                super.hashCode()     // Catch: java.lang.Throwable -> L18
                if (r3 != 0) goto L14
                r0 = 0
                goto L15
            L14:
                r0 = 1
            L15:
                if (r0 == 0) goto L25
                goto L26
            L18:
                r3 = move-exception
                throw r3
            L1a:
                r0 = 12
                if (r3 != 0) goto L21
                r2 = 47
                goto L23
            L21:
                r2 = 12
            L23:
                if (r2 == r0) goto L26
            L25:
                return r1
            L26:
                java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> L3a
                java.lang.String r3 = r3.toString()     // Catch: java.net.MalformedURLException -> L3a
                r0.<init>(r3)     // Catch: java.net.MalformedURLException -> L3a
                int r3 = o.FragmentAnim.AnonymousClass2.HaptikSDK$c
                int r3 = r3 + 61
                int r1 = r3 % 128
                o.FragmentAnim.AnonymousClass2.ag$a = r1
                int r3 = r3 % 2
                return r0
            L3a:
                r3 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r0.<init>(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.FragmentAnim.AnonymousClass2.HaptikSDK$e(android.net.Uri):java.net.URL");
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x004f, code lost:
            if ((!ag$a(234424923 / (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)), new char[]{23431, 63754, org.apache.http.message.TokenParser.CR, 31255}, new char[]{0, 0, 0, 0}, (char) (21723 >> (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1))), new char[]{57062, 30111, 50043, 21881, 32911}).intern().equals(r13) ? 'a' : '@') != '@') goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
            if ((ag$a(234424923 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)), new char[]{23431, 63754, org.apache.http.message.TokenParser.CR, 31255}, new char[]{0, 0, 0, 0}, (char) (5889 - (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1))), new char[]{57062, 30111, 50043, 21881, 32911}).intern().equals(r13)) != true) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x008e, code lost:
            if (org.apache.http.HttpHost.DEFAULT_SCHEME_NAME.equals(r13) == false) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
            return false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static boolean HaptikSDK$b(android.net.Uri r13) {
            /*
                int r0 = o.FragmentAnim.AnonymousClass2.ag$a
                int r0 = r0 + 103
                int r1 = r0 % 128
                o.FragmentAnim.AnonymousClass2.HaptikSDK$c = r1
                int r0 = r0 % 2
                r1 = 5
                r2 = 234424923(0xdf90a5b, float:1.5348303E-30)
                r3 = 1
                r4 = 4
                r5 = 0
                r7 = 0
                if (r0 != 0) goto L52
                java.lang.String r13 = values(r13)
                long r8 = android.widget.ExpandableListView.getPackedPositionForGroup(r7)
                r0 = 64
                int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                int r2 = r2 / r10
                char[] r8 = new char[r4]
                r8 = {x009e: FILL_ARRAY_DATA  , data: [23431, -1782, 13, 31255} // fill-array
                char[] r4 = new char[r4]
                r4 = {x00a6: FILL_ARRAY_DATA  , data: [0, 0, 0, 0} // fill-array
                r9 = 21723(0x54db, float:3.044E-41)
                long r10 = android.os.Process.getElapsedCpuTime()
                int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
                int r5 = r9 >> r12
                char r5 = (char) r5
                char[] r1 = new char[r1]
                r1 = {x00ae: FILL_ARRAY_DATA  , data: [-8474, 30111, -15493, 21881, -32625} // fill-array
                java.lang.String r1 = ag$a(r2, r8, r4, r5, r1)
                java.lang.String r1 = r1.intern()
                boolean r1 = r1.equals(r13)
                if (r1 != 0) goto L4d
                r1 = 97
                goto L4f
            L4d:
                r1 = 64
            L4f:
                if (r1 == r0) goto L93
                goto L88
            L52:
                java.lang.String r13 = values(r13)
                long r8 = android.widget.ExpandableListView.getPackedPositionForGroup(r7)
                int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                int r2 = r2 - r0
                char[] r0 = new char[r4]
                r0 = {x00b8: FILL_ARRAY_DATA  , data: [23431, -1782, 13, 31255} // fill-array
                char[] r4 = new char[r4]
                r4 = {x00c0: FILL_ARRAY_DATA  , data: [0, 0, 0, 0} // fill-array
                long r8 = android.os.Process.getElapsedCpuTime()
                int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                int r5 = 5889 - r10
                char r5 = (char) r5
                char[] r1 = new char[r1]
                r1 = {x00c8: FILL_ARRAY_DATA  , data: [-8474, 30111, -15493, 21881, -32625} // fill-array
                java.lang.String r0 = ag$a(r2, r0, r4, r5, r1)
                java.lang.String r0 = r0.intern()
                boolean r0 = r0.equals(r13)
                if (r0 != 0) goto L85
                r0 = 0
                goto L86
            L85:
                r0 = 1
            L86:
                if (r0 == r3) goto L93
            L88:
                java.lang.String r0 = "http"
                boolean r13 = r0.equals(r13)
                if (r13 == 0) goto L91
                goto L93
            L91:
                r3 = 0
                goto L9d
            L93:
                int r13 = o.FragmentAnim.AnonymousClass2.HaptikSDK$c
                int r13 = r13 + 61
                int r0 = r13 % 128
                o.FragmentAnim.AnonymousClass2.ag$a = r0
                int r13 = r13 % 2
            L9d:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: o.FragmentAnim.AnonymousClass2.HaptikSDK$b(android.net.Uri):boolean");
        }

        public static boolean HaptikSDK$a(Uri uri) {
            try {
                int i = ag$a + 121;
                HaptikSDK$c = i % 128;
                int i2 = i % 2;
                boolean equals = StringSet.file.equals(values(uri));
                try {
                    int i3 = HaptikSDK$c + 11;
                    ag$a = i3 % 128;
                    int i4 = i3 % 2;
                    return equals;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }

        public static boolean HaptikSDK$c(Uri uri) {
            int i = ag$a + 15;
            HaptikSDK$c = i % 128;
            int i2 = i % 2;
            boolean equals = "content".equals(values(uri));
            int i3 = HaptikSDK$c + 43;
            ag$a = i3 % 128;
            int i4 = i3 % 2;
            return equals;
        }

        /* JADX WARN: Code restructure failed: missing block: B:100:0x0085, code lost:
            r4 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x0086, code lost:
            if (r4 == true) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:115:?, code lost:
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x0056, code lost:
            if (("com.android.contacts".equals(r4.getAuthority()) ? '2' : '@') != '2') goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x006a, code lost:
            if (("com.android.contacts".equals(r4.getAuthority()) ? 4 : '%') != 4) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x0081, code lost:
            if (r4.getPath().startsWith((java.lang.String) o.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder.valueOf(o.FragmentAnim.AnonymousClass2.ah$a.getPath())) != false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x0083, code lost:
            r4 = true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static boolean toString(android.net.Uri r4) {
            /*
                int r0 = o.FragmentAnim.AnonymousClass2.HaptikSDK$c
                int r0 = r0 + 13
                int r1 = r0 % 128
                o.FragmentAnim.AnonymousClass2.ag$a = r1
                int r0 = r0 % 2
                java.lang.String r0 = r4.getPath()
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L24
                int r4 = o.FragmentAnim.AnonymousClass2.HaptikSDK$c     // Catch: java.lang.Exception -> L21
                int r4 = r4 + 55
                int r0 = r4 % 128
                o.FragmentAnim.AnonymousClass2.ag$a = r0     // Catch: java.lang.Exception -> L21
                int r4 = r4 % 2
                if (r4 == 0) goto L1f
                goto L20
            L1f:
                r1 = 0
            L20:
                return r1
            L21:
                r4 = move-exception
                goto L8b
            L24:
                boolean r0 = HaptikSDK$c(r4)
                if (r0 == 0) goto L2c
                r0 = 1
                goto L2d
            L2c:
                r0 = 0
            L2d:
                if (r0 == 0) goto L8c
                int r0 = o.FragmentAnim.AnonymousClass2.ag$a
                int r0 = r0 + 7
                int r3 = r0 % 128
                o.FragmentAnim.AnonymousClass2.HaptikSDK$c = r3
                int r0 = r0 % 2
                if (r0 != 0) goto L3d
                r0 = 1
                goto L3e
            L3d:
                r0 = 0
            L3e:
                java.lang.String r3 = "com.android.contacts"
                if (r0 == 0) goto L5b
                java.lang.String r0 = r4.getAuthority()
                boolean r0 = r3.equals(r0)
                r3 = 10
                int r3 = r3 / r2
                r3 = 50
                if (r0 == 0) goto L54
                r0 = 50
                goto L56
            L54:
                r0 = 64
            L56:
                if (r0 == r3) goto L6d
                goto L8c
            L59:
                r4 = move-exception
                throw r4
            L5b:
                java.lang.String r0 = r4.getAuthority()     // Catch: java.lang.Exception -> L89
                boolean r0 = r3.equals(r0)     // Catch: java.lang.Exception -> L89
                r3 = 4
                if (r0 == 0) goto L68
                r0 = 4
                goto L6a
            L68:
                r0 = 37
            L6a:
                if (r0 == r3) goto L6d
                goto L8c
            L6d:
                java.lang.String r4 = r4.getPath()
                android.net.Uri r0 = o.FragmentAnim.AnonymousClass2.ah$a
                java.lang.String r0 = r0.getPath()
                java.lang.Object r0 = o.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder.valueOf(r0)
                java.lang.String r0 = (java.lang.String) r0
                boolean r4 = r4.startsWith(r0)
                if (r4 != 0) goto L85
                r4 = 1
                goto L86
            L85:
                r4 = 0
            L86:
                if (r4 == r1) goto L8d
                goto L8c
            L89:
                r4 = move-exception
                throw r4
            L8b:
                throw r4
            L8c:
                r1 = 0
            L8d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o.FragmentAnim.AnonymousClass2.toString(android.net.Uri):boolean");
        }

        public static boolean ag$a(Uri uri) {
            String uri2;
            int i = ag$a + 47;
            HaptikSDK$c = i % 128;
            if ((i % 2 == 0 ? '_' : '7') != '7') {
                uri2 = uri.toString();
                int i2 = 38 / 0;
                if (!(!uri2.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()))) {
                    return true;
                }
            } else {
                uri2 = uri.toString();
                if (!(!uri2.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()))) {
                    return true;
                }
            }
            int i3 = HaptikSDK$c + 29;
            ag$a = i3 % 128;
            if (i3 % 2 != 0) {
                try {
                    boolean startsWith = uri2.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString());
                    Object obj = null;
                    super.hashCode();
                    if (startsWith) {
                        return true;
                    }
                } catch (Exception e) {
                    throw e;
                }
            } else {
                try {
                    if (uri2.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString())) {
                        return true;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            }
            return false;
        }

        public static boolean ah$a(Uri uri) {
            boolean equals;
            try {
                int i = ag$a + 33;
                HaptikSDK$c = i % 128;
                if ((i % 2 == 0 ? '8' : (char) 4) != '8') {
                    try {
                        equals = "asset".equals(values(uri));
                    } catch (Exception e) {
                        throw e;
                    }
                } else {
                    equals = "asset".equals(values(uri));
                    int i2 = 3 / 0;
                }
                int i3 = HaptikSDK$c + 7;
                ag$a = i3 % 128;
                int i4 = i3 % 2;
                return equals;
            } catch (Exception e2) {
                throw e2;
            }
        }

        public static boolean invoke(Uri uri) {
            int i = HaptikSDK$c + 55;
            ag$a = i % 128;
            int i2 = i % 2;
            boolean equals = "res".equals(values(uri));
            try {
                int i3 = HaptikSDK$c + 79;
                try {
                    ag$a = i3 % 128;
                    if (!(i3 % 2 != 0)) {
                        return equals;
                    }
                    Object obj = null;
                    super.hashCode();
                    return equals;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }

        public static boolean ah$b(Uri uri) {
            try {
                int i = HaptikSDK$c + 7;
                ag$a = i % 128;
                if (i % 2 != 0) {
                    boolean equals = "android.resource".equals(values(uri));
                    Object[] objArr = null;
                    int length = objArr.length;
                    return equals;
                }
                return "android.resource".equals(values(uri));
            } catch (Exception e) {
                throw e;
            }
        }

        public static boolean valueOf(Uri uri) {
            try {
                int i = ag$a + 29;
                HaptikSDK$c = i % 128;
                if ((i % 2 == 0 ? 'C' : ':') != ':') {
                    int i2 = 70 / 0;
                    return "data".equals(values(uri));
                }
                try {
                    return "data".equals(values(uri));
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x0013, code lost:
            if (r4 == null) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x001c, code lost:
            if ((r4 == null) != true) goto L7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0023, code lost:
            r4 = o.FragmentAnim.AnonymousClass2.HaptikSDK$c + 23;
            o.FragmentAnim.AnonymousClass2.ag$a = r4 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x002d, code lost:
            if ((r4 % 2) == 0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x002f, code lost:
            r4 = r3.length;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0033, code lost:
            return r4.getScheme();
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
            return null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.String values(android.net.Uri r4) {
            /*
                int r0 = o.FragmentAnim.AnonymousClass2.ag$a
                r1 = 1
                int r0 = r0 + r1
                int r2 = r0 % 128
                o.FragmentAnim.AnonymousClass2.HaptikSDK$c = r2
                int r0 = r0 % 2
                r2 = 0
                if (r0 != 0) goto Lf
                r0 = 1
                goto L10
            Lf:
                r0 = 0
            L10:
                r3 = 0
                if (r0 == r1) goto L16
                if (r4 != 0) goto L1e
                goto L23
            L16:
                super.hashCode()     // Catch: java.lang.Throwable -> L34
                if (r4 != 0) goto L1c
                r2 = 1
            L1c:
                if (r2 == r1) goto L23
            L1e:
                java.lang.String r3 = r4.getScheme()
                goto L33
            L23:
                int r4 = o.FragmentAnim.AnonymousClass2.HaptikSDK$c
                int r4 = r4 + 23
                int r0 = r4 % 128
                o.FragmentAnim.AnonymousClass2.ag$a = r0
                int r4 = r4 % 2
                if (r4 == 0) goto L33
                int r4 = r3.length     // Catch: java.lang.Throwable -> L31
                goto L33
            L31:
                r4 = move-exception
                throw r4
            L33:
                return r3
            L34:
                r4 = move-exception
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.FragmentAnim.AnonymousClass2.values(android.net.Uri):java.lang.String");
        }

        /* JADX WARN: Code restructure failed: missing block: B:103:0x001b, code lost:
            if (HaptikSDK$c(r11) != false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:108:0x0024, code lost:
            if (HaptikSDK$c(r11) != false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:110:0x002c, code lost:
            r10 = r10.query(r11, null, null, null, null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:112:0x0032, code lost:
            if (r10 == null) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:113:0x0034, code lost:
            r0 = 'R';
         */
        /* JADX WARN: Code restructure failed: missing block: B:114:0x0037, code lost:
            r0 = 'D';
         */
        /* JADX WARN: Code restructure failed: missing block: B:115:0x0039, code lost:
            if (r0 == 'D') goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:117:0x003f, code lost:
            if (r10.moveToFirst() == false) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:118:0x0041, code lost:
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:119:0x0043, code lost:
            r11 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:120:0x0044, code lost:
            if (r11 == false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:121:0x0046, code lost:
            r11 = o.FragmentAnim.AnonymousClass2.ag$a + 53;
            o.FragmentAnim.AnonymousClass2.HaptikSDK$c = r11 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:122:0x0050, code lost:
            if ((r11 % 2) != 0) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:123:0x0052, code lost:
            r11 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:124:0x0054, code lost:
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:126:0x0058, code lost:
            if (r11 == true) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:127:0x005a, code lost:
            r11 = r10.getColumnIndex("_data");
         */
        /* JADX WARN: Code restructure failed: missing block: B:128:0x005e, code lost:
            super.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:129:0x0061, code lost:
            if (r11 == (-1)) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:133:0x0066, code lost:
            r11 = r10.getColumnIndex("_data");
         */
        /* JADX WARN: Code restructure failed: missing block: B:134:0x006a, code lost:
            if (r11 == (-1)) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:136:0x0070, code lost:
            r3 = r10.getString(r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:137:0x0072, code lost:
            r11 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:138:0x0073, code lost:
            r3 = r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:139:0x0075, code lost:
            if (r10 == null) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:140:0x0077, code lost:
            r11 = o.FragmentAnim.AnonymousClass2.ag$a + 83;
            o.FragmentAnim.AnonymousClass2.HaptikSDK$c = r11 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:141:0x0081, code lost:
            if ((r11 % 2) != 0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:142:0x0083, code lost:
            r10.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:144:0x0088, code lost:
            r10 = 98 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:148:0x008c, code lost:
            r10.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:149:0x0090, code lost:
            r11 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:151:0x0093, code lost:
            if (r3 != null) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:152:0x0095, code lost:
            r0 = '2';
         */
        /* JADX WARN: Code restructure failed: missing block: B:153:0x0098, code lost:
            r0 = 11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:154:0x009a, code lost:
            if (r0 == '2') goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:156:0x009d, code lost:
            r3.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:157:0x00a0, code lost:
            throw r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:158:0x00a1, code lost:
            r10 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:159:0x00a2, code lost:
            throw r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:161:0x00a7, code lost:
            if (HaptikSDK$a(r11) == false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:163:0x00ad, code lost:
            return r11.getPath();
         */
        /* JADX WARN: Code restructure failed: missing block: B:180:?, code lost:
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:181:?, code lost:
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:182:?, code lost:
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:183:?, code lost:
            return r3;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.String values(android.content.ContentResolver r10, android.net.Uri r11) {
            /*
                int r0 = o.FragmentAnim.AnonymousClass2.ag$a     // Catch: java.lang.Exception -> Lae
                int r0 = r0 + 79
                int r1 = r0 % 128
                o.FragmentAnim.AnonymousClass2.HaptikSDK$c = r1     // Catch: java.lang.Exception -> Lae
                int r0 = r0 % 2
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                r3 = 0
                if (r0 == 0) goto L20
                boolean r0 = HaptikSDK$c(r11)
                r4 = 39
                int r4 = r4 / r2
                if (r0 == 0) goto La3
                goto L26
            L1e:
                r10 = move-exception
                throw r10
            L20:
                boolean r0 = HaptikSDK$c(r11)
                if (r0 == 0) goto La3
            L26:
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r4 = r10
                r5 = r11
                android.database.Cursor r10 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L90
                r11 = 68
                if (r10 == 0) goto L37
                r0 = 82
                goto L39
            L37:
                r0 = 68
            L39:
                if (r0 == r11) goto L75
                boolean r11 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L72
                if (r11 == 0) goto L43
                r11 = 1
                goto L44
            L43:
                r11 = 0
            L44:
                if (r11 == 0) goto L75
                int r11 = o.FragmentAnim.AnonymousClass2.ag$a     // Catch: java.lang.Exception -> La1
                int r11 = r11 + 53
                int r0 = r11 % 128
                o.FragmentAnim.AnonymousClass2.HaptikSDK$c = r0     // Catch: java.lang.Exception -> La1
                int r11 = r11 % 2
                if (r11 != 0) goto L54
                r11 = 0
                goto L55
            L54:
                r11 = 1
            L55:
                r0 = -1
                java.lang.String r4 = "_data"
                if (r11 == r1) goto L66
                int r11 = r10.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L72
                super.hashCode()     // Catch: java.lang.Throwable -> L64
                if (r11 == r0) goto L75
                goto L6c
            L64:
                r10 = move-exception
                throw r10
            L66:
                int r11 = r10.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L72
                if (r11 == r0) goto L75
            L6c:
                java.lang.String r11 = r10.getString(r11)     // Catch: java.lang.Throwable -> L72
                r3 = r11
                goto L75
            L72:
                r11 = move-exception
                r3 = r10
                goto L91
            L75:
                if (r10 == 0) goto Lad
                int r11 = o.FragmentAnim.AnonymousClass2.ag$a
                int r11 = r11 + 83
                int r0 = r11 % 128
                o.FragmentAnim.AnonymousClass2.HaptikSDK$c = r0
                int r11 = r11 % 2
                if (r11 != 0) goto L8c
                r10.close()     // Catch: java.lang.Exception -> Lae
                r10 = 98
                int r10 = r10 / r2
                goto Lad
            L8a:
                r10 = move-exception
                throw r10
            L8c:
                r10.close()
                goto Lad
            L90:
                r11 = move-exception
            L91:
                r10 = 50
                if (r3 == 0) goto L98
                r0 = 50
                goto L9a
            L98:
                r0 = 11
            L9a:
                if (r0 == r10) goto L9d
                goto La0
            L9d:
                r3.close()     // Catch: java.lang.Exception -> La1
            La0:
                throw r11
            La1:
                r10 = move-exception
                throw r10
            La3:
                boolean r10 = HaptikSDK$a(r11)
                if (r10 == 0) goto Lad
                java.lang.String r3 = r11.getPath()
            Lad:
                return r3
            Lae:
                r10 = move-exception
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: o.FragmentAnim.AnonymousClass2.values(android.content.ContentResolver, android.net.Uri):java.lang.String");
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x0021, code lost:
            if ((HaptikSDK$c(r5) ? 0 : 31) != 31) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0029, code lost:
            if (r0 != false) goto L17;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static android.content.res.AssetFileDescriptor ah$a(android.content.ContentResolver r4, android.net.Uri r5) {
            /*
                int r0 = o.FragmentAnim.AnonymousClass2.ag$a
                int r0 = r0 + 59
                int r1 = r0 % 128
                o.FragmentAnim.AnonymousClass2.HaptikSDK$c = r1
                int r0 = r0 % 2
                r1 = 36
                r2 = 0
                if (r0 != 0) goto L12
                r0 = 36
                goto L13
            L12:
                r0 = 0
            L13:
                r3 = 0
                if (r0 == r1) goto L24
                boolean r0 = HaptikSDK$c(r5)
                r1 = 31
                if (r0 == 0) goto L1f
                goto L21
            L1f:
                r2 = 31
            L21:
                if (r2 == r1) goto L32
                goto L2b
            L24:
                boolean r0 = HaptikSDK$c(r5)
                int r1 = r3.length     // Catch: java.lang.Throwable -> L3f
                if (r0 == 0) goto L32
            L2b:
                java.lang.String r0 = "r"
                android.content.res.AssetFileDescriptor r4 = r4.openAssetFileDescriptor(r5, r0)     // Catch: java.io.FileNotFoundException -> L32
                return r4
            L32:
                int r4 = o.FragmentAnim.AnonymousClass2.ag$a     // Catch: java.lang.Exception -> L3d
                int r4 = r4 + 57
                int r5 = r4 % 128
                o.FragmentAnim.AnonymousClass2.HaptikSDK$c = r5     // Catch: java.lang.Exception -> L3d
                int r4 = r4 % 2
                return r3
            L3d:
                r4 = move-exception
                throw r4
            L3f:
                r4 = move-exception
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.FragmentAnim.AnonymousClass2.ah$a(android.content.ContentResolver, android.net.Uri):android.content.res.AssetFileDescriptor");
        }

        public static Uri valueOf(File file) {
            int i = HaptikSDK$c + 17;
            ag$a = i % 128;
            int i2 = i % 2;
            Uri fromFile = Uri.fromFile(file);
            int i3 = ag$a + 25;
            HaptikSDK$c = i3 % 128;
            if (i3 % 2 != 0) {
                return fromFile;
            }
            Object obj = null;
            super.hashCode();
            return fromFile;
        }

        public static Uri values(int i) {
            Uri build = new Uri.Builder().scheme("res").path(String.valueOf(i)).build();
            int i2 = ag$a + 37;
            HaptikSDK$c = i2 % 128;
            if ((i2 % 2 == 0 ? '*' : (char) 15) != 15) {
                int i3 = 60 / 0;
                return build;
            }
            return build;
        }

        private static String ag$a(int i, char[] cArr, char[] cArr2, char c, char[] cArr3) {
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
                    cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ values) ^ valueOf) ^ toString);
                    getShort.valueOf++;
                }
                str = new String(cArr6);
            }
            return str;
        }
    }

    private FragmentAnim() {
    }

    public static FragmentAnim ah$a() {
        return valueOf;
    }

    @Override // o.animateRemoveFragment
    public long valueOf() {
        return System.currentTimeMillis();
    }

    /* loaded from: classes4.dex */
    public abstract class EndViewTransitionAnimation<T> implements addDisappearingFragmentView<T> {
        @Override // o.addDisappearingFragmentView
        public void onCancellation(AnimationOrAnimator<T> animationOrAnimator) {
        }

        protected abstract void onFailureImpl(AnimationOrAnimator<T> animationOrAnimator);

        protected abstract void onNewResultImpl(AnimationOrAnimator<T> animationOrAnimator);

        @Override // o.addDisappearingFragmentView
        public void onProgressUpdate(AnimationOrAnimator<T> animationOrAnimator) {
        }

        @Override // o.addDisappearingFragmentView
        public void onNewResult(AnimationOrAnimator<T> animationOrAnimator) {
            boolean isFinished = animationOrAnimator.isFinished();
            try {
                onNewResultImpl(animationOrAnimator);
            } finally {
                if (isFinished) {
                    animationOrAnimator.close();
                }
            }
        }

        @Override // o.addDisappearingFragmentView
        public void onFailure(AnimationOrAnimator<T> animationOrAnimator) {
            try {
                onFailureImpl(animationOrAnimator);
            } finally {
                animationOrAnimator.close();
            }
        }
    }

    /* renamed from: o.FragmentAnim$1 */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 {
        public static long values(InputStream inputStream, long j) throws IOException {
            inputStream.getClass();
            Fragment.AnonymousClass8.valueOf(Boolean.valueOf(j >= 0));
            long j2 = j;
            while (j2 > 0) {
                long skip = inputStream.skip(j2);
                if (skip <= 0) {
                    if (inputStream.read() == -1) {
                        return j - j2;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j;
        }
    }
}
