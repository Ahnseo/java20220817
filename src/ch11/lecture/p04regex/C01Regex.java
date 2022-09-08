package ch11.lecture.p04regex;

public class C01Regex {
	public static void main(String[] args) {
		// regular expression (=regex) ,정규식표현
		// 문자열의 패턴을 표현하는 문자열(String)
		
		String str1 = "a";

		//하나의 문자
		String patten1 ="a";
		
		//matches() -> boolean type return 
		System.out.println(str1.matches(patten1));
		
		String str2 = "b";
		String patten2 ="b";
		System.out.println(str2.matches(patten2));
		
		String str3 = "b";
		String patten3 ="bb";
		System.out.println(str3.matches(patten3));
		
		String str4 = "bbb";
		String patten4 ="b+";  // + 의미 : 한개 이상이다. 여러개다. 
		System.out.println(str4.matches(patten4)); //true
		System.out.println("".matches(patten4)); //false
		
		String str5 = "bbbb";
		String patten5 ="b*";// + 의미 : 0개 이상이다.
		System.out.println(str5.matches(patten5)); //true
		
		String str6 = "dog";
		String patten6 ="do+g";
		System.out.println(str6.matches(patten6)); //true
		System.out.println("doooooog".matches(patten6)); //true
		
		String str7 ="[abcd]"; //[] : 안에 나열된 문자중 하나, 대소문자 구분해야함
		System.out.println("A".matches(str7));
		System.out.println("a".matches(str7));
		System.out.println("b".matches(str7));	
		System.out.println("c".matches(str7));
		System.out.println("d".matches(str7));
		
		String str8 = "[a-c]"; // a 부터 c 까지 [] : 안에 나열된 문자중 '하나'!! 대소문자 구분
		String str9 = "[a-cA-C]";// a ~ c , A ~ C  [] : 안에 나열된 문자중 '하나'!
		
//		응용) a 부터 c 까지 [] : 안에 나열된 문자중 '하나'가 1개 이상
		System.out.println("abc".matches("[a-c]+"));

		// a를 제외하고
		String str10 = "[^abcdefghijkl]"; // [^] : 제외하고,[] : 안에 나열된 문자중 '하나'가 1개 이상
		String str11 = "[^a-z]"; //a를 제외하고 z 까지 나열된 문자중 하나.
		
		//응용)
		System.out.println("String str12 = \"d[^o]g\"");
		String str12 = "d[^o]g";
		System.out.println("dog".matches(str12)); //false
		System.out.println("dxg".matches(str12)); //true

		//수량
		//+ : 1개 이상
		//* : 0개 이상
		//? : 0개 또는 1개 (있거나 없거나)
		//{n} : n개
		//{n,} : n개 이상
		//{n,m} : n개 이상 m개 이하
 		
		System.out.println("String str13 = \"do+g\"");
		String str13 = "do+g";
		System.out.println("dog".matches(str13));//t
		System.out.println("dooooooog".matches(str13));//t
		
		System.out.println("String str14 = \"do*g\"");
		String str14 = "do*g";
		System.out.println("dg".matches(str14));//t
		System.out.println("dog".matches(str14));//t
		System.out.println("dooooooog".matches(str14));//t
		
		System.out.println("String str15 = \"do?g\"");
		String str15 = "do?g";
		System.out.println("dg".matches(str15));//t
		System.out.println("dog".matches(str15));//t
		System.out.println("dooooooog".matches(str15));//f
		
		System.out.println("String str16 = \"do{2}g\"");
		String str16 = "do{2}g";
		System.out.println("dg".matches(str16));//f
		System.out.println("dog".matches(str16));//f
		System.out.println("doog".matches(str16));//t
		System.out.println("dooooooog".matches(str16));//t
	
		//기호
		// .  : 모든 글자
		// \. : . (dot)
		// ^  : 한 줄의 시작
		// $  : 한 줄의 끝
		// \d : [0-9] (digit)
		// \w : [a-zA-Z_0-9] 한개의 알파벳 또는 한개의 숫자
		// \s : 공백(스페이스, 엔터 ,탭)
		
		System.out.println("String pattern17 = \".\"");
		String pattern17 = ".";
		System.out.println("a".matches(pattern17)); //t
		System.out.println(" ".matches(pattern17)); // t 빈글자
		System.out.println("aa".matches(pattern17)); //false
		System.out.println("aa".matches(".{2}")); //t
		
		
		System.out.println("   String pattern18 =\"\\\\d\";   ");
		String pattern18 ="\\d"; //자바에서 \ 는 \\로 작성 
		System.out.println("0".matches(pattern18));
		System.out.println("5".matches(pattern18));
		System.out.println("a".matches(pattern18));
		System.out.println("10".matches(pattern18));
		
		String p20 = "\\d{8}";
		System.out.println("19550101".matches(p20));
		System.out.println("550101".matches(p20));
		
		String p21 = "\\d{4}-?\\d{2}-?\\d{2}";
		System.out.println("19550101".matches(p21));
		System.out.println("1955-01-01".matches(p21));
		System.out.println("195501-01".matches(p21));
		
		// () : 그룹
		// | : or 또는
		
		String p22 = "(dog|cat)";
		System.out.println("dog".matches(p22));
		System.out.println("cat".matches(p22));
		
		String p23 = "(\\d{4}|\\d{2})-?\\d{2}-?\\d{2}";
		System.out.println("19550101".matches(p23));
		System.out.println("550101".matches(p23));
		System.out.println("9550101".matches(p23));
		System.out.println("1955-01-01".matches(p23));
		System.out.println("55-01-01".matches(p23));
		
		String p24 = "(dog)+";
		System.out.println("dog".matches(p24));
		System.out.println("dogdog".matches(p24));
		System.out.println("dogdo".matches(p24));
		
		// \. : . (dot)
		
		String p25 = "\\.";
		System.out.println("a".matches(p25)); // false
		System.out.println(".".matches(p25)); // true
		
		String p26 = "www\\.[a-z]+\\.com";
		System.out.println("www.daum.com".matches(p26));
		System.out.println("daum.com".matches(p26));
		System.out.println("www.daumcom".matches(p26));
		
	}
}
