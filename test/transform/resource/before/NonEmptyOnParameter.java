class NonEmptyOnParameter extends Thread {
	NonEmptyOnParameter(@lombok.NonEmpty String arg) {
		this(arg, "");
	}
	
	NonEmptyOnParameter(@lombok.NonEmpty String arg, @lombok.NonEmpty String arg2) {
		super(arg);
		if (arg == null) throw new NullPointerException();
	}
	
	public void test2(@lombok.NonEmpty(trim = false) String arg, @lombok.NonEmpty String arg2, @lombok.NonEmpty String arg3) {
		if (arg2 == null) {
			throw new NullPointerException("arg2");
		}
		if (arg == null) System.out.println("Hello");
	}
	
	public void test3(@lombok.NonEmpty String arg) {
		if (arg != null) throw new IllegalStateException();
	}
	
	public void test(@lombok.NonEmpty String stringArg, @lombok.NonEmpty String arg2, @lombok.NonEmpty int primitiveArg) {
		
	}
	
	public void test(@lombok.NonEmpty String arg) {
		System.out.println("Hey");
		if (arg == null) throw new NullPointerException();
	}
}