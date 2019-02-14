
public class JamesBond {
	static Vault v = new Vault(976543);
public static void main(String[] args) {
	System.out.println(findCode());
}
static int findCode() {
	int n = -1;
	for (int i = 0; i < 1000000; i++) {
		if(v.tryCode(i)) {
			return i;
		}
	}
	return n;
	
}
}
