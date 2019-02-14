import java.util.Random;

public class Vault {
Random rand = new Random();
int code;
Vault(int answer){
	code=answer;
}
boolean tryCode(int test){
	if(test==code) {
		return true;
	}else {
		return false;
	}
}
}
