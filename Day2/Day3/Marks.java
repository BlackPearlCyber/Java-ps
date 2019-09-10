public class Mark {
	public static void main (String [] muthu) {
		int [] marks = { 95,76,88,100};
		for (int i=0; i<marks.length; i++) {
			System.out.println(marks[i]+"\t");
			marks[i]=Math.min(100,marks[i]+5);
		}
		System.out.println("After Adding 5 \n");
		for (int i : marks) {
			System.out.println(i);
		}
	}
}
