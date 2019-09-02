package test;

import org.springframework.stereotype.Component;

@Component
public class QueryDao implements Dao {
	@Override
	public void query() {
		System.out.println("qqqqqqqqqqqqqqqqqqqqqqqqqqqq");
	}
}
