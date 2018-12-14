/**********************************************************\
|                                                          |
|                          hprose                          |
|                                                          |
| Official WebSite: http://www.hprose.com/                 |
|                   http://www.hprose.org/                 |
|                                                          |
\**********************************************************/
/**********************************************************\
 *                                                        *
 * BooleanArrayUnserializer.java                          *
 *                                                        *
 * boolean array unserializer class for Java.             *
 *                                                        *
 * LastModified: Apr 22, 2015                             *
 * Author: Ma Bingyao <andot@hprose.com>                  *
 *                                                        *
\**********************************************************/

package hprose.io.unserialize;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;

final class BooleanArrayUnserializer implements HproseUnserializer {

    public final static HproseUnserializer instance = new BooleanArrayUnserializer();

    public final Object read(HproseReader reader, ByteBuffer buffer, Class<?> cls, Type type) throws IOException {
        return reader.readBooleanArray(buffer);
    }

    public final Object read(HproseReader reader, InputStream stream, Class<?> cls, Type type) throws IOException {
        return reader.readBooleanArray(stream);
    }

}
