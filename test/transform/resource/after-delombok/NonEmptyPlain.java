import java.lang.annotation.*;

class NonEmptyPlain {
    @lombok.NonEmpty
    int i;
    @lombok.NonEmpty
    String s;
    @NonEmpty
    Object o;

    @Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
    @Retention(RetentionPolicy.CLASS)
    public @interface NonEmpty {
        boolean trim() default true;
    }
}