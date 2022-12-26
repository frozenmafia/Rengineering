package com.facebook.imagepipeline.decoder;

import com.facebook.imagepipeline.image.EncodedImage;
import java.io.IOException;
import java.io.InputStream;
import o.Fragment;
import o.FragmentAnim;
import o.markFragmentsCreated;
import o.startIntentSenderFromFragment;
/* loaded from: classes4.dex */
public class ProgressiveJpegParser {
    private static final int BUFFER_SIZE = 16384;
    private static final int NOT_A_JPEG = 6;
    private static final int READ_FIRST_JPEG_BYTE = 0;
    private static final int READ_MARKER_FIRST_BYTE_OR_ENTROPY_DATA = 2;
    private static final int READ_MARKER_SECOND_BYTE = 3;
    private static final int READ_SECOND_JPEG_BYTE = 1;
    private static final int READ_SIZE_FIRST_BYTE = 4;
    private static final int READ_SIZE_SECOND_BYTE = 5;
    private final markFragmentsCreated mByteArrayPool;
    private boolean mEndMarkerRead;
    private int mBytesParsed = 0;
    private int mLastByteRead = 0;
    private int mNextFullScanNumber = 0;
    private int mBestScanEndOffset = 0;
    private int mBestScanNumber = 0;
    private int mParserState = 0;

    private static boolean doesMarkerStartSegment(int i) {
        if (i == 1) {
            return false;
        }
        return ((i >= 208 && i <= 215) || i == 217 || i == 216) ? false : true;
    }

    public ProgressiveJpegParser(markFragmentsCreated markfragmentscreated) {
        this.mByteArrayPool = (markFragmentsCreated) markfragmentscreated.getClass();
    }

    public boolean parseMoreData(EncodedImage encodedImage) {
        if (this.mParserState != 6 && encodedImage.getSize() > this.mBytesParsed) {
            startIntentSenderFromFragment startintentsenderfromfragment = new startIntentSenderFromFragment(encodedImage.getInputStreamOrThrow(), this.mByteArrayPool.get(16384), this.mByteArrayPool);
            try {
                FragmentAnim.AnonymousClass1.values(startintentsenderfromfragment, this.mBytesParsed);
                return doParseMoreData(startintentsenderfromfragment);
            } catch (IOException e) {
                Fragment.OnPreAttachedListener.ag$a(e);
                return false;
            } finally {
                Fragment.AnonymousClass2.valueOf(startintentsenderfromfragment);
            }
        }
        return false;
    }

    private boolean doParseMoreData(InputStream inputStream) {
        int read;
        int i = this.mBestScanNumber;
        while (this.mParserState != 6 && (read = inputStream.read()) != -1) {
            try {
                int i2 = this.mBytesParsed + 1;
                this.mBytesParsed = i2;
                if (this.mEndMarkerRead) {
                    this.mParserState = 6;
                    this.mEndMarkerRead = false;
                    return false;
                }
                int i3 = this.mParserState;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 4) {
                                    this.mParserState = 5;
                                } else if (i3 == 5) {
                                    int i4 = ((this.mLastByteRead << 8) + read) - 2;
                                    FragmentAnim.AnonymousClass1.values(inputStream, i4);
                                    this.mBytesParsed += i4;
                                    this.mParserState = 2;
                                } else {
                                    Fragment.AnonymousClass8.toString(false);
                                }
                            } else if (read == 255) {
                                this.mParserState = 3;
                            } else if (read == 0) {
                                this.mParserState = 2;
                            } else if (read == 217) {
                                this.mEndMarkerRead = true;
                                newScanOrImageEndFound(i2 - 2);
                                this.mParserState = 2;
                            } else {
                                if (read == 218) {
                                    newScanOrImageEndFound(i2 - 2);
                                }
                                if (doesMarkerStartSegment(read)) {
                                    this.mParserState = 4;
                                } else {
                                    this.mParserState = 2;
                                }
                            }
                        } else if (read == 255) {
                            this.mParserState = 3;
                        }
                    } else if (read == 216) {
                        this.mParserState = 2;
                    } else {
                        this.mParserState = 6;
                    }
                } else if (read == 255) {
                    this.mParserState = 1;
                } else {
                    this.mParserState = 6;
                }
                this.mLastByteRead = read;
            } catch (IOException e) {
                Fragment.OnPreAttachedListener.ag$a(e);
            }
        }
        return (this.mParserState == 6 || this.mBestScanNumber == i) ? false : true;
    }

    private void newScanOrImageEndFound(int i) {
        int i2 = this.mNextFullScanNumber;
        if (i2 > 0) {
            this.mBestScanEndOffset = i;
        }
        this.mNextFullScanNumber = i2 + 1;
        this.mBestScanNumber = i2;
    }

    public boolean isJpeg() {
        return this.mBytesParsed > 1 && this.mParserState != 6;
    }

    public int getBestScanEndOffset() {
        return this.mBestScanEndOffset;
    }

    public int getBestScanNumber() {
        return this.mBestScanNumber;
    }

    public boolean isEndMarkerRead() {
        return this.mEndMarkerRead;
    }
}
