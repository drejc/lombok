/*
 * Copyright (C) 2009-2013 The Project Lombok Authors.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package lombok;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * If put on a String, array, Set, Map or Collection parameter, lombok will insert a empty-check at the start of the method /
 * constructor's body, throwing a {@code IllegalArgumentException} with the parameter's name as message.
 * If put on a field, any generated method assigning a value to this field will also produce these empty checks.
 * <p>
 * Note that any annotation named {@code NonEmpty} with any casing and any package will result in empty checks produced for
 * generated methods (and the annotation will be copied to the getter return type and any parameters of generated methods),
 * but <em>only</em> this annotation, if present on a parameter, will result in a null check inserted into your otherwise
 * handwritten method.
 *
 * WARNING: If the java community ever does decide on supporting a single {@code @NonEmpty} annotation (for example via JSR305), then
 * this annotation will <strong>be deleted</strong> from the lombok package. If the need to update an import statement scares
 * you, you should use your own annotation named {@code @NonEmpty} instead of this one.
 */
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.CLASS)
@Documented
public @interface NonEmpty {

    /**
     * IllegalArgumentException message
     * @return exception message
     */
    String value() default "is null or empty!";

    /**
     * Will perform String.trim() operation before empty test by default
     * if set to false @NonEmpty(trim = false) will skip String.trim() before check.
     */
    boolean trim() default true;


}
