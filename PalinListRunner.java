 public class PalinListRunner
{
	public static void main ( String[] args )
	{
		PalinList bum = new PalinList("one two three two one");
		PalinList gum = new PalinList("1 2 3 4 5 one two three four five");
		PalinList dum = new PalinList("a b c d e f g x y z g f h");
		PalinList jum = new PalinList("racecar is racecar");
		PalinList mum = new PalinList("1 2 3 a b c c b a 3 2 1");
		PalinList num = new PalinList("chicken is a chicken");
		
		System.out.println(bum);
		System.out.println(gum);
		System.out.println(num);
	}
}
