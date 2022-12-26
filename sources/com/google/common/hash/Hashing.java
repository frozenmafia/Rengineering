package com.google.common.hash;

import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Checksum;
import o.ChildHelper;
import o.addAdapter;
/* loaded from: classes7.dex */
public final class Hashing {
    static final int valueOf = (int) System.currentTimeMillis();

    public static ChildHelper.Callback valueOf() {
        return Murmur3_128HashFunction.MURMUR3_128;
    }

    /* loaded from: classes7.dex */
    enum ChecksumType implements addAdapter<Checksum> {
        CRC_32("Hashing.crc32()") { // from class: com.google.common.hash.Hashing.ChecksumType.1
            @Override // o.offsetPositionsForRemovingLaidOutOrNewView
            public Checksum get() {
                return new CRC32();
            }
        },
        ADLER_32("Hashing.adler32()") { // from class: com.google.common.hash.Hashing.ChecksumType.2
            @Override // o.offsetPositionsForRemovingLaidOutOrNewView
            public Checksum get() {
                return new Adler32();
            }
        };
        
        public final ChildHelper.Callback hashFunction;

        ChecksumType(String str) {
            this.hashFunction = new ChecksumHashFunction(this, 32, str);
        }
    }
}
