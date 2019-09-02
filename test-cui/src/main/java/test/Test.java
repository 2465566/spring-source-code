package test;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(QueryDao.class);
		annotationConfigApplicationContext.refresh();
		System.out.println(annotationConfigApplicationContext.getBean("queryDao"));
	}
}
