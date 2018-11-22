public class MyString implements CharSequence, Comparable<CharSequence>{
	private char[] data;

	/**
	 * Initializes MyString with some CharSequence (including a MyString)
	 * @param input da any CharSequence lmao
	 */

	public MyString(CharSequence input){
		//copies over CharSequence input into char[] data
		data = new char[input.length()];
		for (int x = 0; x < input.length(); x++){
			data[x] = input.charAt(x);
		}
	}

	/**
	 * Alt constructor that takes in some 1-D array of chars
	 * @param input 1-D char array
	 */
	public MyString(char[] input){
		//allows for a direct char[] input into char[] data
		data = new char[input.length];
		for (int x = 0; x < input.length; x++){
			data[x] = input[x];
		}
	}

	/**
	 * returns character at the input index
	 * @param  index positive integer less then the length of the MyString,
	 * 				 greater than 0
	 * @return char at the specified location
	 */
	public char charAt(int index){
		if (index < 0 || index >= data.length){
			throw new IndexOutOfBoundsException();
		}
		return data[index];
	}

	/**
	 * slices the MyString starting from start (inclusive) until end (exclusive)
	 * returns a new MyString from the specififed parameters
	 * @throws IndexOutOfBoundsException if either start or end are out of bounds
	 * 									 of the MyString
	 * @param  start output MyString start location (inclusive)
	 * @param  end   output MyString end location (exclusive)
	 * @return       resultant output MyString
	 */
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

	/**
	 * returns an int of the length of the MyString
	 * @return int data length
	 */
	public int length(){
		return data.length;
	}

	/**
	 * compares the current instance of MyString to the CharSequence input
	 *
	 * @param  input CharSequence to be compared against
	 * @return       1 if the two Objects are the swim, -1 if otherwise
	 */
	public int compareTo(CharSequence input){
		for (int x = 0; x < data.length; x++){
			if (data[x] != input.charAt(x)){
				return -1;
			}
		}
		return 1;
	}

	/**
	 * String representation of MyString
	 * @return String form of the MyString
	 */
	public String toString(){
		return new String(data);
	}

}
