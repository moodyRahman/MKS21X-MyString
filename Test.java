public class Test{
	public static void main(String[] args) {
		MyString d = new MyString("aaaa");
		System.out.println(d);
		System.out.println(d.charAt(0));

		char[] lett = {'q', 'u', 'a', 'c', 'k'};
		MyString quack = new MyString(lett);
		System.out.println(quack);
		System.out.println(quack.charAt(0));
		System.out.println(quack.charAt(4));
		// System.out.println(quack.charAt(6));
		System.out.println(quack);
		System.out.println(quack.subSequence(0, 3));
		System.out.println(quack.subSequence(2, 5));

		System.out.println();
		System.out.println(quack.compareTo(d));

		MyString dc = new MyString("aaaa");
		System.out.println(d.compareTo(dc));
		System.out.println();
		System.out.println(d.length());
		System.out.println(quack.length());
		System.out.println();

		MyString wowie = new MyString(new MyString(new MyString(new MyString(new MyString(new MyString(new MyString(new MyString(new MyString(new MyString(new MyString("noot")))))))))));
		System.out.println(wowie);
	}
}
