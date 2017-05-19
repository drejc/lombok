class NonEmptyOnParameter extends Thread {
	NonEmptyOnParameter(@lombok.NonEmpty String arg) {
		this(arg, "");
		if (arg == null) {
			throw new java.lang.IllegalArgumentException("arg");
		}
		else {
			if (arg.trim().length() == 0) {
				throw new java.lang.IllegalArgumentException("arg");
			}
		}
	}
	NonEmptyOnParameter(@lombok.NonEmpty String arg, @lombok.NonEmpty String arg2) {
		super(arg);
		if (arg2 == null) {
			throw new java.lang.NullPointerException("arg2");
		}
		else {
			if (arg2.trim().length() == 0) {
				throw new java.lang.IllegalArgumentException("arg");
			}
		}
		if (arg == null) throw new NullPointerException();
	}
	public void test2(@lombok.NonEmpty(trim = false) String arg, @lombok.NonEmpty String arg2, @lombok.NonEmpty String arg3) {
		if (arg == null) {
			throw new java.lang.IllegalArgumentException("arg");
		}
		else {
			if (arg.length() == 0) {
				throw new java.lang.IllegalArgumentException("arg");
			}
		}
		if (arg3 == null) {
			throw new java.lang.IllegalArgumentException("arg3");
		}
		else {
			if (arg3.trim().length() == 0) {
				throw new java.lang.IllegalArgumentException("arg3");
			}
		}
		if (arg2 == null) {
			throw new IllegalArgumentException("arg2");
		}
		else {
			if (arg2.trim().length() == 0) {
				throw new java.lang.IllegalArgumentException("arg2");
			}
		}
		if (arg == null) System.out.println("Hello");
	}
	public void test3(@lombok.NonEmpty String arg) {
		if (arg == null) {
			throw new java.lang.IllegalArgumentException("arg");
		}
		else {
			if (arg.trim().length() == 0) {
				throw new java.lang.IllegalArgumentException("arg");
			}
		}
		if (arg != null) throw new IllegalStateException();
	}
	public void test(@lombok.NonEmpty String stringArg, @lombok.NonEmpty String arg2, @lombok.NonEmpty int primitiveArg) {
		if (stringArg == null) {
			throw new java.lang.NullPointerException("stringArg");
		}
		else {
			if (stringArg.trim().length() == 0) {
				throw new java.lang.IllegalArgumentException("stringArg");
			}
		}
		if (arg2 == null) {
			throw new java.lang.IllegalArgumentException("arg2");
		}
		else {
			if (arg2.trim().length() == 0) {
				throw new java.lang.IllegalArgumentException("arg2");
			}
		}
	}
	public void test(@lombok.NonEmpty String arg) {
		if (arg == null) {
			throw new java.lang.IllegalArgumentException("arg");
		}
		else {
			if (arg.trim().length() == 0) {
				throw new java.lang.IllegalArgumentException("arg");
			}
		}
		System.out.println("Hey");
		if (arg == null) throw new NullPointerException();
	}
}
