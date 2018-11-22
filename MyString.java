public class MyString implements CharSequence, Comparable<CharSequence>{
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
		if (index < 0 || index >= data.length){
			throw new IndexOutOfBoundsException();
		}
		return data[index];
	}

	public MyString subSequence(int start, int end){
		if (start < 0 || end < 0 || start > end || end > data.length){
			throw new IndexOutOfBoundsException();
		}
		char[] output = new char[end - start];
		int point = 0;
		for (int x = start; x < end; x++){
			output[point] = data[x];
			point++;
		}
		return new MyString(output);
	}

	public int length(){
		return data.length;
	}

	public int compareTo(CharSequence input){
		for (int x = 0; x < data.length; x++){
			if (data[x] != input.charAt(x)){
				return -1;
			}
		}
		return 1;
	}

	public String toString(){
		return new String(data);
	}

}
