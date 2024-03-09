import java.io.*;
class NumToAscii{
	static void convertToASCII(int N)
	{
		while (N > 0) {
			int d = N % 10;
			System.out.println(d + " ("
							+ (d + 48) + ")");

			N = N / 10;
                             }
         }
	public static void main(String[] args)
	{
		int N = 36;
		convertToASCII(N);
	}
}
