public class MyString implements CharSequence{
	private char[] data;

	public MyString(CharSequence input){
		data = new char[input.length()];
		for (int x = 0; x < input.length(); x++){
			data[x] = input.charAt(x);
		}
	}

	public MyString(char[] input){
		data = new char[input.length];
		for (int x = 0; x < input.length; x++){
			data[x] = input[x];
		}
	}

	public char charAt(int index){
		return data[index];
	}

	public MyString subSequence(int start, int end){
		char[] output = new char[end - start];
		int point = 0;
		for (int x = start; x < end; x++){
			output[point] = data[x];
		}
		return new MyString(output);
	}

	public int length(){
		return data.length;
	}

	public String toString(){
		return new String(data);
	}

}
