package movie;

public class Movie {
	// 필드

	String movieName ;//영화명

	int price;//금액

	int age;//나이

	int money;//실구매금액

	double rate;//할인율

	String way;//구매방법​


	//생성자

	public Movie(String movieName, int price, int age, String way ) {

	//매개변수로 값을 받아서 멤버변수에 넣기

	this.movieName = movieName;

	this.price = price;

	this.age = age;

	this.way = way;

	}

	
//메소드 
	void rateCal() {
		switch(way) {
		case "현장":
			rate =0;
			break;
		case "인터넷":
			rate = 0.05;
			break;
		case "쿠폰":
			rate = 0.10;
			break;
			
		}
		if(age < 20) 
			rate+=0.25;
		else if(age >=20 && age< 30)
			rate += 0.20;
		else
			rate += 0.15;
		
		
	}

	void moneyCal() {
		//머니의 값 금액 - ( 금액 * 할인율 )
		money = price - (int)(price * rate);
		
	}
//
	void titlePrint() {
		System.out.println("영화명\t\t금액\t\t나이\t\t실구매가격");
		
	}
//
	void dataPrint() {
		rateCal();
		moneyCal();
		System.out.println(movieName+"\t\t"+price+"\t\t"+age+"\t\t"+money);
		
	}


}
