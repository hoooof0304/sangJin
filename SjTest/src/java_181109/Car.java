package java_181109;

public class Car {
	// 필드 선언
	int gas;

	// 메소드 선언
	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas 없음");
			return false;
		}else {
			System.out.println("gas 있음");
			return true;
		}
	}
	
	//run 메소드
	void run(boolean status) {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다. (gas 잔량: "+gas+")");
				gas -= 1;
			}else {
				System.out.println("멈춥니다. (gas 잔량: "+gas+")");
				return;
			}
		}
	}


}
