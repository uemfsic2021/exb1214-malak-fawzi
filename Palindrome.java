public class Palindrome{
    public static boolean is_palindrome(String s, int start, int end){
    if ((end - start) < 2)
    {
        return true;
    }
    if (s.charAt(start) != s.charAt(end))
    {
        return false;
    }
    return is_palindrome(s, ++start, --end);
  }
}