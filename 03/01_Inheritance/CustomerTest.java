package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerShin = new GoldCustomer(888, "Shin");
		
		Customer customerLee = new VIPCustomer(991, "Lee");
		
		Customer customerTemp = new Customer(100, "Temp");
		
		ArrayList<Customer> customerList = new ArrayList<>();
		customerList.add(customerTemp);
		customerList.add(customerShin);
		customerList.add(customerLee);
		
		int price = 10000;
		System.out.println("정가는 10000원입니다.");
		for(Customer customer : customerList) {
			System.out.println("가격은 " + customer.calcPrice(price) + "원 입니다.");
			System.out.println(customer.showCustomerInfo());
		}
	
	}

}
