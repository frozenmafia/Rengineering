package com.google.protobuf;

import com.google.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import o.getLayoutParams;
import o.getStartLine;
/* loaded from: classes7.dex */
public final class RopeByteString extends ByteString {
    static final int[] minLengthByDepth = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    private final ByteString left;
    private final int leftLength;
    private final ByteString right;
    private final int totalLength;
    private final int treeDepth;

    /* JADX INFO: Access modifiers changed from: private */
    public RopeByteString(ByteString byteString, ByteString byteString2) {
        this.left = byteString;
        this.right = byteString2;
        int size = byteString.size();
        this.leftLength = size;
        this.totalLength = size + byteString2.size();
        this.treeDepth = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    public static ByteString concatenate(ByteString byteString, ByteString byteString2) {
        ByteString ah$a;
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString.size() + byteString2.size();
        if (size < 128) {
            return concatenateBytes(byteString, byteString2);
        }
        if (byteString instanceof RopeByteString) {
            RopeByteString ropeByteString = (RopeByteString) byteString;
            if (ropeByteString.right.size() + byteString2.size() < 128) {
                return new RopeByteString(ropeByteString.left, concatenateBytes(ropeByteString.right, byteString2));
            } else if (ropeByteString.left.getTreeDepth() > ropeByteString.right.getTreeDepth() && ropeByteString.getTreeDepth() > byteString2.getTreeDepth()) {
                return new RopeByteString(ropeByteString.left, new RopeByteString(ropeByteString.right, byteString2));
            }
        }
        if (size >= minLength(Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1)) {
            return new RopeByteString(byteString, byteString2);
        }
        ah$a = new RopeByteString$ah$a().ah$a(byteString, byteString2);
        return ah$a;
    }

    private static ByteString concatenateBytes(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[size + size2];
        byteString.copyTo(bArr, 0, 0, size);
        byteString2.copyTo(bArr, 0, size, size2);
        return ByteString.wrap(bArr);
    }

    static RopeByteString newInstanceForTest(ByteString byteString, ByteString byteString2) {
        return new RopeByteString(byteString, byteString2);
    }

    public static int minLength(int i) {
        int[] iArr = minLengthByDepth;
        if (i >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.google.protobuf.ByteString
    public byte byteAt(int i) {
        checkIndex(i, this.totalLength);
        return internalByteAt(i);
    }

    @Override // com.google.protobuf.ByteString
    public byte internalByteAt(int i) {
        int i2 = this.leftLength;
        if (i < i2) {
            return this.left.internalByteAt(i);
        }
        return this.right.internalByteAt(i - i2);
    }

    @Override // com.google.protobuf.ByteString
    public int size() {
        return this.totalLength;
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    /* renamed from: iterator */
    public Iterator<Byte> iterator2() {
        return new ByteString.values() { // from class: com.google.protobuf.RopeByteString.1
            final RopeByteString$ag$a ag$a;
            ByteString.toString ah$a = valueOf();

            {
                RopeByteString.this = this;
                this.ag$a = new RopeByteString$ag$a(this);
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [com.google.protobuf.ByteString$toString] */
            private ByteString.toString valueOf() {
                if (this.ag$a.hasNext()) {
                    return this.ag$a.next().iterator();
                }
                return null;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.ah$a != null;
            }

            @Override // com.google.protobuf.ByteString.toString
            public byte values() {
                ByteString.toString tostring = this.ah$a;
                if (tostring == null) {
                    throw new NoSuchElementException();
                }
                byte values = tostring.values();
                if (!this.ah$a.hasNext()) {
                    this.ah$a = valueOf();
                }
                return values;
            }
        };
    }

    @Override // com.google.protobuf.ByteString
    public int getTreeDepth() {
        return this.treeDepth;
    }

    @Override // com.google.protobuf.ByteString
    public boolean isBalanced() {
        return this.totalLength >= minLength(this.treeDepth);
    }

    @Override // com.google.protobuf.ByteString
    public ByteString substring(int i, int i2) {
        int checkRange = checkRange(i, i2, this.totalLength);
        if (checkRange == 0) {
            return ByteString.EMPTY;
        }
        if (checkRange == this.totalLength) {
            return this;
        }
        int i3 = this.leftLength;
        if (i2 <= i3) {
            return this.left.substring(i, i2);
        }
        if (i >= i3) {
            return this.right.substring(i - i3, i2 - i3);
        }
        return new RopeByteString(this.left.substring(i), this.right.substring(0, i2 - this.leftLength));
    }

    @Override // com.google.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.leftLength;
        if (i + i3 <= i4) {
            this.left.copyToInternal(bArr, i, i2, i3);
        } else if (i >= i4) {
            this.right.copyToInternal(bArr, i - i4, i2, i3);
        } else {
            int i5 = i4 - i;
            this.left.copyToInternal(bArr, i, i2, i5);
            this.right.copyToInternal(bArr, 0, i2 + i5, i3 - i5);
        }
    }

    @Override // com.google.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
        this.left.copyTo(byteBuffer);
        this.right.copyTo(byteBuffer);
    }

    @Override // com.google.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        RopeByteString$ag$a ropeByteString$ag$a = new RopeByteString$ag$a(this);
        while (ropeByteString$ag$a.hasNext()) {
            arrayList.add(ropeByteString$ag$a.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // com.google.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
        this.left.writeTo(outputStream);
        this.right.writeTo(outputStream);
    }

    @Override // com.google.protobuf.ByteString
    public void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        int i3 = this.leftLength;
        if (i + i2 <= i3) {
            this.left.writeToInternal(outputStream, i, i2);
        } else if (i >= i3) {
            this.right.writeToInternal(outputStream, i - i3, i2);
        } else {
            int i4 = i3 - i;
            this.left.writeToInternal(outputStream, i, i4);
            this.right.writeToInternal(outputStream, 0, i2 - i4);
        }
    }

    @Override // com.google.protobuf.ByteString
    public void writeTo(getLayoutParams getlayoutparams) throws IOException {
        this.left.writeTo(getlayoutparams);
        this.right.writeTo(getlayoutparams);
    }

    @Override // com.google.protobuf.ByteString
    public void writeToReverse(getLayoutParams getlayoutparams) throws IOException {
        this.right.writeToReverse(getlayoutparams);
        this.left.writeToReverse(getlayoutparams);
    }

    @Override // com.google.protobuf.ByteString
    protected String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    @Override // com.google.protobuf.ByteString
    public boolean isValidUtf8() {
        int partialIsValidUtf8 = this.left.partialIsValidUtf8(0, 0, this.leftLength);
        ByteString byteString = this.right;
        return byteString.partialIsValidUtf8(partialIsValidUtf8, 0, byteString.size()) == 0;
    }

    @Override // com.google.protobuf.ByteString
    public int partialIsValidUtf8(int i, int i2, int i3) {
        int i4 = this.leftLength;
        if (i2 + i3 <= i4) {
            return this.left.partialIsValidUtf8(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.right.partialIsValidUtf8(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.right.partialIsValidUtf8(this.left.partialIsValidUtf8(i, i2, i5), 0, i3 - i5);
    }

    @Override // com.google.protobuf.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (this.totalLength != byteString.size()) {
                return false;
            }
            if (this.totalLength == 0) {
                return true;
            }
            int peekCachedHashCode = peekCachedHashCode();
            int peekCachedHashCode2 = byteString.peekCachedHashCode();
            if (peekCachedHashCode == 0 || peekCachedHashCode2 == 0 || peekCachedHashCode == peekCachedHashCode2) {
                return equalsFragments(byteString);
            }
            return false;
        }
        return false;
    }

    private boolean equalsFragments(ByteString byteString) {
        boolean equalsRange;
        RopeByteString$ag$a ropeByteString$ag$a = new RopeByteString$ag$a(this);
        ByteString.LeafByteString next = ropeByteString$ag$a.next();
        RopeByteString$ag$a ropeByteString$ag$a2 = new RopeByteString$ag$a(byteString);
        ByteString.LeafByteString next2 = ropeByteString$ag$a2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = next.size() - i;
            int size2 = next2.size() - i2;
            int min = Math.min(size, size2);
            if (i == 0) {
                equalsRange = next.equalsRange(next2, i2, min);
            } else {
                equalsRange = next2.equalsRange(next, i, min);
            }
            if (!equalsRange) {
                return false;
            }
            i3 += min;
            int i4 = this.totalLength;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                i = 0;
                next = ropeByteString$ag$a.next();
            } else {
                i += min;
                next = next;
            }
            if (min == size2) {
                next2 = ropeByteString$ag$a2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    @Override // com.google.protobuf.ByteString
    public int partialHash(int i, int i2, int i3) {
        int i4 = this.leftLength;
        if (i2 + i3 <= i4) {
            return this.left.partialHash(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.right.partialHash(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.right.partialHash(this.left.partialHash(i, i2, i5), 0, i3 - i5);
    }

    @Override // com.google.protobuf.ByteString
    public getStartLine newCodedInput() {
        getStartLine ah$a;
        ah$a = getStartLine.ah$a(new valueOf(), 4096);
        return ah$a;
    }

    @Override // com.google.protobuf.ByteString
    public InputStream newInput() {
        return new valueOf();
    }

    Object writeReplace() {
        return ByteString.wrap(toByteArray());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    /* loaded from: classes7.dex */
    class valueOf extends InputStream {
        private RopeByteString$ag$a HaptikSDK$a;
        private int HaptikSDK$b;
        private int ag$a;
        private int ah$a;
        private ByteString.LeafByteString toString;
        private int valueOf;

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        public valueOf() {
            RopeByteString.this = r1;
            valueOf();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            bArr.getClass();
            if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
                throw new IndexOutOfBoundsException();
            }
            int valueOf = valueOf(bArr, i, i2);
            if (valueOf == 0) {
                if (i2 > 0 || ag$a() == 0) {
                    return -1;
                }
                return valueOf;
            }
            return valueOf;
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (j < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return valueOf(null, 0, (int) j);
        }

        private int valueOf(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (i3 > 0) {
                values();
                if (this.toString == null) {
                    break;
                }
                int min = Math.min(this.ah$a - this.valueOf, i3);
                if (bArr != null) {
                    this.toString.copyTo(bArr, this.valueOf, i, min);
                    i += min;
                }
                this.valueOf += min;
                i3 -= min;
            }
            return i2 - i3;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            values();
            ByteString.LeafByteString leafByteString = this.toString;
            if (leafByteString == null) {
                return -1;
            }
            int i = this.valueOf;
            this.valueOf = i + 1;
            return leafByteString.byteAt(i) & 255;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return ag$a();
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.HaptikSDK$b = this.ag$a + this.valueOf;
        }

        @Override // java.io.InputStream
        public void reset() {
            synchronized (this) {
                valueOf();
                valueOf(null, 0, this.HaptikSDK$b);
            }
        }

        private void valueOf() {
            RopeByteString$ag$a ropeByteString$ag$a = new RopeByteString$ag$a(RopeByteString.this);
            this.HaptikSDK$a = ropeByteString$ag$a;
            ByteString.LeafByteString next = ropeByteString$ag$a.next();
            this.toString = next;
            this.ah$a = next.size();
            this.valueOf = 0;
            this.ag$a = 0;
        }

        private void values() {
            if (this.toString != null) {
                int i = this.valueOf;
                int i2 = this.ah$a;
                if (i == i2) {
                    this.ag$a += i2;
                    this.valueOf = 0;
                    if (this.HaptikSDK$a.hasNext()) {
                        ByteString.LeafByteString next = this.HaptikSDK$a.next();
                        this.toString = next;
                        this.ah$a = next.size();
                        return;
                    }
                    this.toString = null;
                    this.ah$a = 0;
                }
            }
        }

        private int ag$a() {
            return RopeByteString.this.size() - (this.ag$a + this.valueOf);
        }
    }
}
