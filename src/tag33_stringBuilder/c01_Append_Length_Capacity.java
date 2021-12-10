package tag33_stringBuilder;

public class c01_Append_Length_Capacity {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println(sb.append("mehmet"));

		System.out.println(sb.length());
		
		System.out.println(sb.capacity());
		sb.append("onurcetinerkoyun");
		System.out.println(sb.capacity());
		System.out.println(sb);		//mehmetonurcetinerkoyun
		System.out.println(sb.length());
		
		System.out.println(sb.delete(11,22)); //mehmetonurc
		
		System.out.println(sb.capacity());//gene 34
	}


}
