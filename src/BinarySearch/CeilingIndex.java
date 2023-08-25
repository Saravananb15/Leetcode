package BinarySearch;

public class CeilingIndex {
	public static void main(String[] args) {
		int[] arr = {2,3,5,9,14,16,18};
		int target = 16;
		CeilingIndex ci = new CeilingIndex();
		ci.binarySearch(arr, target);
	}
	
	public void binarySearch(int[] arr, int target) {
		int start = arr[0];
		int end = arr[arr.length-1];
		int mid = start+(start+end/end);
		System.out.println(mid +" "+ start+" "+ end);
		for(int i=0;i<arr.length;i++) {
			if(mid<start) {
				end = mid;
				mid = end+(end+start/start);
				System.out.println(mid+" "+end);
			}else if(mid<end) {
				start = mid;
				mid = end+(start+end/start);
				System.out.println(mid+" "+start);
			}else if (mid == end || mid == start) {
				System.out.println("element found" + " "+mid);
			}
		}
		System.out.println(mid +" "+ start+" "+ end);
	}
}
